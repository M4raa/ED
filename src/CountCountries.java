import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class CountCountries {
    public static HashMap<String,Integer> contador(String lista){ //14campos
        HashMap<String,Integer> datos = new HashMap<>();
        String[] lineas = lista.split("/n");
        for (String linea:lineas) {
            String[] dato = linea.split(",");
                if (!datos.containsKey(dato[6])){
                    datos.put(dato[6],1);
                } else {
                    datos.replace(dato[6], datos.get(dato[6])+1);
                }
        }
        return datos;
    }
    public static void main(String[] args) throws IOException{
        String line;
        String datos="";
        BufferedReader reader = new BufferedReader(new FileReader("/home/INFORMATICA/alu10663409/Escritorio/IntJ/Estructura de datos/files/Colfuturo-Seleccionados.csv"));
            while ((line = reader.readLine())!=null) {
                datos+=line + "/n";
            }
        reader.close();
        System.out.println(contador(datos));
    }
}
