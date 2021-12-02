import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TesteOperadores extends JFrame {
    private JTextField txtNum;
    private JTextField txtDen;
    private JButton btnDividir;
    private JLabel lblDiv;
    private JLabel lblRes;
    private JPanel painelPrincipal;

    public TesteOperadores(){
        setContentPane(painelPrincipal);
        setTitle("Teste de Operadores");
        setSize(350, 200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        btnDividir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int n = Integer.parseInt(txtNum.getText());
                int d = Integer.parseInt(txtDen.getText());
                float div = n / d;
                float res = (float) Math.sqrt(n);
                lblDiv.setText(Float.toString(div));
                lblRes.setText(Float.toString(res));
            }
        });
    }

    public static void main(String[] args) {TesteOperadores to = new TesteOperadores();}

}
