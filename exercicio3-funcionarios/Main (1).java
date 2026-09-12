public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Ana", 7000, "Financeiro");
        Desenvolvedor dev = new Desenvolvedor("Bruno", 6000, "Java");

        gerente.mostrarDados();
        gerente.realizarReuniao();

        dev.mostrarDados();
        dev.programar();
    }
}
