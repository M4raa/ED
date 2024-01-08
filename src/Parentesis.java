import java.util.Scanner;
import java.util.Stack;

public class Parentesis {
    public static boolean bienFormado(String cadena){
        Stack<Character> lista = new Stack<>();
        for (int i = 0; i < cadena.length()-1; i++) {
            char x=cadena.charAt(i);
            if (x=='(' || x=='[' || x=='{'){
                lista.add(x);
            }else if (x==')'){
                if (lista.pop()=='('){

                }
            }else if (x==']'){
                if (lista.pop()=='('){

                }
            }else if (x=='}'){
                if (lista.pop()=='('){

                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase = sc.nextLine();
        System.out.println(bienFormado(frase));
    }
}
