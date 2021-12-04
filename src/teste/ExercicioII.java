package teste;

import java.util.Scanner;

public class ExercicioII {
    public static void main(String[] args) {
        System.out.println("1 = Cadastrar");
        System.out.println("2 = Atualizar");
        System.out.println("3 = Excluir");
        System.out.println("3 = Sair");
        Scanner leitor = new Scanner(System.in);
        System.out.println("Qual você deseja escolher? ");
        int num = leitor.nextInt();
        switch (num) {
            case 1:
                System.out.println("Realizou o cadastro.");
                break;
            case 2:
                System.out.println("Sistema atualizado.");
                break;
            case 3:
                System.out.println("Excluído.");
                break;
            case 4:
                System.out.println("Saiu.");
                break;
            default:
                System.out.println("Opção inválida");
        }
    }
}
