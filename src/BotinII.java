import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class BotinII {
    public static HashMap<Integer,String> repartir(int participantes, int ... billetes){
        HashMap<Integer,String> resultado = new HashMap<>();
        ArrayList<Integer> lista = new ArrayList<>();
        for (int billete:billetes) {
            lista.add(billete);
        }
        do {
            for (int j = 0; j < participantes; j++) {
                int Actual= lista.get(0);
                if (resultado.containsKey(j)){
                    resultado.replace(j, resultado.get(j) +", " + Actual);
                }else resultado.put(j, String.valueOf(Actual));
                lista.remove(0);
                if (lista.isEmpty()){
                    break;
                }
            }
        } while (!lista.isEmpty());


        return resultado;
    }
    public static void main(String[] args) {
        /*int personas;
        int billetes;
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce el número de participantes:");
        personas=sc.nextLine();
        System.out.println("Introduce los billetes a repartir:");
        billetes=sc.nextLine();*/
        System.out.println(repartir(4,10,20,30,40,50,60,70));


    }
}
