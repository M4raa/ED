import java.util.HashMap;
import java.util.Scanner;

public class TelefonosI {
    public static int guia(String contacto){
        HashMap<String, Integer> telefonos = new HashMap<String, Integer>();
        telefonos.put("Roberto", 12345);
        telefonos.put("Victor", 123456);
        telefonos.put("David", 1234567);
        telefonos.put("Angel", 12345678);
        telefonos.put("Alex", 123456789);
        int tlf= telefonos.get(contacto);
        return tlf;
    }
    public static void main(String[] args) {
        System.out.println("Introduce un contacto");
        Scanner sc = new Scanner(System.in);
        String persona= sc.nextLine();
        sc.close();
        System.out.println(guia(persona));
    }
}
