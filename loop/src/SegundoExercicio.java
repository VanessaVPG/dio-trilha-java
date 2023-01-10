import java.util.Scanner;

public class SegundoExercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota;

        while (true){
            System.out.println("Digite uma nota entre 0 e 10: ");
            nota = scanner.nextDouble();
            if ((nota>10) || (nota <  0)){
                System.out.println("Insira um valor válido!");
            }else{
                System.out.println("A nota é: " + nota);
                break;
            }
            
        }
        System.out.println("");





    }
}
