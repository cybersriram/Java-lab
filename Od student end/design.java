import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.util.Date;

public class design extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField txtImageFormat;
	private JDateChooser dateChooser;
	private JTextArea textArea;
	public String dept, rollno, number_of_days,link,Date,yearr,email,reason;
	private JTextField textField_3;
	private JRadioButton r1,r2,r3,r4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					design frame = new design();
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
	database object = new database();  
	public design() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 678, 775);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("OD Form");
		lblNewLabel.setBackground(Color.MAGENTA);
		lblNewLabel.setFont(new Font("Yu Gothic", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel.setBounds(273, 24, 221, 51);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Select Year");
		lblNewLabel_1.setFont(new Font("SimSun", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_1.setBounds(100, 96, 141, 30);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Enter Your Department");
		lblNewLabel_1_1.setFont(new Font("SimSun", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_1_1.setBounds(371, 96, 212, 30);
		contentPane.add(lblNewLabel_1_1);
		
		r1 = new JRadioButton("1st Year");
		r1.setBounds(58, 133, 109, 23);
		contentPane.add(r1);
		
		r2 = new JRadioButton("2nd Year");
		r2.setBounds(186, 133, 109, 23);
		contentPane.add(r2);
		
		r4 = new JRadioButton("4th Year");
		r4.setBounds(186, 159, 109, 23);
		contentPane.add(r4);
		
		r3 = new JRadioButton("3rd Year");
		r3.setBounds(58, 159, 109, 23);
		contentPane.add(r3);
		
		textField = new JTextField();
		textField.setBounds(359, 137, 236, 38);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Enter Your Roll Number");
		lblNewLabel_1_1_1.setFont(new Font("SimSun", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_1_1_1.setBounds(58, 210, 212, 30);
		contentPane.add(lblNewLabel_1_1_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(58, 251, 212, 38);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		dateChooser = new JDateChooser();
		dateChooser.setBounds(58, 359, 212, 38);
		contentPane.add(dateChooser);
		dateChooser.setDateFormatString("yyyy-MM-dd");
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Enter the date");
		lblNewLabel_1_1_1_1.setFont(new Font("SimSun", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_1_1_1_1.setBounds(77, 318, 193, 30);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Number of Days");
		lblNewLabel_1_1_1_1_1.setFont(new Font("SimSun", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_1_1_1_1_1.setBounds(398, 318, 212, 30);
		contentPane.add(lblNewLabel_1_1_1_1_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(438, 359, 56, 38);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textArea = new JTextArea();
		textArea.setBounds(39, 439, 571, 191);
		contentPane.add(textArea);
		
		JLabel lblNewLabel_1_1_1_1_2 = new JLabel("Reason");
		lblNewLabel_1_1_1_1_2.setFont(new Font("SimSun", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_1_1_1_1_2.setBounds(44, 408, 212, 30);
		contentPane.add(lblNewLabel_1_1_1_1_2);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setBounds(245, 669, 150, 56);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(this);
		
		JLabel lblNewLabel_2 = new JLabel("Event Poster Link");
		lblNewLabel_2.setFont(new Font("Tekton Pro Ext", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_2.setBounds(10, 641, 169, 30);
		contentPane.add(lblNewLabel_2);
		
		txtImageFormat = new JTextField();
		txtImageFormat.setBounds(186, 638, 424, 27);
		contentPane.add(txtImageFormat);
		txtImageFormat.setColumns(10);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("Enter Your Email ID");
		lblNewLabel_1_1_1_2.setFont(new Font("SimSun", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_1_1_1_2.setBounds(371, 210, 212, 30);
		contentPane.add(lblNewLabel_1_1_1_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(371, 251, 212, 38);
		contentPane.add(textField_3);
	}
	public void actionPerformed(ActionEvent e){
		String btn = e.getActionCommand();
		if (btn.equals("Submit")){
			last_page obj = new last_page();
			obj.setVisible(true);
			if(r1.isSelected()) {
				yearr = "1st Year";
			}
			else if(r2.isSelected()) {
				yearr = "2nd Year";
			}
			else
			if(r3.isSelected()) {
				yearr = "3rd Year";
			}
			else if(r4.isSelected()) {
				yearr = "4th Year";
			}
			email = textField_3.getText();
			dept = textField.getText();
			rollno = textField_1.getText();
			number_of_days = textField_2.getText();
			link = txtImageFormat.getText();
			Date date = dateChooser.getDate();
			if(date!=null) {
				String[] get_date = date.toString().split(" ");
				Date = get_date[2]+"-"+get_date[1]+"-"+get_date[5];
			}
			reason=textArea.getText();
			System.out.print(yearr);
			int pre = 0;
			try {
				object.db(dept, rollno, number_of_days, link, Date, email, yearr, pre, reason);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				System.out.println(e1);
			}
			this.dispose();
		}
	}
}
