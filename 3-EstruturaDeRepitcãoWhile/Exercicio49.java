import java.util.Scanner;

public class Exercicio49 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();
        
        int fatorial = calcularFatorial(numero);
        
        System.out.println("O fatorial de " + numero + " é " + fatorial);
        
        scanner.close();
    }
    
    public static int calcularFatorial(int numero) {
        int fatorial = 1;
        int i = 1;
        do {
            fatorial *= i;
            i++;
        } while (i <= numero);
        
        return fatorial;
    }
}
