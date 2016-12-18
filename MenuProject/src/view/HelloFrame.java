package view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.UIManager;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HelloFrame extends JInternalFrame {
	private JTextField txtName;
	private JButton btnShow;
	private JLabel lblShow;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Throwable e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HelloFrame frame = new HelloFrame();
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
	public HelloFrame() {
		setTitle("Hello Frame");
		setClosable(true);
		setBounds(100, 100, 316, 166);
		getContentPane().setLayout(null);
		
		txtName = new JTextField();
		txtName.setBounds(53, 23, 136, 20);
		getContentPane().add(txtName);
		txtName.setColumns(10);
		
		btnShow = new JButton("แสดง");
		btnShow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblShow.setText(txtName.getText());
				txtName.setText("");
			}
		});
		btnShow.setBounds(199, 22, 89, 23);
		getContentPane().add(btnShow);
		
		JLabel label = new JLabel("ป้อนชื่อ");
		label.setBounds(10, 26, 46, 14);
		getContentPane().add(label);
		
		lblShow = new JLabel("New label");
		lblShow.setForeground(Color.BLACK);
		lblShow.setHorizontalAlignment(SwingConstants.CENTER);
		lblShow.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblShow.setBounds(10, 64, 278, 33);
		getContentPane().add(lblShow);

	}
}
