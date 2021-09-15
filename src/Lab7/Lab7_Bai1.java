package Lab7;

import javax.swing.*;
import java.awt.*;

public class Lab7_Bai1 {
      private JList list1, list2;
      private DefaultListModel dt1, dt2;
      private  JButton btn1, btn2;

      public Lab7_Bai1() {
          JFrame f = new JFrame();
          f.getContentPane().setLayout(new FlowLayout());
          String dsMonHoc[] = {"Pascal", "Java", "Visual Basic", "C", "C++", "C#"};

          dt1 = new DefaultListModel();
          dt2 = new DefaultListModel();
           for (int i = 0; i < dsMonHoc.length; i++) {
               dt1.addElement(dsMonHoc[i]);
           }

           list1 = new JList(dt1);
           list2 = new JList(dt2);

           btn1 = new JButton(">");
           btn2 = new JButton("<");

           f.getContentPane().add(list1);
           f.getContentPane().add(btn1);
           f.getContentPane().add(btn2);
           f.getContentPane().add(list2);
           f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           f.setVisible(true);
           list1.setPreferredSize(new Dimension(100,120));
           list2.setPreferredSize(new Dimension(100,120));
           f.pack();

           btn1.addActionListener(e -> {
               Object s1 = list1.getSelectedValue();
               dt2.addElement(s1);
               dt1.removeElement(s1);
           });

           btn2.addActionListener( e -> {
               Object s2 = list2.getSelectedValue();
               dt1.addElement(s2);
               dt2.removeElement(s2);
           });
      }

      public static void main(String []args) {
          Lab7_Bai1 a = new Lab7_Bai1();
      }

}
