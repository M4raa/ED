import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Existe {
    public static boolean existe(String fruta){
        boolean si = false;
        ArrayList<String> palabras = new ArrayList<>();
        palabras.add("Plátano");
        palabras.add("Fresa");
        palabras.add("Manzana");
        palabras.add("Naranja");
        palabras.add("Pera");

        for (String s:palabras) {
            if (Objects.equals(s, fruta)){
                si = true;
                break;
            }
        }
        return si;
    }
    public static void main(String[] args) {
        String fruta;
        System.out.println("Introduce una fruta para saber si existe");
        Scanner sc = new Scanner(System.in);
        fruta = sc.nextLine();
        sc.close();
        if (existe(fruta)){
            System.out.printf("La fruta %s si que existe",fruta);
        }else System.out.printf("La fruta %s no existe",fruta);
    }
}
