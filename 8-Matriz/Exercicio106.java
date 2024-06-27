public class Exercicio106 {
    public static void main(String[] args) {
        int[][] matriz1 = {
            {1, 2},
            {3, 4}
        };

        int[][] matriz2 = {
            {1, 2},
            {3, 4}
        };

        boolean saoIguais = verificarIgualdadeMatrizes(matriz1, matriz2);
        if (saoIguais) {
            System.out.println("As matrizes são iguais.");
        } else {
            System.out.println("As matrizes não são iguais.");
        }
    }

    public static boolean verificarIgualdadeMatrizes(int[][] matriz1, int[][] matriz2) {
        if (matriz1.length != matriz2.length || matriz1[0].length != matriz2[0].length) {
            return false;
        }

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[0].length; j++) {
                if (matriz1[i][j] != matriz2[i][j]) {
                    return false;
                }
            }
        }

        return true;
    }
}
