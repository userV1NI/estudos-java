import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class SuperCalculadora extends JFrame {
    private JLabel lblResdiv;
    private JLabel lblElecubo;
    private JLabel lblRaizqua;
    private JLabel lblRaizcub;
    private JLabel lblValab;
    private JPanel painelPrincipal;
    private JButton btnCalc;
    private JTextField txtNum;

    public SuperCalculadora () {
        setContentPane(painelPrincipal);
        setTitle("Super Calculadora");
        setSize(350, 200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        btnCalc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Integer num = Integer.parseInt(txtNum.getText());
                Integer resto = num % 2;
                float cubo = (float) Math.pow(num, 3);
                float raizQ = (float) Math.sqrt(num);
                float raizC = (float)Math.cbrt(num);
                float valorAbs = (float) Math.abs(num);
                lblResdiv.setText(Float.toString(resto));
                lblElecubo.setText(Float.toString(cubo));
                lblRaizqua.setText(Float.toString(raizQ));
                lblRaizcub.setText(Float.toString(raizC));
                lblValab.setText(Float.toString(valorAbs));
            }
        });
    }

    public static void main(String[] args) {SuperCalculadora calc = new SuperCalculadora();}

}
