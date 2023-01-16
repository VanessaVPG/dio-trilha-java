public class RodarAplicacao {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

        // A exucução abaixo resultará em erro, evitar usar o downcast
        // Vendedor vendedor2 = (Vendedor) new Funcionario();
        ClasseMae[] classes = new ClasseMae[]{new ClasseFilha1(), new ClasseFilha2(), new ClasseMae()};

        for (ClasseMae classe: classes){
            classe.metodo1();
        }
        System.out.println("");

        for(ClasseMae classe:classes){
            classe.metodo2();
        }
        System.out.println("");

        ClasseFilha2 classeFilha2 = new ClasseFilha2();
        classeFilha2.metodo2();
    }
}
