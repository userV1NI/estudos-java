import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int A, B, temporario;
        System.out.println("Digite um valor: ");
        A = leitor.nextInt();
        System.out.println("Digite mais um valor: ");
        B = leitor.nextInt();
        temporario = A;
        A = B;
        B = temporario;
        System.out.println("A = " + A);
        System.out.println("B = " + B);
    }
}
