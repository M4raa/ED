import java.util.ArrayList;
import java.util.Scanner;

public class Altura1 {

    public static Double calcularMedia(ArrayList<Double> alt, int alu){
        double media=0;
        for (double x:alt) {
            media +=x;
        }
        media=media/alu;
        return media;
    }
    public static Integer calcularAlturaInferior(ArrayList<Double> alt, int alu){
        double media = calcularMedia(alt,alu);
        int alumnos=0;
        for (double a:alt) {
            if (a<media){
                alumnos++;
            }
        }
        return alumnos;
    }
    public static Integer calcularAlturaSuperior(ArrayList<Double> alt, int alu){
        double media = calcularMedia(alt,alu);
        int alumnos=0;
        for (double a:alt) {
            if (a>media){
                alumnos++;
            }
        }
        return alumnos;
    }
    public static void main(String[] args) {
        ArrayList<Double> alturas = new ArrayList<>();
        int alumnos;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la cantidad de alumnos");
        alumnos = sc.nextInt();
        sc.close();

        System.out.println("Introduce las alturas de los alumnos");
        Scanner sc1 = new Scanner(System.in);
        for (int i = 0; i < alumnos; i++) {
            double al = sc1.nextDouble();
            alturas.add(al);
        }
        sc1.close();
        System.out.println("La media es " + calcularMedia(alturas,alumnos));
        System.out.println("La cantidad de alumnos con altura inferior a la media es " + calcularAlturaInferior(alturas,alumnos));
        System.out.println("La cantidad de alumnos con altura superior a la media es " + calcularAlturaSuperior(alturas,alumnos));
    }
}
