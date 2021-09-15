package Lab4;

import javax.swing.*;

import java.awt.event.KeyEvent;

public class Lab4_Bai1 {
    JMenu aMenu, aMenuAnother, subMenu;
    JMenuItem aText, iconText, iconn, item1, item2;


    public Lab4_Bai1 () {
        JFrame f = new JFrame();
        f.setSize(450,500);

        ImageIcon icon = new ImageIcon("C:/images/2.png");

        aMenu = new JMenu("A menu");
          aMenu.setMnemonic(KeyEvent.VK_A);
        aMenuAnother = new JMenu("Another menu");

        JMenuBar menuBar = new JMenuBar();

        aText = new JMenuItem("A text-only menu item");
          aText.setMnemonic(KeyEvent.VK_1);

        iconText = new JMenuItem("Both text and icon",icon);

        iconn = new JMenuItem(icon);

        JRadioButtonMenuItem radio1 = new JRadioButtonMenuItem("A radio button menu item");
        JRadioButtonMenuItem radio2 = new JRadioButtonMenuItem("Another one");

        JCheckBoxMenuItem cBox1 = new JCheckBoxMenuItem("A check box menu item");
        JCheckBoxMenuItem cBox2 = new JCheckBoxMenuItem("Another one");

        subMenu = new JMenu("A submenu");
        item1 = new JMenuItem("An item in the submenu");
          item1.setMnemonic(KeyEvent.VK_2);
        item2 = new JMenuItem("Another item");

        subMenu.add(item1);
        subMenu.add(item2);

        aMenu.add(aText);
        aMenu.add(iconText);
        aMenu.add(iconn);
        aMenu.addSeparator();
        aMenu.add(radio1);
        aMenu.add(radio2);
        aMenu.addSeparator();
        aMenu.add(cBox1);
        aMenu.add(cBox2);
        aMenu.addSeparator();
        aMenu.add(subMenu);


        menuBar.add(aMenu);
        menuBar.add(aMenuAnother);
        f.setJMenuBar(menuBar);

        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }

    public static void main(String []arg) {
        Lab4_Bai1 a = new Lab4_Bai1();
    }
}

