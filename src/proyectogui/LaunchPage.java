/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectogui;

/**
 *
 * @author zCarlxs
 */
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
/**
 *
 * @author zCarlxs
 */
public class LaunchPage implements ActionListener {
    JFrame frame = new JFrame();
    JButton button = new JButton("320131343");

    LaunchPage() {
        // Configurar el marco principal
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        frame.setLayout(new BorderLayout());

        // Crear un panel principal con un borde y un color de fondo
        JPanel mainPanel = new JPanel();
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        mainPanel.setBackground(Color.LIGHT_GRAY);
        mainPanel.setLayout(new GridBagLayout());

        // Configurar el botón
        button.setPreferredSize(new Dimension(200, 40));
        button.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 16));
        button.setBackground(new Color(70, 130, 180)); // Steel blue
        button.setForeground(Color.WHITE);
        button.setFocusPainted(false);
        button.addActionListener(this);

        // Añadir el botón al panel principal
        mainPanel.add(button, new GridBagConstraints());

        // Añadir el panel principal al marco
        frame.add(mainPanel, BorderLayout.CENTER);

        // Hacer visible el marco
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            NewWindow window = new NewWindow();
        }
    }
}