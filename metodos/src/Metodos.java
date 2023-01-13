public class Metodos {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println("Exercício da calculadora");
        Calculadora.somar(11.6,2564133.4);
        Calculadora.subtrair(46, 5);
        Calculadora.multiplicar(5, 6);
        Calculadora.dividir(41856, 2);
        Dia.hora(23);
        Emprestimo.taxar(100, 210);
        Sobrecarga.calcularArea(1, 2, 3);
        Sobrecarga.calcularArea(10);
        Sobrecarga.calcularArea(20, 40);
        RetornoValor.calcularArea(1, 3);
        RetornoValor.calcularArea(1, 3,5);
        RetornoValor.calcularArea(2);
        double areaQuadrado = RetornoValor.calcularArea(10);
        System.out.println("Área do Quadrado: " + areaQuadrado);

    };
    

}
