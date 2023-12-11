import javax.swing.text.Utilities;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PaisCapital {
    public static String capital(String pais){
        Map<String, String> mapaCapitales = new HashMap<String, String>();
        String cap="";
        mapaCapitales.put("España", "Madrird");
        mapaCapitales.put("Alemania", "Berlin");
        mapaCapitales.put("Reino Unido", "Londres");
        mapaCapitales.put("Paises Bajos", "Ámsterdam");
        mapaCapitales.put("Polonia", "Grecia");
        mapaCapitales.put("Francia", "Paris");
        mapaCapitales.put("Italia", "Roma");

        cap=mapaCapitales.get(pais);
        return cap;
    }
    public static void main(String[] args) {
        System.out.println("Introduce un país Europeo para saber su capital");
        Scanner sc = new Scanner(System.in);
        String pais= sc.nextLine();
        sc.close();
        System.out.println(capital(pais));
    }
}
