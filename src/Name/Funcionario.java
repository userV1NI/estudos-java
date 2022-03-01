package Name;

import java.util.Scanner;

public class Funcionario {
    public static void main(String[] args) {
        CompFuncionario funcionario = new CompFuncionario();
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe o seu nome: ");
        funcionario.nome = leitor.next();

        System.out.println("Informe o email: ");
        funcionario.email = leitor.next();

        System.out.println("Informe a idade: ");
        funcionario.idade = leitor.nextInt();

        System.out.println("Informe o salário: ");
        funcionario.salario = leitor.nextDouble();

        funcionario.exibirNomeEemail();
        funcionario.exibirIdade();
        funcionario.calcularMedia(4);
    }
}
