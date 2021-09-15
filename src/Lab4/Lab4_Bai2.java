package Lab4;

import javax.swing.*;
import java.awt.event.KeyEvent;

public class Lab4_Bai2 {

    public Lab4_Bai2() {
        JFrame f = new JFrame();
        f.setSize(500,450);

        JMenuBar menuBar = new JMenuBar();

        JMenu file = new JMenu("File");
        file.setMnemonic(KeyEvent.VK_F);
        file.addChangeListener(e -> {
            System.out.println("File Menu Change");
        });

        menuBar.add(file);
        f.setJMenuBar(menuBar);


        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public static void main (String []args) {
        Lab4_Bai2 a = new Lab4_Bai2();
    }
}
