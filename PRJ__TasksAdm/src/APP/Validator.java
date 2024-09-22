
package APP;

import java.util.regex.Pattern;

public class Validator {
     public static boolean validarData(String data) {
        if (data.length() > 0 ) {
            String padraoData = "^([0-2][0-9]|(3)[0-1])/(0[1-9]|1[0-2])/\\d{4}$";
            return Pattern.matches(padraoData, data);
        }
        return false;
    }
     
    public static boolean validarHora(String hora) {
        if (hora.length() > 0 ) {
            String padraoHora = "^([1-9]|1[0-2])$";
            return Pattern.matches(padraoHora, hora);
        }
        return false;
    }

    public static boolean validarMinutos(String minutos) {
        if (minutos.length() > 0 ) {
            String padraoMinutos = "^([1-9]|[0-5][0-9])$"; 
            return Pattern.matches(padraoMinutos, minutos);
        }
        return false;
    }

    public static boolean validarTexto(String texto, int limite) {
        return texto.length() <= limite;
    }
}
