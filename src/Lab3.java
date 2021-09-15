import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lab3 {
    private JPanel All;
    private JPanel First;
    private JPanel Center;
    private JPanel Last;
    private JButton a1Button;
    private JButton a2Button;
    private JButton a3Button;
    private JButton a4Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton a10Button;
    private JButton a11Button;
    private JButton a12Button;
    private JButton a13Button;
    private JButton a14Button;
    private JButton a15Button;
    private JButton button16;
    private JButton start;
    public boolean check = false;


    public Lab3() {
        JFrame f = new JFrame();
        f.setSize(495, 510);
        f.add(All);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);


        a1Button.setEnabled(true);
        a2Button.setEnabled(true);
        a3Button.setEnabled(true);
        a4Button.setEnabled(true);
        a5Button.setEnabled(true);
        a6Button.setEnabled(true);
        a7Button.setEnabled(true);
        a8Button.setEnabled(true);
        a9Button.setEnabled(true);
        a10Button.setEnabled(true);
        a11Button.setEnabled(true);
        a12Button.setEnabled(true);
        a13Button.setEnabled(true);
        a14Button.setEnabled(true);
        a15Button.setEnabled(true);


        a15Button.addActionListener(e -> {
            if (a11Button.getText().equals("")) {
                a11Button.setText(a15Button.getText());
                a15Button.setText("");
            } else if (a14Button.getText().equals("")) {
                a14Button.setText(a15Button.getText());
                a15Button.setText("");
            } else if (button16.getText().equals("")) {
                button16.setText(a15Button.getText());
                a15Button.setText("");
            }
            check = true;
        });

        button16.addActionListener(e -> {
            if (a12Button.getText().equals("")) {
                a12Button.setText(button16.getText());
                button16.setText("");
            } else if (a15Button.getText().equals("")) {
                a15Button.setText(button16.getText());
                button16.setText("");
            }
            check = true;
        });


        a14Button.addActionListener(e -> {
            if (a10Button.getText().equals("")) {
                a10Button.setText(a14Button.getText());
                a14Button.setText("");
            } else if (a13Button.getText().equals("")) {
                a13Button.setText(a14Button.getText());
                a14Button.setText("");
            } else if (a15Button.getText().equals("")) {
                a15Button.setText(a14Button.getText());
                a14Button.setText("");
            }
            check = true;
        });


        a13Button.addActionListener(e -> {
            if (a9Button.getText().equals("")) {
                a9Button.setText(a13Button.getText());
                a13Button.setText("");
            } else if (a14Button.getText().equals("")) {
                a14Button.setText(a13Button.getText());
                a13Button.setText("");
            }
            check = true;
        });


        a12Button.addActionListener(e -> {
            if (button16.getText().equals("")) {
                button16.setText(a12Button.getText());
                a12Button.setText("");
            } else if (a11Button.getText().equals("")) {
                a11Button.setText(a12Button.getText());
                a12Button.setText("");
            } else if (a8Button.getText().equals("")) {
                a8Button.setText(a12Button.getText());
                a12Button.setText("");
            }
            check = true;
        });


        a11Button.addActionListener(e -> {
            if (a10Button.getText().equals("")) {
                a10Button.setText(a11Button.getText());
                a11Button.setText("");
            } else if (a7Button.getText().equals("")) {
                a7Button.setText(a11Button.getText());
                a11Button.setText("");
            } else if (a12Button.getText().equals("")) {
                a12Button.setText(a11Button.getText());
                a11Button.setText("");
            } else if (a15Button.getText().equals("")) {
                a15Button.setText(a11Button.getText());
                a11Button.setText("");
            }
            check = true;
        });


        a10Button.addActionListener(e -> {
            if (a6Button.getText().equals("")) {
                a6Button.setText(a10Button.getText());
                a10Button.setText("");
            } else if (a9Button.getText().equals("")) {
                a9Button.setText(a10Button.getText());
                a10Button.setText("");
            } else if (a11Button.getText().equals("")) {
                a11Button.setText(a10Button.getText());
                a10Button.setText("");
            } else if (a14Button.getText().equals("")) {
                a14Button.setText(a10Button.getText());
                a10Button.setText("");
            }
            check = true;
        });


        a9Button.addActionListener(e -> {
            if (a5Button.getText().equals("")) {
                a5Button.setText(a9Button.getText());
                a9Button.setText("");
            } else if (a10Button.getText().equals("")) {
                a10Button.setText(a9Button.getText());
                a9Button.setText("");
            } else if (a13Button.getText().equals("")) {
                a13Button.setText(a9Button.getText());
                a9Button.setText("");
            }
            check = true;
        });


        a8Button.addActionListener(e -> {
            if (a4Button.getText().equals("")) {
                a4Button.setText(a8Button.getText());
                a8Button.setText("");
            } else if (a7Button.getText().equals("")) {
                a7Button.setText(a8Button.getText());
                a8Button.setText("");
            } else if (a12Button.getText().equals("")) {
                a12Button.setText(a8Button.getText());
                a8Button.setText("");
            }
            check = true;
        });


        a7Button.addActionListener(e -> {
            if (a6Button.getText().equals("")) {
                a6Button.setText(a7Button.getText());
                a7Button.setText("");
            } else if (a3Button.getText().equals("")) {
                a3Button.setText(a7Button.getText());
                a7Button.setText("");
            } else if (a11Button.getText().equals("")) {
                a11Button.setText(a7Button.getText());
                a7Button.setText("");
            } else if (a8Button.getText().equals("")) {
                a8Button.setText(a7Button.getText());
                a7Button.setText("");
            }
            check = true;
        });


        a6Button.addActionListener(e -> {
            if (a10Button.getText().equals("")) {
                a10Button.setText(a6Button.getText());
                a6Button.setText("");
            } else if (a7Button.getText().equals("")) {
                a7Button.setText(a6Button.getText());
                a6Button.setText("");
            } else if (a2Button.getText().equals("")) {
                a2Button.setText(a6Button.getText());
                a6Button.setText("");
            } else if (a5Button.getText().equals("")) {
                a5Button.setText(a6Button.getText());
                a6Button.setText("");
            }
            check = true;
        });


        a5Button.addActionListener(e -> {
            if (a6Button.getText().equals("")) {
                a6Button.setText(a5Button.getText());
                a5Button.setText("");
            } else if (a9Button.getText().equals("")) {
                a9Button.setText(a5Button.getText());
                a5Button.setText("");
            } else if (a1Button.getText().equals("")) {
                a1Button.setText(a5Button.getText());
                a5Button.setText("");
            }
            check = true;
        });


        a4Button.addActionListener(e -> {
            if (a3Button.getText().equals("")) {
                a3Button.setText(a4Button.getText());
                a4Button.setText("");
            } else if (a8Button.getText().equals("")) {
                a8Button.setText(a4Button.getText());
                a4Button.setText("");
            }
            check = true;
        });


        a3Button.addActionListener(e -> {
            if (a4Button.getText().equals("")) {
                a4Button.setText(a3Button.getText());
                a3Button.setText("");
            } else if (a7Button.getText().equals("")) {
                a7Button.setText(a3Button.getText());
                a3Button.setText("");
            } else if (a2Button.getText().equals("")) {
                a2Button.setText(a3Button.getText());
                a3Button.setText("");
            }
            check = true;
        });


        a2Button.addActionListener(e -> {
            if (a6Button.getText().equals("")) {
                a6Button.setText(a2Button.getText());
                a2Button.setText("");
            } else if (a3Button.getText().equals("")) {
                a3Button.setText(a2Button.getText());
                a2Button.setText("");
            } else if (a1Button.getText().equals("")) {
                a1Button.setText(a2Button.getText());
                a2Button.setText("");
            }
            check = true;
        });


        a1Button.addActionListener(e -> {
            if (a2Button.getText().equals("")) {
                a2Button.setText(a1Button.getText());
                a1Button.setText("");
            } else if (a5Button.getText().equals("")) {
                a5Button.setText(a1Button.getText());
                a1Button.setText("");
            }
            check = true;
        });

        start.addActionListener(e -> {
            JOptionPane infor = new JOptionPane();
            infor.setSize(300, 400);
            String input = infor.showInputDialog(infor, "Name: ");
            f.setTitle(input);
        });

        while (check = true) {
            if (a15Button.getText().equals("15") && a14Button.getText().equals("14") && a13Button.getText().equals("13") &&
                    a12Button.getText().equals("12") && a11Button.getText().equals("11") && a10Button.getText().equals("10") &&
                    a9Button.getText().equals("9") && a8Button.getText().equals("8") && a7Button.getText().equals("7") &&
                    a6Button.getText().equals("6") && a5Button.getText().equals("5") && a4Button.getText().equals("4") &&
                    a3Button.getText().equals("3") && a2Button.getText().equals("2") && a1Button.getText().equals("1")) {

                JOptionPane win = new JOptionPane();
                win.setSize(300, 400);

                JOptionPane.showConfirmDialog(win,"Win!!" );
            }
            check = false;
        }


    }


    public static void main (String []args) {
        Lab3 a = new Lab3();
    }
}
