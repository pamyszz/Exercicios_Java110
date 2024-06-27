import java.util.Scanner;

public class Exercicio58 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();
        
        verificarPrimo(numero);
        
        scanner.close();
    }
    
    public static void verificarPrimo(int numero) {
        boolean ehPrimo = true;
        int i = 2;
        do {
            if (numero % i == 0) {
                ehPrimo = false;
                break;
            }
            i++;
        } while (i <= numero / 2);
        
        if (ehPrimo) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }
    }
}
