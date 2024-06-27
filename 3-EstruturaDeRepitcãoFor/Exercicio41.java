import java.util.Scanner;

public class Exercicio41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();
        
        System.out.println("Divisores de " + numero + ":");
        int i = 1;
        while (i <= numero) {
            if (numero % i == 0) {
                System.out.println(i);
            }
            i++;
        }
        
        scanner.close();
    }
}
