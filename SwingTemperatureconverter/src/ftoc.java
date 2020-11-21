
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class ftoc extends JFrame implements ActionListener {

	private JPanel contentPane;
	
	private JTextField textField;
	public JLabel lblNewLabel_1;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ftoc frame = new ftoc();
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
	public ftoc() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 433, 520);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JLabel lblNewLabel = new JLabel("Temperature in Fahrenhiet");
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.ITALIC, 18));
		lblNewLabel.setBounds(89, 63, 236, 33);
		contentPane.add(lblNewLabel);
		
		JLabel lblTemperatureInFahrenhiet = new JLabel("Temperature in Celsius");
		lblTemperatureInFahrenhiet.setFont(new Font("Comic Sans MS", Font.ITALIC, 18));
		lblTemperatureInFahrenhiet.setBounds(110, 259, 236, 33);
		contentPane.add(lblTemperatureInFahrenhiet);
		
		textField = new JTextField();
		textField.setBounds(116, 107, 177, 39);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Convert");
		btnNewButton.setBounds(153, 177, 100, 39);
		btnNewButton.addActionListener(this);
		contentPane.add(btnNewButton);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(184, 290, 187, 39);
		contentPane.add(lblNewLabel_1);
	}
	public void actionPerformed(ActionEvent e){
		String cel = textField.getText() ;
		float f=Float.parseFloat(cel); 
		float fah = (f - 32) * 5/9 ;
		String fa =String.format("%.1f",fah); 
		lblNewLabel_1.setText(fa); 
	}
}



