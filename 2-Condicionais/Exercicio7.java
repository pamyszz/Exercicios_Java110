import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o salário base: ");
        double salarioBase = scanner.nextDouble();
        
        double comissao = salarioBase * 0.05;
        double salarioLiquido = salarioBase + comissao;

        System.out.println("Salário líquido: " + salarioLiquido);
        
        scanner.close();
    }
}
