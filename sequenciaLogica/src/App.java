import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        System.out.println("qual das sequencias você gostaria de resolver: \n"+
        "a) 1, 3, 5, 7, ___ \n" +
        "b) 2, 4, 8, 16, 32, 64, ____ \n" +
        "c) 0, 1, 4, 9, 16, 25, 36, ____ \n" +
        "d) 4, 16, 36, 64, ____ \n" +
        "e) 1, 1, 2, 3, 5, 8, ____ \n" +
        "f) 2,10, 12, 16, 17, 18, 19, ____ \n");
        String logica = entrada.nextLine();
        int numero;
        switch (logica) {
            case "a":
                    numero = 7;
                    numero += 2;
                    System.out.println("A logica da sequencia é somar +2 o ultimo número portanto o proximo numero é " + numero);
                break;
            case "b":
                numero = 64;
                numero *= 2;
                System.out.println("A logica da sequencia é multiplicar por 2 o número portanto o proximo numero é " + numero);
                break;
            case "c":
                numero = 36;
                numero *= numero;
                System.out.println("A logica da sequencia é o quadrado numero portanto o proximo numero é " + numero);
                break;
            case "d":
                numero = 10;
                numero *= numero;
                System.out.println("A logica da sequencia é os quadrados dos números pares (2,4,6,8) portanto seguindo a lógica o proximo número é " + numero);
                break;
            case "e":
                numero = 8;
                numero += 5;
                System.out.println("A logica da sequencia é que está e a sequencia Fibonacci onde o número é a soma dos dois anteriores portanto o proximo número é " + numero);
            case "f":
                System.out.println("A logica e que são números que começam com D portanto o proximo número e 200");
        }
    }
}
