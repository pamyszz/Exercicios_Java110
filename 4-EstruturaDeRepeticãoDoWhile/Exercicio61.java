import java.util.Scanner;

public class Exercicio61 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();

        int somaPares = 0;
        int i = 2; // Começa em 2 porque é o primeiro número par

        do {
            somaPares += i;
            i += 2; // Próximo número par
        } while (i <= numero);

        System.out.println("A soma dos números pares até " + numero + " é: " + somaPares);

        scanner.close();
    }
}
