import java.util.Scanner;
import java.util.Stack;

public class Parentesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una cadena: ");
        String cadena = sc.nextLine();
        if (bienFormada(cadena)){
            System.out.println("La cadena está bien formada");
        } else {
            System.out.println("La cadena está mal formada");
        }
    }
    public static boolean bienFormada(String cadena){
        Stack<Character> stack = new Stack<>();
        char letra;
        for (int i = 0; i < cadena.length(); i++) {
            letra = cadena.charAt(i);
            if (letra == '(' || letra == '[' || letra == '{'){
                stack.add(letra);
            } else if (letra == ')' || letra == ']' || letra == '}') {
                if (stack.isEmpty()) {
                    return false;
                }
                char ultimo = stack.pop();
                if (ultimo == '(' && letra != ')') return false;
                if (ultimo == '[' && letra != ']') return false;
                if (ultimo == '{' && letra != '}') return false;
            }

        }
        return stack.isEmpty();
    }
}