import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class SecurityQuestion extends JFrame {

	private JPanel contentPane;
	private final JPanel contentPane_1 = new JPanel();
	private JTextField txtquestion1;
	private JTextField txtquestion2;
	private JTextField txtquestion3;
	private JTextField txtemailbackup;
	

	/**
	 * Launch the application.
	 */
	public void Back() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SecurityQuestion frame = new SecurityQuestion();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public SecurityQuestion() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 646, 435);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 153, 102));
		setLocationRelativeTo(null);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel CloseButton = new JLabel("X");
		CloseButton.setBounds(616, 5, 30, 30);
		contentPane.add(CloseButton);
		CloseButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?", "Confirmation", JOptionPane.YES_NO_OPTION) == 0) {
					SecurityQuestion.this.dispose();
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
		contentPane_1.setBounds(0, 0, 646, 425);
		contentPane.add(contentPane_1);
		contentPane_1.setLayout(null);
		contentPane_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane_1.setBackground(new Color(204, 153, 102));
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.GRAY);
		panel.setBounds(0, 0, 646, 85);
		contentPane_1.add(panel);
		
		JLabel lblBackupYourAccount = new JLabel("Back-up your Account!");
		lblBackupYourAccount.setHorizontalAlignment(SwingConstants.CENTER);
		lblBackupYourAccount.setFont(new Font("Cher Faust", Font.PLAIN, 26));
		lblBackupYourAccount.setBounds(74, 10, 504, 65);
		panel.add(lblBackupYourAccount);
		
		JLabel lblNewLabel_1 = new JLabel("Answer a few question for your account recovery ");
		lblNewLabel_1.setForeground(new Color(204, 0, 0));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1.setBounds(23, 91, 538, 28);
		contentPane_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("This will help you retrieve you account\r\n incase you forgot your passwd!");
		lblNewLabel_2.setForeground(new Color(204, 0, 0));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(23, 116, 577, 28);
		contentPane_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("1. What is the name of the town where you were born?");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(33, 145, 488, 17);
		contentPane_1.add(lblNewLabel_3);
		
		txtquestion1 = new JTextField();
		txtquestion1.setColumns(10);
		txtquestion1.setBounds(60, 172, 290, 28);
		contentPane_1.add(txtquestion1);
		
		JLabel lblNewLabel_3_1 = new JLabel("2. What is your mother's maiden name?");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3_1.setBounds(33, 210, 514, 16);
		contentPane_1.add(lblNewLabel_3_1);
		
		txtquestion2 = new JTextField();
		txtquestion2.setColumns(10);
		txtquestion2.setBounds(60, 236, 290, 28);
		contentPane_1.add(txtquestion2);
		
		JLabel lblNewLabel_3_2 = new JLabel("3. What is the name of your first pet?");
		lblNewLabel_3_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3_2.setBounds(33, 274, 514, 21);
		contentPane_1.add(lblNewLabel_3_2);
		
		txtquestion3 = new JTextField();
		txtquestion3.setColumns(10);
		txtquestion3.setBounds(60, 305, 290, 28);
		contentPane_1.add(txtquestion3);
		
		JPanel pnlSubmitBackup = new JPanel();
		pnlSubmitBackup.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ForgotPass dev = new ForgotPass();
				String q1, q2,q3,backup;
				q1 = txtquestion1.getText();
				q2 = txtquestion2.getText();
				q3 = txtquestion3.getText();
				backup = txtemailbackup.getText();
				if(q1.equals("") || q2.equals("") || q3.equals("") || backup.contentEquals("")) {
					JOptionPane.showMessageDialog(null, "Please input all requirements!");
				} else {
					ForgotPass.question1.add(q1);
					ForgotPass.question2.add(q2);
					ForgotPass.question3.add(q3);
					ForgotPass.backupemail.add(backup);
					dev.Back();
					dev.setVisible(true);
					FrameLogin fl = new FrameLogin();
					fl.setVisible(true);
					SecurityQuestion.this.dispose();
				}
				
			}
			//Hovering buttons
			@Override
			public void mouseEntered(MouseEvent e) {
				pnlSubmitBackup.setBackground(new Color(230, 130, 130));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				pnlSubmitBackup.setBackground(new Color(255, 153, 153));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				pnlSubmitBackup.setBackground(new Color(285, 183, 183));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				pnlSubmitBackup.setBackground(new Color(230, 130, 130));
			}
		});
		pnlSubmitBackup.setLayout(null);
		pnlSubmitBackup.setBorder(new LineBorder(new Color(0, 0, 0)));
		pnlSubmitBackup.setBackground(new Color(255, 153, 153));
		pnlSubmitBackup.setBounds(106, 381, 90, 40);
		contentPane_1.add(pnlSubmitBackup);
		
		JLabel lblSubmit = new JLabel("SUBMIT");
		lblSubmit.setHorizontalAlignment(SwingConstants.CENTER);
		lblSubmit.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSubmit.setBounds(10, 10, 70, 21);
		pnlSubmitBackup.add(lblSubmit);
		
		JPanel panelbtnClear = new JPanel();
		panelbtnClear.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showConfirmDialog(null, "Are you sure you want to clear your data?", "Warning", JOptionPane.WARNING_MESSAGE,JOptionPane.OK_CANCEL_OPTION);
				txtquestion1.setText("");
				txtquestion2.setText("");
				txtquestion3.setText("");
				txtemailbackup.setText("");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				panelbtnClear.setBackground(new Color(123, 123, 123));
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				panelbtnClear.setBackground(new Color(153, 153, 153));
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				panelbtnClear.setBackground(new Color(193, 193, 193));
			}
			
			@Override
			public void mouseReleased(MouseEvent e) {
				panelbtnClear.setBackground(new Color(153, 153, 153));
			}
		});
		panelbtnClear.setLayout(null);
		panelbtnClear.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelbtnClear.setBackground(new Color(153, 153, 153));
		panelbtnClear.setBounds(259, 381, 90, 40);
		contentPane_1.add(panelbtnClear);
		
		JLabel lblClear = new JLabel("CLEAR");
		lblClear.setHorizontalAlignment(SwingConstants.CENTER);
		lblClear.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblClear.setBackground(Color.PINK);
		lblClear.setBounds(10, 10, 70, 21);
		panelbtnClear.add(lblClear);
		
		JLabel lblNewLabel_2_1 = new JLabel("Back-up email:");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2_1.setBounds(48, 343, 106, 28);
		contentPane_1.add(lblNewLabel_2_1);
		
		txtemailbackup = new JTextField();
		txtemailbackup.setColumns(10);
		txtemailbackup.setBounds(148, 343, 202, 28);
		contentPane_1.add(txtemailbackup);
		
		
	}
}
