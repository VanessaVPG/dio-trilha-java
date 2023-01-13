public class Dia {
    public static void hora(int hora) {
        if(hora >= 12 && hora <= 18 )
        System.out.println("Boa tarde!");
        else if (hora>18 && hora <24){
            System.out.println("Boa noite!");
        }else {
            System.out.println("Bom dia!");
        }
    }
}
