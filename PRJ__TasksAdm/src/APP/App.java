
package APP;
import TSq.Categoria;
import java.util.ArrayList;
import java.util.Collections;


public class App {
    private ArrayList<Categoria> categorias = new ArrayList<>();
    
    public boolean addCategoria(String nome, short prd) {
       if (!this.asDuplicate(nome))
            if (this.categorias.add(new Categoria(nome,prd))){
                this.ordenarCategoriasPorPrioridade();
                return true;
            }
       return false;
    }
    
    public boolean delCategoria(String nome) {
       if (!this.categorias.isEmpty()) {
            this.categorias.removeIf(cat -> cat.getNome().equals(nome));
            this.ordenarCategoriasPorPrioridade();
            return true;
       }
       return false;
    }
    
    public ArrayList<Categoria> getCategorias() {
        if (!this.categorias.isEmpty()) 
            return this.categorias;
        return null;
    }
    
    private boolean asDuplicate(String nome) {
        if (!this.categorias.isEmpty())
            for ( Categoria categoria : this.categorias) {
                if (categoria.getNome().equals(nome))
                    return true;
            }
        return false;
    }
    
    private void ordenarCategoriasPorPrioridade() {
        Collections.sort(this.categorias, (c1, c2) -> Short.compare(c2.getPrioridade(), c1.getPrioridade()));
    }
    
    public boolean isEmpty() {
        return this.categorias.isEmpty();
    }
}
