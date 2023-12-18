import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Botin {
    public static HashMap<Integer,ArrayList<Integer>> repartir(String atraco){
        HashMap<Integer,ArrayList<Integer>> sereparte=new HashMap<>();
        String[] datos = atraco.split(",");
        int personas = Integer.parseInt(datos[0]);
        ArrayList<Integer> billetes = new ArrayList<>();
        for (int i=1; i < datos.length; i++) {
            for (int j = 0; j < personas; j++) {
                billetes.add(Integer.valueOf(datos[i]));
                sereparte.put(j,billetes);
            }
        }
        return sereparte;
    }
    public static void main(String[] args) {
        String datos;
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce los datos separados por una ',' :");
        datos=sc.nextLine();
        System.out.println(repartir(datos));


    }
}
