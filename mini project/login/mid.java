package login;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JPasswordField;

public class mid extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JPasswordField passwordField;
	public JLabel lb2;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mid frame = new mid();
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
	public mid() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100,10,370,600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome Owner");
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		lblNewLabel.setBounds(110, 121, 161, 48);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter your password");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(104, 180, 213, 48);
		contentPane.add(lblNewLabel_1);
		
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setBounds(125, 296, 89, 23);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(this);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(68, 230, 203, 48);
		contentPane.add(passwordField);
		
		lb2 = new JLabel("");
		lb2.setBounds(125, 341, 142, 23);
		contentPane.add(lb2);
		
	}
	public void actionPerformed(ActionEvent e){
		char[] pass = passwordField.getPassword();
		char[] temp = {'s','r','i','r','a','m','@','1','8'};
		if (Arrays.equals(pass,temp)) {
			   this.dispose();
			   setpass obj1 = new setpass();
			   obj1.setVisible(true);
		}
		else
			lb2.setText("Wrong Password");
		}
}
