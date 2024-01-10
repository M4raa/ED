import java.util.Stack;

public class ExpresionesAritmeticas {

    public static Integer calculo(String expresionA){
        String[] datos = expresionA.split(" ");
        Stack<Integer> pila = new Stack<>();
        int n1;
        int n2;
        int resultadoFinal;
        for (int i = 0; i < datos.length; i++) {
            switch (datos[i]){
                case "-":
                    n2=pila.pop();
                    n1=pila.pop();
                    resultadoFinal=n1-n2;
                    pila.push(resultadoFinal);
                    break;
                case"+":
                    n2=pila.pop();
                    n1=pila.pop();
                    resultadoFinal=n1+n2;
                    pila.push(resultadoFinal);
                    break;
                case "*":
                    n2=pila.pop();
                    n1=pila.pop();
                    resultadoFinal=n1*n2;
                    pila.push(resultadoFinal);
                    break;
                case "/":
                    n2=pila.pop();
                    n1=pila.pop();
                    resultadoFinal=n1/n2;
                    pila.push(resultadoFinal);
                    break;
                default:
                    pila.push(Integer.parseInt(datos[i]));
                    break;
            }
        }
        return pila.pop();
    }
    public static void main(String[] args) {
        System.out.println(calculo("3 2 5 - 2 * 3 -"));
        System.out.println(calculo("4 3 2 * +"));
        System.out.println(calculo("6 2 1 + /"));
        System.out.println(calculo("7 4 6 - *"));
    }
}

