USE EMPRESA

CREATE TABLE produtos(
	codigo INT PRIMARY KEY,
	nome VARCHAR(50),
	preco_unitario DECIMAL(5,2),
	quant_estoque INT)

INSERT INTO produtos VALUES (1, 'Sabonete',5,100)
INSERT INTO produtos VALUES (2, 'Sabão',3,199)
INSERT INTO produtos VALUES (3, 'Maionese',6.78,20)
INSERT INTO produtos VALUES (4, 'Oleo',3.21,500)
INSERT INTO produtos VALUES (5, 'Pão de Forma',8.56,20)

SELECT * FROM produtos