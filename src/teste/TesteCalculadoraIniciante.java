package teste;

import javax.swing.JOptionPane;

public class TesteCalculadoraIniciante {
    public static void main(String[] args) {
            int escolha;
            double num1, num2, operacao;
            do {

                JOptionPane.showMessageDialog(null, "1 = Soma; 2 = Subtração; 3 = Multiplicação; 4 = Divisão; 5 = Saída");
                escolha = Integer.parseInt(JOptionPane.showInputDialog("Escolha a operação: "));

                if (escolha == 1) {
                    num1 = Double.parseDouble(JOptionPane.showInputDialog("Primeiro número para operação: "));
                    num2 = Double.parseDouble(JOptionPane.showInputDialog("Segundo número para operação: "));
                    operacao = num1 + num2;
                    JOptionPane.showMessageDialog(null, "O valor da Soma é: " + operacao);
                } else if (escolha == 2) {
                    num1 = Double.parseDouble(JOptionPane.showInputDialog("Primeiro número para operação: "));
                    num2 = Double.parseDouble(JOptionPane.showInputDialog("Segundo número para operação: "));
                    operacao = num1 - num2;
                    JOptionPane.showMessageDialog(null, "O valor da Subtração é: " + operacao);
                } else if (escolha == 3) {
                    num1 = Double.parseDouble(JOptionPane.showInputDialog("Primeiro número para operação: "));
                    num2 = Double.parseDouble(JOptionPane.showInputDialog("Segundo número para operação: "));
                    operacao = num1 * num2;
                    JOptionPane.showMessageDialog(null, "O valor da multiplicação é: " + operacao);
                } else if (escolha == 4) {
                    num1 = Double.parseDouble(JOptionPane.showInputDialog("Primeiro número para operação: "));
                    num2 = Double.parseDouble(JOptionPane.showInputDialog("Segundo número para operação: "));
                    operacao = num1 / num2;
                    JOptionPane.showMessageDialog(null, "O valor da divisão é: " + operacao);
                }

            }

            while (escolha != 5);

    }

}
