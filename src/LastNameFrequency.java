import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class LastNameFrequency {
    public static HashMap<String,Integer> contador(String lista) throws IOException {
        String line;
        String datos="";
        BufferedReader reader = new BufferedReader(new FileReader("/home/INFORMATICA/alu10663409/Escritorio/IntJ/Estructura de datos/files/LastnameFrequencies.csv"));
        while ((line = reader.readLine())!=null) {
            datos+=line + "/n";
        }
        reader.close();
        HashMap<String,Integer> datoss = new HashMap<>();
        String[] lineas = lista.split("/n");
        for (String linea:lineas) {
            String[] dato = linea.split(",");
            if (!datoss.containsKey(dato[6])){
                datoss.put(dato[6],1);
            } else {
                datoss.replace(dato[6], datoss.get(dato[6])+1);
            }
        }
        return datos;
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println(contador(datos));
    }
}
