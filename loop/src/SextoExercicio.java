import java.util.Scanner;

public class SextoExercicio {
    public static void main(String[] args) {
        int numero = 0;
        int multiplicacao = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número para realizar o fatorial: ");
        numero = scanner.nextInt();
        System.out.println(numero + "! = ");
        for (int counter = numero ; counter >= 1; counter--) {
            multiplicacao *= counter;
        }
        System.out.println(multiplicacao);
    }
}
