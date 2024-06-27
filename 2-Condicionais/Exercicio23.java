import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do mês: ");
        String mes = scanner.nextLine().toLowerCase();

        int dias = 0;
        switch (mes) {
            case "janeiro":
            case "março":
            case "maio":
            case "julho":
            case "agosto":
            case "outubro":
            case "dezembro":
                dias = 31;
                break;
            case "abril":
            case "junho":
            case "setembro":
            case "novembro":
                dias = 30;
                break;
            case "fevereiro":
                dias = 28; // Considerando um ano não bissexto
                break;
            default:
                System.out.println("Mês inválido!");
                break;
        }

        if (dias != 0) {
            System.out.println("O mês de " + mes + " possui " + dias + " dias.");
        }

        scanner.close();
    }
}
