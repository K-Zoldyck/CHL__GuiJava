package Tools;



import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Matricula {
 public String gen() {
        SimpleDateFormat sdf = new SimpleDateFormat("MMddyy");
        String data = sdf.format(new Date());
        Random random = new Random();
        
        int aleatorio = random.nextInt(1000);
        String formatoAleatorio = String.format("%03d", aleatorio);
        return String.format("%s%s-M", data, formatoAleatorio);
    }
}
