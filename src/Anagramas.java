import java.io.BufferedReader;
import java.io.FileReader;

public class Anagramas {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new FileReader("path-to-file"));
        String line;
        while ((line = reader.readLine())!=null) {
            //Trabajar con line
        }
        reader.close();
    }
}
