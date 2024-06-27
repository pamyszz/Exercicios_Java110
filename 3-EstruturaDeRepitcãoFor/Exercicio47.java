public class Exercicio47 {
    public static void main(String[] args) {
        exibirImpares();
    }
    
    public static void exibirImpares() {
        int i = 1;
        
        System.out.println("Números ímpares de 1 a 50:");
        do {
            if (i % 2 != 0) {
                System.out.println(i);
            }
            i++;
        } while (i <= 50);
    }
}
