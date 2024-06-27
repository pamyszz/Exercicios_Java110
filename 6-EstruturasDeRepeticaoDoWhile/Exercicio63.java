import java.util.Scanner;

public class Exercicio63 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        exibirSequenciaFibonacci(numero);

        scanner.close();
    }

    public static void exibirSequenciaFibonacci(int numero) {
        int anterior = 0;
        int atual = 1;
        int proximo;
        
        System.out.println("Sequência de Fibonacci até " + numero + ":");
        System.out.print(anterior + " ");
        
        while (atual <= numero) {
            System.out.print(atual + " ");
            proximo = anterior + atual;
            anterior = atual;
            atual = proximo;
        }
        System.out.println();
    }
}
