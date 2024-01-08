import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Repartiendo_Regalos {
    public static String regalos(int aterrizaje, ArrayList<Integer> portales){
        String reparte="";
        Collections.sort(portales);
        for (int i = 0; i < portales.size()-1; i++) {                   //3  2 5 1
            if (aterrizaje== portales.get(i)) {                         //3  1 2 3 - 5
                reparte += aterrizaje;
            }
            if (aterrizaje+1== portales.get(i)) {
                reparte += portales.get(aterrizaje);
            }
            if (aterrizaje-1== portales.get(i)) {
                reparte += portales.get(aterrizaje);
            }

        }
        return reparte;
    }
    public static void main(String[] args) {
        ArrayList<Integer> portales = new ArrayList<>();

            portales.add(2);
            portales.add(1);
            portales.add(5);

        System.out.println(regalos(3,portales));
        portales.clear();

            portales.add(2);
            portales.add(4);
            portales.add(7);

        System.out.println(regalos(3,portales));
        portales.clear();
            portales.add(0);
            portales.add(4);

        System.out.println(regalos(0,portales));

       /* ArrayList<Integer> portales1 = new ArrayList<>();
            portales.add(2);
            portales.add(5);
            portales.add(7);
            portales.add(8);
            portales.add(1);

        System.out.println(regalos(3,portales1));*/
    }


}
