import java.util.Scanner;

public class Exercicio27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade da pessoa: ");
        int idade = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha após o próximo nextInt()

        System.out.print("Digite o sexo da pessoa (M ou F): ");
        String sexo = scanner.nextLine().toUpperCase();

        if (sexo.equals("M")) {
            if (idade >= 65) {
                System.out.println("Pode se aposentar.");
            } else {
                System.out.println("Não pode se aposentar.");
            }
        } else if (sexo.equals("F")) {
            if (idade >= 60) {
                System.out.println("Pode se aposentar.");
            } else {
                System.out.println("Não pode se aposentar.");
            }
        } else {
            System.out.println("Sexo inválido!");
        }

        scanner.close();
    }
}
