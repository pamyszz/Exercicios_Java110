import java.util.Scanner;

public class Exercicio89 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        do {
            System.out.print("Digite um número inteiro (digite 0 para encerrar): ");
            numero = scanner.nextInt();

            if (numero > maior) {
                maior = numero;
            }

            if (numero < menor && numero != 0) {
                menor = numero;
            }
        } while (numero != 0);

        if (maior == Integer.MIN_VALUE && menor == Integer.MAX_VALUE) {
            System.out.println("Nenhum número foi digitado além do 0.");
        } else {
            System.out.println("O maior número digitado é: " + maior);
            System.out.println("O menor número digitado é: " + menor);
        }

        scanner.close();
    }
}
