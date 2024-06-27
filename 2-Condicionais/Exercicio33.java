import java.util.Scanner;

public class Exercicio33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o turno do aluno (M - Matutino, V - Vespertino): ");
        String turno = scanner.next().toUpperCase();

        if (turno.equals("M")) {
            System.out.println("Bom dia, " + nome + "!");
        } else if (turno.equals("V")) {
            System.out.println("Boa tarde, " + nome + "!");
        } else {
            System.out.println("Turno inválido!");
        }

        scanner.close();
    }
}
