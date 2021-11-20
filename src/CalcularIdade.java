import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcularIdade extends JFrame {
    private JSpinner txtAN;
    private JButton btnCalc;
    private JLabel lblIdade;
    private JPanel painelPrincipal;

    public CalcularIdade() {
        setContentPane(painelPrincipal);
        setTitle("Ano de nascimento");
        setSize(350, 200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        btnCalc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int an = Integer.parseInt(txtAN.getValue().toString());
                int id = 2021 - an;
                lblIdade.setText(Integer.toString(id));
            }
        });
    }

    public static void main(String[] args) {
        CalcularIdade cIdade = new CalcularIdade();
    }
}
