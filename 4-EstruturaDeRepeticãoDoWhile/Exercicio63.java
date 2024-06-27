import java.util.Scanner;

public class Exercicio63 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();

        System.out.print("Dígitos do número " + numero + ": ");

        int digito;
        do {
            digito = numero % 10;
            System.out.print(digito + " ");
            numero /= 10;
        } while (numero != 0);

        scanner.close();
    }
}
