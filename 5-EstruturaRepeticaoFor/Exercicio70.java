import java.util.Scanner;

public class Exercicio70 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro para ver sua tabuada até o décimo valor: ");
        int numero = scanner.nextInt();

        exibirTabuada(numero);

        scanner.close();
    }

    public static void exibirTabuada(int numero) {
        System.out.println("Tabuada de multiplicação do número " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}
