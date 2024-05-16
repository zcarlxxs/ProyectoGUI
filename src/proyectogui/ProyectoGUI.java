package proyectogui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


/**
 *
 * @author zCarlxs
 */
public class ProyectoGUI implements ActionListener {
    JFrame frame;
    JButton button;
    JLabel label;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ProyectoGUI proyecto = new ProyectoGUI();
        proyecto.createGUI();
    }

    public void createGUI() {
        frame = new JFrame();
        button = new JButton("320131343");
        label = new JLabel();

        button.setBounds(100, 160, 200, 40);
        button.setFocusable(false);
        button.addActionListener(this);

        frame.add(button);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            NewWindow window = new NewWindow();
        }
    }
}
