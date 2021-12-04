import java.util.Scanner;

public class ExemploWhile {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe um nome: ");
        String nome = leitor.next();
        while (!nome.equals("João")) {
            System.out.println("Informe mais um nome: ");
            nome = leitor.next();

        }
    }
}
