import java.util.Scanner;

public class Exercicio69 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = scanner.nextInt();
        }

        double media = calcularMedia(numeros);
        System.out.println("Média aritmética dos números digitados: " + media);

        scanner.close();
    }

    public static double calcularMedia(int[] numeros) {
        int soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }
        return (double) soma / numeros.length;
    }
}
