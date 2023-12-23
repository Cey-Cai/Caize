package View.AdminLibrary;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JTable;

public class ABook extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ABook frame = new ABook();
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
	public ABook() {
		setFont(new Font("Dialog", Font.PLAIN, 30));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 679, 564);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 10, 585, 385);
		tabbedPane.setFont(new Font("ËÎÌו", Font.PLAIN, 20));
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		panel.setToolTipText("");
		tabbedPane.addTab("\u4E66\u7C4D\u67E5\u770B", null, panel, null);
		panel.setLayout(null);
		
		table = new JTable();
		table.setBounds(290, 139, 0, 0);
		panel.add(table);
		tabbedPane.setEnabledAt(0, true);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("\u4E66\u7C4D\u5220\u9664", null, panel_2, null);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("\u4E66\u7C4D\u6DFB\u52A0", null, panel_1, null);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("\u4E66\u7C4D\u4FEE\u6539", null, panel_3, null);
		
		JButton btnNewButton = new JButton("\u8FD4\u56DE");
		btnNewButton.setBounds(234, 421, 151, 59);
		btnNewButton.setBackground(new Color(255, 128, 64));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				try {
					AdLibrary frame = new AdLibrary();
					frame.setVisible(true);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setFont(new Font("ËÎÌו", Font.PLAIN, 20));
		contentPane.add(btnNewButton);
	}

}
