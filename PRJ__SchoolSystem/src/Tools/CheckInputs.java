
/*
    by: lucieudo roberto
*/

package Tools;
import java.awt.Color;
import javax.swing.BorderFactory;

public class CheckInputs 
{
   private boolean erros = false;
   
   public void email(javax.swing.JTextField obj) {
        obj.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        String value = obj.getText().trim();

        if (value.isEmpty() || value.length() > 254) {
            obj.setBorder(BorderFactory.createLineBorder(Color.RED));
            obj.requestFocusInWindow();
            this.erros = true;
            return;
        }

        if (!value.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
            obj.setBorder(BorderFactory.createLineBorder(Color.RED));
            obj.requestFocusInWindow();
            this.erros = true;
            return;
        }
   }
   
  public void cpf(javax.swing.JTextField obj) {
    obj.setBorder(BorderFactory.createLineBorder(Color.GRAY));
    String value = obj.getText().trim();

    if (value.isEmpty() || !value.matches("\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}")) {
        obj.setBorder(BorderFactory.createLineBorder(Color.RED));
        obj.requestFocusInWindow();
        this.erros = true;
    }
}
  
  public void nome(javax.swing.JTextField obj) {
    obj.setBorder(BorderFactory.createLineBorder(Color.GRAY));
    String value = obj.getText().trim();

    if (value.isEmpty() || !value.matches("^[a-zA-ZÀ-ÿ\\s]{1,50}$")) {
        obj.setBorder(BorderFactory.createLineBorder(Color.RED));
        obj.requestFocusInWindow();
        this.erros = true;
    }
}

 public void hora(javax.swing.JTextField obj) {
    obj.setBorder(BorderFactory.createLineBorder(Color.GRAY));
    String value = obj.getText().trim();

    if (value.isEmpty() || !value.matches("^(?:[01]\\d|2[0-3]):[0-5]\\d$")) {
        obj.setBorder(BorderFactory.createLineBorder(Color.RED));
        obj.requestFocusInWindow();
        this.erros = true;
    }
} 
  
 public void sala(javax.swing.JTextField obj) {
  obj.setBorder(BorderFactory.createLineBorder(Color.GRAY));
    String value = obj.getText().trim();

    if (value.isEmpty() || !value.matches("^[a-zA-ZÀ-ÿ0-9\\s-_]{1,50}$")) {
        obj.setBorder(BorderFactory.createLineBorder(Color.RED));
        obj.requestFocusInWindow();
        this.erros = true;
    }
}
  
  public void telefone(javax.swing.JTextField obj) {
    obj.setBorder(BorderFactory.createLineBorder(Color.GRAY));
    String value = obj.getText().trim();
  
    if (value.isEmpty() || !value.matches("\\d{2} 9\\.\\d{4}-\\d{4}")) {
        obj.setBorder(BorderFactory.createLineBorder(Color.RED));
        obj.requestFocusInWindow();
        this.erros = true;
    }
}
  public void data(javax.swing.JTextField obj) {
    obj.setBorder(BorderFactory.createLineBorder(Color.GRAY));
    String value = obj.getText().trim();

    if (value.isEmpty() || !value.matches("\\d{4}-\\d{2}-\\d{2}")) {
        obj.setBorder(BorderFactory.createLineBorder(Color.RED));
        obj.requestFocusInWindow();
        this.erros = true;
    }
}
  
  public void numero(javax.swing.JTextField obj, double min, double max) {
    obj.setBorder(BorderFactory.createLineBorder(Color.GRAY));
    String value = obj.getText().trim();

    try {
        double numero = Double.parseDouble(value);

        if (numero < min || numero > max) {
            obj.setBorder(BorderFactory.createLineBorder(Color.RED));
            obj.requestFocusInWindow();
            this.erros = true;
        }
    } catch (NumberFormatException e) {
        obj.setBorder(BorderFactory.createLineBorder(Color.RED));
        obj.requestFocusInWindow();
        this.erros = true;
    }
  }
  
  public void numero(javax.swing.JTextField obj, int min, int max) {
    obj.setBorder(BorderFactory.createLineBorder(Color.GRAY));
    String value = obj.getText().trim();

    try {
        int numero = Integer.parseInt(value);

        if (numero < min || numero > max) {
            obj.setBorder(BorderFactory.createLineBorder(Color.RED));
            obj.requestFocusInWindow();
            this.erros = true;
        }
    } catch (NumberFormatException e) {
        obj.setBorder(BorderFactory.createLineBorder(Color.RED));
        obj.requestFocusInWindow();
        this.erros = true;
    }
}
  
  public void numero(javax.swing.JSpinner obj, int min, int max) {
    obj.setBorder(BorderFactory.createLineBorder(Color.GRAY));
    String value = obj.getValue().toString();

    try {
        int numero = Integer.parseInt(value);

        if (numero < min || numero > max) {
            obj.setBorder(BorderFactory.createLineBorder(Color.RED));
            obj.requestFocusInWindow();
            this.erros = true;
        }
    } catch (NumberFormatException e) {
        obj.setBorder(BorderFactory.createLineBorder(Color.RED));
        obj.requestFocusInWindow();
        this.erros = true;
    }
}
  
  public void textArea(javax.swing.JTextArea obj, int maxLength) {
    obj.setBorder(BorderFactory.createLineBorder(Color.GRAY));
    String value = obj.getText().trim();

    if (value.isEmpty() || value.length() > maxLength) {
        obj.setBorder(BorderFactory.createLineBorder(Color.RED));
        obj.requestFocusInWindow();
        this.erros = true;
    }
}
  public void endereco(javax.swing.JTextField obj) {
    obj.setBorder(BorderFactory.createLineBorder(Color.GRAY));
    String value = obj.getText().trim();

    if (value.isEmpty() || value.length() < 5 ) {
        obj.setBorder(BorderFactory.createLineBorder(Color.RED));
        obj.requestFocusInWindow();
        this.erros = true;
    }
}

   public boolean asErros() {return this.erros;}
   
}
