public class Desenvolvedor extends Funcionario {

    private String linguagem;

    public Desenvolvedor(String nome, double salario, String linguagem) {
        super(nome, salario);
        this.linguagem = linguagem;
    }

    public String getLinguagem() {
        return linguagem;
    }

    public void programar() {
        System.out.println(getNome() + " está programando em " + linguagem + ".");
    }
}
