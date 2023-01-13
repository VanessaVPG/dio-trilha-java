public class Emprestimo {
    public static void taxar(double valor, int parcelas) {
        double taxa;
        if(parcelas>3){
            taxa = 0.5;
        }else {
            taxa = 0.2;
        }
        double montante = valor + (valor * taxa);
        System.out.println("O valor total é:" + montante + "reais");
    }
}
