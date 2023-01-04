public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        double salarioMinimo = 2500;
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;
        double VALOR_DE_PI = 3.14;
        VALOR_DE_PI = 10.75;
        System.out.print(VALOR_DE_PI);
        final double VALOR_DE_PI_IMUTÁVEL = 3.14;
        System.out.println("valor de pi imutável! " + VALOR_DE_PI_IMUTÁVEL);

        String concatenacao = "?";
        System.out.println("concatenação" + concatenacao);
        concatenacao = 1 + 1 + 1 + "1";
        System.out.println("concatenação" + concatenacao);
        concatenacao = 1 + "1" + 1 + "1";
        System.out.println("concatenação" + concatenacao);
        concatenacao = "1" + 1 + 1 + 1;
        System.out.println("concatenação" + concatenacao);
        concatenacao = "1" + (1 + 1 + 1);
        System.out.println("concatenação" + concatenacao);

        int numero = 5;
        System.out.println(-numero);
        int numero2 = 5;
        numero2 = -numero2;
        System.out.println(numero2);
        numero2++;

        System.out.println(numero2);
        boolean variavelBooleana = false;
        System.out.println(!variavelBooleana);

        int a = 6;
        int b = 5;
        String resultado = "";
        if (a == b) {
            resultado = "vardadeiro";
            System.out.println(resultado);
        } else {
            resultado = "falso";
            System.out.println(resultado);
        }

        int c, d;
        c = 6;
        d = 6;
        String resultado2 = c == d ? "verdadeiro!" : "falso!";
        System.out.println("Esse é o resultado de um código simplificado, de se/senão: " + resultado2);

        int numero3, numero4, numero5, numero6;
        numero3 = 1;
        numero4 = 4;

        boolean simNao = numero3 == numero4;
        System.out.println(simNao);
        numero5 = 6;
        numero6 = 3;
        boolean simNao2 = numero5 > numero6; 
        System.out.println("O número5 é maior que o número6 ?" + simNao2);
    }
}
