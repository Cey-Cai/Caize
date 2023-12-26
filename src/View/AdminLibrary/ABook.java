package View.AdminLibrary;

import Sql.SqlCon;

import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import static javax.swing.JOptionPane.WARNING_MESSAGE;

public class ABook extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField Name;
	private JTextField Num;
	private JTextField Writer;
	private JTable table;
	private JTextField textField;

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
		JOptionPane jOptionPane=new JOptionPane();
		SqlCon sq=new SqlCon();
		setFont(new Font("Dialog", Font.PLAIN, 30));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 855, 731);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 10, 761, 546);
		tabbedPane.setFont(new Font("宋体", Font.PLAIN, 20));
		contentPane.add(tabbedPane);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("\u4E66\u7C4D\u6DFB\u52A0", null, panel_1, null);
		panel_1.setLayout(null);
		
		Name = new JTextField();
		Name.setBounds(161, 44, 211, 51);
		panel_1.add(Name);
		Name.setColumns(1);
		
		Num = new JTextField();
		Num.setColumns(1);
		Num.setBounds(161, 122, 211, 52);
		panel_1.add(Num);
		
		JLabel lblNewLabel = new JLabel("\u4E66\u540D");
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 30));
		lblNewLabel.setBounds(39, 44, 81, 46);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u4E66\u7C4D\u7F16\u53F7");
		lblNewLabel_1.setFont(new Font("宋体", Font.PLAIN, 30));
		lblNewLabel_1.setBounds(26, 122, 125, 51);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\u4F5C\u8005");
		lblNewLabel_2.setFont(new Font("宋体", Font.PLAIN, 30));
		lblNewLabel_2.setBounds(39, 204, 81, 51);
		panel_1.add(lblNewLabel_2);
		
		Writer = new JTextField();
		Writer.setColumns(1);
		Writer.setBounds(161, 204, 211, 51);
		panel_1.add(Writer);
		JLabel Cate = new JLabel("\u7C7B\u522B");
		Cate.setFont(new Font("宋体", Font.PLAIN, 30));
		Cate.setBounds(39, 284, 81, 51);
		panel_1.add(Cate);

		textField = new JTextField();
		textField.setColumns(1);
		textField.setBounds(161, 284, 211, 51);
		panel_1.add(textField);
		
		JButton btnNewButton_1 = new JButton("\u6DFB\u52A0");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1=Name.getText();
				String s2=Num.getText() ;
				String s3=Writer.getText();
				String s4=textField.getText();
				String string="INSERT into library.Book(BNum,BName,Writer,Cate)values(" + '\'' + s1 + '\'' + "," + '\'' + s2 + '\'' + "," + '\'' + s3 + '\''+","+'\''+s4+'\''+")";
				sq.InsertCon(string);
				jOptionPane.showMessageDialog(null,"添加成功","书籍添加", WARNING_MESSAGE);
				jOptionPane.setVisible(true);

			}
		});
		btnNewButton_1.setBackground(new Color(255, 128, 64));
		btnNewButton_1.setFont(new Font("宋体", Font.PLAIN, 20));
		btnNewButton_1.setBounds(174, 387, 164, 69);
		panel_1.add(btnNewButton_1);
		

		
		JPanel panel_2 = new JPanel();
		panel_2.setToolTipText("");
		tabbedPane.addTab("\u4E66\u7C4D增删", null, panel_2, null);
		panel_2.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		scrollPane.setBounds(66, 47, 429, 365);
		panel_2.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Name", "Num", "Writer", "Set"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, true, true, true
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel_3 = new JLabel("\u53EF\u76F4\u63A5\u5728\u8868\u8FDB\u884C\u64CD\u4F5C");
		lblNewLabel_3.setFont(new Font("宋体", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(66, 10, 382, 27);
		panel_2.add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("\u8FD4\u56DE");
		btnNewButton.setBounds(349, 589, 151, 59);
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
		btnNewButton.setFont(new Font("宋体", Font.PLAIN, 20));
		contentPane.add(btnNewButton);
	}
}
