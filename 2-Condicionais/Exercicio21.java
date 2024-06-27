import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a quantidade de pessoas: ");
        int quantidade = scanner.nextInt();
        
        int menores = 0;
        int maiores = 0;
        
        for (int i = 0; i < quantidade; i++) {
            System.out.print("Digite a idade da pessoa " + (i + 1) + ": ");
            int idade = scanner.nextInt();
            
            if (idade < 18) {
                menores++;
            } else {
                maiores++;
            }
        }
        
        System.out.println("Quantidade de menores de idade: " + menores);
        System.out.println("Quantidade de maiores de idade: " + maiores);
        
        scanner.close();
    }
}
