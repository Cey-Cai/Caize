package View.Login;

import Sql.SqlCon;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class Login1 extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JLabel lblNewLabel_1;
    private JLabel lblNewLabel_2;
    private JButton btnNewButton_1;

    /**
     * Create the frame.
     */
    public Login1() {
        SqlCon sqlCon1=new SqlCon();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 545, 402);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(192, 192, 192));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("\u539F\u5BC6\u7801");
        lblNewLabel.setFont(new Font("????", Font.PLAIN, 20));
        lblNewLabel.setBounds(12, 58, 104, 26);
        contentPane.add(lblNewLabel);

        textField = new JTextField();
        textField.setColumns(10);
        textField.setBounds(101, 58, 232, 30);
        contentPane.add(textField);

        textField_1 = new JTextField();
        textField_1.setColumns(10);
        textField_1.setBounds(101, 131, 232, 33);
        contentPane.add(textField_1);

        textField_2 = new JTextField();
        textField_2.setColumns(10);
        textField_2.setBounds(120, 230, 232, 33);
        contentPane.add(textField_2);

        lblNewLabel_1 = new JLabel("\u65B0\u5BC6\u7801");
        lblNewLabel_1.setFont(new Font("????", Font.PLAIN, 20));
        lblNewLabel_1.setBounds(12, 128, 104, 33);
        contentPane.add(lblNewLabel_1);

        lblNewLabel_2 = new JLabel("\u91CD\u590D\u65B0\u5BC6\u7801");
        lblNewLabel_2.setFont(new Font("????", Font.PLAIN, 20));
        lblNewLabel_2.setBounds(12, 227, 104, 33);
        contentPane.add(lblNewLabel_2);
        btnNewButton_1 = new JButton("\u66F4\u65B0\u5BC6\u7801");
        btnNewButton_1.setBackground(new Color(255, 255, 255));
        btnNewButton_1.setBounds(122, 307, 165, 48);
        contentPane.add(btnNewButton_1);
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                try {
                    Signup frame = new Signup();
                    frame.setVisible(true);
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
                String s1=textField.getText();
                String s2=textField_1.getText();
                String s3=textField_2.getText();
                if (Objects.equals(s2, s3)) {
                    String string = "UPDATE user set password='"+s2+"'where password='"+s1+"';";
                        sqlCon1.UpdateCon(string);
                }
            }
        });

    }

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Login1 frame = new Login1();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

}
