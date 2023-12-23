package View.UserLibrary;

import View.Login.Login;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Library extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textField;
    private JLabel textField_1;
    private JButton btnNewButton_2;
    private JButton btnNewButton_3;
    private JButton btnNewButton_4;

    /**
     * Create the frame.
     */
    public Library() {
    	setBackground(new Color(128, 255, 255));
        setTitle("\u6A59\u7070\u56FE\u4E66\u9986");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 892, 760);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(128, 128, 128));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        textField = new JTextField();
        textField.setBounds(39, 48, 451, 47);
        contentPane.add(textField);
        textField.setColumns(10);

        JButton btnNewButton = new JButton("\u68C0\u7D22");
        btnNewButton.setBackground(new Color(255, 128, 64));
        btnNewButton.setFont(new Font("����", Font.PLAIN, 20));
        btnNewButton.setBounds(535, 40, 111, 59);
        contentPane.add(btnNewButton);

        JButton btnNewButton_1 = new JButton("\u9AD8\u7EA7\u68C0\u7D22");
        btnNewButton_1.setBackground(new Color(255, 128, 64));
        btnNewButton_1.setFont(new Font("����", Font.PLAIN, 20));
        btnNewButton_1.setBounds(702, 40, 134, 59);
        contentPane.add(btnNewButton_1);

        textField_1 = new JLabel();
        textField_1.setFont(new Font("����", Font.PLAIN, 45));
        textField_1.setText("\u670D\u52A1\u6307\u5357");
        textField_1.setBounds(316, 137, 187, 67);
        contentPane.add(textField_1);

        btnNewButton_2 = new JButton("\u4E66\u7C4D\u501F\u8FD8");
        btnNewButton_2.setForeground(new Color(0, 0, 0));
        btnNewButton_2.setBackground(new Color(255, 128, 64));
        btnNewButton_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                try {
                    BookSystem frame = new BookSystem();
                    frame.setVisible(true);
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            }
        });
        btnNewButton_2.setFont(new Font("����", Font.PLAIN, 20));
        btnNewButton_2.setBounds(164, 226, 187, 67);
        contentPane.add(btnNewButton_2);

        btnNewButton_3 = new JButton("\u6211\u7684\u56FE\u4E66\u9986");
        btnNewButton_3.setBackground(new Color(255, 128, 64));
        btnNewButton_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                try {
                    Myself frame = new Myself();
                    frame.setVisible(true);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        });
        btnNewButton_3.setFont(new Font("����", Font.PLAIN, 20));
        btnNewButton_3.setBounds(164, 340, 187, 67);
        contentPane.add(btnNewButton_3);

        btnNewButton_4 = new JButton("\u8054\u7CFB\u9986\u5458");
        btnNewButton_4.setBackground(new Color(255, 128, 64));
        btnNewButton_4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                try {
                    Librarier frame = new Librarier();
                    frame.setVisible(true);
                } catch (Exception e3) {
                    e3.printStackTrace();
                }
            }
        });
        btnNewButton_4.setFont(new Font("����", Font.PLAIN, 20));
        btnNewButton_4.setBounds(513, 226, 187, 67);
        contentPane.add(btnNewButton_4);
        
        JButton btnNewButton_2_1 = new JButton("\u9000\u51FA\u56FE\u4E66\u9986");
        btnNewButton_2_1.setBackground(new Color(255, 128, 64));
        btnNewButton_2_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
                dispose();
                try {
                    Login frame = new Login();
                    frame.setVisible(true);
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
        	}
        });
        btnNewButton_2_1.setFont(new Font("Dialog", Font.PLAIN, 20));
        btnNewButton_2_1.setBounds(513, 340, 180, 67);
        contentPane.add(btnNewButton_2_1);
        
        JLabel lblNewLabel_3 = new JLabel("");
        lblNewLabel_3.setFont(new Font("Dialog", Font.PLAIN, 20));
        lblNewLabel_3.setBounds(422, 226, 81, 59);
        contentPane.add(lblNewLabel_3);
    }
    /*
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Library frame = new Library();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
