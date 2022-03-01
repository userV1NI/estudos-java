package Name;

public class CompFuncionario {
    String nome;
    String email;
    int idade;
    double salario;

    double calcularMedia(int meses) {
        System.out.println("A média do salário é: ");
        return salario/meses;

    }

    void exibirNomeEemail() {

        System.out.println("O funcionário " + nome + " tem o email: " + email);
    }

    void exibirIdade() {

        System.out.println("Tem " + idade + " anos.");
    }
}
