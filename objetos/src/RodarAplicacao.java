public class RodarAplicacao {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.setCor("Azul marinho");
        carro1.setModelo("RAM");
        carro1.setCapacidadeTanque(100);

        System.out.println(carro1.getCor());
        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCapacidadeTanque());
        System.out.println(carro1.totalValorTanque(6.80));

        Carro carro2 = new Carro();
        carro2.setCor("Vermelho");
        carro2.setModelo("Porche");
        carro2.setCapacidadeTanque(220);

        System.out.println(carro2.getCor());
        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCapacidadeTanque());
        System.out.println(carro2.totalValorTanque(5.60));

        Carro carro3 = new Carro("Cinza", "BMW", 40);
        System.out.println(carro3.getCor());
        System.out.println(carro3.getModelo());
        System.out.println(carro3.getCapacidadeTanque());
        System.out.println(carro3.totalValorTanque(5.60));

    }
}
