package proyectogui;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JPanel;

public class NewWindow {
    JFrame frame = new JFrame();
    JLabel label = new JLabel("Carlos González Robles | 320131343 | 01/03/2003");
    JLabel label2 = new JLabel("Kaua 10 MZ 939 Pedregal de San Nicolás Tlalpan 14100");

    NewWindow() {
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        frame.setLayout(new BorderLayout());

        // Crear un panel principal con un borde y un color de fondo
        JPanel mainPanel = new JPanel();
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        mainPanel.setBackground(Color.decode("#18A8FA"));
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        
        label.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
        label.setAlignmentX(Component.CENTER_ALIGNMENT);

        
        label2.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
        label2.setAlignmentX(Component.CENTER_ALIGNMENT);

        
        JLabel imageLabel = new JLabel();
        ImageIcon icon = new ImageIcon("C:\\Users\\zCarlxs\\Documents\\NetBeansProjects\\ProyectoGUI\\foto.jpg"); // Cambia la ruta y el nombre del archivo de imagen
        Image image = icon.getImage(); 
        Image scaledImage = image.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        icon = new ImageIcon(scaledImage);
        imageLabel.setIcon(icon);
        imageLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        
        mainPanel.add(label);
        mainPanel.add(Box.createRigidArea(new Dimension(0, 10))); 
        mainPanel.add(label2);
        mainPanel.add(Box.createRigidArea(new Dimension(0, 20))); 
        mainPanel.add(imageLabel);

        
        frame.add(mainPanel, BorderLayout.CENTER);

        
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new NewWindow();
    }
}