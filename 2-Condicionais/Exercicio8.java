import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();
        
        // Troca de valores
        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("Primeiro número após a troca: " + num1);
        System.out.println("Segundo número após a troca: " + num2);
        
        scanner.close();
    }
}
