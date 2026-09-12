public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Carla");

        aluno.setPrimeiraNota(8.5);
        aluno.setSegundaNota(7.0);
        aluno.mostrarDados();

        aluno.setPrimeiraNota(15);
        aluno.setSegundaNota(-2);
        aluno.mostrarDados();
    }
}
