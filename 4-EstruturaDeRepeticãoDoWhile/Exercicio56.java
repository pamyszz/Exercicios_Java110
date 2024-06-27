public class Exercicio56 {
    public static void main(String[] args) {
        exibirFibonacci();
    }
    
    public static void exibirFibonacci() {
        int anterior = 0;
        int atual = 1;
        int proximo;
        int contador = 0;
        
        System.out.println("Os primeiros 20 números da sequência de Fibonacci:");
        do {
            System.out.print(anterior + " ");
            proximo = anterior + atual;
            anterior = atual;
            atual = proximo;
            contador++;
        } while (contador < 20);
        System.out.println();
    }
}
