package login;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;

public class select extends JFrame implements ActionListener {

	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					select frame = new select();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public select() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100,10,370,600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("BILLER");
		btnNewButton.addActionListener(this);
		btnNewButton.setBounds(101, 147, 145, 75);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Stock Manager");
		btnNewButton_1.setBounds(101, 298, 145, 75);
		btnNewButton_1.addActionListener(this);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("      Select your choice");
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel.setBounds(69, 243, 237, 32);
		contentPane.add(lblNewLabel);
		
	}
	
	public void actionPerformed(ActionEvent e){
		 String btn = e.getActionCommand();
		 if (btn.equals("BILLER")) {
			 Biller.item_list obj = new Biller.item_list();
			 obj.setVisible(true);
			 this.dispose();
			 obj.setTitle("Item Selecter");
		 }
		 else {
			 Smanager.select obj1 = new Smanager.select();
			 obj1.setVisible(true);
			 this.dispose();
		 }
		}
}
