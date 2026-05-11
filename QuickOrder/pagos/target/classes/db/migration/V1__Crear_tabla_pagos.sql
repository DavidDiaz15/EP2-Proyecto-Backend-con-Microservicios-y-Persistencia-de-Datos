CREATE TABLE pagos (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    pedido_id BIGINT NOT NULL,
    monto INT NOT NULL,
    metodo_pago VARCHAR(50),
    estado_pago VARCHAR(20)
);