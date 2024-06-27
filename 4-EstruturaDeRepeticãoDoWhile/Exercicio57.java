import java.util.Scanner;

public class Exercicio57 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();

        if (numero <= 1) {
            System.out.println("Número inválido.");
        } else {
            boolean ehPrimo = true;
            int divisor = 2;

            do {
                if (numero % divisor == 0 && numero != divisor) {
                    ehPrimo = false;
                }
                divisor++;
            } while (divisor <= numero / 2);

            if (ehPrimo) {
                System.out.println(numero + " é um número primo.");
            } else {
                System.out.println(numero + " não é um número primo.");
            }
        }

        scanner.close();
    }
}
