public class ExercicioUm {
    public static void main(String[] args) {
        int [] vetor = {0, -5, 190, 1, 2931};
        int counter = 0;
        System.out.print("Vetor:");
        while (counter < (vetor.length)){
            System.out.print(vetor[counter] + " ");
            counter++;
        }
        System.out.print("\nVetor Inverso: ");
        for(int i = (vetor.length -1); i >= 0; i--){
            System.out.print(vetor[i] + " ");
        }
    }
}
