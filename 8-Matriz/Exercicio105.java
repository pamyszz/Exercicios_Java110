public class Exercicio105 {
    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        int[] somaColunas = calcularSomaColunas(matriz);

        for (int i = 0; i < somaColunas.length; i++) {
            System.out.println("Soma dos elementos da coluna " + i + ": " + somaColunas[i]);
        }
    }

    public static int[] calcularSomaColunas(int[][] matriz) {
        int[] somaColunas = new int[matriz[0].length];

        for (int i = 0; i < matriz[0].length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                somaColunas[i] += matriz[j][i];
            }
        }

        return somaColunas;
    }
}
