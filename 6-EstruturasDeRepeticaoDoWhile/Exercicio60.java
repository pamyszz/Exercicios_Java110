import java.util.Scanner;

public class Exercicio60 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();

        exibirDivisores(numero);

        scanner.close();
    }

    public static void exibirDivisores(int numero) {
        int i = 1;
        System.out.println("Divisores de " + numero + ":");
        do {
            if (numero % i == 0) {
                System.out.println(i);
            }
            i++;
        } while (i <= numero);
    }
}
