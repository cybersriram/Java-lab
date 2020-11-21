import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class converter extends JFrame implements ActionListener {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					converter frame = new converter();
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
	public converter() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 433, 520);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("201901156");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(298, 33, 119, 40);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Celsius to Fahrenhiet");
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(132, 133, 151, 64);
		btnNewButton.addActionListener(this);
		contentPane.add(btnNewButton);
		
		JButton btnFahrenhietToCelsius = new JButton("Fahrenhiet to Celsius");
		btnFahrenhietToCelsius.setBackground(Color.WHITE);
		btnFahrenhietToCelsius.setBounds(132, 257, 151, 64);
		btnFahrenhietToCelsius.addActionListener(this);
		contentPane.add(btnFahrenhietToCelsius);
		
		JLabel lblNewLabel_1 = new JLabel("Select any one");
		lblNewLabel_1.setFont(new Font("Comic Sans MS", Font.ITALIC, 20));
		lblNewLabel_1.setBounds(142, 208, 157, 40);
		contentPane.add(lblNewLabel_1);
	}
	public void actionPerformed(ActionEvent e){
		String btn = e.getActionCommand();
		if (btn.equals("Celsius to Fahrenhiet")) {
			ctof obj = new ctof();
			obj.setVisible(true);
		}
		else {
			ftoc obj1 = new ftoc();
			obj1.setVisible(true);
		}
	
	}
}
