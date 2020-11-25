package Smanager;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class QTYUPDATE extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	boolean t = false,t1 = false,t2 = false,t3 = false,t4 = false,t5 = false;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QTYUPDATE frame = new QTYUPDATE();
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
	public QTYUPDATE() {
		setBounds(100,10,370,600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Pen");
		chckbxNewCheckBox.setFont(new Font("Wide Latin", Font.PLAIN, 14));
		chckbxNewCheckBox.setBounds(39, 80, 122, 58);
		contentPane.add(chckbxNewCheckBox);
		chckbxNewCheckBox.addItemListener(new ItemListener() {  
            public void itemStateChanged(ItemEvent e) {               
                 if(e.getStateChange()==1) {
                	 textField.setVisible(true);
                	 t = true;
                 }
            }  
         });
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setBounds(0, 0, 354, 561);
		contentPane.add(panel);
		
		
		JCheckBox chckbxPencil = new JCheckBox("Pencil");
		chckbxPencil.setFont(new Font("Wide Latin", Font.PLAIN, 14));
		chckbxPencil.setBounds(39, 136, 116, 57);
		panel.add(chckbxPencil);
		chckbxPencil.addItemListener(new ItemListener() {  
            public void itemStateChanged(ItemEvent e) {               
                 if(e.getStateChange()==1) {
                	 textField_1.setVisible(true);
                	 t1 = true;
                 }
            }  
         });
		
		JCheckBox chckbxScissor = new JCheckBox("Scissor");
		chckbxScissor.setFont(new Font("Wide Latin", Font.PLAIN, 14));
		chckbxScissor.setBounds(39, 196, 116, 57);
		panel.add(chckbxScissor);
		chckbxScissor.addItemListener(new ItemListener() {  
            public void itemStateChanged(ItemEvent e) {               
                 if(e.getStateChange()==1) {
                	 textField_2.setVisible(true);
                	 t2 = true;
                 }
            }  
         });
		
		JCheckBox chckbxASheets = new JCheckBox("A4 Sheets");
		chckbxASheets.setFont(new Font("Wide Latin", Font.PLAIN, 14));
		chckbxASheets.setBounds(39, 258, 143, 57);
		panel.add(chckbxASheets);
		chckbxASheets.addItemListener(new ItemListener() {  
            public void itemStateChanged(ItemEvent e) {               
                 if(e.getStateChange()==1) {
                	 textField_3.setVisible(true);
                	 t3 = true;
                 }
            }  
         });
		
		JCheckBox chckbxRuler = new JCheckBox("Ruler");
		chckbxRuler.setFont(new Font("Wide Latin", Font.PLAIN, 14));
		chckbxRuler.setBounds(39, 318, 116, 40);
		panel.add(chckbxRuler);
		chckbxRuler.addItemListener(new ItemListener() {  
            public void itemStateChanged(ItemEvent e) {               
                 if(e.getStateChange()==1) {
                	 textField_4.setVisible(true);
                	 t4 = true;
                 }
            }  
         });
		
		JCheckBox chckbxEraser = new JCheckBox("Eraser");
		chckbxEraser.setFont(new Font("Wide Latin", Font.PLAIN, 14));
		chckbxEraser.setBounds(39, 376, 116, 40);
		panel.add(chckbxEraser);
		chckbxEraser.addItemListener(new ItemListener() {  
            public void itemStateChanged(ItemEvent e) {               
                 if(e.getStateChange()==1) {
                	 textField_5.setVisible(true);
                	 t5 = true;
                 }
            }  
         });
		
		textField = new JTextField();
		textField.setBounds(189, 96, 143, 34);
		panel.add(textField);
		textField.setColumns(10);
		textField.setVisible(false);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(189, 154, 143, 34);
		panel.add(textField_1);
		textField_1.setVisible(false);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(189, 214, 143, 34);
		panel.add(textField_2);
		textField_2.setVisible(false);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(189, 276, 143, 34);
		panel.add(textField_3);
		textField_3.setVisible(false);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(189, 328, 143, 34);
		panel.add(textField_4);
		textField_4.setVisible(false);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(189, 386, 143, 34);
		panel.add(textField_5);
		textField_5.setVisible(false);
		
		JButton btnNewButton = new JButton("UPDATE");
		btnNewButton.setBounds(118, 454, 102, 63);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Quantity Update");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel.setBounds(111, 29, 172, 40);
		panel.add(lblNewLabel);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int amt1, amt2, amt3, amt4, amt5 ,amt6;
				int[] quantity = qty();
				if(t == true) {
					amt1 = Integer.parseInt(textField.getText());
					amt1 = amt1 + quantity[0];
					update(amt1,"UPDATE item SET qty = ? where i_name = 'Pen'");
				}
				if(t1 == true) {
					amt2 = Integer.parseInt(textField_1.getText());
					amt2 = amt2 + quantity[1];
					update(amt2,"UPDATE item SET qty = ? where i_name = 'Pencil'");
				}
				if(t2 == true) {
					amt3 = Integer.parseInt(textField_2.getText());
					amt3 = amt3 + quantity[2];
					update(amt3,"UPDATE item SET qty = ? where i_name = 'Scissor'");
				}
				if(t3 == true) {
					amt4 = Integer.parseInt(textField_3.getText());
					amt4 = amt4 + quantity[3];
					update(amt4,"UPDATE item SET qty = ? where i_name = 'A4 Sheet'");
				}
				if(t4 == true) {
					amt5 = Integer.parseInt(textField_4.getText());
					amt5 = amt5 + quantity [4];
					update(amt5,"UPDATE item SET qty = ? where i_name = 'Ruler'");
				}
				if(t5 == true) {
					amt6 = Integer.parseInt(textField.getText());
					amt6 =  amt6 + quantity[5];
					update(amt6,"UPDATE item SET qty = ? where i_name = 'Eraser'");
				}
				JOptionPane.showMessageDialog(contentPane, "DONE");
			}
		});
		
	}
	private Connection connect() {
        // SQLite connection string
        String url = "jdbc:sqlite:C:\\Users\\SRI\\eclipse-workspace\\Biller\\Sqlite\\sqlite-tools-win32-x86-3330000\\items.db";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
	 public void update(int qty, String statement) {
	        String sql = statement;

	        try (Connection conn = this.connect();
	                PreparedStatement pstmt = conn.prepareStatement(sql)) {

	            // set the corresponding param
	            pstmt.setInt(1, qty);
	            // update 
	            pstmt.executeUpdate();
	        } catch (SQLException e) {
	            System.out.println(e.getMessage());
	        }
	    }
	 public int[] qty(){
	        String sql = "SELECT qty FROM item";
	        
	        int[] quantity = new int[6];
	        try (Connection conn = this.connect();
	             Statement stmt  = conn.createStatement();
	             ResultSet rs    = stmt.executeQuery(sql)){
	            
	            // loop through the result set
	        	int q =0;
	            while (rs.next()) {
	             quantity[q]= rs.getInt("qty"); 
	             q++;
	            }
	            return quantity;
	        } catch (SQLException e) {
	            System.out.println(e.getMessage());
	            return quantity;
	        }
	    }
}
