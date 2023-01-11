import java.util.Scanner;

public class QuintoExercicio {
    public static void main(String[]args) {
        int numero;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número para a tabuada: ");
        numero = scanner.nextInt();
        for (int counter = 0; counter <= 10; counter++){
            System.out.println(counter+ "x" + numero + "=" + (counter*numero));
        }
    }
}
