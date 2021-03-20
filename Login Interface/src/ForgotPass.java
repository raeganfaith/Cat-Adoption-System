//To import built-in and user-defined packages into your java source file
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class ForgotPass extends JFrame {

	private JPanel contentPane;
	private JTextField txtemailfp;
	private JTextField txtq1fp;
	private JTextField txtq2fp;
	private JTextField txtq3fp;
	
	//For inserting and getting input, we use array list 
	public static ArrayList <String> question1 = new ArrayList();
	public static ArrayList <String> question2 = new ArrayList();
	public static ArrayList <String> question3 = new ArrayList();
	public static ArrayList <String> backupemail = new ArrayList();

	//Launch the application.
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ForgotPass frame = new ForgotPass();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ForgotPass() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setBounds(100, 100, 646, 435);
		setUndecorated(true);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 153, 102));
		setLocationRelativeTo(null);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		panel.setBounds(0, 0, 646, 78);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("FORGOT PASSWORD?");
		lblNewLabel.setBounds(166, 10, 320, 66);
		lblNewLabel.setFont(new Font("Cher Faust", Font.PLAIN, 26));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel);
		
		JLabel CloseButton = new JLabel("X");
		CloseButton.setBounds(616, 0, 30, 40);
		CloseButton.addMouseListener(new MouseAdapter() {	
			//Close function and confirmation
			@Override
			public void mouseClicked(MouseEvent e) {
				if(JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?", "Confirmation", JOptionPane.YES_NO_OPTION) == 0) {
					ForgotPass.this.dispose();
				}
			}
			//Hovering effects for the CloseButton 
			@Override
			public void mouseEntered(MouseEvent e) {
				CloseButton.setForeground(Color.RED);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				CloseButton.setForeground(Color.BLACK);
			}
		});
		CloseButton.setHorizontalAlignment(SwingConstants.CENTER);
		CloseButton.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		panel.add(CloseButton);
		
		JLabel lblNewLabel_1 = new JLabel("Get back into your account!");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(10, 88, 280, 28);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("To recover your account, begin by entering your email and answer the security question.");
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(10, 114, 770, 28);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Enter your Backup Email:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(30, 146, 187, 28);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblValidate = new JLabel("");
		lblValidate.setFont(new Font("Tahoma", Font.ITALIC, 13));
		lblValidate.setForeground(Color.RED);
		lblValidate.setBounds(508, 156, 113, 18);
		contentPane.add(lblValidate);
		
		txtemailfp = new JTextField();
		txtemailfp.addKeyListener(new KeyAdapter() {
			//Ask input from user
			//Apply validation
			@Override
			public void keyReleased(KeyEvent e) {
				String PATTERN = "^[a-zA-Z0-9]{0,30}[@][a-zA-Z0-9]{0,10}[.][a-zA-Z]{0,5}$";
			Pattern patt = Pattern.compile(PATTERN);
			Matcher match = patt.matcher(txtemailfp.getText());
			if(!match.matches()) {
				lblValidate.setText("Invalid Email!");
			} else {
				lblValidate.setText(null);
			}
			}
		});
		
		txtemailfp.setBounds(188, 146, 310, 33);
		contentPane.add(txtemailfp);
		txtemailfp.setColumns(10);
		
		JLabel lblNewLabel_3_1 = new JLabel("1. What is the name of the town where you were born?");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3_1.setBounds(20, 215, 488, 17);
		contentPane.add(lblNewLabel_3_1);
		
		txtq1fp = new JTextField();
		txtq1fp.setColumns(10);
		txtq1fp.setBounds(47, 242, 290, 28);
		contentPane.add(txtq1fp);
		
		txtq2fp = new JTextField();
		txtq2fp.setColumns(10);
		txtq2fp.setBounds(47, 306, 290, 28);
		contentPane.add(txtq2fp);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("2. What is your mother's maiden name?");
		lblNewLabel_3_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3_1_1.setBounds(20, 280, 514, 16);
		contentPane.add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("Security Question:");
		lblNewLabel_3_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3_2.setBounds(0, 184, 187, 28);
		contentPane.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_2_1 = new JLabel("3. What is the name of your first pet?");
		lblNewLabel_3_2_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3_2_1.setBounds(20, 344, 514, 21);
		contentPane.add(lblNewLabel_3_2_1);
		
		txtq3fp = new JTextField();
		txtq3fp.setColumns(10);
		txtq3fp.setBounds(47, 375, 290, 28);
		contentPane.add(txtq3fp);
		
		JPanel jSSumbit = new JPanel();
		jSSumbit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//Declares variable
				String ques1, ques2, ques3, em;
				//Gets the input from the user
				ques1 = txtq1fp.getText();
				ques2 = txtq2fp.getText();
				ques3 = txtq3fp.getText();
				em = txtemailfp.getText();
				//Validation warning
				if(question1.contains(ques1)&&question2.contains(ques2)&&question3.contains(ques3)&&backupemail.contains(em)) {
					JOptionPane.showMessageDialog(null,"Successfully answered the textfields!");
					SetNewPass security = new SetNewPass();
					security.setVisible(true);
					ForgotPass.this.dispose();
				} else {
					JOptionPane.showMessageDialog(null,"Failed to retrieve account!");
				}				
			}
		});
		jSSumbit.setLayout(null);
		jSSumbit.setBorder(new LineBorder(Color.BLACK));
		jSSumbit.setBackground(Color.PINK);
		jSSumbit.setBounds(395, 361, 172, 48);
		contentPane.add(jSSumbit);
		
		JLabel lblSubmit = new JLabel("SUBMIT");
		lblSubmit.setHorizontalAlignment(SwingConstants.CENTER);
		lblSubmit.setFont(new Font("Cher Faust", Font.PLAIN, 20));
		lblSubmit.setBounds(20, 10, 131, 28);
		jSSumbit.add(lblSubmit);
		
		
	}

	public void Back() {
		
		
	}
}
