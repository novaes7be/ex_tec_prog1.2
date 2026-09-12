public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto("Teclado", 150.0, 10);

        produto.mostrarDados();

        produto.alterarPreco(180.0);
        produto.alterarPreco(-50.0);

        produto.adicionarEstoque(5);
        produto.adicionarEstoque(-3);

        produto.retirarEstoque(20);
        produto.retirarEstoque(4);

        produto.mostrarDados();
    }
}
