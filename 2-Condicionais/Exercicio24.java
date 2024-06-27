import java.util.Arrays;
import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = scanner.nextInt();
        System.out.print("Digite o segundo número inteiro: ");
        int num2 = scanner.nextInt();
        System.out.print("Digite o terceiro número inteiro: ");
        int num3 = scanner.nextInt();

        int[] numeros = { num1, num2, num3 };
        Arrays.sort(numeros);

        System.out.println("Números em ordem crescente: " + numeros[0] + ", " + numeros[1] + ", " + numeros[2]);

        scanner.close();
    }
}
