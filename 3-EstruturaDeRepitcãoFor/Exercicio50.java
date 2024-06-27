import java.util.Scanner;

public class Exercicio50 {
    public static void main(String[] args) {
        calcularMediaIdades();
    }
    
    public static void calcularMediaIdades() {
        Scanner scanner = new Scanner(System.in);
        int somaIdades = 0;
        int contador = 0;
        String nome;
        
        do {
            System.out.print("Digite o nome da pessoa (ou 'fim' para encerrar): ");
            nome = scanner.next();
            if (!nome.equalsIgnoreCase("fim")) {
                System.out.print("Digite a idade de " + nome + ": ");
                int idade = scanner.nextInt();
                somaIdades += idade;
                contador++;
            }
        } while (!nome.equalsIgnoreCase("fim"));
        
        if (contador > 0) {
            double mediaIdades = somaIdades / (double)contador;
            System.out.println("A média das idades é: " + mediaIdades);
        } else {
            System.out.println("Nenhuma idade foi informada.");
        }
        
        scanner.close();
    }
}
