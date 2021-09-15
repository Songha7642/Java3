package Lab6;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;


public class Lab6_Bai2 {

    JLabel l, l1, l2, l3, l4, l5;
    JButton b;
    JTextField tf1, tf2, tf3, tf4;
    JComboBox bx;
    String str;

    private static String userName = "root";
    private static String pass = "Ha766442.";
    private static String url = "jdbc:mysql://localhost:3306/lab6";


    Lab6_Bai2() {
        JFrame f1 = new JFrame("Demo");
        f1.setSize(600, 450);
        f1.setLayout(null);
        f1.setTitle("demo");

        l = new JLabel("Select Name");
        b = new JButton("Submit");
        bx = new JComboBox();

        tf1 = new JTextField();
        tf2 = new JTextField();
        tf3 = new JTextField();
        tf4 = new JTextField();

        l.setBounds(20, 20, 200, 20);
        b.setBounds(50, 50, 150, 30);
        bx.setBounds(240, 20, 200, 20);

        f1.add(l);
        f1.add(b);
        f1.add(bx);

        tf1.setEditable(false);
        tf2.setEditable(false);
        tf3.setEditable(false);
        tf4.setEditable(false);

        f1.setLocationRelativeTo(null);
        f1.setVisible(true);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        try {
            Connection conn = getConnection(url, userName, pass);
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery("SELECT uname FROM emp");
            while (rs.next()) {
                String s = rs.getString(1);
                bx.addItem(s);
            }
            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        b.addActionListener(e -> {
            showData();
        });

        // Make JTable


    }




    public void showData() {

        JFrame f2 = new JFrame();
        f2.setSize(500, 400);
        f2.setLayout(null);
        f2.setTitle("demo2");

        l5 = new JLabel("Displaying Emp Data");
        l5.setForeground(Color.red);
        l5.setFont(new Font("Serif", Font.BOLD, 20));
        l1 = new JLabel("Emp Name");
        l2 = new JLabel("Emp Email");
        l3 = new JLabel("Emp Pass");
        l4 = new JLabel("Emp Country");

        l5.setBounds(100, 50, 300, 30);
        l1.setBounds(20, 110, 200, 20);
        l2.setBounds(20, 140, 200, 20);
        l3.setBounds(20, 170, 200, 20);
        l4.setBounds(20, 200, 200, 20);

        tf1.setBounds(240, 110, 200, 20);
        tf2.setBounds(240, 140, 200, 20);
        tf3.setBounds(240, 170, 200, 20);
        tf4.setBounds(240, 200, 200, 20);

        f2.add(l5);
        f2.add(l1);
        f2.add(tf1);
        f2.add(l2);
        f2.add(tf2);
        f2.add(l3);
        f2.add(tf3);
        f2.add(l4);
        f2.add(tf4);

        f2.setVisible(true);

        str = (String) bx.getSelectedItem();
        try {
            Connection conn = getConnection(url, userName, pass);
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM emp");
            while (rs.next()) {
                tf1.setText(rs.getString(1));
                tf2.setText(rs.getString(2));
                tf3.setText(rs.getString(3));
                tf4.setText(rs.getString(4));

            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    //MAKE TABLE

    public void Table() {
        JFrame f3 = new JFrame();
        f3.setSize(400,300);
        f3.setTitle("demo3");
        f3.setLocation(230,400);



        JPanel btn = new JPanel();
        JButton delete = new JButton("Delete row");
        JButton add = new JButton("Add row");
        JButton edit = new JButton("Edit");

        Vector rowHeader = new Vector();
        rowHeader.add("Emp Name");
        rowHeader.add("Emp Email");
        rowHeader.add("Emp Pass");
        rowHeader.add("Emp Country");

        DefaultTableModel model = new DefaultTableModel(rowHeader,0);

        try {
            Connection conn = getConnection(url, userName, pass);
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM emp");
            Vector rowData;
            while (rs.next()) {
                rowData = new Vector();
                rowData.add (rs.getString("uname"));
                rowData.add (rs.getString("umail"));
                rowData.add (rs.getString("upass"));
                rowData.add (rs.getString("ucountry"));
                model.addRow(rowData);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        JTable jTable1 = new JTable();
        jTable1.setModel(model);

        JScrollPane p = new JScrollPane(jTable1);


        delete.addActionListener(e -> {
            if (jTable1.getSelectedRowCount() > 0) {
                int realIndex = jTable1.convertRowIndexToModel(jTable1.getSelectedRowCount());
                model.removeRow(realIndex);
                jTable1.repaint();
            }
        });

        add.addActionListener(e -> {
            Vector rowData = null;
            DefaultTableModel models = (DefaultTableModel) jTable1.getModel();
            models.addRow(rowData);
        });

        btn.add(delete);
        btn.add(add);
        btn.add(edit);
        f3.add(btn, BorderLayout.NORTH);
        f3.add(p);
        f3.setVisible(true);
    }

    public static Connection getConnection(String url, String userName, String pass) {
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, userName, pass);
            System.out.println("Connect successfully");
        } catch (Exception e) {
            System.err.println("KHONG KET NOI DUOC");
            e.printStackTrace();
        }
        return conn;
    }


    public static void main(String []args) {
        Lab6_Bai2 a = new Lab6_Bai2();
        a.Table();
    }


}
