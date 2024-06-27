import java.util.Scanner;

public class Exercicio74 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro para exibir seus dígitos separadamente: ");
        int numero = scanner.nextInt();

        exibirDigitos(numero);

        scanner.close();
    }

    public static void exibirDigitos(int numero) {
        System.out.print("Dígitos do número " + numero + ": ");
        while (numero > 0) {
            int digito = numero % 10;
            System.out.print(digito + " ");
            numero /= 10;
        }
        System.out.println();
    }
}
