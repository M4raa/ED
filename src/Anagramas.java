import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Anagramas {
    public static String alfabetiza(String palabra){
        char[] letras = palabra.toCharArray();
        Arrays.sort(letras);
        String orden = Arrays.toString(letras);
        String palabraOrdenada = orden.replace(",","").replace(" ","").replace("[","").replace("]","");
        return palabraOrdenada;
    }
    public static HashMap<String,String> anagrama(ArrayList<String> palabras){
        HashMap<String,String> lista = new HashMap<>();
        String todasLasPalabras ="";
        for (String palabra:palabras) {
            String palabraOrdenada = alfabetiza(palabra);
            /*if (palabraOrdenada.equals(lista.containsKey(palabraOrdenada))){
                todasLasPalabras += palabra;
            }*/
            todasLasPalabras += palabra + " ";
            if (!lista.containsKey(palabraOrdenada)){
                lista.put(palabraOrdenada,todasLasPalabras);
            }
        }
       return lista;
    }
    public static void main(String[] args) {
        ArrayList<String> listado = new ArrayList<>();
        /*String line;
        try {
            BufferedReader reader = new BufferedReader(new FileReader("/home/INFORMATICA/alu10663409/Escritorio/IntJ/Estructura de datos/files/anagramas.txt"));
            try {
                while ((line = reader.readLine()) != null) {
                    listado.add(line);
                }
                reader.close();
            }catch (IOException e){
                System.out.println("El archivo no está bien formado");
            }

        }catch (FileNotFoundException e){
            System.out.println("El archivo no existe, por favor especifica otro.");
        }*/
        listado.add("alma");
        listado.add("mala");
        listado.add("alam");
        listado.add("laam");
        listado.add("ele");
        listado.add("eel");
        listado.add("lee");
        listado.add("ala");
        listado.add("hola");
        listado.add("ohla");
        listado.add("aloh");
        System.out.println(anagrama(listado));
    }
}
