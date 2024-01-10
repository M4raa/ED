import java.util.ArrayList;
import java.util.Arrays;

public class Convertir_a_array {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        numeros.add(6);

        int[] arrayNumeros = new int[numeros.size()];
        for (int i = 0; i < numeros.size(); i++) {
            arrayNumeros[i] = numeros.get(i);
        }

        System.out.println(Arrays.toString(arrayNumeros));
    }
}
