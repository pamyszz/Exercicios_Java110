public class Exercicio60 {
    public static void main(String[] args) {
        int a = 0, b = 1, fibonacci;
        System.out.print("Sequência de Fibonacci: " + a + " " + b);

        int contador = 2;
        do {
            fibonacci = a + b;
            System.out.print(" " + fibonacci);
            a = b;
            b = fibonacci;
            contador++;
        } while (contador < 20);

        System.out.println();
    }
}
