import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       Scanner entrada = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        String palavra = entrada.nextLine();

        
        String stringInvertida = new StringBuilder(palavra).reverse().toString();

        System.out.println("palavra invertida: " + stringInvertida);
    }
}
