CREATE TABLE IF NOT EXISTS ESCOLA.ALUNO (
    ID CHAR(36) NOT NULL,
    NOME VARCHAR(255),
    IDADE INTEGER NOT NULL,
    EMAIL VARCHAR(255),
    SEXO VARCHAR(20),
    DATA_INSERCAO TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    DATA_ALTERACAO TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    PRIMARY KEY (ID)
)