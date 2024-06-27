public class Exercicio107 {
    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int produtoDiagonalSecundaria = calcularProdutoDiagonalSecundaria(matriz);
        System.out.println("Produto dos elementos da diagonal secundária: " + produtoDiagonalSecundaria);
    }

    public static int calcularProdutoDiagonalSecundaria(int[][] matriz) {
        int produto = 1;
        int n = matriz.length;

        for (int i = 0; i < n; i++) {
            produto *= matriz[i][n - 1 - i];
        }

        return produto;
    }
}
