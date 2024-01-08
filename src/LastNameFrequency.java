import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class LastNameFrequency {
    public static String contador(String apellido) throws IOException {
        String line;
        String datos="";
        //Leo el archivo
        BufferedReader reader = new BufferedReader(new FileReader("/home/INFORMATICA/alu10663409/Escritorio/IntJ/Estructura de datos/files/LastnameFrequencies.csv"));
        while ((line = reader.readLine())!=null) {
            datos+=line + "/n";
        }
        reader.close();
        HashMap<String,String> lista = new HashMap<>();
        String[] lineas = datos.split("/n");
        for (String linea:lineas) {
            String[] cantidad=linea.split(",");
            lista.put(cantidad[0],cantidad[1]);
        }

        return lista.get(apellido);

    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String dato=sc.nextLine();
        System.out.printf("El apellido %s se repite %s veces en España",dato,contador(dato));
    }
}
