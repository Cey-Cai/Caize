package View.UserLibrary;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Librarier extends JFrame {

    private static final long serialVersionUID = 1L;
    private final JPanel contentPane;

    /**
     * Create the frame.
     */
    public Librarier() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 643, 496);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("\u8FD9\u91CC\u662F\u9986\u957F\u6D3E\u8499\uFF01");
        lblNewLabel.setFont(new Font("ï¿½ï¿½ï¿½ï¿½", Font.PLAIN, 45));
        lblNewLabel.setBounds(26, 10, 461, 90);
        contentPane.add(lblNewLabel);

        JLabel lblNewLabel_2 = new JLabel("\u7535\u8BDD\uFF0C\u542F\u52A8\uFF01");
        lblNewLabel_2.setFont(new Font("ï¿½ï¿½ï¿½ï¿½", Font.PLAIN, 20));
        lblNewLabel_2.setBounds(36, 106, 179, 52);
        contentPane.add(lblNewLabel_2);

        JLabel lblNewLabel_1 = new JLabel("400-666-6312");
        lblNewLabel_1.setFont(new Font("ï¿½ï¿½ï¿½ï¿½", Font.PLAIN, 20));
        lblNewLabel_1.setBounds(179, 110, 237, 46);
        contentPane.add(lblNewLabel_1);

        JLabel lblNewLabel_3 = new JLabel("");
        lblNewLabel_3.setBounds(30, 172, 129, 33);
        contentPane.add(lblNewLabel_3);
        
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
        btnNewButton.setFont(new Font("ËÎÌå", Font.PLAIN, 40));
        btnNewButton.setBounds(160, 239, 237, 113);
        contentPane.add(btnNewButton);
    }

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Librarier frame = new Librarier();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

}
