package teste;

import javax.swing.*;

public class TesteInterfaceClass {
    public static void main(String[] args) {
        int idade = 10;
        double altura = 1.78;
        String nome = "Vinícius";
        boolean pessoa = true;

        JOptionPane.showMessageDialog(null, "Idade = " + idade);
        JOptionPane.showMessageDialog(null, "Altura = " + altura);
        JOptionPane.showMessageDialog(null, "Nome = " + nome);
        JOptionPane.showMessageDialog(null, "Pessoa = " + pessoa);
    }
}
