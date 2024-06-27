import java.util.Scanner;

public class Exercicio58 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();

        int primeiro = 0, segundo = 1, proximoTermo;

        System.out.println("Sequência de Fibonacci até " + numero + ":");
        System.out.print(primeiro + " ");

        do {
            System.out.print(segundo + " ");
            proximoTermo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximoTermo;
        } while (segundo <= numero);

        scanner.close();
    }
}
