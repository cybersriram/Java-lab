package login;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.awt.event.ActionEvent;

public class setpass extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JPasswordField passwordField;
	private JTextField txtEnterThePassword;
	private JTextField txtReenterThePassword;
	private JPasswordField passwordField_1;
	public JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					setpass frame = new setpass();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public setpass() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100,10,370,600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(92, 151, 181, 40);
		contentPane.add(passwordField);
		
		txtEnterThePassword = new JTextField();
		txtEnterThePassword.setEditable(false);
		txtEnterThePassword.setBounds(92, 111, 181, 29);
		txtEnterThePassword.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtEnterThePassword.setText("     Enter the Password");
		contentPane.add(txtEnterThePassword);
		txtEnterThePassword.setColumns(10);
		
		txtReenterThePassword = new JTextField();
		txtReenterThePassword.setEditable(false);
		txtReenterThePassword.setBounds(92, 212, 181, 29);
		txtReenterThePassword.setText("    Reenter the Password");
		txtReenterThePassword.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtReenterThePassword.setColumns(10);
		contentPane.add(txtReenterThePassword);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(92, 264, 181, 40);
		contentPane.add(passwordField_1);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(119, 378, 181, 40);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Set Password");
		btnNewButton.setBounds(92, 330, 181, 37);
		btnNewButton.addActionListener(this);
		contentPane.add(btnNewButton);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		char[] pass = passwordField.getPassword();
		char[] repass = passwordField_1.getPassword();
		if (Arrays.equals(pass,repass)) {
			this.dispose();
			LoginFrame obj1 = new LoginFrame();
			obj1.setVisible(true);
			obj1.setBounds(100,10,370,600);
			FileWriter myWriter;
			try {
				myWriter = new FileWriter("ebdsfyeo.txt");
				myWriter.write(pass);
				myWriter.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			 
		}
		else
			lblNewLabel.setText("Both are not same");
	}

}
