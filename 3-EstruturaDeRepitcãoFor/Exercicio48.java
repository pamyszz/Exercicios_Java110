import java.util.Scanner;

public class Exercicio48 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();
        
        exibirDigitos(numero);
        
        scanner.close();
    }
    
    public static void exibirDigitos(int numero) {
        System.out.println("Dígitos do número " + numero + ":");
        do {
            int digito = numero % 10;
            System.out.println(digito);
            numero /= 10;
        } while (numero > 0);
    }
}
