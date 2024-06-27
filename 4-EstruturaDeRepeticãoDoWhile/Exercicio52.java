public class Exercicio52 {
    public static void main(String[] args) {
        int i = 1;
        int soma = 0;
        do {
            soma += i;
            i++;
        } while (i <= 100);
        System.out.println("A soma dos números de 1 a 100 é: " + soma);
    }
}
