import java.util.Scanner;

public class Exercicio26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o código do produto: ");
        int codigo = scanner.nextInt();

        double preco = 0;
        switch (codigo) {
            case 1:
                preco = 10.0;
                break;
            case 2:
                preco = 15.0;
                break;
            case 3:
                preco = 20.0;
                break;
            default:
                System.out.println("Código de produto inválido!");
                break;
        }

        if (preco != 0) {
            System.out.print("Digite a quantidade comprada: ");
            int quantidade = scanner.nextInt();

            double total = preco * quantidade;
            System.out.println("Total a ser pago: R$" + total);
        }

        scanner.close();
    }
}
