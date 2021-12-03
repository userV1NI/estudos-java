package teste;

public class LoopWhile {
    public static void main(String[] args) {
        int inicial = 1;
        int maximo = 10;

        System.out.println("Contado até " + maximo);

        while (inicial <= maximo) {
            System.out.println("Valor: " + inicial);
            inicial++;
        }
        do {
            inicial++;
            System.out.println("Valor: " + inicial);
        } while (inicial < 15);
        }
}
