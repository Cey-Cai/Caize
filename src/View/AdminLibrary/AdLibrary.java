package View.AdminLibrary;

import View.Login.Login;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdLibrary extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdLibrary frame = new AdLibrary();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AdLibrary() {
		setTitle("\u6A59\u7070\u56FE\u4E66\u9986");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 616, 498);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(62, 21, 404, 78);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u4EB2\u7231\u7684\u7BA1\u7406\u5458\uFF0C\u60A8\u597D");
		lblNewLabel.setBounds(0, 0, 404, 78);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("ËÎÌו", Font.PLAIN, 40));
		
		JButton btnNewButton_2_1 = new JButton("\u9000\u51FA\u56FE\u4E66\u9986");
		btnNewButton_2_1.setBounds(302, 230, 144, 65);
		contentPane.add(btnNewButton_2_1);
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
		btnNewButton_2_1.setBackground(new Color(255, 128, 64));
		btnNewButton_2_1.setFont(new Font("ËÎÌו", Font.PLAIN, 20));
		
		JButton btnNewButton = new JButton("\u4E66\u7C4D\u7BA1\u7406");
		btnNewButton.setBounds(73, 230, 144, 65);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				try {
					ABook frame = new ABook();
					frame.setVisible(true);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setBackground(new Color(255, 128, 64));
		btnNewButton.setFont(new Font("ËÎÌו", Font.PLAIN, 20));
	}

}
