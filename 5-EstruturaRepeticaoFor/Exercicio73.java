import java.util.Scanner;

public class Exercicio73 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro para exibir a sequência de Fibonacci até ele: ");
        int numero = scanner.nextInt();

        exibirSequenciaFibonacci(numero);

        scanner.close();
    }

    public static void exibirSequenciaFibonacci(int numero) {
        int primeiro = 0, segundo = 1;
        System.out.print("Sequência de Fibonacci até " + numero + ": ");
        while (primeiro <= numero) {
            System.out.print(primeiro + " ");
            int soma = primeiro + segundo;
            primeiro = segundo;
            segundo = soma;
        }
        System.out.println();
    }
}
