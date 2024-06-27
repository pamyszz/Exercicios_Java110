import java.util.Scanner;

public class Exercicio81 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome;
        int idade;
        int somaIdades = 0;
        int contador = 0;

        System.out.println("Digite 'fim' no nome para encerrar o programa.");

        do {
            System.out.print("Digite o nome (ou 'fim' para encerrar): ");
            nome = scanner.nextLine();

            if (!nome.equalsIgnoreCase("fim")) {
                System.out.print("Digite a idade de " + nome + ": ");
                idade = lerIdadeValida(scanner);
                somaIdades += idade;
                contador++;
            }
        } while (!nome.equalsIgnoreCase("fim"));

        if (contador > 0) {
            double mediaIdades = (double) somaIdades / contador;
            System.out.println("Média das idades das pessoas digitadas: " + mediaIdades);
        } else {
            System.out.println("Nenhuma pessoa foi inserida.");
        }

        scanner.close();
    }

    public static int lerIdadeValida(Scanner scanner) {
        int idade;
        do {
            System.out.print("Digite a idade: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Por favor, digite um número válido.");
                scanner.next();
            }
            idade = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner
        } while (idade <= 0);

        return idade;
    }
}
