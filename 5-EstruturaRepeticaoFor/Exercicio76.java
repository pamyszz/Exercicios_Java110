import java.util.Scanner;

public class Exercicio76 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro para calcular a soma de todos os números pares até ele: ");
        int numero = scanner.nextInt();

        int somaPares = calcularSomaPares(numero);
        System.out.println("A soma dos números pares até " + numero + " é: " + somaPares);

        scanner.close();
    }

    public static int calcularSomaPares(int numero) {
        int soma = 0;
        for (int i = 2; i <= numero; i += 2) {
            soma += i;
        }
        return soma;
    }
}
