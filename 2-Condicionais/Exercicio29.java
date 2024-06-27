import java.util.Scanner;

public class Exercicio29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a nota do aluno: ");
        double nota = scanner.nextDouble();

        if (nota >= 7) {
            System.out.println("Aluno " + nome + " aprovado.");
        } else {
            System.out.println("Aluno " + nome + " em recuperação.");
        }

        scanner.close();
    }
}
