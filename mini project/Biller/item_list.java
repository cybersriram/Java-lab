package Biller;

import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;


import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JTextField;

public class item_list extends JFrame implements ActionListener{
	int qty_1 = 0,qty_2 = 0,qty_3= 0,qty_4=0,qty_5=0,qty_6=0;
	private JPanel contentPane;
	public JCheckBox chckbxNewCheckBox,chckbxPencil,chckbxScissor,chckbxASheet,chckbxRuler,chckbxEraser;
	public JButton btnNewButton;
	public float amt;
	private JTextField txtQuantity;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	double amt_1 = 0,amt_2 = 0,amt_3=0,amt_4=0,amt_5=0,amt_6=0;
	boolean t = false,t1 = false,t2 = false,t3 = false,t4 = false,t5 = false;
	int[] qty;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					item_list frame = new item_list();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	public item_list() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100,10,370,600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Select the Items");
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.ITALIC, 17));
		lblNewLabel.setBounds(106, 29, 180, 23);
		contentPane.add(lblNewLabel);
		
		
		btnNewButton = new JButton("Proceed Checkout");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.addActionListener(this);
		btnNewButton.setBounds(76, 494, 180, 56);
		contentPane.add(btnNewButton);
		
		txtQuantity = new JTextField();
		txtQuantity.setBounds(32, 165, 137, 34);
		contentPane.add(txtQuantity);
		txtQuantity.setColumns(10);
		txtQuantity.setVisible(false);
		
		chckbxNewCheckBox = new JCheckBox("PEN");
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 20));
		chckbxNewCheckBox.setForeground(Color.YELLOW);
		chckbxNewCheckBox.setBackground(Color.BLACK);
		chckbxNewCheckBox.setBounds(32, 102, 137, 56);
		contentPane.add(chckbxNewCheckBox);
		chckbxNewCheckBox.addItemListener(new ItemListener() {  
            public void itemStateChanged(ItemEvent e) {               
                 if(e.getStateChange()==1) {
                	 txtQuantity.setVisible(true);
                	 t = true;
                	 
                 }
                 else
                	 txtQuantity.setVisible(false);
                 	qty_1 = 0;
            }  
         });  
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(187, 165, 137, 34);
		contentPane.add(textField_1);
		textField_1.setVisible(false);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(187, 302, 137, 34);
		contentPane.add(textField_2);
		textField_2.setVisible(false);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(32, 302, 137, 34);
		contentPane.add(textField_3);
		textField_3.setVisible(false);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(32, 449, 137, 34);
		contentPane.add(textField_4);
		textField_4.setVisible(false);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(187, 449, 137, 34);
		contentPane.add(textField_5);
		textField_5.setVisible(false);
		
		
		chckbxPencil = new JCheckBox("PENCIL");
		chckbxPencil.setForeground(Color.YELLOW);
		chckbxPencil.setFont(new Font("Tahoma", Font.PLAIN, 20));
		chckbxPencil.setBackground(Color.BLACK);
		chckbxPencil.setBounds(187, 102, 137, 56);
		contentPane.add(chckbxPencil);
		chckbxPencil.addItemListener(new ItemListener() {  
            public void itemStateChanged(ItemEvent e) {               
                 if(e.getStateChange()==1) {
                	 textField_1.setVisible(true); 
                 	 t1 = true;	
                 }
                 else
                	 textField_1.setVisible(false);
                 	qty_2=0;
            }  
         }); 
	
		
		chckbxScissor = new JCheckBox("SCISSOR");
		chckbxScissor.setForeground(Color.YELLOW);
		chckbxScissor.setFont(new Font("Tahoma", Font.PLAIN, 20));
		chckbxScissor.setBackground(Color.BLACK);
		chckbxScissor.setBounds(187, 239, 137, 56);
		contentPane.add(chckbxScissor);
		chckbxScissor.addItemListener(new ItemListener() {  
            public void itemStateChanged(ItemEvent e) {               
                 if(e.getStateChange()==1) {
                	 textField_2.setVisible(true);
                	 t2 = true;
                 }
                 else
                	 textField_2.setVisible(false);
            }  
         }); 
	
		
		chckbxASheet = new JCheckBox("A4 sheet");
		chckbxASheet.setForeground(Color.YELLOW);
		chckbxASheet.setFont(new Font("Tahoma", Font.PLAIN, 20));
		chckbxASheet.setBackground(Color.BLACK);
		chckbxASheet.setBounds(32, 239, 137, 56);
		contentPane.add(chckbxASheet);
		chckbxASheet.addItemListener(new ItemListener() {  
            public void itemStateChanged(ItemEvent e) {               
                 if(e.getStateChange()==1) {
                	 textField_3.setVisible(true);
                 	 t3 = true;
                 }
                 else
                	 textField_3.setVisible(false);
            }  
         }); 
	
		
		chckbxRuler = new JCheckBox("RULER");
		chckbxRuler.setForeground(Color.YELLOW);
		chckbxRuler.setFont(new Font("Tahoma", Font.PLAIN, 20));
		chckbxRuler.setBackground(Color.BLACK);
		chckbxRuler.setBounds(32, 386, 137, 56);
		contentPane.add(chckbxRuler);
		chckbxRuler.addItemListener(new ItemListener() {  
            public void itemStateChanged(ItemEvent e) {               
                 if(e.getStateChange()==1) {
                	 textField_4.setVisible(true);
                	 t4 = true;
                 }
                 else
                	 textField_4.setVisible(false);
            }  
         }); 
		
	
		
		chckbxEraser = new JCheckBox("ERASER");
		chckbxEraser.setForeground(Color.YELLOW);
		chckbxEraser.setFont(new Font("Tahoma", Font.PLAIN, 20));
		chckbxEraser.setBackground(Color.BLACK);
		chckbxEraser.setBounds(187, 386, 137, 56);
		contentPane.add(chckbxEraser);
		chckbxEraser.addItemListener(new ItemListener() {  
            public void itemStateChanged(ItemEvent e) {               
                 if(e.getStateChange()==1) {
                	 textField_5.setVisible(true);
                	 t5 = true;
                 }
                 else
                	 textField_5.setVisible(false);
            }  
         }); 	
		
		
	}
	public void actionPerformed(ActionEvent e){
		double[] amount;
		qty = qty();
		int uqty1,uqty2,uqty3,uqty4,uqty5,uqty6;
		amount = amt();
		String s1="",s2="",s3="",s="",s4="",s5="",s6="";
		if(t==true) {
			 amt_1 = amount[0];
			 if(qty[0]>0) {
				 qty_1 = Integer.parseInt(txtQuantity.getText());
			 }
			 uqty1 = qty[0]-qty_1;
			 if(uqty1<0) {
				 JOptionPane.showMessageDialog(contentPane, "Item underflow");
				 qty_1 =0;
			 }
			 else {
				 update(uqty1,"UPDATE item SET qty = ? WHERE i_name = 'Pen'"); 
			 }
			 amt_1 = amt_1 *qty_1;
			 
			 
			 if (qty[0]<7) {
				 JOptionPane.showMessageDialog(contentPane, "QUANTITY OF THE PEN IS LESS THAN 5");
			 }
			 s1 = qty_1+" pen's "+amt_1; 
		}
		if(t1==true) {
			amt_2 = amount[1];
			if(qty[1]>0) {
			qty_2 = Integer.parseInt(textField_1.getText());
			}
			uqty2 = qty[1]-qty_2;
			if(uqty2<0) {
				 JOptionPane.showMessageDialog(contentPane, "Item underflow");
				 qty_2 =0;
			 }
			else {
				update(uqty2,"UPDATE item SET qty = ? WHERE i_name = 'Pencil'");
			}
			amt_2 = amt_2 *qty_2;
			
			
			 if (qty[1]<7) {
				 JOptionPane.showMessageDialog(contentPane, "QUANTITY OF THE PENCIL IS LESS THAN 5");
			 }
			s2 = qty_2+" pencil's "+amt_2; 
		}
		if(t2==true) {
			amt_3 = amount[2];
			if(qty[2]>0) {
			qty_3 = Integer.parseInt(textField_2.getText());
			}
			uqty3 = qty[2]-qty_3;
			if(uqty3<0) {
				 JOptionPane.showMessageDialog(contentPane, "Item underflow");
				 qty_3 =0;
			 }
			else {
				update(uqty3,"UPDATE item SET qty = ? WHERE i_name = 'Scissor'");
			}
			amt_3 = amt_3 *qty_3;
			if (qty[2]<7) {
				 JOptionPane.showMessageDialog(contentPane, "QUANTITY OF THE Scissor IS LESS THAN 5");
			 }
			s3 = qty_3+" Scissor's "+amt_3; 
		}
		if(t3==true) {
			amt_4 = amount[3];
			if(qty[3]>0) {
				qty_4 = Integer.parseInt(textField_3.getText());
			}
			uqty4 = qty[3]-qty_4;
			if(uqty4<0) {
				 JOptionPane.showMessageDialog(contentPane, "Item underflow");
				 qty_4 =0;
			 }
			else {
				update(uqty4,"UPDATE item SET qty = ? WHERE i_name = 'A4 Sheet'");
			}
			amt_4 = amt_4 *qty_4;
			if (qty[3]<7) {
				 JOptionPane.showMessageDialog(contentPane, "QUANTITY OF THE A4 Sheet IS LESS THAN 5");
			 }
			s4 = qty_4+" A4 Sheet's Rs "+amt_4; 
		}
		if(t4==true) {
			amt_5 = amount[4];
			if(qty[4]>0) {
				qty_5 = Integer.parseInt(textField_4.getText());
			}
			uqty5 = qty[4]-qty_5;
			if(uqty5<0) {
				 JOptionPane.showMessageDialog(contentPane, "Item underflow");
				 qty_5 =0;
			 }
			else {
				update(uqty5,"UPDATE item SET qty = ? WHERE i_name = 'RULER'");
			}
			amt_5 = amt_5 *qty_5;
			if (qty[4]<7) {
				 JOptionPane.showMessageDialog(contentPane, "QUANTITY OF THE RULER IS LESS THAN 5");
			 }
			s5 = qty_5+" Ruler's Rs "+amt_5; 
		}
		if(t5==true) {
			amt_6 = amount[5];
			if(qty[5]>0) {
				qty_6 = Integer.parseInt(textField_5.getText());
			}
			uqty6 = qty[5]-qty_6;
			if(uqty6<0) {
				 JOptionPane.showMessageDialog(contentPane, "Item underflow");
				 qty_6 =0;
			 }
			else {
				update(uqty6,"UPDATE item SET qty = ? WHERE i_name = 'Eraser'");
			}
			amt_6 = amt_6 *qty_6;
			if (qty[5]<7) {
				 JOptionPane.showMessageDialog(contentPane, "QUANTITY OF THE ERASER IS LESS THAN 5");
			 }
			s6 = qty_6+" eraser's Rs "+amt_6; 
		}
		s ="Items:"+ s1+" "+s2+" "+s3+" "+s4+" "+s5+" "+s6+"Total Amount";
		amt =(float)( amt_1+amt_2+amt_3+amt_4+amt_5+amt_6);
		FileWriter myWriter;
		try {
		myWriter = new FileWriter("amt.txt");
		String temp = String.valueOf(amt); 
		myWriter.write(s+" "+temp);
		myWriter.close();
		}catch(IOException e1){
			e1.printStackTrace();
		}
		this.dispose();
		display obj = new display();
		obj.setVisible(true);
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
	    public double[] amt(){
	        String sql = "SELECT amt FROM item";
	        double[] amount = new double[6];
	        
	        try (Connection conn = this.connect();
	             Statement stmt  = conn.createStatement();
	             ResultSet rs    = stmt.executeQuery(sql)){
	            
	            // loop through the result set
	        	int q =0;
	            while (rs.next()) {
	             amount[q] = rs.getDouble("amt");
	             q++;
	            }
	            return amount;
	        } catch (SQLException e) {
	            System.out.println(e.getMessage());
	            return amount;
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
}
