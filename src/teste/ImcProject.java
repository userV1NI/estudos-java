package teste;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class ImcProject {
    public static void main(String[] args) {
        double Altura, peso, imc;
        Altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a sua altura: "));
        peso = Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso: "));

        imc = peso / (Altura*Altura);

        DecimalFormat decimal = new DecimalFormat("0.00");
        String valorFormatado = decimal.format(imc);

        if (imc >= 18.5 && imc <= 24.9){
            JOptionPane.showMessageDialog(null, "Seu imc é: " + valorFormatado + " - Peso normal");
        } else if (imc >= 25 && imc <= 29.9){
            JOptionPane.showMessageDialog(null, "Seu imc é: " + valorFormatado + " - Sobrepeso");
        } else if (imc >= 30 && imc <= 34.9){
            JOptionPane.showMessageDialog(null, "Seu imc é: " + valorFormatado + " - Obesidade");
        } else if (imc >= 35 && imc <= 39.9){
            JOptionPane.showMessageDialog(null, "Seu imc é: " + valorFormatado + " - Obesidade Severa");
        } else if (imc >= 40){
            JOptionPane.showMessageDialog(null, "Seu imc é: " + valorFormatado + " - Obesidade Mórbida");
        } else {
            JOptionPane.showMessageDialog(null, "Seu imc é: " + valorFormatado + " - Abaixo do peso");
        }

    }
}
