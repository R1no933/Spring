--liquibase formatted sql

--changeset dbaskakov:1
ALTER TABLE users
ADD COLUMN image VARCHAR(64);

--changeset dbaskakov:2
ALTER TABLE users_aud
ADD COLUMN image VARCHAR(64);
