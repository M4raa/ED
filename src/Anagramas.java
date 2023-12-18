import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

public class Anagramas {
    public static String alfabetiza(String palabra){
        char[] letras = palabra.toCharArray();
        Arrays.sort(letras);
        String orden = Arrays.toString(letras);
        String palabraOrdenada = orden.replace(",","").replace(" ","").replace("[","").replace("]","");
        return palabraOrdenada;
    }
    public static HashMap<String,String> anagrama(ArrayList<String> palabras, int minimo){
        HashMap<String,String> lista = new HashMap<>();
        for (String palabra:palabras) {
            String palabraOrdenada = alfabetiza(palabra);
            if (!lista.containsKey(palabraOrdenada)){
                lista.put(palabraOrdenada,palabra);
            } else {
                lista.replace(palabraOrdenada,lista.get(palabraOrdenada) + " " + palabra);
            }
        }
        //No mio
        Iterator<String> iterator = lista.keySet().iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            String[] valor = lista.get(key).split(" ");
            if (valor.length < minimo) {
                iterator.remove();
            }
        }

        return lista;
    }
    //No mio
    public static String formatResult(HashMap<String, String> lista) {
        StringBuilder result = new StringBuilder();
        for (String key : lista.keySet()) {
            result.append(key).append(": ").append(lista.get(key)).append("\n");
        }
        return result.toString();
    }
    public static void main(String[] args) {
        ArrayList<String> listado = new ArrayList<>();
        int minimo=6;
        String line;
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
        }/*
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
        listado.add("aloh");*/

        System.out.println(formatResult(anagrama(listado,minimo)));
    }
}
