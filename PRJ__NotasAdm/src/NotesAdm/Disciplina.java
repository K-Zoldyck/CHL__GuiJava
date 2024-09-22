
package NotesAdm;
import java.io.Serializable;
import java.util.ArrayList;

public class Disciplina implements Serializable {
    private String name;
    private double final_note;
    private double final_media;
    
    private ArrayList<Prova> provas = new ArrayList<>();
    private ArrayList<Trabalho> trabls = new ArrayList<>();
    
    public Disciplina(String name,double final_note) {
        this.name = name;
        this.final_note = final_note;
    }
    
    public Object[][] provasToTable() {
       Object[][] output = new Object[this.provas.size()][3];
       
       if (!this.provas.isEmpty()) {
           for (int i = 0; i < this.provas.size(); i++) {
               Prova pv = this.provas.get(i);
               output[i][0] = pv.getName();
               output[i][1] = pv.getNota();
               output[i][2] = pv.getDate();
           }
       }

       return output;
    }
    
    private void calcMedia() {
        double md_P = 0.0;
        double md_T = 0.0;
        
        // somatório das provas
        if (!this.provas.isEmpty()) 
            for (Prova prova : this.provas) md_P += prova.getNota();
            
        // somatório dos trabalhos
        if (!this.trabls.isEmpty())
            for (Trabalho trabl : this.trabls) md_T += trabl.getNota();
        
        if ( md_P > 0 ) this.final_media  = md_P/this.provas.size();
        if ( md_P > 0 ) this.final_media += md_T;
    }
    
   
    public Object[][] trablsToTable() {
       Object[][] output = new Object[this.trabls.size()][3];
       
       if (!this.trabls.isEmpty()) {
           for (int i = 0; i < this.trabls.size(); i++) {
               Trabalho tb = this.trabls.get(i);
               output[i][0] = tb.getName();
               output[i][1] = tb.getNota();
               output[i][2] = tb.getDate();
           }
       }

       return output;
    }

   
    public boolean remProva(String name) {
        if (!this.provas.isEmpty())
            return this.provas.removeIf(prova -> prova.getName().equals(name));
        return false;
    }
    
    public boolean remTrabl(String name) {
        if (!this.trabls.isEmpty())
            return this.trabls.removeIf(trabl -> trabl.getName().equals(name));
        return false;
    }
    
    public boolean addProva(Prova p) {
        if (!this.provaAsRegistered(p.getName()))
            return this.provas.add(p);
        return false;
    }
    
    public boolean addTrabl(Trabalho t) {
        if (!this.trablAsRegistered(t.getName()))
            return this.trabls.add(t);
        return false;
    }
    
    public Prova getProva(String name) {
        if (!this.provas.isEmpty()) {
            for (int x=0; x<this.provas.size(); x++) 
                if (this.provas.get(x).getName().equals(name)) 
                    return this.provas.get(x);
        }
        return null;
    }
    
     public Trabalho getTrabl(String name) {
        if (!this.trabls.isEmpty()) {
            for (int x=0; x<this.trabls.size(); x++) 
                if (this.trabls.get(x).getName().equals(name)) 
                    return this.trabls.get(x);
        }
        return null;
    }
    
    private boolean provaAsRegistered(String provaName) {
        if (!this.provas.isEmpty())
            for (Prova p : this.provas) {
                if (p.getName().equals(provaName)) return true;
            }
        
        return false;
    }
    
    private boolean trablAsRegistered(String trablName) {
        if (!this.trabls.isEmpty())
            for (Trabalho t : this.trabls) {
                if (t.getName().equals(trablName)) return true;
            }
        
        return false;
    }
    
    public String getMedia() {
        this.calcMedia();
        return String.format("Média  %.1f",(this.final_media >= 100 ) ? 100 : this.final_media);
    }
    
    public String getDefit() {
        this.calcMedia();
        double defict = this.final_note-this.final_media;
        return String.format("Défice  %.1f",(defict > 0 ) ? defict : 0);
    }
    
    public String getStatus() {
        this.calcMedia();
        return String.format("Status  %s",(this.final_media >= this.final_note) ? "Aprovado" : "Reprovado");
    }
    
    public String getName() {return this.name;}
    
    @Override
    public String toString() {return this.name;}
}
