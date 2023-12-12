import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class TelefonosII {
    public static ArrayList<Integer> guia(String contacto){
        HashMap<String, ArrayList<Integer>> telefonos = new HashMap<>();
        ArrayList<Integer> Roberto = new ArrayList<>();
        Roberto.add(12345);
        Roberto.add(12345);
        telefonos.put("Roberto", Roberto);
        ArrayList<Integer> Victor = new ArrayList<>();
        Victor.add(123456);
        Victor.add(123456);
        telefonos.put("Victor", Victor);
        ArrayList<Integer> David = new ArrayList<>();
        David.add(1234567);
        David.add(1234567);
        telefonos.put("David", David);
        ArrayList<Integer> Angel = new ArrayList<>();
        Angel.add(12345678);
        Angel.add(12345678);
        telefonos.put("Angel", Angel);
        ArrayList<Integer> Alex = new ArrayList<>();
        Alex.add(123456789);
        Alex.add(123456789);
        telefonos.put("Alex", Alex);
        return telefonos.get(contacto);
    }
    public static void main(String[] args) {
        System.out.println("Introduce un contacto");
        Scanner sc = new Scanner(System.in);
        String persona= sc.nextLine();
        sc.close();
        System.out.println(guia(persona));
    }
}
