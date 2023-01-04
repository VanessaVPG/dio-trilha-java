public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();
        System.out.println("TV ligada ? " + smartTv.ligada);
        System.out.println("Canal atual : " + smartTv.canal);
        System.out.println("Volume atual : " + smartTv.volume);

        smartTv.ligar();
        System.out.println("NOVO STATUS - > TV ligada ? " + smartTv.ligada);
        smartTv.desligar();
        System.out.println("NOVO STATUS - > TV ligada ? " + smartTv.ligada);
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        System.out.println("Volume atual : " + smartTv.volume);
        smartTv.mudarCanal(13);
        System.out.println("Canal atual: " + smartTv.canal);
        
    }
}
