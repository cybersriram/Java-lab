package Biller;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class display extends JFrame implements ActionListener {
	public String number,str = ""; 
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	public JLabel lblNewLabel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					display frame = new display();
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
	public display() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100,10,370,600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter the name of the Customer");
		lblNewLabel.setFont(new Font("Myriad Pro Cond", Font.ITALIC, 18));
		lblNewLabel.setBounds(77, 52, 220, 54);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(77, 104, 193, 39);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblEnterTheNumber = new JLabel("Enter the number of the Customer");
		lblEnterTheNumber.setFont(new Font("Myriad Pro Cond", Font.ITALIC, 18));
		lblEnterTheNumber.setBounds(77, 157, 220, 54);
		contentPane.add(lblEnterTheNumber);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(77, 222, 193, 39);
		contentPane.add(textField_1);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setBounds(103, 291, 129, 54);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(this);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(64, 356, 213, 119);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton_1 = new JButton("Send Bill");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent f) {
				SMS obj = new SMS();
				obj.sendSms(str, number);
				System.out.print("sms sent");
			}
		});
		btnNewButton_1.setBounds(92, 486, 153, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Go Back");
		btnNewButton_2.setBounds(103, 527, 129, 23);
		contentPane.add(btnNewButton_2);
		btnNewButton_2.addActionListener(this);
		
		
	}
	public void actionPerformed(ActionEvent e){
		String btn = e.getActionCommand();
		if(btn.equals("Submit"))
		{
			String name,amt="";
			name = textField.getText();
			number = textField_1.getText();
			FileInputStream fis;
			try {
				fis = new FileInputStream("amt.txt");
				Scanner sc=new Scanner(fis); 
				amt = sc.nextLine(); 
				sc.close();
			} catch (FileNotFoundException e2) {
				System.out.println("file not found");
				e2.printStackTrace();
			}   
			str = "Hello "+name+" "+amt;
			lblNewLabel_1.setText("<html>"+str+"</html>");
		}
		if(btn.equals("Go Back")){
			item_list obj1 = new item_list();
			obj1.setVisible(true);
			this.dispose();
		}
	}
}
