public class Exercicio62 {
    public static void main(String[] args) {
        int numero = 1;

        System.out.println("Números ímpares de 1 a 50:");
        do {
            if (numero % 2 != 0) {
                System.out.print(numero + " ");
            }
            numero++;
        } while (numero <= 50);
    }
}
