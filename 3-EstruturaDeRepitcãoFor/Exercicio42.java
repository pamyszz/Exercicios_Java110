import java.util.Scanner;

public class Exercicio42 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();
        
        boolean isPrimo = true;
        int i = 2;
        while (i <= numero / 2) {
            if (numero % i == 0) {
                isPrimo = false;
                break;
            }
            i++;
        }
        
        if (isPrimo) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }
        
        scanner.close();
    }
}
