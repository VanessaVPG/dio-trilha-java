import java.util.Scanner;

public class SegundoExercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota;

        System.out.println("Digite uma nota entre 0 e 10: ");
        nota = scanner.nextDouble();
        while (nota < 0 || nota > 10) {
            System.out.println("Insira um valor válido!");
            System.out.println("Digite uma nota entre 0 e 10: ");
            nota = scanner.nextDouble();

        }
    }
}
