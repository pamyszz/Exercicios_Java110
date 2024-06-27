public class Exercicio102 {
    public static void main(String[] args) {
        int[][] matriz1 = {
            {1, 2},
            {3, 4}
        };

        int[][] matriz2 = {
            {5, 6},
            {7, 8}
        };

        int[][] resultado = multiplicarMatrizes(matriz1, matriz2);
        exibirMatriz(resultado);
    }

    public static int[][] multiplicarMatrizes(int[][] matriz1, int[][] matriz2) {
        int[][] resultado = new int[matriz1.length][matriz2[0].length];

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz2[0].length; j++) {
                for (int k = 0; k < matriz1[0].length; k++) {
                    resultado[i][j] += matriz1[i][k] * matriz2[k][j];
                }
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
