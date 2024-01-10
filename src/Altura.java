import java.util.ArrayList;
import java.util.Scanner;

public class Altura {
   public static Integer leerAlumnos(){
       int cantAlu;
       System.out.println("¿Cuántos alumnos hay?");
       Scanner sc = new Scanner(System.in);
       cantAlu = sc.nextInt();
       return cantAlu;
   }
   public static ArrayList<Double> leerAlturas(int alu){
       Scanner sc = new Scanner(System.in);
       ArrayList<Double> alturas = new ArrayList<>();
       System.out.println("Introduce sus alturas");
       for (int i = 0; i < alu; i++) {
           alturas.add(sc.nextDouble());
       }
       return alturas;
   }
   public static Double calcularMedia(int alumnos, ArrayList<Double> alturas){
       double total=0;
       for (double alt:alturas) {
           total+=alt;
       }
       return total/alumnos;
   }
   public static Integer calSuperior(ArrayList<Double> alturas, double media){
       int cuantos=0;
       for (double alt:alturas) {
           if (alt>media) cuantos++;
       }
       return cuantos;
   }
    public static Integer calInferior(ArrayList<Double> alturas, double media){
        int cuantos=0;
        for (double alt:alturas) {
            if (alt<media) cuantos++;
        }
        return cuantos;
    }

    public static void mostrarResultados() {
        int alumnos = leerAlumnos();
        ArrayList<Double> alturas = leerAlturas(alumnos);
        double media = calcularMedia(alumnos, alturas);
        System.out.println("Total alumnos -> " + alumnos);
        System.out.println("Alturas -> " + alturas);
        System.out.println("Media -> " + calcularMedia(alumnos, alturas));
        System.out.println("Total alumnos que superan la media -> " + calSuperior(alturas, media));
        System.out.println("Total alumnos que no superan la media -> " + calInferior(alturas, media));
    }

    public static void main(String[] args) {
        mostrarResultados();
    }
}
