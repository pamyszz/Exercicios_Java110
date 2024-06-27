import java.util.Scanner;

public class Exercicio31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do salário-mínimo: ");
        double salarioMinimo = scanner.nextDouble();

        System.out.print("Digite o salário do funcionário: ");
        double salarioFuncionario = scanner.nextDouble();

        double salariosMinimos = salarioFuncionario / salarioMinimo;

        System.out.println("O funcionário recebe " + salariosMinimos + " salários-mínimos.");

        scanner.close();
    }
}
