import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class LaMejorTerminacion {
    public static HashMap<Integer, Integer> probabilidad(ArrayList<String> datos){
        HashMap<Integer, Integer> repeticion = new HashMap<>();
        String repetido=""; //474
        for (String valor:datos) {
            int rep=1;
            int ultimo = Integer.parseInt("" + valor.charAt(valor.length()-1));
            if (ultimo == Integer.parseInt("" + valor.charAt(valor.length() - 1))) {
                if (repeticion.containsKey(ultimo)){
                    rep++;
                }
            }

            repeticion.put(ultimo,rep);
        }

        return repeticion;
    }
    public static void main(String[] args) {
        System.out.println("Introduce varios boletos");
        /*Scanner sc = new Scanner(System.in);
        ArrayList<Integer> boletos = new ArrayList<>();
        int boleto;
        while (sc.hasNextInt()) {
            boleto = sc.nextInt();
            if (boleto == -1) {
                break;
            }
            boletos.add(boleto);
        }
        sc.close();*/
        ArrayList<String> boletos = new ArrayList<>();
        boletos.add("00004");
        boletos.add("03777");
        boletos.add("39804");
        boletos.add("39746");
        System.out.println(probabilidad(boletos));


    }
}
