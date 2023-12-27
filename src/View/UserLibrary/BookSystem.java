package View.UserLibrary;

import Class.Book.Book;
import Sql.SqlCon;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class BookSystem extends JFrame {

    private static final long serialVersionUID = 1L;
    private final ButtonGroup buttonGroup = new ButtonGroup();
    private final JPanel contentPane;
    private final JTextField textField;
    private final JTable table;
    private final JPanel panel_1;
    List<Book> list = new ArrayList<Book>();


    /**
     * Create the frame.
     */
    public BookSystem() {
        SqlCon sqlCon = new SqlCon();

        String[] head = {"Num", "Name", "Writer", "Set"};
        setForeground(new Color(0, 128, 117));
        setBackground(new Color(0, 128, 98));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 961, 803);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(128, 128, 128));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(192, 192, 192));
        panel.setBounds(49, 27, 771, 74);
        contentPane.add(panel);
        panel.setLayout(null);


        String[] arr = {"Name", "Num", "Writer", "Casual"};
        JComboBox comboBox = new JComboBox(arr);
        comboBox.setBounds(25, 10, 94, 54);
        panel.add(comboBox);

        textField = new JTextField();
        textField.setBounds(139, 10, 151, 54);
        panel.add(textField);
        textField.setColumns(10);

        JButton btnNewButton = new JButton("\u68C0\u7D22");
        btnNewButton.setForeground(new Color(0, 0, 0));
        btnNewButton.setFont(new Font("锟斤拷锟斤拷", Font.PLAIN, 20));
        btnNewButton.setBackground(new Color(255, 128, 64));
        btnNewButton.setBounds(320, 10, 205, 54);
        panel.add(btnNewButton);

        JButton btnNewButton_1 = new JButton("\u9AD8\u7EA7\u68C0\u7D22");
        btnNewButton_1.setBackground(new Color(255, 128, 0));
        btnNewButton_1.setFont(new Font("宋体", Font.PLAIN, 20));
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        btnNewButton_1.setBounds(564, 10, 177, 54);
        panel.add(btnNewButton_1);

        panel_1 = new JPanel();
        panel_1.setBackground(new Color(192, 192, 192));
        panel_1.setToolTipText("\u5206\u7C7B\u5BFC\u822A");
        panel_1.setBounds(49, 129, 771, 139);
        contentPane.add(panel_1);
        panel_1.setLayout(null);
        JRadioButton button1 = new JRadioButton("\u6587\u5B66");
        JRadioButton button2 = new JRadioButton("\u7ECF\u6D4E");
        JRadioButton button3 = new JRadioButton("\u54F2\u5B66");

        JRadioButton button4 = new JRadioButton("\u8BED\u8A00");
        buttonGroup.add(button1);
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String s1 = "文学";
                String s = "Select * from book where Cate='" + s1 + "';";
                ResultSet rs = sqlCon.SelectCon(s);
                try {
                    while (rs.next()) {
                        DefaultTableModel tableModel = new DefaultTableModel(head, 0);
                        Vector<Object> row = new Vector<>();
                        row.add(rs.getString("BName"));
                        row.add(rs.getString("BNum"));
                        row.add(rs.getString("Writer"));
                        row.add(rs.getString("BSet"));
                        tableModel.addRow(row);
                        table.setModel(tableModel);
                    }
                } catch (SQLException e2) {
                    e2.printStackTrace();
                }

            }
        });
        Object[][] data = new Object[list.size()][arr.length];

        DefaultTableModel tableModel = new DefaultTableModel(data, head);

        JLabel lblNewLabel = new JLabel("\u5206\u7C7B\u5BFC\u822A");
        lblNewLabel.setForeground(new Color(0, 0, 0));
        lblNewLabel.setBackground(new Color(0, 0, 0));
        lblNewLabel.setFont(new Font("锟斤拷锟斤拷", Font.PLAIN, 20));
        lblNewLabel.setBounds(10, 10, 120, 35);
        panel_1.add(lblNewLabel);


        button1.setBounds(10, 51, 127, 23);
        panel_1.add(button1);


        buttonGroup.add(button2);
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String s1 = "经济";
                String s = "Select * from book where Cate='" + s1 + "';";
                ResultSet rs = sqlCon.SelectCon(s);
                try {
                    while (rs.next()) {
                        DefaultTableModel tableModel = new DefaultTableModel(head, 0);
                        Vector<Object> row = new Vector<>();
                        row.add(rs.getString("BName"));
                        row.add(rs.getString("BNum"));
                        row.add(rs.getString("Writer"));
                        row.add(rs.getString("BSet"));
                        tableModel.addRow(row);
                        table.setModel(tableModel);
                    }
                } catch (SQLException e2) {
                    e2.printStackTrace();
                }
            }
        });
        button2.setBounds(139, 51, 127, 23);
        panel_1.add(button2);


        buttonGroup.add(button3);
        button3.setBounds(268, 51, 127, 23);
        panel_1.add(button3);
        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String s1 = "哲学";
                String s = "Select * from book where Cate='" + s1 + "';";
                ResultSet rs = sqlCon.SelectCon(s);
                try {
                    while (rs.next()) {
                        DefaultTableModel tableModel = new DefaultTableModel(head, 0);
                        Vector<Object> row = new Vector<>();
                        row.add(rs.getString("BName"));
                        row.add(rs.getString("BNum"));
                        row.add(rs.getString("Writer"));
                        row.add(rs.getString("BSet"));
                        tableModel.addRow(row);
                        table.setModel(tableModel);

                    }
                } catch (SQLException e2) {
                    e2.printStackTrace();
                }
            }
        });


        buttonGroup.add(button4);
        button4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String s1 = "语言";
                String s = "Select * from book where Cate='" + s1 + "';";
                ResultSet rs = sqlCon.SelectCon(s);
                try {
                    while (rs.next()) {
                        DefaultTableModel tableModel = new DefaultTableModel(head, 0);
                        Vector<Object> row = new Vector<>();
                        row.add(rs.getString("BName"));
                        row.add(rs.getString("BNum"));
                        row.add(rs.getString("Writer"));
                        row.add(rs.getString("BSet"));
                        tableModel.addRow(row);
                        table.setModel(tableModel);

                    }
                } catch (SQLException e2) {
                    e2.printStackTrace();
                }
            }
        });
        button4.setBounds(397, 51, 127, 23);
        panel_1.add(button4);


        JButton btnNewButton_2 = new JButton("\u8FD4\u56DE");
        btnNewButton_2.setBackground(new Color(255, 128, 64));
        btnNewButton_2.setForeground(new Color(0, 0, 0));
        btnNewButton_2.setFont(new Font("宋体", Font.PLAIN, 20));
        btnNewButton_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                try {
                    Library frame = new Library();
                    frame.setVisible(true);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
        btnNewButton_2.setBounds(825, 27, 100, 65);
        contentPane.add(btnNewButton_2);

        JButton btnNewButton_3 = new JButton("Borrow");
        btnNewButton_3.setBackground(new Color(255, 128, 64));
        btnNewButton_3.setFont(new Font("宋体", Font.PLAIN, 20));
        btnNewButton_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                JOptionPane jOptionPane = new JOptionPane();
                JOptionPane.showMessageDialog(null, "租借成功");
            }
        });
        btnNewButton_3.setBounds(144, 670, 181, 40);
        contentPane.add(btnNewButton_3);

        JButton btnNewButton_3_1 = new JButton("Return");
        btnNewButton_3_1.setBackground(new Color(255, 128, 64));
        btnNewButton_3_1.setFont(new Font("宋体", Font.PLAIN, 20));
        btnNewButton_3_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane jOptionPane = new JOptionPane();
                JOptionPane.showMessageDialog(null, "归还成功");
            }
        });
        btnNewButton_3_1.setBounds(514, 670, 181, 40);
        contentPane.add(btnNewButton_3_1);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(49, 290, 771, 350);
        contentPane.add(scrollPane);
        scrollPane.setWheelScrollingEnabled(false);

        table = new JTable();
        table.setSize(new Dimension(0, 30));
        scrollPane.setViewportView(table);
        table.setCellSelectionEnabled(true);
        table.setFont(new Font("宋体", Font.PLAIN, 15));
        table.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        table.setColumnSelectionAllowed(true);
        table.setModel(tableModel);
    }


    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    BookSystem frame = new BookSystem();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public JPanel getPanel_1() {
        return panel_1;
    }
}
