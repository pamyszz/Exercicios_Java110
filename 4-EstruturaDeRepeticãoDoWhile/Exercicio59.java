import java.util.Scanner;

public class Exercicio59 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contador = 0;
        int somaIdades = 0;

        do {
            System.out.print("Digite a idade da pessoa " + (contador + 1) + ": ");
            int idade = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha após nextInt()

            somaIdades += idade;
            contador++;
        } while (contador < 5);

        double mediaIdades = (double) somaIdades / 5;
        System.out.println("Média das idades: " + mediaIdades);

        scanner.close();
    }
}
