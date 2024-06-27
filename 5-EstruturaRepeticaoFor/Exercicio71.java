import java.util.Scanner;

public class Exercicio71 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro para encontrar seus divisores: ");
        int numero = scanner.nextInt();

        exibirDivisores(numero);

        scanner.close();
    }

    public static void exibirDivisores(int numero) {
        System.out.println("Divisores de " + numero + ":");
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
