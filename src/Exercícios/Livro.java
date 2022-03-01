package Exercícios;

public class Livro {
    public static void main(String[] args) {
        CompLivro livro = new CompLivro();

        livro.autor = "Vinícius";
        livro.anoLancamento = 2022;
        livro.corCapa = "Azul";
        livro.nome = "Meu Programa Java";
        livro.numeroPaginas = 1;

        System.out.println(livro.anoLancamento);
    }
}
