import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class BotinII {
    public static HashMap<Integer,ArrayList<Integer>> repartir(String atraco){
        HashMap<Integer,ArrayList<Integer>> sereparte=new HashMap<>();
        HashMap<String,Integer> billetes=new HashMap<>();
        String[] datos = atraco.split(",");
        int personas = Integer.parseInt(datos[0]);
        int cnt= 1;
        for (int i = 1; i < datos.length; i++) {
            billetes.put(datos[i],cnt);
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
