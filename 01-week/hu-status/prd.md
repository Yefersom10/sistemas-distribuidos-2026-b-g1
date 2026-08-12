# CineSync Platform — Booking & Seat Reservation Service

**Responsable:** **Yeferson Esmid Heredia Perdomo**

## Introducción

Este documento describe el componente encargado de la **gestión de reservas y disponibilidad de asientos** dentro de **Cine API**.

Debido a que múltiples usuarios pueden intentar reservar los mismos asientos simultáneamente, este servicio debe garantizar la consistencia de las reservas, evitar la sobreventa de sillas y controlar los bloqueos temporales mientras el usuario completa el proceso de pago.

El servicio **Booking & Seat Reservation** será un microservicio transaccional encargado de consultar la disponibilidad de los asientos, realizar bloqueos temporales, confirmar reservas y publicar eventos para que otros servicios puedan continuar el proceso de generación y envío del boleto digital.

---

## 1. Booking & Seat Reservation Service


El servicio será responsable de administrar todo el ciclo de vida de una reserva de asientos para una función determinada.

### Funciones principales

* Consulta de disponibilidad de asientos.
* Gestión del estado de cada asiento.
* Bloqueo temporal de asientos.
* Expiración automática de bloqueos.
* Creación de reservas.
* Confirmación de reservas.
* Validación del estado de los asientos antes de confirmar.
* Prevención de reservas duplicadas.
* Publicación de eventos de reserva confirmada.
* Consulta del estado de una reserva.

---

## 2. Estados de los asientos

Cada asiento podrá encontrarse en uno de los siguientes estados:

* **AVAILABLE:** El asiento está disponible para ser reservado.
* **HELD:** El asiento está bloqueado temporalmente mientras el usuario completa el proceso de reserva/pago.
* **OCCUPIED:** El asiento pertenece a una reserva confirmada.

El flujo principal será:

```text
AVAILABLE
    │
    │ Hold
    ▼
  HELD
    │
    ├── Pago confirmado ──────► OCCUPIED
    │
    └── Tiempo expirado ──────► AVAILABLE
```

El estado `HELD` tendrá una duración limitada para evitar que un usuario pueda bloquear indefinidamente un asiento.

---

## 3. Bloqueo temporal de asientos

El sistema implementará un mecanismo de **bloqueo temporal** para garantizar que un asiento seleccionado por un usuario no pueda ser reservado simultáneamente por otro usuario.

El bloqueo tendrá una duración aproximada de **5 a 10 minutos**.

Para administrar este estado temporal se utilizará **Redis**, aprovechando su capacidad de expiración automática mediante TTL.

Ejemplo conceptual:

```text
Usuario
   │
   │ Selecciona asientos
   ▼
Booking Service
   │
   ▼
Redis
   │
   ├── Seat A1 → HELD
   ├── Seat A2 → HELD
   └── TTL → 10 minutos
```

Si el usuario no completa el proceso dentro del tiempo establecido, el bloqueo expirará y los asientos volverán a estar disponibles.

---

## 4. Persistencia

El servicio utilizará diferentes mecanismos de almacenamiento dependiendo de la naturaleza de la información.

### PostgreSQL

Se utilizará **PostgreSQL** para almacenar la información permanente relacionada con las reservas.

Entidades principales:

```text
Booking
BookingSeat
```

Información que podrá almacenarse:

* Identificador de la reserva.
* Identificador del usuario.
* Identificador de la función.
* Estado de la reserva.
* Asientos asociados.
* Fecha de creación.
* Fecha de confirmación.
* Fecha de expiración.
* Identificador de la transacción de pago.

### Redis

**Redis** será utilizado para manejar información temporal relacionada con los bloqueos de asientos.

Ejemplo:

```text
showtime:{showtime_id}:seat:{seat_id}

Estado:
HELD

TTL:
600 segundos
```

Esto permitirá liberar automáticamente los asientos cuando expire el tiempo de bloqueo.

---

## 5. API Endpoints

El microservicio expondrá inicialmente los siguientes endpoints:

### Consultar asientos

```http
GET /api/v1/showtimes/{id}/seats
```

Permite consultar el estado actual de los asientos disponibles para una función.

Respuesta conceptual:

```json
{
  "showtimeId": 15,
  "seats": [
    {
      "id": "A1",
      "status": "AVAILABLE"
    },
    {
      "id": "A2",
      "status": "HELD"
    },
    {
      "id": "A3",
      "status": "OCCUPIED"
    }
  ]
}
```

---

### Bloquear asientos

```http
POST /api/v1/bookings/hold
```

Permite realizar un bloqueo temporal de uno o varios asientos.

El servicio deberá validar:

* Que la función exista.
* Que los asientos pertenezcan a la sala correspondiente.
* Que los asientos estén disponibles.
* Que no estén bloqueados por otro usuario.
* Que el usuario esté autenticado.

Ejemplo:

```json
{
  "showtimeId": 15,
  "seatIds": [
    "A1",
    "A2"
  ]
}
```

Respuesta conceptual:

```json
{
  "bookingId": "BK-001",
  "status": "HELD",
  "expiresIn": 600
}
```

---

### Confirmar reserva

```http
POST /api/v1/bookings/confirm
```

Permite confirmar una reserva después de validar el proceso de pago.

El servicio deberá comprobar:

* Que la reserva exista.
* Que la reserva pertenezca al usuario.
* Que los asientos continúen bloqueados.
* Que el pago haya sido validado.
* Que la reserva no haya expirado.
* Que los asientos no hayan sido confirmados previamente.

Una vez confirmada la reserva, los asientos pasarán de:

```text
HELD
  │
  ▼
OCCUPIED
```

---

## 6. Integración con el sistema de pagos

La confirmación de una reserva estará relacionada con la validación del pago.

El flujo general será:

```text
Usuario
   │
   ▼
Selecciona asientos
   │
   ▼
Booking Service
   │
   ▼
Redis
   │
   │ Hold temporal
   ▼
Proceso de pago
   │
   ▼
Validación del pago
   │
   ▼
Confirmación de reserva
   │
   ▼
PostgreSQL
```

La reserva no deberá considerarse confirmada únicamente porque los asientos hayan sido bloqueados.

El estado definitivo `OCCUPIED` deberá establecerse únicamente después de completar correctamente el proceso de confirmación.

---

## 7. Eventos y comunicación entre microservicios

Una vez confirmada una reserva, el servicio publicará un evento mediante un **broker de mensajería**, utilizando **RabbitMQ o Kafka**.

Evento:

```text
BookingConfirmed
```

Flujo:

```text
Booking Service
      │
      │ BookingConfirmed
      ▼
RabbitMQ / Kafka
      │
      ▼
Notification & Ticket Service
      │
      ├── Generar QR
      ├── Generar PDF
      └── Enviar correo
```

El evento deberá contener la información necesaria para que el servicio de notificaciones pueda generar el boleto digital.

Ejemplo conceptual:

```json
{
  "event": "BookingConfirmed",
  "bookingId": "BK-001",
  "userId": "USR-001",
  "showtimeId": "SHOW-015",
  "seatIds": [
    "A1",
    "A2"
  ],
  "confirmedAt": "2026-08-11T20:00:00Z"
}
```

---

## 8. Concurrencia y consistencia

Uno de los puntos críticos del servicio será evitar que dos usuarios puedan reservar simultáneamente el mismo asiento.

Por esta razón, el sistema deberá manejar correctamente las operaciones concurrentes.

Ejemplo:

```text
Usuario A ──────► Solicita A1
                       │
                       ▼
                    Redis
                       │
                    A1 HELD
                       │
                       X
                       │
Usuario B ──────► Solicita A1
                       │
                       ▼
                  NO DISPONIBLE
```

El sistema deberá garantizar que solamente una solicitud pueda obtener el bloqueo del asiento.

Se deberán considerar mecanismos como:

* Operaciones atómicas en Redis.
* Identificadores únicos de reserva.
* Validaciones transaccionales.
* Restricciones de integridad en PostgreSQL.
* Idempotencia en operaciones críticas.

---

## 9. Arquitectura del servicio

El microservicio seguirá una arquitectura orientada a la separación de responsabilidades.

Conceptualmente:

```text
                    Booking Service
                          │
          ┌───────────────┼───────────────┐
          │               │               │
          ▼               ▼               ▼
      Controller       Application      Domain
          │               │               │
          └───────────────┼───────────────┘
                          │
                          ▼
                     Infrastructure
                     │            │
                     ▼            ▼
                 PostgreSQL     Redis
                                   
                          │
                          ▼
                   Message Broker
                    RabbitMQ/Kafka
```

El dominio deberá mantenerse independiente de los detalles específicos de infraestructura siempre que sea posible.

---

## 10. Seguridad

El servicio deberá integrarse con el sistema de autenticación de Cine API.

Las operaciones relacionadas con reservas deberán validar la identidad del usuario mediante **JWT**.

El flujo será:

```text
Usuario
   │
   ▼
JWT
   │
   ▼
Booking Service
   │
   ├── ¿JWT válido?
   ├── ¿Usuario autenticado?
   ├── ¿Reserva pertenece al usuario?
   └── ¿Puede realizar la operación?
```

Se deberán considerar:

* Validación de JWT.
* Identificación del usuario.
* Control de acceso.
* Validación de propiedad de las reservas.
* Validación de datos de entrada.
* Protección contra solicitudes duplicadas.
* Manejo seguro de información sensible.

---

## 11. Manejo de errores

El servicio deberá proporcionar respuestas consistentes ante errores.

Casos principales:

### Asiento no disponible

```http
409 Conflict
```

Cuando otro usuario ya haya bloqueado o reservado el asiento.

### Reserva expirada

```http
409 Conflict
```

Cuando el usuario intente confirmar una reserva cuyo bloqueo temporal ya expiró.

### Reserva inexistente

```http
404 Not Found
```

Cuando no exista la reserva solicitada.

### Usuario no autorizado

```http
401 Unauthorized
```

Cuando el usuario no proporcione credenciales válidas.

### Operación no permitida

```http
403 Forbidden
```

Cuando el usuario esté autenticado pero no tenga permisos para realizar la operación.

---

## 12. Dockerización

El microservicio deberá contar con su propio `Dockerfile`.

Estructura conceptual:

```text
booking-service/
│
├── Dockerfile
├── docker-compose.yml
├── src/
├── tests/
├── README.md
└── ...
```

El servicio deberá poder ejecutarse de manera independiente dentro del entorno de microservicios.

Las dependencias principales serán:

```text
Booking Service
      │
      ├── PostgreSQL
      ├── Redis
      └── RabbitMQ / Kafka
```

---

## 13. Documentación de API

La API deberá estar documentada utilizando **Swagger / OpenAPI**.

La documentación deberá incluir:

* Endpoints.
* Parámetros.
* Request Body.
* Responses.
* Códigos HTTP.
* Esquemas de datos.
* Autenticación mediante JWT.

La documentación deberá estar disponible desde:

```text
/docs
```

---

## 14. Pruebas

El servicio deberá contar con pruebas para garantizar el correcto funcionamiento de las operaciones críticas.

Se deberán considerar:

### Pruebas unitarias

Para:

* Creación de reservas.
* Validación de asientos.
* Expiración de reservas.
* Confirmación.
* Validaciones de negocio.

### Pruebas de integración

Para:

* PostgreSQL.
* Redis.
* RabbitMQ/Kafka.
* API REST.

### Pruebas de concurrencia

Especialmente para validar escenarios donde varios usuarios intentan reservar el mismo asiento simultáneamente.

Ejemplo:

```text
100 usuarios
     │
     ▼
Intentan reservar A1
     │
     ▼
Solo 1 obtiene el bloqueo
     │
     ▼
Los demás reciben conflicto
```

---

## 15. Principios de diseño

El desarrollo del servicio deberá procurar seguir principios de:

* **TDD — Test Driven Development**
* **DDD — Domain Driven Design**
* **SDD — Specification Driven Development**
* **SOLID**
* **Clean Code**
* **Clean Architecture / Arquitectura Hexagonal**
* Separación de responsabilidades.
* Bajo acoplamiento.
* Alta cohesión.
* Inyección de dependencias.
* Código mantenible y testeable.

La lógica relacionada con las reglas de negocio de las reservas deberá permanecer principalmente dentro del dominio y no depender directamente de PostgreSQL, Redis o del broker de mensajería.

---

## 16. Flujo completo de una reserva

El flujo general del proceso será:

```text
                    Usuario
                       │
                       ▼
              Consultar funciones
                       │
                       ▼
              Consultar asientos
                       │
                       ▼
              Seleccionar asientos
                       │
                       ▼
                POST /hold
                       │
                       ▼
                    Redis
                       │
                  ┌────┴────┐
                  │         │
             Disponible   Ocupado
                  │         │
                  ▼         ▼
                HELD      Rechazar
                  │
                  ▼
             Realizar pago
                  │
                  ▼
          Validar confirmación
                  │
                  ▼
          POST /bookings/confirm
                  │
                  ▼
              PostgreSQL
                  │
                  ▼
              OCCUPIED
                  │
                  ▼
          BookingConfirmed
                  │
                  ▼
            RabbitMQ/Kafka
                  │
                  ▼
       Notification & Ticket
                  │
          ┌───────┴────────┐
          ▼                ▼
      Generar QR        Generar PDF
          │                │
          └───────┬────────┘
                  ▼
              Enviar Email
```

---

## 17. Entregables

Como responsable del módulo **Booking & Seat Reservation Service**, los entregables principales serán:

* Microservicio de reservas funcional.
* API REST.
* Gestión de disponibilidad de asientos.
* Sistema de bloqueo temporal mediante Redis.
* Persistencia de reservas en PostgreSQL.
* Confirmación de reservas.
* Control de concurrencia.
* Integración con el sistema de pagos.
* Publicación del evento `BookingConfirmed`.
* Integración con RabbitMQ o Kafka.
* Pruebas unitarias.
* Pruebas de integración.
* Documentación Swagger/OpenAPI.
* Dockerfile funcional.
* Documentación técnica del servicio.
* Repositorio organizado mediante ramas `feature/` y `main`.
* Commits descriptivos.

---

## 18. Resultado esperado

Al finalizar el desarrollo, el **Booking & Seat Reservation Service** deberá permitir que un usuario pueda seleccionar y bloquear temporalmente sus asientos, completar el proceso de pago y obtener una reserva confirmada sin que exista riesgo de que dos usuarios puedan adquirir simultáneamente el mismo asiento.

El servicio también deberá integrarse con el resto de la arquitectura de **Cine API** mediante eventos, permitiendo que el módulo **Notification & Ticket Service** genere automáticamente el boleto digital una vez que la reserva haya sido confirmada.

El objetivo principal es garantizar un proceso de reserva **consistente, seguro, transaccional, escalable y resistente a problemas de concurrencia**.
