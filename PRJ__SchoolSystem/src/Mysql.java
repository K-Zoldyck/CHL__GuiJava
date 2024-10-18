
/*
    by: lucieudo roberto
*/

import Components.ComboInput;
import Components.TableIten;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class Mysql {
    
    private String status = "Desconectado";
    private Connection conection = null;
    
    public boolean open(String server,String user,String pass, String dbnm) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = String.format("jdbc:mysql://%s/%s",server,dbnm);
            this.conection = DriverManager.getConnection(url,user,pass);
            if (this.conection != null ) {
                this.status = "Conectado";
                return true;
            }
            this.status = "Desconectado";
            return false;
        } 
        catch( ClassNotFoundException | SQLException e) { return false; }
    }
    
    
    
    public List<ComboInput> listLevels() {
        List<ComboInput> levels = new ArrayList<>();
        try {
            Statement s = this.conection.createStatement();
            ResultSet r = s.executeQuery("SELECT id, label FROM nivels");
            
            while (r.next()) {
                levels.add(new ComboInput(r.getInt("id"),r.getString("label")));
            }
            s.close();
        }
        catch (SQLException e) {return null;}
        return levels;
    }
    
    
    public List<ComboInput> listTurnos() {
        List<ComboInput>  turnos = new ArrayList<>();
        try {
            Statement s = this.conection.createStatement();
            ResultSet r = s.executeQuery("SELECT id, label FROM turnos");
            
            while (r.next()) {
                turnos.add(new ComboInput(r.getInt("id"),r.getString("label")));
            }
            s.close();
        }
        catch (SQLException e) {return null;}
        return turnos;
    }
    
    
    
    public List<ComboInput> listTurmasAfter(int id) {
        List<ComboInput>  turmas = new ArrayList<>();
        try {
            Statement s = this.conection.createStatement();
            ResultSet r = s.executeQuery(String.format("SELECT id, nome FROM turmas WHERE nivel > %d AND qtd_discpl < max_discip",id));
            
            while (r.next()) {
                turmas.add(new ComboInput(r.getInt("id"),r.getString("nome")));
            }
            s.close();
        }
        catch (SQLException e) {return null;}
        return turmas;
    }
    
    public List<ComboInput> listGenders() {
        List<ComboInput>  genders = new ArrayList<>();
        try {
            Statement s = this.conection.createStatement();
            ResultSet r = s.executeQuery("SELECT id, label FROM generos");
            
            while (r.next()) {
                genders.add(new ComboInput(r.getInt("id"),r.getString("label")));
            }
            s.close();
        }
        catch (SQLException e) {return null;}
        return genders;
    }
    
    
    public List<ComboInput> listTurmasIdNome() {
        List<ComboInput> turmas = new ArrayList<>();
        try {
            Statement s = this.conection.createStatement();
            ResultSet r = s.executeQuery("SELECT id,nome FROM turmas WHERE qtd_alunos < max_alunos");
            
            while (r.next()) {
                 turmas.add(new ComboInput(r.getInt("id"),r.getString("nome")));
            }
            s.close();
        }
        catch (SQLException e) {return null;}
        return turmas;
    }
    
    
     public List<ComboInput> listProfesIdNome() {
        List<ComboInput> profrs = new ArrayList<>();
        try {
            Statement s = this.conection.createStatement();
            ResultSet r = s.executeQuery("SELECT id,nome FROM professores");
            
            while (r.next()) {
                 profrs.add(new ComboInput(r.getInt("id"),r.getString("nome")));
            }
            s.close();
        }
        catch (SQLException e) {return null;}
        return profrs;
    }
     
     
    public List<TableIten> listRegistres() {
        List<TableIten> regs = new ArrayList<>();
        try {
            Statement s = this.conection.createStatement();
            ResultSet r = s.executeQuery("SELECT id,nome,tipo FROM registros");
            
            while (r.next()) {
                 regs.add(new TableIten(r.getInt("id"),r.getString("nome"),r.getString("tipo")));
            }
            s.close();
        }
        catch (SQLException e) {return null;}
        return regs;
    }
    
     public List<TableIten> listRegistresByTerm(String term) {
        List<TableIten> regs = new ArrayList<>();
        try {
            Statement s = this.conection.createStatement();
            ResultSet r = s.executeQuery(String.format("SELECT id, nome, tipo FROM registros WHERE nome LIKE '%%%s%%'", term));            
            while (r.next()) {
                 regs.add(new TableIten(r.getInt("id"),r.getString("nome"),r.getString("tipo")));
            }
            s.close();
        }
        catch (SQLException e) {return null;}
        return regs;
    }
    
    
   public Object[][] getTurmaInfos(int turmaId) {
        List<String[]> dataList = new ArrayList<>();

        try {
            Statement s = this.conection.createStatement();
            ResultSet r = s.executeQuery(String.format(Queries.get_turma_infos(), turmaId));
            while (r.next()) {
                ArrayList<String> temp_data = new ArrayList<>();
                temp_data.add(r.getString("disciplina"));
                temp_data.add(r.getString("local"));
                temp_data.add(r.getString("nivel"));
                temp_data.add(r.getString("turno"));
                dataList.add(temp_data.toArray(new String[0]));
            }
            s.close();
        } 
        catch (SQLException e) {return null;}

        Object[][] dataArray = new Object[dataList.size()][];
        
        for (int i = 0; i < dataList.size(); i++) {
            dataArray[i] = dataList.get(i);
        }
        return dataArray;
}
   
    public Object[][] getFaltasInfos(String matricula) {
        List<String[]> dataList = new ArrayList<>();

        try {
            Statement s = this.conection.createStatement();
            ResultSet r = s.executeQuery(String.format(Queries.select_detalhes_aluno_faltas_by_matricula(), matricula));
            while (r.next()) {
                ArrayList<String> temp_data = new ArrayList<>();
                temp_data.add(r.getString("d_id"));
                temp_data.add(r.getString("nome_disciplina"));
                temp_data.add(r.getString("turno_disciplina"));
                temp_data.add(r.getString("dia"));
                temp_data.add(r.getString("faltas"));
                dataList.add(temp_data.toArray(new String[0]));
            }
            s.close();
        } 
        catch (SQLException e) {return null;}

        Object[][] dataArray = new Object[dataList.size()][];
        
        for (int i = 0; i < dataList.size(); i++) {
            dataArray[i] = dataList.get(i);
        }
        return dataArray;
}

  
      public List<String> select_notas_dia_faltas(int id_disciplina, String aluno_matricula) {
        List<String>  aluno = new ArrayList<>();
        try {
            Statement s = this.conection.createStatement();
            ResultSet r = s.executeQuery(String.format(Queries.select_notas_dia_by_matricula_disciplina_id(),aluno_matricula,id_disciplina));
            if (r.next()) {
                aluno.add(r.getString("nota_1"));                
                aluno.add(r.getString("nota_2"));            
                aluno.add(r.getString("nota_3"));
                aluno.add(r.getString("dia"));
                aluno.add(r.getString("faltas"));
            }
            s.close();
        }
        catch (SQLException e) {return null;}
        return aluno;
     }
   

     
    
    public List<String> listTurmasNivelTurnoById(int id) {
        List<String>  turmas = new ArrayList<>();
        try {
            Statement s = this.conection.createStatement();
            ResultSet r = s.executeQuery(String.format("SELECT nivels.label AS level_label,turnos.label AS turno_label FROM turmas INNER JOIN nivels ON turmas.nivel = nivels.id INNER JOIN turnos ON turmas.turno = turnos.id WHERE turmas.id = %d",id));
            
            while (r.next()) {
                turmas.add(r.getString("level_label"));                
                turmas.add(r.getString("turno_label"));
            }
            s.close();
        }
        catch (SQLException e) {return null;}
        return turmas;
    }
    
    
    public boolean removerRegistro(TableIten regs) {        
        try {
            Statement s = this.conection.createStatement();
            int rows = s.executeUpdate(String.format("DELETE FROM %s WHERE id = %d",regs.getType(),regs.getId()));
            if ( rows > 0 ) {
                s.close();
                return true;
            }
            s.close();
            return false;
        }
        catch (SQLException e) {}
        return false;
    }
    
     public List<String> select_aluno_byID(int id) {
        List<String>  aluno = new ArrayList<>();
        try {
            Statement s = this.conection.createStatement();
            ResultSet r = s.executeQuery(String.format(Queries.select_aluno_by_id(),id));
            if (r.next()) {
                aluno.add(r.getString("nome"));                
                aluno.add(r.getString("cpf"));            
                aluno.add(r.getString("telefone"));
                aluno.add(r.getString("email"));
                aluno.add(r.getString("endereco"));
                aluno.add(r.getString("genero"));
                aluno.add(r.getString("deficiencia"));
                aluno.add(r.getString("turma"));
                aluno.add(r.getString("data_nascimento"));
            }
            s.close();
        }
        catch (SQLException e) {return null;}
        return aluno;
     }
     
     
     
     public Object[] select_detalhes_turmas(int id) {
        Object[] data = new Object[]{};
        try {
            Statement s = this.conection.createStatement();
            ResultSet r = s.executeQuery(String.format(Queries.select_detalhes_turma_by_id(),id));
            if (r.next()) {
                data = new Object[]{r.getString("turno"),r.getString("nivel"),r.getString("quantidade_de_alunos"),r.getString("max_alunos")};                
                s.close();
                
            }
            s.close();
        }
        catch (SQLException e) {System.out.println(e.getMessage());}
        return data;
     }
     
    public Object[] select_detalhes_aluno_by_id(int id) {
        Object[] data = new Object[]{};
        try {
            Statement s = this.conection.createStatement();
            ResultSet r = s.executeQuery(String.format(Queries.select_detalhes_aluno_by_id(),id));
            if (r.next()) {
                data = new Object[]{r.getString("matricula"),r.getString("nome"),r.getString("cpf"),r.getString("email")};                
                s.close();
                
            }
            s.close();
        }
        catch (SQLException e) {System.out.println(e.getMessage());}
        return data;
     }
     
     
     
     
    
    public List<String> select_detalhes_turmas_by_id(int id) {
        List<String> data = new ArrayList<>();
        try {
            Statement s = this.conection.createStatement();
            ResultSet r = s.executeQuery(String.format(Queries.select_turma_by_id(),id));
            if (r.next()) {
                data.add(r.getString("nome"));
                data.add(r.getString("max_discip"));    
                data.add(r.getString("max_alunos"));  
                data.add(r.getString("nivel")); 
                data.add(r.getString("turno")); 
                data.add(r.getString("proxima_turma")); 
                s.close();
            }
            s.close();
        }
        catch (SQLException e) {System.out.println(e.getMessage());}
        return data;
     }
     
     
    public Object[] select_detalhes_professor(int id) {
        Object[] data = new Object[]{};
        try {
            Statement s = this.conection.createStatement();
            ResultSet r = s.executeQuery(String.format(Queries.select_detalhes_professor_by_id(),id));
            if (r.next()) {
                data = new Object[]{r.getString("nome"),r.getString("email"),r.getString("telefone")};                
                s.close();
                
            }
            s.close();
        }
        catch (SQLException e) {System.out.println(e.getMessage());}
        return data;
     }
    
    
     public List<String> select_professor_by_id(int id) {
        List<String> data = new ArrayList<>();
        try {
            Statement s = this.conection.createStatement();
            ResultSet r = s.executeQuery(String.format(Queries.select_professor_by_id(),id));
            if (r.next()) {
                data.add(r.getString("nome"));
                data.add(r.getString("email"));    
                data.add(r.getString("cpf"));  
                data.add(r.getString("genero")); 
                data.add(r.getString("endereco")); 
                data.add(r.getString("data_nascimento")); 
                data.add(r.getString("informacoes")); 
                data.add(r.getString("telefone")); 
                s.close();
            }
            s.close();
        }
        catch (SQLException e) {System.out.println(e.getMessage());}
        return data;
     }
     

     
   public Object[][] select_registers_count() {
        Object[][] data = new Object[1][4]; // 1 linha, 4 colunas
        try {
            Statement s = this.conection.createStatement();
            ResultSet r = s.executeQuery(Queries.select_regs_counts());
            if (r.next()) {
                data[0][0] = r.getInt("total_alunos");
                data[0][1] = r.getInt("total_professores");
                data[0][2] = r.getInt("total_disciplinas");
                data[0][3] = r.getInt("total_turmas");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return data;
   }
     
     
     public List<String> select_disciplina_local_aula(int id) {
        List<String>  aluno = new ArrayList<>();
        try {
            int local_aula_id = 0;
            Statement s = this.conection.createStatement();
            ResultSet r = s.executeQuery(String.format(Queries.select_disciplina_by_id(),id));
            if (r.next()) {                 
                aluno.add(r.getString("nome"));                
                aluno.add(r.getString("semestre"));            
                aluno.add(r.getString("media_aprovacao"));
                aluno.add(r.getString("turma"));
                aluno.add(r.getString("professor"));
                aluno.add(r.getString("cargaH"));
                local_aula_id = r.getInt("localAula");
            }
            r = s.executeQuery(String.format(Queries.select_local_aula_by_id(),local_aula_id));
            if (r.next()) {  
                aluno.add(r.getString("sala"));                
                aluno.add(r.getString("horario_entrada"));            
                aluno.add(r.getString("horario_saida"));
                aluno.add(r.getString("dia"));
                aluno.add(r.getString("id"));
            }
            s.close();
        }
        catch (SQLException e) {return null;}
        return aluno;
      }
   
   public boolean updateFaltas( String alunoMatricula,int idDisciplina,int faltas) {
        try {
            Statement s = this.conection.createStatement();
            String sql = String.format(Queries.update_faltas(),faltas,alunoMatricula,idDisciplina);
            if ( s.executeUpdate(sql) > 0 ) { s.close(); return true;}
        }
        catch (SQLException e) {System.out.println(e.getMessage());return false;}
        return false;
   }
   
   public boolean updateNotas(double n1, double n2, double n3, String alunoMatricula,int idDisciplina) {
        try {
            Statement s = this.conection.createStatement();
            String sql = String.format(Queries.update_notas(),n1,n2,n3,alunoMatricula,idDisciplina);
            if ( s.executeUpdate(sql) > 0 ) { s.close(); return true;}
        }
        catch (SQLException e) {System.out.println(e.getMessage());return false;}
        return false;
   }
   
   
     
   public boolean updateTurma(
        String nome,
        int nivel,
        int turno,
        int max_alunos,
        int max_discip,
        int proxima_turma,
        int turma_id
        ) {
        try {
            Statement s = this.conection.createStatement();
            String sql = String.format(Queries.update_turma(),nome,max_discip,max_alunos,nivel,turno,proxima_turma,turma_id);
            if ( s.executeUpdate(sql) > 0 ) { s.close(); return true;}
        }
        catch (SQLException e) {System.out.println(e.getMessage());return false;}
        return false;
    }
   
   
   
    public boolean insertTurma(
        String nome,
        int nivel,
        int turno,
        int max_alunos,
        int max_discip,
        int proxima_turma
        ) {
        try {
            Statement s = this.conection.createStatement();
            String sql = String.format(Queries.insert_turma(),nome,nivel,turno,max_alunos,max_discip,proxima_turma);
            if ( s.executeUpdate(sql) > 0 ) { s.close(); return true;}
        }
        catch (SQLException e) {return false;}
        return false;
    }
    
    
    public boolean updateProfessor(
        //nome='%s',email='%s', telefone='%s',cpf='%s',genero=%d,endereco='%s',data_nascimento='%s',informacoes='%s'
        String nome,
        String email,
        String telefone,
        String cpf, 
        int genero, 
        String endereco, 
        String data_nascimento, 
        String informacoes,
        int professor_id
     ) {
        try {
            Statement s = this.conection.createStatement();
            String sql =  String.format(Queries.update_professor(),nome,email,telefone,cpf,genero,endereco,data_nascimento,informacoes,professor_id);
            if ( s.executeUpdate(sql) > 0 ) {s.close(); return true;}
            s.close();
        }
        catch (SQLException e) { System.out.println(e.getMessage());return false;}
        return false;
    }
    
    
    public boolean inserProfessor(
        String nome,
        String email,
        String telefone,
        String cpf, 
        int genero, 
        String endereco, 
        String data_nascimento, 
        String informacoes
     ) {
        try {
            Statement s = this.conection.createStatement();
            String sql =  String.format(Queries.insert_professor(),nome,email,telefone,cpf,genero,endereco,data_nascimento,informacoes);
            if ( s.executeUpdate(sql) > 0 ) {s.close(); return true;}
            s.close();
        }
        catch (SQLException e) { System.out.println(e.getMessage());return false;}
        return false;
    }
     
     public boolean updateAluno (
        String nome,
        String cpf,
        String telefone,
        String email,
        String endereco,
        int genero,
        boolean deficiencia,
        int turma, 
        String data_nascimento, 
        int id
     ) {
        try {
            Statement s = this.conection.createStatement();
            String sql =  String.format(Queries.update_aluno(),  nome,cpf,telefone,email,endereco,genero,deficiencia,turma,data_nascimento,id);
            if ( s.executeUpdate(sql) > 0 ) {s.close(); return true;}
        }
        catch (SQLException e) {}
        return false;
    }
     
    public boolean insertAluno(
        String matricula,
        String nome,
        String cpf,
        String telefone, 
        String email,
        String endereco,
        int genero, 
        boolean deficiencia,
        int turma,
        String nascimento
     ) {
        try {
            Statement s = this.conection.createStatement();
            String sql =  String.format(Queries.insert_aluno(),matricula,nome,cpf,telefone,email,endereco,genero,deficiencia,turma,nascimento);
            ResultSet turmas_vazia = s.executeQuery(String.format(Queries.turmas_as_aluno_space(),turma));
            
            if (turmas_vazia.next()) {
                if (turmas_vazia.getBoolean(1)) {
                     if ( s.executeUpdate(sql) > 0 ) {s.close(); return true;}
                }
                alert("A turma escolhida está cheia");
                s.close();
                return false;
            }
        }
        catch (SQLException e) {}
        return false;
    }
   
    public boolean updateDisciplina(
        String sala,
        String horario_entrada,
        String horario_saida,
        String dia, 
        String nome,
        int semestre,
        int media_aprovacao,
        int turma,
        int professor,
        int cargaH,
        int d_id,
        int l_id
     ) {
        try {
            Statement s = this.conection.createStatement();
            String sql_disciplina =  String.format(Queries.update_disciplina(),nome,semestre,media_aprovacao,turma,professor,cargaH,d_id);
            String sql_localaulas =  String.format(Queries.update_localAulas(),sala,horario_entrada,horario_saida,dia,l_id);

            if ( s.executeUpdate(sql_disciplina) > 0 ) {
                if (s.executeUpdate(sql_localaulas) > 0 ){
                    s.close(); 
                    return true;   
                }
            }
        }
        catch (SQLException e) {System.out.println(e.getMessage());}
        return false;
    }
    
     public boolean insertDisciplina(
        String sala,
        String horario_entrada,
        String horario_saida,
        String dia, 
        String nome,
        int semestre,
        int media_aprovacao,
        int turma,
        int professor,
        int cargaH
     ) {
        try {
            Statement s = this.conection.createStatement();
            String sql =  String.format(Queries.insert_local_aulas(),sala,horario_entrada,horario_saida,dia);
          
            if ( s.executeUpdate(sql,Statement.RETURN_GENERATED_KEYS) > 0 ) {
                ResultSet id = s.getGeneratedKeys();
                
                if (id.next()) {
                    long localAulaId = id.getLong(1);
                    String nsql = String.format(Queries.insert_disciplina(),nome,semestre,media_aprovacao,turma,professor,cargaH,localAulaId);
                    try {
                        if (s.executeUpdate(nsql) > 0 ) {
                            s.close();
                            return true;
                        }
                    }
                    catch (SQLException e) {s.close(); return false;}
                }
            }
        }
        catch (SQLException e){return false;}
        return false;
    }
     
     
     
    private void alert(String msg) {
        JOptionPane.showMessageDialog(null,msg, "Avisos", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public boolean close() {
        try { 
            this.conection.close();
            this.status = "Desconectado";
            return true;
        }
        catch( SQLException e) { return false; }
    
    }
    public String getStatus() {return this.status;}
}
