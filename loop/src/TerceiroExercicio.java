import java.util.Scanner;

public class TerceiroExercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number;
        double soma = 0;
        int counter = 0;
        double maiorNumero = 0;
        do {
            System.out.println("Digite um número: ");
            number = scanner.nextDouble();
            if (number > maiorNumero) {
                maiorNumero = number;
            }
            soma += number;
            counter++;
        } while (counter < 5);
        System.out.println("A média é: " + (soma / 5) + " --- e o maior número é: " + maiorNumero);

    }

}
