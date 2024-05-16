/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectogui;

import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author zCarlxs
 */
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

public class NewWindow {
    JFrame frame = new JFrame();
    JLabel label = new JLabel("Hola");

    NewWindow() {
        label.setBounds(0, 0, 100, 50);
        label.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 25));

        JLabel imageLabel = new JLabel();
        ImageIcon icon = new ImageIcon("C:\\Users\\zCarlxs\\Pictures\\xDD.jpg"); // Cambia la ruta y el nombre del archivo de imagen
        imageLabel.setIcon(icon);
        imageLabel.setBounds(10, 10, icon.getIconWidth(), icon.getIconHeight());
        Image image = icon.getImage();
        Image newImage = image.getScaledInstance(200, 200, Image.SCALE_SMOOTH); // Cambia los valores de anchura y altura según sea necesario
        ImageIcon newIcon = new ImageIcon(newImage);
        imageLabel.setIcon(newIcon);
        imageLabel.setBounds(100, 100, 200, 200);

        frame.add(label);
        frame.add(imageLabel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
