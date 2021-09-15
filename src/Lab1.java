import javax.swing.*;
import java.awt.*;

public class Lab1 {
    private JPanel map;
   Image pic;
    public Lab1() {
        JFrame f = new JFrame();
        f.setSize(500,450);

        map = new javax.swing.JPanel() {
            ImageIcon icon = new ImageIcon("C:/images/1.png");

            public void paintComponent(Graphics g) {
                Dimension d = getSize();
                g.drawImage(icon.getImage(), 0, 0, d.width, d.height, null);
                setOpaque(false);
                super.paintComponent(g);
            }
        };

        f.add(map);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public static void main (String []args) {
        Lab1 a = new Lab1();
    }

}
