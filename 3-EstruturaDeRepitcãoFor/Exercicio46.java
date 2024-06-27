import java.util.Scanner;

public class Exercicio46 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();
        
        int soma = somaParesAteNumero(numero);
        
        System.out.println("A soma de todos os números pares de 1 até " + numero + " é " + soma);
        
        scanner.close();
    }
    
    public static int somaParesAteNumero(int numero) {
        int soma = 0;
        int i = 1;
        do {
            if (i % 2 == 0) {
                soma += i;
            }
            i++;
        } while (i <= numero);
        
        return soma;
    }
}
