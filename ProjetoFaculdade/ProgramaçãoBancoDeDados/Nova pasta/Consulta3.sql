USE Loja;

CREATE VIEW ContasNaoPagas AS
SELECT  CR.ID AS 'ID da conta a receber',
		C.Nome AS 'Nome do Cliente associado a conta',
        C.CPF AS 'CPF do Cliente associado a conta',
        CR.DataVencimento AS 'Data de vencimento da conta',
        Cr.Valor AS 'Valor da conta'
FROM ContaReceber CR
INNER JOIN Cliente C ON CR.Cliente_ID = C.ID
WHERE CR.Situacao = '1';

SELECT * FROM ContasNaoPagas;