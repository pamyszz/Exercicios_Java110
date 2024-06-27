public class Exercicio100 {
    public static void main(String[] args) {
        int[][] matriz = {
            {1, 5, 3},
            {4, 2, 9},
            {7, 8, 6}
        };

        int maiorValor = encontrarMaiorValor(matriz);
        System.out.println("O maior valor presente na matriz é: " + maiorValor);
    }

    public static int encontrarMaiorValor(int[][] matriz) {
        int maior = matriz[0][0];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
            }
        }
        return maior;
    }
}
