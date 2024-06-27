import java.util.Scanner;

public class Exercicio91 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int somaDigitos;

        do {
            System.out.print("Digite um número inteiro (digite 0 para encerrar): ");
            numero = scanner.nextInt();
            somaDigitos = calcularSomaDigitos(numero);
            System.out.println("A soma dos dígitos de " + numero + " é: " + somaDigitos);
        } while (numero != 0);

        scanner.close();
    }

    public static int calcularSomaDigitos(int numero) {
        int soma = 0;
        while (numero != 0) {
            soma += numero % 10;
            numero /= 10;
        }
        return soma;
    }
}
