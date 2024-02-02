USE Loja;

INSERT INTO ContaReceber (Cliente_ID, FaturaVendaID, DataConta, DataVencimento, Valor, Situacao)
Values
	(1, 001, '2011-01-01', '2021-04-11', 500.00, '1'),
    (2, 002, '2012-02-02', '2022-05-12', 600.00, '2'),
    (3, 003, '2013-03-03', '2023-06-13', 700.00, '3');
    
INSERT INTO Cliente (Nome, CPF, Celular, EndLogradouro, EndNumero, EndMunicipio, EndCEP, MunicipioID)
VALUES 
	('Jonas Silveira', '12345678901', '912345678', 'Rua x', '123', 1, '12345678', 1),
    ('Carla Medeiros', '12345678902', '923456789', 'Avenida y', '456', 2, '87654321', 2),
    ('Predo Rocha', '12345678903', '934567891', 'Travessia z', '789', 3, '12365487', 3);
    
INSERT INTO Municipio (Estado_ID, Nome, CodIBGE)
VALUES
	(1, 'Camaragibe', 26),
	(2, 'Acopiara', 23),
    (3, 'Aporá', 29);
    
INSERT INTO Estado (Nome, UF)
VALUES
	('Pernambuco', 'PE'),
    ('Ceara', 'CE'),
    ('Bahia', 'BA');