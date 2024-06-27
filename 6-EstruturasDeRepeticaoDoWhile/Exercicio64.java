import java.util.Scanner;

public class Exercicio64 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        exibirDigitosSeparadamente(numero);

        scanner.close();
    }

    public static void exibirDigitosSeparadamente(int numero) {
        System.out.println("Dígitos de " + numero + ":");
        
        do {
            int digito = numero % 10;
            System.out.println(digito);
            numero /= 10;
        } while (numero > 0);
    }
}
