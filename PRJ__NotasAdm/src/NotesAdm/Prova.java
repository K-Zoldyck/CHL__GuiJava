
package NotesAdm;
import java.io.Serializable;

public class Prova extends Avaliacoes implements Serializable {
//    private short qtd_questoes;
//    private short qtd_qacertos;
    
    public Prova(String name,String date, String desc,double nota) {
        this.date = date;
        this.name = name;
        this.desc = desc;
        this.nota = nota;
    }
}
