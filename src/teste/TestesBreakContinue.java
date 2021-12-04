package teste;

import java.util.Scanner;

public class TestesBreakContinue {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        /*System.out.println("Informe o número: ");
        int num = leitor.nextInt();
        System.out.println("Informe o limite: ");
        int lim = leitor.nextInt();

        for (int i = num; i <= lim; ++i) {
            if (i % 7 == 0) {
                System.out.println("Valor de i divisível por 7: " + i);
                break;
            }
        } */
        System.out.println("Informe o número: ");
        int num = leitor.nextInt();
        System.out.println("Informe o limite: ");
        int lim = leitor.nextInt();

        for (int i = num; i <= lim; ++i) {
            if (i % 7 == 0) {
                continue;
            }
            System.out.println("Valor de i: " + i);
        }

        System.out.println("FIM");
    }
}
