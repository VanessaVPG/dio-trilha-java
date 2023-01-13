public class RetornoValor {
    public static int calcularArea(int lado) {
        int area = lado * lado;
        return area;
    }
    public static double calcularArea(double lado1, double lado2) {
        double area = lado1 * lado2;
        return area;
    }
    public static double calcularArea(double ladoT1, double ladoT2, double alturaT) {
        double area = (ladoT1 + ladoT2)*alturaT/2;
        return area;
    }
}
