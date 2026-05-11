# EP2-Proyecto-Backend-con-Microservicios-y-Persistencia-de-Datos



## 1. Infraestructura

 - **API Gateway**: Es el punto de entrada único para todos los clientes (Postman). Su función es el enrutamiento: recibe una petición al puerto 8080 y, gracias a sus reglas, sabe a qué microservicio redirigirla.

- **Eureka Server**: Es la guía telefónica del sistema. Cada vez que un microservicio arranca, se registra aquí con su IP y puerto. Así, el Gateway no necesita saber dónde están los servicios; solo le pregunta a Eureka: "¿Dónde está 'Clientes'?" y Eureka le da la dirección.

## 2. Microservicios de Negocio
- **Seguridad**: Gestiona la identidad y el acceso. Emite tokens JWT tras validar credenciales.

- **Clientes**: Administra los usuarios finales. Gestiona datos personales, direcciones de facturación y perfiles de los compradores.

- **Productos**: Es el catálogo digital. Controla la información estática de lo que se vende: nombres, descripciones, categorías y precios base.

- **Inventario**: Gestiona el stock físico. Controla cuántas unidades quedan en bodega y evita que se venda algo que no existe.

- **Pedidos**: Es el orquestador principal. Recibe la intención de compra, une al cliente con sus productos y genera la orden que gatilla el resto del flujo.

- **Detalle-Pedido**: Maneja la granularidad de la compra. Desglosa cada ítem dentro de un pedido, permitiendo cálculos de totales.

- **Pagos**: Gestiona la transacción financiera. Se encarga de la integración con pasarelas de pago.

- **Despachos**: Administra la logística de estados de envío y las rutas de entrega.

- **Notificaciones**: Es el puente de comunicación. Se encarga de enviar correos o alertas al cliente cuando su pedido cambia de estado, trabajando de forma asíncrona.

- **Reclamos**:	Gestiona el post-venta. Permite a los usuarios levantar tickets de soporte, asegurando que la experiencia del cliente no termine al recibir el producto.


