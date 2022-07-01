Create TABLE pessoas(
    id INT NOT NULL PRIMARY KEY AUTOINCREMENT,
    nome VARCHAR(20),
    nascimento DATE
)

INSERT INTO pessoas (nome, nascimento) VALUES ('teste','1889 11 22')
INSERT INTO pessoas (nome, nascimento) VALUES ('teste2','1999 01 12')
INSERT INTO pessoas (nome, nascimento) VALUES ('teste3','2009 05 04')