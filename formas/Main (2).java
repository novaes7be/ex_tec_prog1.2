public class Main {
    public static void main(String[] args) {
        Forma forma1 = new Retangulo(10, 5);
        Forma forma2 = new Circulo(3);

        System.out.println("Área do retângulo: " + forma1.calcularArea());
        System.out.println("Área do círculo: " + forma2.calcularArea());
    }
}
