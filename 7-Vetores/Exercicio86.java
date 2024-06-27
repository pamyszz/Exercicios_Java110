import java.util.Scanner;

public class Exercicio86 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int contadorPositivos = 0;

        do {
            System.out.print("Digite um número inteiro (digite 0 para encerrar): ");
            numero = scanner.nextInt();
            if (numero > 0) {
                contadorPositivos++;
            }
        } while (numero != 0);

        System.out.println("A quantidade de números positivos digitados é: " + contadorPositivos);

        scanner.close();
    }
}
