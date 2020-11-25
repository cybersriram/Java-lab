import javax.swing.JFrame;

public class Main {
	public static void main(String[] args) {
		login.LoginFrame frame = new login.LoginFrame();
		frame.setTitle("Login Form");
        frame.setVisible(true);
        frame.setBounds(100,10,370,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
		
	}
}
