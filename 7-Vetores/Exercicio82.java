import java.util.Scanner;

public class Exercicio82 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int soma = 0;

        do {
            System.out.print("Digite um número inteiro (digite 0 para encerrar): ");
            numero = scanner.nextInt();
            soma += numero;
        } while (numero != 0);

        System.out.println("A soma dos números digitados é: " + soma);

        scanner.close();
    }
}
