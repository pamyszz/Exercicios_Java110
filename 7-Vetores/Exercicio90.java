import java.util.Scanner;

public class Exercicio90 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int soma = 0;
        int contador = 0;
        double media;
        double somaQuadrados = 0;

        do {
            System.out.print("Digite um número inteiro (digite 0 para encerrar): ");
            numero = scanner.nextInt();
            soma += numero;
            somaQuadrados += Math.pow(numero, 2);
            contador++;
        } while (numero != 0);

        if (contador > 1) {
            media = (double) soma / (contador - 1); // Desconsiderando o 0 na média
            double desvioPadrao = Math.sqrt((somaQuadrados - contador * Math.pow(media, 2)) / (contador - 1));

            System.out.println("A média dos números digitados é: " + media);
            System.out.println("O desvio padrão dos números digitados é: " + desvioPadrao);
        } else {
            System.out.println("Nenhum número foi digitado além do 0.");
        }

        scanner.close();
    }
}
