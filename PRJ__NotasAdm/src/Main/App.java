
package Main;
import NotesAdm.Disciplina;
import java.io.Serializable;
import java.util.ArrayList;


public class App implements Serializable {
    private ArrayList<Disciplina> disciplines = new ArrayList<>();
    
    public Disciplina addDiscipline(String name,double final_note) {
        if (!this.disciplineAsRegistered(name)) {
             Disciplina nds = new Disciplina(name,final_note);
             this.disciplines.add(nds);
             return nds; 
        }
        return null;
    }
    
    public boolean remDisciplina(String name) {
         if (!this.disciplines.isEmpty()) 
              return this.disciplines.removeIf(d -> d.getName().equals(name));
         
         return false;
    }
    
    private boolean disciplineAsRegistered(String disciplineName) {
        if (!this.disciplines.isEmpty())
            for (Disciplina ds : this.disciplines)
                if (ds.getName().equals(disciplineName)) return true;
            
        return false;
    }
    
    public ArrayList<Disciplina> getDisciplinas() {
        if (!this.disciplines.isEmpty())
            return this.disciplines;
        return null;
    }
}
