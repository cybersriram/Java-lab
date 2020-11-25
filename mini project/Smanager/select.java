package Smanager;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class select extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
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

	/**
	 * Create the frame.
	 */
	public select() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100,10,370,600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Update Stock");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				QTYUPDATE obj2 = new QTYUPDATE();
				obj2.setVisible(true);
			}
		});
		btnNewButton.setBounds(111, 66, 130, 75);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("View Stock");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				viewstock obj = new viewstock();
				obj.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(111, 192, 130, 75);
		contentPane.add(btnNewButton_1);
		
		JButton btnResetPrice = new JButton("Reset Price");
		btnResetPrice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				reset_price obj1 = new reset_price();
				obj1.setVisible(true);
			}
		});
		btnResetPrice.setBounds(111, 330, 130, 75);
		contentPane.add(btnResetPrice);
	}

}
