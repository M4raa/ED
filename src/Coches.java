import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Coches {
    public static void main(String[] args) {
        ArrayList<String> coches = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String coche = sc.nextLine();
        do {
            if (!Objects.equals(coche, "")){
                coches.add(coche);
                coche = sc.nextLine();
            } else break;
        } while (!Objects.equals(coche, ""));
        sc.close();
        coches.forEach(System.out::println);
    }
}