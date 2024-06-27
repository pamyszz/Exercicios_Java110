import java.util.Scanner;

public class Exercicio65 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int somaIdades = 0;
        int contador = 0;
        String nome;

        do {
            System.out.print("Digite o nome da pessoa (ou 'fim' para encerrar): ");
            nome = scanner.nextLine();

            if (!nome.equalsIgnoreCase("fim")) {
                System.out.print("Digite a idade de " + nome + ": ");
                int idade = scanner.nextInt();
                scanner.nextLine(); // Consumir a quebra de linha após nextInt()

                somaIdades += idade;
                contador++;
            }
        } while (!nome.equalsIgnoreCase("fim"));

        if (contador > 0) {
            double mediaIdades = (double) somaIdades / contador;
            System.out.println("Média das idades das pessoas digitadas: " + mediaIdades);
        } else {
            System.out.println("Nenhuma pessoa foi cadastrada.");
        }

        scanner.close();
    }
}
