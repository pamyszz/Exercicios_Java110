import java.util.Scanner;

public class Exercicio95 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroAnterior = Integer.MAX_VALUE;
        int numeroAtual;

        boolean sequenciaDecrescente = true;

        do {
            System.out.print("Digite um número inteiro (digite 0 para encerrar): ");
            numeroAtual = scanner.nextInt();

            if (numeroAtual != 0) {
                if (numeroAtual >= numeroAnterior) {
                    sequenciaDecrescente = false;
                }
                numeroAnterior = numeroAtual;
            }
        } while (numeroAtual != 0);

        if (sequenciaDecrescente) {
            System.out.println("A sequência de números digitada é decrescente.");
        } else {
            System.out.println("A sequência de números digitada não é decrescente.");
        }

        scanner.close();
    }
}
