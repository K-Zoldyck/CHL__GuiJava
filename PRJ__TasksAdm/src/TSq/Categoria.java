
package TSq;
import java.util.ArrayList;

public class Categoria {
   private short prioridade; //3 alta, 2 Media, 1 baixa
   private String nome;
   private ArrayList<Tarefa> tarefas = new ArrayList<>();
    
   public Categoria(String nome, short prioridade) {
        this.nome = nome;
        this.prioridade = prioridade;
   }
   
   public void edit(String nome, short prioridade) {
        this.nome = nome;
        this.prioridade = prioridade;
   }
   
   public boolean addTarefa(Tarefa tf) {
       for ( Tarefa tf_loop: this.tarefas ) 
           if (tf_loop.getNome().equals(tf.getNome()))
               return false;
       
       return this.tarefas.add(tf);
   }
   
   public Tarefa getTarefa(String nome) {
       if (!this.tarefas.isEmpty()) 
           for ( Tarefa tf_loop: this.tarefas ) 
               if (tf_loop.getNome().equals(nome))
                   return tf_loop;
       return null;
   }
   
   public boolean delTarefa(String nome) {
       if (!this.tarefas.isEmpty()) 
          return this.tarefas.removeIf(t -> t.getNome().equals(nome));
       return false;
   }
   
   public boolean moveTarefa(String tarefaNome, Categoria catg_dst) {
       Tarefa tf = this.getTarefa(tarefaNome);
       if ( tf != null && (catg_dst instanceof Categoria) ) {
           catg_dst.addTarefa(tf);
           return this.delTarefa(tarefaNome);
       }
       return false;
   }
   
   
   public String[][] tarefasToMatriz() {
       String[][] data = new String[this.tarefas.size()][];
       if (!this.tarefas.isEmpty()) {
           for ( int x=0; x<this.tarefas.size(); x++ ) 
                data[x] = this.tarefas.get(x).toArray();
           return data;
       }
       return data;
   }
   
   public String[][] tarefasToMatrizIfStatus(short status) {
       String[][] data = new String[this.tarefas.size()][];
       if (!this.tarefas.isEmpty()) {
           for ( int x=0; x<this.tarefas.size(); x++ )
               if (this.tarefas.get(x).getEstd() == status)
                    data[x] = this.tarefas.get(x).toArray();
           return data;
       }
       
       return data;
   }
   
   public ArrayList<Tarefa> getTarefas() {
       return (!this.tarefas.isEmpty()) ? this.tarefas : null;
   }
   
   @Override
   public String toString() {
        String prd = (this.prioridade == 3 ) ? "Alta" : (this.prioridade == 2 ) ? "Media" : "Baixa";
        return String.format("%s, PRD: %s",this.nome,prd);
   }
   
   public boolean isEmpty() {return this.tarefas.isEmpty();}
   public String getNome(){return this.nome;}
   public short getPrioridade() {return this.prioridade;}
   
   public int getTarefasLength(){
       if (!this.tarefas.isEmpty())
           return this.tarefas.size();
       return 0;
   }
}
