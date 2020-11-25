package login;
import java.text.SimpleDateFormat;  
import java.util.Date;
import java.util.Scanner;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class LoginFrame extends JFrame implements ActionListener {
    Container container=getContentPane();
    public static JFrame login = new JFrame();
    JLabel userLabel=new JLabel("USERNAME");
    JLabel passwordLabel=new JLabel("PASSWORD");
    JTextField userTextField=new JTextField();
    JPasswordField passwordField=new JPasswordField();
    JLabel l1 = new JLabel();
    JButton loginButton=new JButton("LOGIN");
    JButton setButton=new JButton("Set | Reset Password");
    
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
 
    public LoginFrame()
    {
       //Calling methods inside constructor.
        setLayoutManager();
        setLocationAndSize();
        addComponentsToContainer();
 
    }
   public void setLayoutManager()
   {
       container.setLayout(null);
   }
   public void setLocationAndSize()
   {
       //Setting location and Size of each components using setBounds() method.
       userLabel.setBounds(50,150,150,30);
       passwordLabel.setBounds(50,220,100,30);
       userTextField.setBounds(150,150,150,30);
       passwordField.setBounds(150,220,150,30);
       l1.setBounds(80, 260,  200, 30);
       loginButton.addActionListener(this);
       loginButton.setBounds(120,300,100,30);
       setButton.setBounds(70,360,200,30);
       setButton.addActionListener(this);
       
   }
   
   public void addComponentsToContainer()
   {
      //Adding each components to the Container
       container.add(userLabel);
       container.add(passwordLabel);
       container.add(userTextField);
       container.add(passwordField);
       container.add(loginButton);
       container.add(l1);
       container.add(setButton);
   }
   public void actionPerformed(ActionEvent e) {
	   String btn = e.getActionCommand();
	   if (btn.equals("LOGIN")) {
	   String name = (userTextField.getText());
	   char[] pass =passwordField.getPassword();
	   String str = new String(pass);
	   String tpass="";
	   FileInputStream fis;
	try {
		fis = new FileInputStream("ebdsfyeo.txt");
		Scanner sc=new Scanner(fis); 
		tpass = sc.nextLine(); 
		sc.close();
	} catch (FileNotFoundException e2) {
		System.out.println("file not found");
		e2.printStackTrace();
	}       
	   if(tpass.equals(str)) {
		   l1.setText("Logined by "+name);
		   SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
		   String date = formatter.format(new Date());  
		      try {
		    	  BufferedWriter out = new BufferedWriter(new FileWriter("usernames.txt", true));
					out.write(name + " logined at "+ date);
					out.write("\n");
					out.close();
			} catch (IOException e1) {
				System.out.println("Error encountered");
				e1.printStackTrace();
			}
		    select sel = new select();
		    sel.setVisible(true);
		    this.dispose();
	   }
	   else {
		   l1.setText(name+" enter the correct password");
	   }
	 }
	   else{
		   this.dispose();
		   mid obj1 = new mid();
		   obj1.setVisible(true);
	   }
   }
}