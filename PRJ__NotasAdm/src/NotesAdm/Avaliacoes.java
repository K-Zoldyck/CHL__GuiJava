

package NotesAdm;
public class Avaliacoes {
    protected String name;
    protected String date;
    protected String desc;
    protected double nota;
    
    public void setNota(double value) { this.nota = value;}
    public void setName(String name) {this.name = name;}
    public void setDate(String date) {this.date = date;}
    public void setDesc(String desc) {this.desc = desc;}
    
    public double getNota() { return this.nota;}
    public String getName() {return this.name;}
    public String getDate() {return this.date;}
    public String getDesc() {return this.desc;}
}
