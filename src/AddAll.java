import java.util.ArrayList;
import java.util.List;

public class AddAll {
    public static ArrayList<String> addAll(ArrayList<String> lista){
        ArrayList<String> lista2 = new ArrayList<>();
        lista2.addAll(lista);

        return lista2;
    }
    public static void main(String[] args) {
        ArrayList<String> lista1 = new ArrayList<>();
        lista1.add("Plátano");
        lista1.add("Fresa");
        lista1.add("Melón");
        lista1.add("Sandia");
        lista1.add("Pera");
        lista1.add("Manzana");

        System.out.println(lista1);
        System.out.println();
        System.out.println(addAll(lista1));
    }
}
