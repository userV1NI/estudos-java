import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class ExercicioArea {
    public static void main(String[] args) {
        double Largura, Comprimento, MQ, area;
        Largura = Double.parseDouble(JOptionPane.showInputDialog("Informe a Largura do terreno: "));
        Comprimento = Double.parseDouble(JOptionPane.showInputDialog("Informe o comprimento do terreno: "));

        area = (Largura * Comprimento);
        MQ = (200 * area);
        DecimalFormat decimal = new DecimalFormat("0.00");
        String valorFormatado = decimal.format(MQ);

        JOptionPane.showMessageDialog(null, "Para a Largura de valor: " + Largura);
        JOptionPane.showMessageDialog(null, "Para o comprimento de valor: " + Comprimento);
        JOptionPane.showMessageDialog(null, "Temos uma área de " + area);
        JOptionPane.showMessageDialog(null, "E o preço do terreno fica R$" + valorFormatado);
    }
}
