import java.util.Scanner;

public class Exercicio34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade da pessoa: ");
        int idade = scanner.nextInt();

        if (idade >= 18 && idade <= 70) {
            System.out.println("Voto obrigatório.");
        } else if ((idade >= 16 && idade < 18) || idade > 70) {
            System.out.println("Voto facultativo.");
        } else {
            System.out.println("Não pode votar.");
        }

        scanner.close();
    }
}
