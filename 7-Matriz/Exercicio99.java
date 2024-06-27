public class Exercicio99 {
    public static void main(String[] args) {
        int[][] matriz1 = {
            {1, 2},
            {3, 4}
        };

        int[][] matriz2 = {
            {5, 6},
            {7, 8}
        };

        int[][] resultado = somarMatrizes(matriz1, matriz2);
        exibirMatriz(resultado);
    }

    public static int[][] somarMatrizes(int[][] matriz1, int[][] matriz2) {
        int[][] resultado = new int[matriz1.length][matriz1[0].length];

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[0].length; j++) {
                resultado[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        return resultado;
    }

    public static void exibirMatriz(int[][] matriz) {
        System.out.println("Matriz Resultante:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
