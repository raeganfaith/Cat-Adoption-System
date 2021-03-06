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

public class ForgotPass extends JFrame {

	private JPanel contentPane;
	private JTextField txtemailfp;
	private JTextField txtq1fp;
	private JTextField txtq2fp;
	private JTextField txtq3fp;
	public static ArrayList <String> question1 = new ArrayList();
	public static ArrayList <String> question2 = new ArrayList();
	public static ArrayList <String> question3 = new ArrayList();
	public static ArrayList <String> backupemail = new ArrayList();

	/**
	 * Launch the application.
	 */
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

	/**
	 * Create the frame.
	 */
	public ForgotPass() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setBounds(100, 100, 850, 484);
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
		panel.setBounds(0, 0, 850, 100);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("FORGOT PASSWORD?");
		lblNewLabel.setFont(new Font("Cher Faust", Font.PLAIN, 26));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(166, 10, 504, 85);
		panel.add(lblNewLabel);
		
		JLabel CloseButton = new JLabel("X");
		CloseButton.addMouseListener(new MouseAdapter() {	
			@Override
			public void mouseClicked(MouseEvent e) {
				if(JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?", "Confirmation", JOptionPane.YES_NO_OPTION) == 0) {
					ForgotPass.this.dispose();
				}
			}
			
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
		CloseButton.setBounds(820, 0, 30, 30);
		panel.add(CloseButton);
		
		JLabel lblNewLabel_1 = new JLabel("Get back into your account!");
		lblNewLabel_1.setFont(new Font("Cher Faust", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(56, 138, 280, 28);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("To recover your account, begin by entering your email and answer the security question.");
		lblNewLabel_2.setFont(new Font("Cher Faust", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(56, 176, 770, 28);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Enter your Backup Email:");
		lblNewLabel_3.setFont(new Font("Cher Faust", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(56, 254, 280, 28);
		contentPane.add(lblNewLabel_3);
		
		txtemailfp = new JTextField();
		txtemailfp.setBounds(56, 294, 290, 33);
		contentPane.add(txtemailfp);
		txtemailfp.setColumns(10);
		
		JLabel lblNewLabel_3_1 = new JLabel("1. What is the name of the town where you were born?");
		lblNewLabel_3_1.setFont(new Font("Cher Faust", Font.PLAIN, 15));
		lblNewLabel_3_1.setBounds(423, 242, 488, 17);
		contentPane.add(lblNewLabel_3_1);
		
		txtq1fp = new JTextField();
		txtq1fp.setColumns(10);
		txtq1fp.setBounds(450, 269, 290, 28);
		contentPane.add(txtq1fp);
		
		txtq2fp = new JTextField();
		txtq2fp.setColumns(10);
		txtq2fp.setBounds(450, 333, 290, 28);
		contentPane.add(txtq2fp);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("2. What is your mother's maiden name?");
		lblNewLabel_3_1_1.setFont(new Font("Cher Faust", Font.PLAIN, 15));
		lblNewLabel_3_1_1.setBounds(423, 307, 514, 16);
		contentPane.add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("Security Question:");
		lblNewLabel_3_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_2.setFont(new Font("Cher Faust", Font.PLAIN, 17));
		lblNewLabel_3_2.setBounds(399, 208, 187, 24);
		contentPane.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_2_1 = new JLabel("3. What is the name of your first pet?");
		lblNewLabel_3_2_1.setFont(new Font("Cher Faust", Font.PLAIN, 15));
		lblNewLabel_3_2_1.setBounds(423, 371, 514, 21);
		contentPane.add(lblNewLabel_3_2_1);
		
		txtq3fp = new JTextField();
		txtq3fp.setColumns(10);
		txtq3fp.setBounds(450, 402, 290, 28);
		contentPane.add(txtq3fp);
		
		JPanel jSSumbit = new JPanel();
		jSSumbit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String ques1, ques2, ques3, em;
				ques1 = txtq1fp.getText();
				ques2 = txtq2fp.getText();
				ques3 = txtq3fp.getText();
				em = txtemailfp.getText();
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
		jSSumbit.setBorder(new LineBorder(new Color(153, 153, 153), 4));
		jSSumbit.setBackground(new Color(255, 153, 204));
		jSSumbit.setBounds(56, 402, 172, 48);
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
