import java.util.Scanner;

public class ExercicioArray1e2e3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
       /* int[] vetorA = new int[5];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Entre com os valores: ");
            vetorA[i] = leitor.nextInt();
        }
        System.out.println("============================");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Os valores de B são: " + vetorA[i]);
        }
        System.out.println("============================");
        System.out.println("B assumiu os seus valores."); */

        /* int[] vetorA = new int[8];
        int[] vetorB = vetorA;

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Entre com os valores: ");
            vetorA[i] = leitor.nextInt();
        }
        System.out.println("============================");
        for (int i = 0; i < vetorB.length; i++) {
            vetorB[i] = vetorA[i] * 2;
            System.out.println("Os valores de B são: " + vetorB[i]);
        }
        System.out.println("============================");
        System.out.println("B assumiu os seus valores multiplicados por 2."); */

        int[] vetorA = new int[15];
        int[] vetorB = vetorA;

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Entre com os valores: ");
            vetorA[i] = leitor.nextInt();
        }
        System.out.println("============================");
        for (int i = 0; i < vetorB.length; i++) {
            vetorB[i] = vetorA[i] * vetorA[i];
            System.out.println("Os valores de B são: " + vetorB[i]);
        }
        System.out.println("============================");
        System.out.println("B assumiu os seus valores ao quadrado.");
    }
}
