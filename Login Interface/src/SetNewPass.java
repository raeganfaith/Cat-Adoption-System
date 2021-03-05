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

public class SetNewPass extends JFrame {

	private JPanel contentPane;
	private JTextField txtemailnp;
	private JTextField txtusernamenp;
	private JTextField txtnewpass;
	private JTextField txtnewpass2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SetNewPass frame = new SetNewPass();
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
	public SetNewPass() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 858, 537);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel contentPane_1 = new JPanel();
		setLocationRelativeTo(null);
		contentPane_1.setLayout(null);
		contentPane_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane_1.setBackground(new Color(204, 153, 102));
		contentPane.add(contentPane_1, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.GRAY);
		panel.setBounds(0, 0, 850, 100);
		contentPane_1.add(panel);
		
		JLabel lblSetYourNew = new JLabel("Set your New Password");
		lblSetYourNew.setHorizontalAlignment(SwingConstants.CENTER);
		lblSetYourNew.setFont(new Font("Cher Faust", Font.PLAIN, 26));
		lblSetYourNew.setBounds(166, 10, 504, 85);
		panel.add(lblSetYourNew);
		
		JLabel lblNewLabel_1_1 = new JLabel("X");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(820, 0, 30, 30);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1 = new JLabel("Successfully Retrieved your account!");
		lblNewLabel_1.setFont(new Font("Cher Faust", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(222, 139, 391, 28);
		contentPane_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("Email:");
		lblNewLabel_3.setFont(new Font("Cher Faust", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(102, 196, 237, 13);
		contentPane_1.add(lblNewLabel_3);
		
		txtemailnp = new JTextField();
		txtemailnp.setColumns(10);
		txtemailnp.setBounds(102, 221, 290, 33);
		contentPane_1.add(txtemailnp);
		
		JLabel lblNewLabel_3_3 = new JLabel("Username:");
		lblNewLabel_3_3.setFont(new Font("Cher Faust", Font.PLAIN, 15));
		lblNewLabel_3_3.setBounds(102, 279, 237, 13);
		contentPane_1.add(lblNewLabel_3_3);
		
		txtusernamenp = new JTextField();
		txtusernamenp.setColumns(10);
		txtusernamenp.setBounds(102, 304, 290, 33);
		contentPane_1.add(txtusernamenp);
		
		JPanel jSSumbit = new JPanel();
		jSSumbit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				FrameLogin creates = new FrameLogin();
				String email,userr,newpass,newpass2;
				email = txtemailnp.getText();
				userr = txtusernamenp.getText();
				newpass = txtnewpass.getText();
				newpass2 = txtnewpass2.getText();
				if(email.equals("") || userr.equals("")|| newpass.equals("")|| newpass2.equals("")) {
					JOptionPane.showMessageDialog(null, "Please input all requirements!");
				} else {
					FrameLogin.email.add(email);
					FrameLogin.username.add(userr);
					FrameLogin.password.add(newpass);
					
					creates.Back();
					creates.setVisible(true);
					
					JOptionPane.showMessageDialog(null, "Successfully Updated your password!");
					SetNewPass.this.dispose();
					FrameLogin framelogin = new FrameLogin();
					framelogin.setVisible(true);
				}
				
			}
		});
		jSSumbit.setLayout(null);
		jSSumbit.setBorder(new LineBorder(new Color(153, 153, 153), 4));
		jSSumbit.setBackground(new Color(255, 153, 204));
		jSSumbit.setBounds(318, 409, 172, 48);
		contentPane_1.add(jSSumbit);
		
		JLabel lblSubmit = new JLabel("SUBMIT");
		lblSubmit.setHorizontalAlignment(SwingConstants.CENTER);
		lblSubmit.setFont(new Font("Cher Faust", Font.PLAIN, 20));
		lblSubmit.setBounds(20, 10, 131, 28);
		jSSumbit.add(lblSubmit);
		
		JLabel lblNewLabel_3_3_1 = new JLabel("New Password:");
		lblNewLabel_3_3_1.setFont(new Font("Cher Faust", Font.PLAIN, 15));
		lblNewLabel_3_3_1.setBounds(456, 196, 237, 13);
		contentPane_1.add(lblNewLabel_3_3_1);
		
		txtnewpass = new JTextField();
		txtnewpass.setColumns(10);
		txtnewpass.setBounds(456, 221, 290, 33);
		contentPane_1.add(txtnewpass);
		
		JLabel lblNewLabel_3_3_2 = new JLabel("Re-enter New Password");
		lblNewLabel_3_3_2.setFont(new Font("Cher Faust", Font.PLAIN, 15));
		lblNewLabel_3_3_2.setBounds(456, 279, 237, 13);
		contentPane_1.add(lblNewLabel_3_3_2);
		
		txtnewpass2 = new JTextField();
		txtnewpass2.setColumns(10);
		txtnewpass2.setBounds(456, 304, 290, 33);
		contentPane_1.add(txtnewpass2);
	}

}
