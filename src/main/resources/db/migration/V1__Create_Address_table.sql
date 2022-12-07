CREATE SEQUENCE IF NOT EXISTS hibernate_sequence START WITH 1 INCREMENT BY 1;

CREATE TABLE address
(
    id       BIGINT NOT NULL,
    street   VARCHAR(255),
    zip_code VARCHAR(255),
    city     VARCHAR(255),
    state    VARCHAR(255),
    CONSTRAINT pk_address PRIMARY KEY (id)
);