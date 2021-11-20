import javax.swing.JOptionPane;

public class ExerciciosDeTeste {
    public static void main(String[] args) {
        double numero1, numero2;
        numero1 = Double.parseDouble(JOptionPane.showInputDialog("Informe um número: "));
        numero2 = Double.parseDouble(JOptionPane.showInputDialog("Informe mais um número: "));

        if (numero1 > numero2) {
            JOptionPane.showMessageDialog(null, "O primeiro número é o maior.");
        } else if (numero1 < numero2) {
            JOptionPane.showMessageDialog(null, "O segundo número é o maior");
        } else {
            JOptionPane.showMessageDialog(null, "Os dois números são iguais");
        }
    }
}
