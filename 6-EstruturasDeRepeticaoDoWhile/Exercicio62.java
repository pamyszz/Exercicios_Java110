import java.util.Scanner;

public class Exercicio62 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        verificarNumeroPrimo(numero);

        scanner.close();
    }

    public static void verificarNumeroPrimo(int numero) {
        int i = 2;
        boolean primo = true;
        do {
            if (numero % i == 0) {
                primo = false;
                break;
            }
            i++;
        } while (i <= numero / 2);

        if (primo) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }
    }
}
