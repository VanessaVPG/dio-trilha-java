import java.util.Random;

public class ExercicioTres {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numerosAleatorios = new int[20];
        for (int counter = 0; counter < numerosAleatorios.length; counter++) {
            int numero = random.nextInt(100);
            numerosAleatorios[counter] = numero;
        }
        System.out.print("Números aleatórios: ");
        for (int i : numerosAleatorios) {
            System.out.print(i + " ");

        }
        System.out.print("\nSucessores dos números aleatórios: ");
        for (int i : numerosAleatorios) {
            System.out.print((i + 1) + " ");
        }

    }
}
