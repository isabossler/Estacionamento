CREATE DATABASE IF NOT EXISTS estacionamento;
USE estacionamento;

CREATE TABLE vaga (
idvaga int NOT NULL AUTO_INCREMENT,
numero int NOT NULL,
rua varchar (100) NOT NULL,
obliqua boolean NOT NULL,
PRIMARY KEY (idVaga));

CREATE TABLE motorista (
idMotorista int NOT NULL AUTO_INCREMENT,
nome varchar (90) NOT NULL,
genero varchar (25) NOT NULL,
RG int NOT NULL,
CPF int NOT NULL,
celular int NOT NULL,
email varchar (72),
senha varchar (20) NOT NULL,
PRIMARY KEY (idMotorista));

