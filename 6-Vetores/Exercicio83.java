import java.util.Scanner;

public class Exercicio83 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int soma = 0;
        int contador = 0;

        do {
            System.out.print("Digite um número inteiro (digite 0 para encerrar): ");
            numero = scanner.nextInt();
            soma += numero;
            contador++;
        } while (numero != 0);

        if (contador > 1) {
            double media = (double) soma / (contador - 1); // Desconsiderando o 0 na média
            System.out.println("A média dos números digitados é: " + media);
        } else {
            System.out.println("Nenhum número foi digitado além do 0.");
        }

        scanner.close();
    }
}
