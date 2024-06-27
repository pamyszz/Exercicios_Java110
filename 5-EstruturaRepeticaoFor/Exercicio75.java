public class Exercicio75 {
    public static void main(String[] args) {
        int n = 20;
        exibirPrimeirosNFibonacci(n);
    }

    public static void exibirPrimeirosNFibonacci(int n) {
        int primeiro = 0, segundo = 1;

        System.out.print("Os primeiros " + n + " números da sequência de Fibonacci: ");
        for (int i = 0; i < n; i++) {
            System.out.print(primeiro + " ");
            int soma = primeiro + segundo;
            primeiro = segundo;
            segundo = soma;
        }
        System.out.println();
    }
}
