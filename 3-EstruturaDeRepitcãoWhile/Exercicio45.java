public class Exercicio45 {
    public static void main(String[] args) {
        int a = 0, b = 1, contador = 1;
        
        System.out.println("Os primeiros 20 números da sequência de Fibonacci são:");
        while (contador <= 20) {
            System.out.print(a + " ");
            int temp = a;
            a = b;
            b = temp + b;
            contador++;
        }
    }
}
