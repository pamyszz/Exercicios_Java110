import java.util.Scanner;

public class Exercicio30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de maçãs compradas: ");
        int quantidade = scanner.nextInt();

        double precoUnitario;
        if (quantidade < 12) {
            precoUnitario = 0.50;
        } else {
            precoUnitario = 0.40;
        }

        double total = quantidade * precoUnitario;
        System.out.println("Total a ser pago: R$" + total);

        scanner.close();
    }
}
