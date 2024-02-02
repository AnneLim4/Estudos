USE Loja;

INSERT INTO ContaReceber (Cliente_ID, FaturaVendaID, DataConta, DataVencimento, Valor, Situacao)
VALUES
	(1, 001, '2001-01-10', '2002-10-11', 100.00, '1'),
    (2, 002, '2002-02-20', '2003-11-12', 200.00, '2'),
    (3, 003, '2003-03-30', '2004-12-13', 300.00, '3');
    
INSERT INTO Cliente (Nome, CPF, Celular, EndLogradouro, EndNumero, EndCEP, Municipio_ID)
VALUES
	('Jonas Silva', '12345678901' , '91111111111', 'Rua A', '123',  '12345678', 2),
    ('Maria Joaquina', '23456789101', '92222222211', 'Rua B', '456',  '23456789', 1),
    ('Predo Souza', '34567891011', '93333333311', 'Rua C', '789',  '34567891', 3);
    
INSERT Municipio (Estado_ID, Nome, CodIBGE)
VALUES
	(2, 'Camaragibe', 26034540),
    (1, 'Acopiara', 23003090),
    (3, 'Aporá', 29019080);
    
INSERT Estado(Nome, UF)
VALUES
	('Pernambuco', 'PE'),
    ('Ceara', 'CE'),
    ('Bahia', 'BA');
