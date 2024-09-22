
package TSq;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TarefaPrioritaria extends Tarefa {
    private short hora;
    private short mnut;
    private boolean pmam;
    
    public TarefaPrioritaria(String nome, String data, String desc, boolean notfy,short hora, short mnut,boolean pmam) {
        super(nome, data, desc, notfy);
        this.hora = hora;
        this.mnut = mnut;
        this.pmam = pmam;
        this.createTimesTamp();
    }
    
    public void editar(String nome, String data, String desc, boolean notfy,short hora, short mnut,boolean pmam) {
        this.nome = nome;
        this.data = data;
        this.desc = desc;
        this.notfy = notfy;
        this.hora = hora;
        this.mnut = mnut;
        this.pmam = pmam;
        this.createTimesTamp();
    }
    
    private void createTimesTamp() {
        String pmam_f = (this.pmam) ? "PM" : "AM";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy, h:mm a");
        LocalDateTime dataHora = LocalDateTime.parse(String.format("%s, %d:%02d %s", this.data,this.hora,this.mnut,pmam_f), formatter);
        this.timestamp = Timestamp.valueOf(dataHora);
    }
    
    @Override
    public String[] toArray() {
       String pmam_f = (this.pmam) ? "PM" : "AM";
       String strEstd = (this.estd == 1) ? "Pendente" : (this.estd == 2 ) ? "Concluida" : "Atrasada";
       String[] data = {this.nome,String.format("%s, %02d:%02d %s",this.data,this.hora,this.mnut,pmam_f),strEstd};
       return data;
    }
    
    public void setHora(short hora){this.hora = hora;}
    public void setMnut(short mnut){this.mnut = mnut;}
    
    public boolean getPmAm() {return this.pmam;}
    public short getHora(){return this.hora;}
    public short getMnut(){return this.mnut;}
}
