import java.util.Scanner;

public class Exercicio94 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroAnterior = Integer.MIN_VALUE;
        int numeroAtual;

        boolean sequenciaCrescente = true;

        do {
            System.out.print("Digite um número inteiro (digite 0 para encerrar): ");
            numeroAtual = scanner.nextInt();

            if (numeroAtual != 0) {
                if (numeroAtual <= numeroAnterior) {
                    sequenciaCrescente = false;
                }
                numeroAnterior = numeroAtual;
            }
        } while (numeroAtual != 0);

        if (sequenciaCrescente) {
            System.out.println("A sequência de números digitada é crescente.");
        } else {
            System.out.println("A sequência de números digitada não é crescente.");
        }

        scanner.close();
    }
}
