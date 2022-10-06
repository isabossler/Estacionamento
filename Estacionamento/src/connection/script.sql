CREATE DATABASE IF NOT EXISTS estacionamento;
USE estacionamento;

CREATE TABLE vaga {
idvaga int NOT NULL AUTO-INCREMENT;
numero int NOT NULL;
rua varchar (100) NOT NULL;
obliqua boolean NOT NULL;
PRIMARY KEY (idVaga)};
}