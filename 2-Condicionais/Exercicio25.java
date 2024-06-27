import java.util.Scanner;

public class Exercicio25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de faltas do aluno: ");
        int faltas = scanner.nextInt();

        if (faltas > 15) {
            System.out.println("Situação do aluno: Reprovado por falta.");
        } else {
            System.out.println("Situação do aluno: Aprovado.");
        }

        scanner.close();
    }
}
