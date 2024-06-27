public class Exercicio97 {
    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2},
            {3, 4}
        };

        int soma = calcularSoma(matriz);
        System.out.println("Soma dos elementos da matriz 2x2: " + soma);
    }

    public static int calcularSoma(int[][] matriz) {
        int soma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                soma += matriz[i][j];
            }
        }
        return soma;
    }
}
