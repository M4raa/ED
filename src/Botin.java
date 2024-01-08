import java.util.ArrayList;
import java.util.HashMap;

public class Botin {
    public static HashMap<Integer,String> repartir(int participantes, int ... billetes){
        HashMap<Integer,String> resultado = new HashMap<>();
        ArrayList<Integer> listaBilletes = new ArrayList<>();
        for (int billete:billetes) {
            listaBilletes.add(billete);
        }
        do {
            for (int j = 0; j < participantes; j++) {
                int Actual= listaBilletes.get(0);
                if (resultado.containsKey(j)){
                    resultado.replace(j, resultado.get(j) +", " + Actual);
                }else resultado.put(j, String.valueOf(Actual));
                listaBilletes.remove(0);
                if (listaBilletes.isEmpty()){
                    break;
                }
            }
        } while (!listaBilletes.isEmpty());


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
