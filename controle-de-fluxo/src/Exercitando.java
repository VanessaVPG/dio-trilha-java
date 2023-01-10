import java.util.Locale;
import java.util.Scanner;

public class Exercitando {
    public static void main(String[] args) throws Exception {
       Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        String nomeMes = "";
       System.out.println("Digite o número do mês atual: ");
        int mesAtual = scanner.nextInt();
        if(mesAtual == 1) {
            nomeMes = "Janeiro";
        } else if (mesAtual == 2) {
           nomeMes = "Fevereiro"; 
        } else if (mesAtual == 3){
            nomeMes = "Março";
        } else if (mesAtual == 4){
            nomeMes = "Abril";
        } else if (mesAtual == 5) {
            nomeMes = "Maio";
        } else if (mesAtual == 6) {
            nomeMes = "Junho";
        } else if (mesAtual == 7) {
            nomeMes = "Julho";
        } else if (mesAtual == 8) {
            nomeMes = "Agosto";
        } else if (mesAtual == 9) {
            nomeMes = "Setembro";
        } else if (mesAtual == 10) {
            nomeMes = "Outubro";
        } else if (mesAtual == 11) {
            nomeMes = "Novembro";
        } else if (mesAtual == 12) {
            nomeMes = "Dezembro";
        }else { 
            System.out.println("Número inválido!");
        }
        System.out.println("O nome do mês é: " + nomeMes);
        if (mesAtual == 6 || mesAtual == 12 || mesAtual == 1){
            System.out.println("Férias!!");

        }
        System.out.println("Digite uma palavra");
        String testeSwitchComString = scanner.next();

        switch (testeSwitchComString) {
            case "palavra": 
            System.out.println("Deu certo o primeiro case!");
            break;
            case "uma palavra":
            System.out.println("Deu certo o segundo case!");
            break;
            default: 
            System.out.println("Não digitou o que eu falei para digitar :(");
            break;
        }


        System.out.println("Digite o número do dia da semana: ");
        int diaDaSemana = scanner.nextInt();

        switch (diaDaSemana) {
            case 1: 
            System.out.println("Segunda Feira");
            break;

            case 2: 
            System.out.println("Terça Feira");
            break;

            case 3: 
            System.out.println("Quarta Feira");
            break;

            case 4: 
            System.out.println("Quinta Feira");
            break;

            case 5: 
            System.out.println("Sexta Feira");
            break;

            case 6: 
            System.out.println("Sabadou Fera");
            break;

            case 7: 
            System.out.println("Domingou Fera");
            break;

        }

        switch (diaDaSemana) {
            case 1: 
            case 2:
            case 3:
            System.out.println("Certo");
            break;
            case 4:
            System.out.println("Errado");
            break;
            case 5: 
            System.out.println("talvez");
            break;
            default:
            System.out.println("Esse é o default!");
        }
    }
}
