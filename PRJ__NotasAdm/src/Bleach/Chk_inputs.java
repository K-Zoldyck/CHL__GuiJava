
package Bleach;
import java.awt.Color;
import javax.swing.BorderFactory;

public class Chk_inputs {
    
    public static boolean nameAsErro(javax.swing.JTextField field) {
        String data = field.getText();
        field.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        
        if ( data.length() == 0 ) {
            field.setBorder(BorderFactory.createLineBorder(Color.RED));
            field.requestFocusInWindow();
            return true;
        }
        return false;
    }
    
    public static boolean dataAsErro(javax.swing.JTextField field) {
        String data = field.getText();
        field.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        
        if ( data.length() == 0 ) {
            field.setBorder(BorderFactory.createLineBorder(Color.RED));
            field.requestFocusInWindow();
            return true;
        }
        return false;
    }
    
    public static boolean notaAsErro(javax.swing.JTextField field) {
        String data = field.getText();
        field.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        
        if ( data.length() == 0 ) {
            field.setBorder(BorderFactory.createLineBorder(Color.RED));
            field.requestFocusInWindow();
            return true;
        }
        return false;
    }
    
    public static boolean descAsErro(javax.swing.JTextArea field) {
        String data = field.getText();
        field.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        
        if ( data.length() == 0 ) {
            field.setBorder(BorderFactory.createLineBorder(Color.RED));
            field.requestFocusInWindow();
            return true;
        }
        return false;
    }

}
