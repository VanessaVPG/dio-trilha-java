public class Sobrecarga {
    public static void calcularArea(int lado1) {
        int area = lado1*lado1;
        System.out.println("Área: " + area);
    }
    public static void calcularArea(int ladoR1, int ladoR2) {
        double area = ladoR1*ladoR2;
        System.out.println("Área do Retângulo: " + area);
    }
    public static void calcularArea(int baseT1, int baseT2, int alturaT) {
        double area = (baseT1+baseT2)*alturaT/2;
        System.out.println("Área do Trapézio: " + area);
    }

}
