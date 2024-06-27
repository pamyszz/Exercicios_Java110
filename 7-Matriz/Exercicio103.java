public class Exercicio103 {
    public static void main(String[] args) {
        int[][] matriz = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };

        int menorValor = encontrarMenorValor(matriz);
        System.out.println("Menor valor na matriz 3x3: " + menorValor);
    }

    public static int encontrarMenorValor(int[][] matriz) {
        int menor = matriz[0][0];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
            }
        }

        return menor;
    }
}
