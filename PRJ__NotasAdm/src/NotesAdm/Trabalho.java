
package NotesAdm;
import java.io.Serializable;

public class Trabalho extends Avaliacoes implements Serializable {
//    private String tema;
//    private String form;
    private boolean delivered;
    
    public Trabalho(String name, String date, String desc, double nota, boolean delivered) {
        this.date = date;
        this.name = name;
        this.desc = desc;
        this.nota = nota;
        this.delivered = delivered;
    }
    
    public boolean isDelivered(){return this.delivered;}
}
