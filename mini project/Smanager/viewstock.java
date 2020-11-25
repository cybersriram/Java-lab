package Smanager;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JTextArea;

public class viewstock extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					viewstock frame = new viewstock();
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
	public viewstock() {
		
		setBounds(100,10,370,600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("STOCK DETAILS");
		lblNewLabel.setFont(new Font("Adobe Fan Heiti Std B", Font.PLAIN, 18));
		lblNewLabel.setBounds(106, 51, 141, 37);
		contentPane.add(lblNewLabel);
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setFont(new Font("Monospaced", Font.PLAIN, 13));
		textArea.setBounds(10, 146, 334, 201);
		contentPane.add(textArea);
		
		String str1,str2,str3,str4;
		String str="" ;
		String sql = "SELECT * FROM item";
        try (Connection conn = this.connect();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){
            
            // loop through the result set
        
            while (rs.next()) {
             
            	str1=String.valueOf(rs.getDouble("amt"));
            	str2=String.valueOf(rs.getInt("qty"));
            	str3=String.valueOf(rs.getString("i_name"));
            	str4=String.valueOf(rs.getInt("slno"));
            
            	str = str + str4+".There are "+str2+" "+str3+" each of cost "+str1+"\n";
                      	
            }
     
            textArea.append(str+"\n");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
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
}
