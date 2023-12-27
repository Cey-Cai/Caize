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
    private JTextField Name;
    private JTextField password;
    private JTextField password1;
    private JLabel lblNewLabel_1;
    private JLabel lblNewLabel_2;
    private JButton btnNewButton_1;
    private JTextField Num;

    /**
     * Create the frame.
     */
    public Login1() {
        SqlCon sqlCon1=new SqlCon();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JOptionPane jOptionPane=new JOptionPane();
        setBounds(100, 100, 545, 402);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(192, 192, 192));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("\u540D\u5B57");
        lblNewLabel.setFont(new Font("????", Font.PLAIN, 20));
        lblNewLabel.setBounds(12, 121, 104, 26);
        contentPane.add(lblNewLabel);

        Name = new JTextField();
        Name.setColumns(10);
        Name.setBounds(120, 122, 232, 30);
        contentPane.add(Name);

        password = new JTextField();
        password.setColumns(10);
        password.setBounds(120, 182, 232, 33);
        contentPane.add(password);

        password1 = new JTextField();
        password1.setColumns(10);
        password1.setBounds(120, 246, 232, 33);
        contentPane.add(password1);

        lblNewLabel_1 = new JLabel("\u5BC6\u7801");
        lblNewLabel_1.setFont(new Font("????", Font.PLAIN, 20));
        lblNewLabel_1.setBounds(12, 182, 104, 33);
        contentPane.add(lblNewLabel_1);

        lblNewLabel_2 = new JLabel("\u91CD\u590D\u5BC6\u7801");
        lblNewLabel_2.setFont(new Font("????", Font.PLAIN, 20));
        lblNewLabel_2.setBounds(12, 243, 104, 33);
        contentPane.add(lblNewLabel_2);
        btnNewButton_1 = new JButton("\u6CE8\u518C");
        btnNewButton_1.setBackground(new Color(255, 128, 64));
        btnNewButton_1.setBounds(272, 305, 165, 48);
        contentPane.add(btnNewButton_1);
        
        JLabel lblNewLabel_3 = new JLabel("\u8D26\u53F7");
        lblNewLabel_3.setFont(new Font("Dialog", Font.PLAIN, 20));
        lblNewLabel_3.setBounds(12, 66, 104, 26);
        contentPane.add(lblNewLabel_3);
        
        Num = new JTextField();
        Num.setColumns(10);
        Num.setBounds(120, 62, 232, 30);
        contentPane.add(Num);
        
        JButton btnNewButton_1_1 = new JButton("\u8FD4\u56DE");
        btnNewButton_1_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		dispose();
        		try {
                    Login frame = new Login();
                    frame.setVisible(true);
                } catch (Exception e0) {
                    e0.printStackTrace();
                }
        	}
        });
        btnNewButton_1_1.setBackground(new Color(255, 128, 64));
        btnNewButton_1_1.setBounds(55, 305, 165, 48);
        contentPane.add(btnNewButton_1_1);
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                try {
                    Signup frame = new Signup();
                    frame.setVisible(true);
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
                String s1=Name.getText();
                String s4=Num.getText();
                String s2=password.getText();
                String s3=password1.getText();
                if (Objects.equals(s2, s3)) {
                    String string = "Insert into library.user(UName,UNum,password)values("+'\''+s1+'\''+","+'\''+s4+'\''+","+'\''+s2+'\''+")";
                        sqlCon1.UpdateCon(string);
                }else {
                    jOptionPane.showMessageDialog(null, "两次密码不一致");
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
