import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Lab2 {

    private JButton a1Button;
    private JButton a2Button;
    private JButton a3Button;
    private JButton button4;
    private JButton a4Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton button8;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton button12;
    private JButton a0Button;
    private JButton button14;
    private JButton cButton;
    private JButton button16;
    private JLabel hienThi;
    private JButton sqrtButton;
    private JButton button18;
    private JButton a1XButton;
    private JButton button20;
    private JPanel Cal;
    private JPanel Show;

    String phepToan;
    float a;
    float num;
    float b=0;

    public Lab2() {
        JFrame j = new JFrame();
        j.setSize(500, 400);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setVisible(true);

        j.add(Cal);

        j.add(Show, BorderLayout.NORTH);

        a1Button.addActionListener(e -> {
            String gt = hienThi.getText();
            if (gt.length() < 12) {
                if (gt.equals("0")) gt = "";
                num = Long.parseLong(gt + a1Button.getText());
                hienThi.setText(String.valueOf(num));
            }
        });
        a2Button.addActionListener(e -> {
            String gt = hienThi.getText();
            if (gt.length() < 12) {
                if (gt.equals("0")) gt = "";
                num = Long.parseLong(gt + a2Button.getText());
                hienThi.setText(String.valueOf(num));
            }
        });
        a3Button.addActionListener(e -> {
            String gt = hienThi.getText();
            if (gt.length() < 12) {
                if (gt.equals("0")) gt = "";
                num = Long.parseLong(gt + a3Button.getText());
                hienThi.setText(String.valueOf(num));
            }
        });
        a4Button.addActionListener(e -> {
            String gt = hienThi.getText();
            if (gt.length() < 12) {
                if (gt.equals("0")) gt = "";
                num = Long.parseLong(gt + a4Button.getText());
                hienThi.setText(String.valueOf(num));
            }
        });
        a5Button.addActionListener(e -> {
            String gt = hienThi.getText();
            if (gt.length() < 12) {
                if (gt.equals("0")) gt = "";
                num = Long.parseLong(gt + a5Button.getText());
                hienThi.setText(String.valueOf(num));
            }
        });
        a6Button.addActionListener(e -> {
            String gt = hienThi.getText();
            if (gt.length() < 12) {
                if (gt.equals("0")) gt = "";
                num = Long.parseLong(gt + a6Button.getText());
                hienThi.setText(String.valueOf(num));
            }
        });
        a7Button.addActionListener(e -> {
            String gt = hienThi.getText();
            if (gt.length() < 12) {
                if (gt.equals("0")) gt = "";
                num = Long.parseLong(gt + a7Button.getText());
                hienThi.setText(String.valueOf(num));
            }
        });
        a8Button.addActionListener(e -> {
            String gt = hienThi.getText();
            if (gt.length() < 12) {
                if (gt.equals("0")) gt = "";
                num = Long.parseLong(gt + a8Button.getText());
                hienThi.setText(String.valueOf(num));
            }
        });
        a9Button.addActionListener(e -> {
            String gt = hienThi.getText();
            if (gt.length() < 12) {
                if (gt.equals("0")) gt = "";
                num = Long.parseLong(gt + a9Button.getText());
                hienThi.setText(String.valueOf(num));
            }
        });
        a0Button.addActionListener(e -> {
            String gt = hienThi.getText();
            if (gt.length() < 12) {
                if (gt.equals("0")) gt = "";
                num = Long.parseLong(gt + a0Button.getText());
                hienThi.setText(String.valueOf(num));
            }
        });
        button4.addActionListener(e -> {
            a = (long) Float.parseFloat(hienThi.getText());
            if (a != 0) {
                phepToan = "/";
                hienThi.setText("0");
            }
        });
        button8.addActionListener(e -> {
            a =  Float.parseFloat(hienThi.getText());
            phepToan = "*";
            hienThi.setText("0");
        });
        button12.addActionListener(e -> {
            a = Float.parseFloat(hienThi.getText());
            phepToan = "-";
            hienThi.setText("0");
        });
        button16.addActionListener(e -> {
            a = Float.parseFloat(hienThi.getText());
            phepToan = "+";
            hienThi.setText("0");
        });


        button18.addActionListener(e -> {
            a = Float.parseFloat(hienThi.getText());
            phepToan = "%";
            hienThi.setText("0");
        });

        button20.addActionListener(e -> {
            if (phepToan.length() > 0) {
                b = Float.parseFloat(hienThi.getText());
                if (phepToan.equals("+")) {
                    float kq = a + b;
                    hienThi.setText(String.valueOf(kq));
                } else if (phepToan.equals("-")) {
                    float kq = a - b;
                    hienThi.setText(String.valueOf(kq));
                } else if (phepToan.equals("*")) {
                    float kq = a * b;
                    hienThi.setText(String.valueOf(kq));
                } else if (phepToan.equals("/")) {
                    float kq = (float) a / b;
                    hienThi.setText(String.valueOf(kq));
                } else if (phepToan.equals("%")) {
                    float kq = (float) a % b;
                    hienThi.setText(String.valueOf(kq));
                }
                phepToan = "";
                a = 0;
            }
        });

        sqrtButton.addActionListener(e -> {
            String gt = hienThi.getText();
            if (gt.length() < 12) {
                if (gt.equals("0")) gt = "";
                a =  Float.parseFloat(hienThi.getText());
                num = (float) Math.sqrt(a);
                hienThi.setText(String.valueOf(num));
                a = 0;
            }
        });

        cButton.addActionListener(e -> {
            hienThi.setText("");
        });
        //2.0 + 1/x = 0.5  5.0 + 1/x -> 0.2  = 0.4

        a1XButton.addActionListener(e -> {
            String gt = hienThi.getText();
            if (gt.length() < 12) {
                if (gt.equals("0")) gt = "";
                a =  Float.parseFloat(hienThi.getText());
                num = (float) 1/a;
                hienThi.setText(String.valueOf(num));
                a =  0;
            }
        });
    }
        public static void main (String[]args){
            Lab2 b = new Lab2();
        }
    }

