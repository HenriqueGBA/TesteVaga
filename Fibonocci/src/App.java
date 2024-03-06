import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
         Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = entrada.nextInt();

        if (vericaFibo(numero)){
            System.out.println(numero + " Pertence à sequência de Fibonacci");
        }else{
            System.out.println(numero + " Não pertence à sequência de Fibonacci");
        }
    }
    public static boolean vericaFibo(int numero) {
        int a = 0, b = 1;

        while (a <= numero) {
            if (a == numero) {
                return true;                
            }
            int proximo = a + b;
            a = b;
            b = proximo;            
        }
        return false;
    }
}

