package teste;

import java.util.Scanner;

public class ExerciciosLoopsP2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        boolean enderecoValido = false;
        String nomeUser;
        String senha;
        do {
            System.out.println("Informe o nome: ");
            nomeUser = leitor.next();
            System.out.println("Informe a senha: ");
            senha = leitor.next();
            if (!nomeUser.equalsIgnoreCase(senha)) {
                System.out.println("Nome e senha iguais. digite novamente");
            }
            else {
                enderecoValido = true;
                System.out.println("Registrado");
            }
        } while (!enderecoValido);
    }
}
