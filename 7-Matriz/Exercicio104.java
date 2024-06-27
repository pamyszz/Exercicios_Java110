public class Exercicio104 {
    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] transposta = calcularTransposta(matriz);
        exibirMatriz(transposta);
    }

    public static int[][] calcularTransposta(int[][] matriz) {
        int[][] transposta = new int[matriz.length][matriz[0].length];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                transposta[j][i] = matriz[i][j];
            }
        }

        return transposta;
    }

    public static void exibirMatriz(int[][] matriz) {
        System.out.println("Matriz Transposta:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
