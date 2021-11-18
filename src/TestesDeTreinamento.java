import javax.swing.JOptionPane;

public class TestesDeTreinamento {
    public static void main(String[] args) {
        int mesJaneiro = 15000, mesFevereiro = 23000, mesMarco = 17000, somaTrimestre = (mesJaneiro + mesFevereiro + mesMarco);
        double mediaMensal = (somaTrimestre) / 3;

        JOptionPane.showMessageDialog(null,"O valor acumulado durante o trimestre foi de R$" + somaTrimestre + "\n E a média foi de R$" + mediaMensal);

    }
}
