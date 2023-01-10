import java.util.Scanner;

public class PrimeiroExercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome;
        int idade;

        while (true){
            System.out.println("Digite o seu nome: ");
            nome = scanner.next();
            if(nome.equals("0")) break;
            System.out.println("Digite sua idade: ");
            idade = scanner.nextInt();
        }
        System.out.println("Fim do programa :)");





    }
}
