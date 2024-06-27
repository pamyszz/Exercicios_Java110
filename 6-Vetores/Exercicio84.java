import java.util.Scanner;

public class Exercicio84 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int contadorPares = 0;

        do {
            System.out.print("Digite um número inteiro (digite 0 para encerrar): ");
            numero = scanner.nextInt();
            if (numero % 2 == 0 && numero != 0) {
                contadorPares++;
            }
        } while (numero != 0);

        System.out.println("A quantidade de números pares digitados é: " + contadorPares);

        scanner.close();
    }
}
