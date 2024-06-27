import java.util.Scanner;

public class Exercicio93 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Digite um número inteiro (digite 0 para encerrar): ");
            numero = scanner.nextInt();

            if (ehNumeroPerfeito(numero)) {
                System.out.println(numero + " é um número perfeito.");
            } else if (numero != 0) {
                System.out.println(numero + " não é um número perfeito.");
            }
        } while (numero != 0);

        scanner.close();
    }

    public static boolean ehNumeroPerfeito(int numero) {
        if (numero <= 1) {
            return false;
        }

        int somaDivisores = 0;
        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                somaDivisores += i;
            }
        }

        return somaDivisores == numero;
    }
}

