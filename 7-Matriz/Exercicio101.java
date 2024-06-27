public class Exercicio101 {
    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        double media = calcularMediaMatriz(matriz);
        System.out.println("A média aritmética dos elementos da matriz é: " + media);
    }

    public static double calcularMediaMatriz(int[][] matriz) {
        int soma = 0;
        int totalElementos = matriz.length * matriz[0].length;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                soma += matriz[i][j];
            }
        }

        return (double) soma / totalElementos;
    }
}
