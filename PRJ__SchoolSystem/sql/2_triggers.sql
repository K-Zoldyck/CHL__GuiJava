
DELIMITER //
	CREATE TRIGGER after_insert_aluno
	AFTER INSERT ON alunos
	FOR EACH ROW
	BEGIN
	    INSERT INTO alunoFaltas (matricula_aluno, id_disciplina, data_aula, faltas)
	    SELECT NEW.matricula, d.id, CURRENT_DATE, 0
	    FROM disciplinas d
	    WHERE d.turma = NEW.turma;
	
	    INSERT INTO alunoNotas (matricula_aluno, id_disciplina, nota_1, nota_2, nota_3)
	    SELECT NEW.matricula, d.id, 0, 0, 0
	    FROM disciplinas d
	    WHERE d.turma = NEW.turma;
	
	    UPDATE turmas
	    SET qtd_alunos = qtd_alunos + 1
	    WHERE id = NEW.turma;
	END//
DELIMITER;

DELIMITER //
	CREATE TRIGGER after_delete_aluno
	AFTER DELETE ON alunos
	FOR EACH ROW
	BEGIN
	    UPDATE turmas
	    SET qtd_alunos = qtd_alunos - 1
	    WHERE id = OLD.turma;
	    
	    DELETE FROM alunoFaltas
	    WHERE matricula_aluno = OLD.matricula;
	
	    DELETE FROM alunoNotas
	    WHERE matricula_aluno = OLD.matricula;
	END//
DELIMITER;

DELIMITER //
	CREATE TRIGGER after_update_aluno
	AFTER UPDATE ON alunos
	FOR EACH ROW
	BEGIN
	    IF OLD.turma <> NEW.turma THEN
	        UPDATE turmas
	        SET qtd_alunos = qtd_alunos - 1
	        WHERE id = OLD.turma;

	        UPDATE turmas
	        SET qtd_alunos = qtd_alunos + 1
	        WHERE id = NEW.turma;
	    END IF;
	END//
DELIMITER;

DELIMITER //
	CREATE TRIGGER after_insert_disciplina
	AFTER INSERT ON disciplinas
	FOR EACH ROW
	BEGIN
	    -- Incrementa a quantidade de disciplinas na turma
	    UPDATE turmas
	    SET qtd_discpl = qtd_discpl + 1
	    WHERE id = NEW.turma;
	END//
DELIMITER;

DELIMITER //
	CREATE TRIGGER after_delete_disciplina
	AFTER DELETE ON disciplinas
	FOR EACH ROW
	BEGIN
	    -- Decrementa a quantidade de disciplinas na turma
	    UPDATE turmas
	    SET qtd_discpl = qtd_discpl - 1
	    WHERE id = OLD.turma;
	END//
DELIMITER;

DELIMITER //
	CREATE TRIGGER after_update_disciplina
	AFTER UPDATE ON disciplinas
	FOR EACH ROW
	BEGIN
	    IF OLD.turma <> NEW.turma THEN
	        UPDATE turmas
	        SET qtd_discpl = qtd_discpl - 1
	        WHERE id = OLD.turma;

	        UPDATE turmas
	        SET qtd_discpl = qtd_discpl + 1
	        WHERE id = NEW.turma;
	    END IF;
	END//
DELIMITER;


