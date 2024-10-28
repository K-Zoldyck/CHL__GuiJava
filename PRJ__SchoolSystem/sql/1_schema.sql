
CREATE TABLE IF NOT EXISTS nivels (
    id INT PRIMARY KEY AUTO_INCREMENT,
    label VARCHAR(30) NOT NULL    
);

CREATE TABLE IF NOT EXISTS turnos (
    id INT PRIMARY KEY AUTO_INCREMENT,
    label VARCHAR(30) NOT NULL    
);

CREATE TABLE IF NOT EXISTS generos (
    id INT PRIMARY KEY AUTO_INCREMENT,
    label VARCHAR(20)
);
   
CREATE TABLE IF NOT EXISTS turmas (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(30) NOT NULL,
    nivel INT NOT NULL,
    turno INT NOT NULL,
    max_alunos INT NOT NULL,
    max_discip INT NOT NULL,
    qtd_alunos INT DEFAULT 0,
    qtd_discpl INT DEFAULT 0,
    proxima_turma INT,
        
    UNIQUE (nivel,turno,nome),
    FOREIGN KEY (nivel) REFERENCES nivels(id),
    FOREIGN KEY (turno) REFERENCES turnos(id)
);
 
CREATE TABLE IF NOT EXISTS alunos (
    id INT PRIMARY KEY AUTO_INCREMENT,
    matricula varchar(11) UNIQUE NOT NULL,
    nome VARCHAR(50) NOT NULL,
    cpf VARCHAR(15) UNIQUE,
    telefone VARCHAR(17) UNIQUE,
    email VARCHAR(30) UNIQUE,
    endereco VARCHAR(50) NOT NULL,
    genero INT NOT NULL,
    data_nascimento DATE,
    deficiencia BOOL,
    turma INT NOT NULL,
        
    FOREIGN KEY (genero) REFERENCES generos(id),
    FOREIGN KEY (turma) REFERENCES turmas(id)
);

CREATE TABLE IF NOT EXISTS professores (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(30) NOT NULL,
    email VARCHAR(30) UNIQUE,
    telefone VARCHAR(23) UNIQUE,
    cpf VARCHAR(15) UNIQUE,
    genero INT NOT NULL,
    endereco VARCHAR(50) NOT NULL,
    data_nascimento DATE NOT NULL,
    informacoes VARCHAR(320),
    FOREIGN KEY (genero) REFERENCES generos(id)
);

CREATE TABLE IF NOT EXISTS localAulas (
    id INT PRIMARY KEY AUTO_INCREMENT,
    sala VARCHAR(30),
    horario_entrada VARCHAR(6) NOT NULL,
    horario_saida VARCHAR(6) NOT NULL,
    dia VARCHAR(14) NOT NULL,  
    UNIQUE(sala,horario_entrada,horario_saida,dia)
);
    
CREATE TABLE IF NOT EXISTS disciplinas (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(30) NOT NULL,
    semestre INT DEFAULT 1,
    media_aprovacao INT DEFAULT 7,
    turma INT NOT NULL,
    professor INT,
    cargaH SMALLINT DEFAULT 32,
    localAula INT,

    FOREIGN KEY (professor) REFERENCES professores(id),
    FOREIGN KEY (localAula) REFERENCES localAulas(id),
    FOREIGN KEY (turma) REFERENCES turmas(id)
);

CREATE TABLE IF NOT EXISTS alunoFaltas (
    matricula_aluno varchar(11) NOT NULL,
    id_disciplina int NOT NULL,
    data_aula DATE NOT NULL,
    faltas SMALLINT DEFAULT 0 ,
     
    FOREIGN KEY (matricula_aluno) REFERENCES alunos(matricula) ON DELETE CASCADE,
    FOREIGN KEY (id_disciplina) REFERENCES disciplinas(id) ON DELETE CASCADE
);

CREATE TABLE IF NOT EXISTS alunoNotas (
    matricula_aluno varchar(11) NOT NULL,
    id_disciplina int NOT NULL,
    nota_1 FLOAT DEFAULT 0,
    nota_2 FLOAT DEFAULT 0,
    nota_3 FLOAT DEFAULT 0,
    
    FOREIGN KEY (matricula_aluno) REFERENCES alunos(matricula) ON DELETE CASCADE,
    FOREIGN KEY (id_disciplina) REFERENCES disciplinas(id) ON DELETE CASCADE
);


CREATE VIEW registros AS SELECT id, nome, 'alunos' AS tipo FROM alunos
    UNION ALL SELECT id, nome, 'turmas' AS tipo FROM turmas
    UNION ALL SELECT id, nome, 'professores' AS tipo FROM professores
    UNION ALL SELECT id, nome, 'disciplinas' AS tipo FROM disciplinas;
        
