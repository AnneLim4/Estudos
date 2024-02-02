CREATE DATABASE IF NOT EXISTS Loja;

USE Loja;

CREATE TABLE ContaReceber(
	ID  INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    Cliente_ID INT,
    FaturaVendaID INT,
    DataConta DATE NOT NULL,
    DataVencimento DATE NOT NULL,
    Valor Decimal(18,2) NOT NULL,
    Situacao ENUM('1', '2', '3') NOT NULL
    
 );
 ALTER table ContaReceber add foreign key (Cliente_ID) references Cliente(ID);
 
 CREATE TABLE Cliente(
	ID INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    Nome VARCHAR(80) NOT NULL,
    CPF VARCHAR(11) NOT NULL,
    Celular VARCHAR(11),
    EndLogradouro VARCHAR(100) NOT NULL,
    EndNumero VARCHAR(10) NOT NUll,
    EndCEP CHAR(8) NOT NULL,
    Municipio_ID INT NOT NULL
 );
 ALTER TABLE Cliente CHANGE COLUMN EndMunicipio Municipio_ID INT NOT Null;
 ALTER table Cliente add foreign key (Municipio_ID) references Municipio(ID);
 
 CREATE TABLE Municipio(
	ID INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    Estado_ID INT NOT NULL,
    Nome VARCHAR(80) NOT NULL,
    CodIBGE INT NOT NULL
 );
 ALTER table Municipio add foreign key (Estado_ID) references Estado(ID);
 
 CREATE TABLE Estado(
	ID INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    Nome VARCHAR(50) NOT NULL,
    UF CHAR(2) NOT NULL
    );
    
    SELECT * FROM ContaReceber;
    SELECT * FROM Cliente;
    SELECT * FROM Municipio;
    SELECT * FROM Estado;