
public class Queries {
   
    public static String select_regs_counts() {
        return """
               SELECT (SELECT COUNT(*) FROM alunos) AS total_alunos,(SELECT COUNT(*) FROM disciplinas) AS total_disciplinas,
                   (SELECT COUNT(*) FROM turmas) AS total_turmas,
                   (SELECT COUNT(*) FROM professores) AS total_professores""";
    }
    public static String select_aluno_by_id() {
        return "SELECT nome,cpf,telefone,email,endereco,genero,deficiencia,turma,data_nascimento FROM alunos WHERE id = %d LIMIT 1";
    }
    
    public static String select_professor_by_id() {
        return "SELECT nome,email,cpf,genero,endereco,data_nascimento,telefone,informacoes FROM professores WHERE id=%d";
    }
    
    public static String select_detalhes_turma_by_id() {
        return  "SELECT turnos.label AS turno, nivels.label AS nivel, turmas.qtd_alunos AS quantidade_de_alunos, turmas.max_alunos AS max_alunos FROM turmas JOIN nivels ON turmas.nivel = nivels.id JOIN turnos ON turmas.turno = turnos.id WHERE turmas.id = %d AND turmas.qtd_discpl < turmas.max_discip";
    }
    
    public static String select_detalhes_aluno_by_id() {
        return  "SELECT matricula,nome,cpf,email FROM alunos WHERE id=%d";
    }
    
    public static String select_detalhes_aluno_faltas_by_matricula() {
        return "SELECT d.id AS d_id, d.nome AS nome_disciplina, t2.label AS turno_disciplina, lf.data_aula AS dia, lf.faltas FROM alunos a JOIN alunoFaltas lf ON a.matricula = lf.matricula_aluno JOIN disciplinas d ON lf.id_disciplina = d.id JOIN turmas tu2 ON d.turma = tu2.id JOIN turnos t2 ON tu2.turno = t2.id WHERE a.matricula = '%s';";
    }
    
    public static String select_notas_dia_by_matricula_disciplina_id() {
        return "SELECT an.nota_1, an.nota_2, an.nota_3, lf.data_aula AS dia, lf.faltas FROM alunoNotas an JOIN alunoFaltas lf ON an.matricula_aluno = lf.matricula_aluno AND an.id_disciplina = lf.id_disciplina WHERE an.matricula_aluno = '%s' AND an.id_disciplina = %d;";
    }
    
    public static String select_detalhes_professor_by_id() {
        return "SELECT nome,email,telefone FROM professores WHERE id=%d";
    }
    
    public static String select_disciplina_by_id() {
        return "SELECT nome,semestre,media_aprovacao,turma,professor,cargaH,localAula FROM disciplinas WHERE id=%d LIMIT 1";
    }
    
    public static String turmas_as_aluno_space() {
        return "SELECT EXISTS(SELECT 1 FROM turmas WHERE qtd_alunos < max_alunos and id=%d)";
    }
    public static String increment_turma_alunos() {
        return "UPDATE turmas SET qtd_alunos = qtd_alunos + 1 WHERE id = %d;";
    }
    
    public static String update_faltas() {
        return "UPDATE alunoFaltas SET faltas = %d WHERE matricula_aluno='%s' AND id_disciplina = %d ";
    }
    
    public static String update_notas() {
        return "UPDATE alunoNotas SET nota_1=%.2f,nota_2=%.2f,nota_3=%.2f WHERE matricula_aluno='%s' AND id_disciplina = %d";
    }
    
    public static String update_turma() {
        return "UPDATE turmas SET nome='%s',max_discip=%d, max_alunos=%d, nivel=%d,turno=%d, proxima_turma=%d WHERE id=%d";
    }
    
    public static String select_turma_by_id() {
        return "SELECT nome,max_discip,  max_alunos, nivel,turno, proxima_turma FROM turmas WHERE id=%d";
    }
    
    public static String select_local_aula_by_id() {
        return "SELECT sala,horario_entrada,horario_saida,dia,id FROM localAulas WHERE id =%d LIMIT 1";
    }
    
    public static String update_professor() {
        return "UPDATE professores SET nome='%s',email='%s', telefone='%s',cpf='%s',genero=%d,endereco='%s',data_nascimento='%s',informacoes='%s' WHERE id = %d";
    }
    
    public static String update_aluno() {
        return "UPDATE alunos SET nome = '%s', cpf = '%S', telefone = '%s', email = '%s', endereco = '%s', genero = %d, deficiencia = %b, turma = %d, data_nascimento = '%s' WHERE id = %d";
    }
    
    public static String update_localAulas() {
 	return "UPDATE localAulas SET sala = '%s',horario_entrada = '%s',horario_saida = '%s', dia = '%s' WHERE id = %d";
    }
    
    public static String update_disciplina() {
 	return "UPDATE disciplinas SET nome = '%s',semestre = %d,media_aprovacao=%d,turma=%d,professor=%d,cargaH=%d WHERE id = %d";
    }
    
    public static String get_turma_infos() {
        return "SELECT d.nome AS disciplina, la.sala AS local, n.label AS nivel, t.label AS turno FROM disciplinas d LEFT JOIN localAulas la ON d.localAula = la.id LEFT JOIN turmas tu ON d.turma = tu.id LEFT JOIN nivels n ON tu.nivel = n.id LEFT JOIN turnos t ON tu.turno = t.id WHERE d.turma = %d AND tu.qtd_alunos < tu.max_alunos;";
    }
    
    public static String insert_turma() {
        return "INSERT INTO turmas(nome,nivel,turno,max_alunos,max_discip,proxima_turma) VALUES('%s',%d,%d,%d,%d,%d)";
    }
    
    public static String insert_local_aulas() {
        return "INSERT INTO localAulas(sala,horario_entrada,horario_saida,dia) VALUES('%s','%s','%s','%s')";
    }
    
    public static String insert_disciplina() {
        return "INSERT INTO disciplinas(nome,semestre,media_aprovacao,turma,professor,cargaH,localAula) VALUES ('%s',%d,%d,%d,%d,%d,%d)";
    }
    
    public static String insert_professor() {
        return "INSERT INTO professores(nome,email,telefone,cpf,genero,endereco,data_nascimento,informacoes) VALUES('%s','%s','%s','%s',%d,'%s','%s','%s')";
    }
    
    public static String insert_aluno() {
        return "INSERT INTO alunos (matricula,nome,cpf,telefone,email,endereco,genero,deficiencia,turma,data_nascimento) values('%s','%s','%s','%s','%s','%s',%d,%b,%d,'%s')";
    }
}
