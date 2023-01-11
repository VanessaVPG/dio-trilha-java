import java.util.Scanner;

public class QuartoExercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero, quantidadeNumeros;
        int counter = 0, impar = 0, par = 0;
        System.out.println("Digite a quantidade de números a serem avaliados: ");
        quantidadeNumeros = scanner.nextInt();
        do {
            System.out.println("Digite um número: ");
            numero = scanner.nextInt();
            if ((numero % 2) == 0) {
                par++;
            } else {
                impar++;
            }
            counter++;
        } while (counter < quantidadeNumeros);
        System.out.println("Total de números pares: " + par);
        System.out.println("Total de números ímpares: " + impar);
    }
}
