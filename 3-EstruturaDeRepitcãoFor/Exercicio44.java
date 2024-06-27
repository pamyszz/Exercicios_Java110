import java.util.Scanner;

public class Exercicio44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int somaIdades = 0;
        int contador = 0;
        
        while (contador < 5) {
            System.out.print("Digite a idade da pessoa " + (contador + 1) + ": ");
            int idade = scanner.nextInt();
            somaIdades += idade;
            contador++;
        }
        
        double mediaIdades = somaIdades / 5.0;
        System.out.println("A média das idades é: " + mediaIdades);
        
        scanner.close();
    }
}
