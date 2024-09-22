
package TSq;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Tarefa {
    protected String nome;
    protected String data;
    protected String desc;
    protected boolean notfy;
    protected Timestamp timestamp;
    protected short  estd = Tarefa.PENDENTE;
    
    public static final short PENDENTE  = 1;
    public static final short ATRASADA  = 3;
    public static final short CONCLUIDA = 2;

     
    public Tarefa( String nome, String data,String desc, boolean notfy ) {
        this.nome = nome;
        this.data = data;
        this.desc = desc;
        this.notfy = notfy;
        this.createTimesTamp();
    }
    
    public void editar( String nome, String data,String desc, boolean notfy ) {
        this.nome = nome;
        this.data = data;
        this.desc = desc;
        this.notfy = notfy;
        this.createTimesTamp();
    }
    
    public String[] toArray() {
       String strEstd = (this.estd == 1) ? "Pendente" : (this.estd == 2 ) ? "Concluida" : "Atrasada";
       String[] data = {this.nome,String.format("%s, 12:59 AM",this.data),strEstd};
       return data;
    }
    
    private void createTimesTamp() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy, h:mm a");
        LocalDateTime dataHora = LocalDateTime.parse(String.format("%s, 12:59 AM", this.data), formatter);
        this.timestamp = Timestamp.valueOf(dataHora);
    }
    
    public Timestamp getTimestamp() {return this.timestamp;}
    public String getNome() {return this.nome;}
    public String getData() {return this.data;}
    public String getDesc() {return this.desc;}
    public boolean getNotfy() {return this.notfy;}
    public short getEstd() {return this.estd;}
    
    public void setStatus(short estd) { 
        if ( this.estd != 2 ) this.estd = estd;
    }
    
    public void setStatusForced(short estd) { this.estd = estd;}
}
