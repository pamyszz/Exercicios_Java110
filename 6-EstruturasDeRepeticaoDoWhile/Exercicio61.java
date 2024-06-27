public class Exercicio61 {
    public static void main(String[] args) {
        int numero = 7;
        exibirTabuada(numero);
    }

    public static void exibirTabuada(int numero) {
        int i = 1;
        System.out.println("Tabuada de multiplicação do " + numero + ":");
        do {
            System.out.println(numero + " x " + i + " = " + (numero * i));
            i++;
        } while (i <= 10);
    }
}
