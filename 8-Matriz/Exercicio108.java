public class Exercicio108 {
    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        encontrarMaiorPorLinha(matriz);
    }

    public static void encontrarMaiorPorLinha(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            int maior = matriz[i][0];
            for (int j = 1; j < matriz[i].length; j++) {
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
            }
            System.out.println("Maior valor da linha " + i + ": " + maior);
        }
    }
}
