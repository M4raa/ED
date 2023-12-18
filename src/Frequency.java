import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Frequency {
    public static HashMap<String,Integer> repeticion(ArrayList<String> palabras){
        HashMap<String,Integer> contador = new HashMap<>();
        for (String palabra:palabras) {
            int rep=1;
            if (contador.containsKey(palabra)){
                rep= contador.get(palabra)+1;
            }
            contador.put(palabra,rep);
        }

        return  contador;
    }
    public static void main(String[] args) {
        System.out.println("Introduce varias palabras");
        ArrayList<String> cadenas = new ArrayList<>();
        /*Scanner sc = new Scanner(System.in);
        String palabra;
        while (sc.hasNextLine()) {
            palabra = sc.nextLine();
            if (palabra.isEmpty()) {
                break;
            }
            cadenas.add(palabra);
        }
        sc.close();*/
        cadenas.add("uno");
        cadenas.add("dos");
        cadenas.add("tres");
        cadenas.add("tres");
        cadenas.add("dos");
        cadenas.add("tres");
        System.out.println(repeticion(cadenas));
    }
}
