public class Aluno {

    private String nome;
    private double primeiraNota;
    private double segundaNota;

    public Aluno(String nome) {
        this.nome = nome;
    }

    public void setPrimeiraNota(double nota) {
        if (nota >= 0 && nota <= 10) {
            this.primeiraNota = nota;
        } else {
            System.out.println("Nota inválida: " + nota);
        }
    }

    public void setSegundaNota(double nota) {
        if (nota >= 0 && nota <= 10) {
            this.segundaNota = nota;
        } else {
            System.out.println("Nota inválida: " + nota);
        }
    }

    public double calcularMedia() {
        return (primeiraNota + segundaNota) / 2;
    }

    public void mostrarDados() {
        System.out.println("Aluno: " + nome);
        System.out.println("Primeira nota: " + primeiraNota);
        System.out.println("Segunda nota: " + segundaNota);
        System.out.println("Média: " + calcularMedia());
    }
}
