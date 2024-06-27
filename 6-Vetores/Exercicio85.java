import java.util.Scanner;

public class Exercicio85 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int contadorImpares = 0;

        do {
            System.out.print("Digite um número inteiro (digite 0 para encerrar): ");
            numero = scanner.nextInt();
            if (numero % 2 != 0 && numero != 0) {
                contadorImpares++;
            }
        } while (numero != 0);

        System.out.println("A quantidade de números ímpares digitados é: " + contadorImpares);

        scanner.close();
    }
}
