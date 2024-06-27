import java.util.Scanner;

public class Exercicio92 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Digite um número inteiro (digite 0 para encerrar): ");
            numero = scanner.nextInt();

            if (ehPrimo(numero)) {
                System.out.println(numero + " é um número primo.");
            } else if (numero != 0) {
                System.out.println(numero + " não é um número primo.");
            }
        } while (numero != 0);

        scanner.close();
    }

    public static boolean ehPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }
}
