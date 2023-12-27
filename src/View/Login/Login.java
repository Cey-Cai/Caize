package View.Login;

import Sql.SqlCon;
import View.AdminLibrary.AdLibrary;
import View.UserLibrary.Library;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serial;
import java.sql.*;

public class Login extends JFrame {

    @Serial
    private static final long serialVersionUID = 1L;
    private final JTextField NumText;
    private final JTextField psw;
    private final JTextField NameText;

    /**
     * Create the frame.
     */
    public Login() {
        SqlCon sqlCon =new SqlCon();
        setBackground(new Color(255, 255, 255));
        setTitle("登录");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 588, 441);
        JPanel contentPane = new JPanel();
        contentPane.setBackground(new Color(192, 192, 192));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("账号");
        lblNewLabel.setFont(new Font("????", Font.PLAIN, 20));
        lblNewLabel.setBounds(12, 45, 104, 44);
        contentPane.add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("密码");
        lblNewLabel_1.setFont(new Font("????", Font.PLAIN, 20));
        lblNewLabel_1.setBounds(10, 183, 72, 44);
        contentPane.add(lblNewLabel_1);

        NumText = new JTextField();
        NumText.setBounds(105, 54, 232, 33);
        contentPane.add(NumText);
        NumText.setColumns(10);

        psw = new JTextField();
        psw.setColumns(10);
        psw.setBounds(105, 192, 232, 33);
        contentPane.add(psw);

        JButton btnNewButton_1 = new JButton("登录");
        btnNewButton_1.setBackground(new Color(255, 255, 255));
        JRadioButton AminButton = new JRadioButton("管理员");
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(AminButton);
        AminButton.setFont(new Font("Dialog", Font.BOLD, 20));
        AminButton.setBackground(new Color(192, 192, 192));
        AminButton.setBounds(66, 259, 122, 26);
        contentPane.add(AminButton);

        JRadioButton UserButton = new JRadioButton("用户");
        buttonGroup.add(UserButton);
        UserButton.setFont(new Font("Dialog", Font.BOLD, 20));
        UserButton.setBackground(Color.LIGHT_GRAY);
        UserButton.setBounds(225, 259, 122, 26);
        contentPane.add(UserButton);

        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String s1 = NumText.getText();
                String s2 = NameText.getText();
                String s3 = psw.getText();

                String string = "SELECT * from user where UNum='" + s1 + "'AND UName='" + s2 + "'AND password='" + s3 + "';";
                String string1 = "SELECT * from admin where ANum='" + s1 + "'AND AName='" + s2 + "'AND APassword='" + s3 + "';";
                try {
                    if (UserButton.isSelected()) {
                        if (sqlCon.SelectCon(string).next()) {
                            try {
                                String string3="在线";
                                String s4="离线";
                                String string2="Update user set USet='"+string3+"'  where USet='"+s4+"'AND UNum='"+s1+"';";
                                sqlCon.UpdateCon(string2);
                                dispose();
                                Library frame = new Library();
                                frame.setVisible(true);
                            } catch (Exception e2) {
                                e2.printStackTrace();
                            }
                        } else {

                            try {
                                Login2 frame = new Login2();
                                frame.setVisible(true);
                            } catch (Exception e3) {
                                e3.printStackTrace();
                            }
                        }

                        System.out.println("添加成功");
                    }
                    if (AminButton.isSelected()) {
                        dispose();
                        if (sqlCon.SelectCon(string1).next()) try {
                            AdLibrary frame = new AdLibrary();
                            frame.setVisible(true);
                        } catch (Exception e4) {
                            e4.printStackTrace();
                        }
                        else {
                            try {
                                Login2 frame = new Login2();
                                frame.setVisible(true);
                            } catch (Exception e5) {
                                e5.printStackTrace();
                            }
                        }
                    }
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        btnNewButton_1.setBounds(45, 323, 180, 44);
        contentPane.add(btnNewButton_1);

        JLabel lblNewLabel_3 = new JLabel("注册时的初始密码为账号");
        lblNewLabel_3.setFont(new Font("????", Font.PLAIN, 18));
        lblNewLabel_3.setBounds(341, 192, 221, 44);
        contentPane.add(lblNewLabel_3);


        JButton btnNewButton_1_1 = new JButton("注册");
        btnNewButton_1_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                try {
                    Login1 frame = new Login1();
                    frame.setVisible(true);
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            }
        });
        btnNewButton_1_1.setBackground(new Color(255, 255, 255));
        btnNewButton_1_1.setBounds(260, 323, 180, 44);
        contentPane.add(btnNewButton_1_1);

        JLabel lblNewLabel_4 = new JLabel("姓名");
        lblNewLabel_4.setFont(new Font("Dialog", Font.PLAIN, 20));
        lblNewLabel_4.setBounds(10, 125, 104, 35);
        contentPane.add(lblNewLabel_4);

        NameText = new JTextField();
        NameText.setColumns(10);
        NameText.setBounds(105, 125, 232, 33);
        contentPane.add(NameText);
    }
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Login frame = new Login();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
