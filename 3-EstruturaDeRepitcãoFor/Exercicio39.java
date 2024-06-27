import java.util.Scanner;

public class Exercicio39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;
        int i = 1;
        
        while (i <= 5) {
            System.out.print("Digite o " + i + "º número: ");
            int numero = scanner.nextInt();
            soma += numero;
            i++;
        }

        double media = soma / 5.0;
        System.out.println("A média dos números é: " + media);
        
        scanner.close();
    }
}
