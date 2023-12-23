package View.UserLibrary;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Myself extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;


    /**
     * Create the frame.
     */
    public Myself() {
    	setFont(new Font("Dialog", Font.PLAIN, 20));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 576, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u60A8\u7684\u540D\u5B57");
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 20));
		lblNewLabel.setBounds(20, 49, 121, 50);
		contentPane.add(lblNewLabel);
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(165, 53, 195, 46);
		contentPane.add(textField);
		textField.setColumns(10);
		JLabel lblNewLabel_1 = new JLabel("\u60A8\u7684\u8D26\u53F7");
		lblNewLabel_1.setFont(new Font("宋体", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(20, 125, 121, 50);
		contentPane.add(lblNewLabel_1);
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(165, 128, 195, 46);
		contentPane.add(textField_1);
		JLabel lblNewLabel_1_1 = new JLabel("\u60A8\u7684\u5BC6\u7801");
		lblNewLabel_1_1.setFont(new Font("宋体", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(20, 213, 121, 50);
		contentPane.add(lblNewLabel_1_1);
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(165, 213, 195, 46);
		contentPane.add(textField_2);
		JButton btnNewButton = new JButton("\u8FD4\u56DE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				 try {
	                    Library frame = new Library();
	                    frame.setVisible(true);
	                } catch (Exception e1) {
	                    e1.printStackTrace();
	                }
			}
		});
		btnNewButton.setBackground(new Color(255, 128, 64));
		btnNewButton.setFont(new Font("宋体", Font.PLAIN, 20));
		btnNewButton.setBounds(185, 314, 139, 67);
		contentPane.add(btnNewButton);
    }

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Myself frame = new Myself();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

}
