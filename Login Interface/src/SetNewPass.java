//To import built-in and user-defined packages into your java source file
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

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;

public class SetNewPass extends JFrame {

	private JPanel contentPane;
	private JTextField txtusernamenp;
	private JPasswordField jSPassword;
	private JPasswordField jSPassword2;

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

	public SetNewPass() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 646, 435);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 153, 102));
		contentPane.setForeground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel contentPane_1 = new JPanel();
		contentPane_1.setBounds(0, 0, 646, 430);
		setLocationRelativeTo(null);
		contentPane.setLayout(null);
		contentPane_1.setLayout(null);
		contentPane_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane_1.setBackground(new Color(204, 153, 102));
		contentPane.add(contentPane_1);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.GRAY);
		panel.setBounds(0, 0, 646, 78);
		contentPane_1.add(panel);
		
		JLabel lblSetYourNew = new JLabel("Set your New Password");
		lblSetYourNew.setHorizontalAlignment(SwingConstants.CENTER);
		lblSetYourNew.setFont(new Font("Cher Faust", Font.PLAIN, 26));
		lblSetYourNew.setBounds(40, 10, 504, 64);
		panel.add(lblSetYourNew);
		
		JLabel CloseButton = new JLabel("X");
		CloseButton.addMouseListener(new MouseAdapter() {
			//Close Button Function and confirmation
			@Override
			public void mouseClicked(MouseEvent e) {
				if(JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?", "Confirmation", JOptionPane.YES_NO_OPTION) == 0) {
					SetNewPass.this.dispose();
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
		CloseButton.setBounds(601, 10, 30, 30);
		panel.add(CloseButton);
		
		JLabel lblNewLabel_1 = new JLabel("Successfully Retrieved your account!");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(46, 102, 391, 28);
		contentPane_1.add(lblNewLabel_1);
		
		txtusernamenp = new JTextField();
		txtusernamenp.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtusernamenp.setColumns(10);
		txtusernamenp.setBounds(56, 178, 290, 33);
		contentPane_1.add(txtusernamenp);
		
		JPanel jSSumbit = new JPanel();
		jSSumbit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//Validation warning
				FrameLogin creates = new FrameLogin();
				String userr,newpass,newpass2;
				userr = txtusernamenp.getText();
				newpass = jSPassword.getText();
				newpass2 = jSPassword.getText();
				//Conditional statements to specify the validation pop up
				//To determine whether all require text fields are filled
				if(userr.equals("")|| newpass.equals("")|| newpass2.equals("")) {
					JOptionPane.showMessageDialog(null, "Please input all requirements!");
				} else if(!(new String(jSPassword.getPassword()).equals(new String(jSPassword2.getPassword())))) { 
					JOptionPane.showMessageDialog(null, "Password didn't match!");
				} else {
					//Passing the input from the SetNewPass Frame to the Login Frame.
					FrameLogin.username.add(userr);
					FrameLogin.password.add(newpass);
					creates.Back();
					creates.setVisible(true);
					//Tells user password is successfully update
					JOptionPane.showMessageDialog(null, "Successfully Updated your password!");
					SetNewPass.this.dispose();
					FrameLogin framelogin = new FrameLogin();
					framelogin.setVisible(true);
				}
			}
			//Hovering effects for the Submit Button
			@Override
			public void mouseEntered(MouseEvent e) {
				jSSumbit.setBackground(new Color(230, 130, 130));
			}	
			@Override
			public void mouseExited(MouseEvent e) {
				jSSumbit.setBackground(new Color(255, 153, 153));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				jSSumbit.setBackground(new Color(285, 183, 183));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				jSSumbit.setBackground(new Color(230, 130, 130));
			}
		});
		jSSumbit.setLayout(null);
		jSSumbit.setBorder(new LineBorder(Color.BLACK));
		jSSumbit.setBackground(Color.PINK);
		jSSumbit.setBounds(56, 372, 172, 48);
		contentPane_1.add(jSSumbit);
		
		JLabel lblSubmit = new JLabel("SUBMIT");
		lblSubmit.setHorizontalAlignment(SwingConstants.CENTER);
		lblSubmit.setFont(new Font("Cher Faust", Font.PLAIN, 20));
		lblSubmit.setBounds(20, 10, 131, 28);
		jSSumbit.add(lblSubmit);
		
		JLabel lblNewLabel_3_3_1 = new JLabel("New Password:");
		lblNewLabel_3_3_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3_3_1.setBounds(46, 221, 237, 13);
		contentPane_1.add(lblNewLabel_3_3_1);
		
		JLabel lblNewLabel_3_3_2 = new JLabel("Re-enter New Password");
		lblNewLabel_3_3_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3_3_2.setBounds(46, 287, 237, 13);
		contentPane_1.add(lblNewLabel_3_3_2);
		
		JLabel lblNewLabel_3_3_3 = new JLabel("You can set your new username or use your previouse one");
		lblNewLabel_3_3_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3_3_3.setBounds(46, 140, 455, 28);
		contentPane_1.add(lblNewLabel_3_3_3);
		
		jSPassword = new JPasswordField();
		jSPassword.setFont(new Font("Tahoma", Font.PLAIN, 15));
		jSPassword.setEchoChar('*');
		jSPassword.setBounds(56, 244, 290, 33);
		contentPane_1.add(jSPassword);
		
		jSPassword2 = new JPasswordField();
		jSPassword2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		jSPassword2.setEchoChar('*');
		jSPassword2.setBounds(56, 307, 290, 33);
		contentPane_1.add(jSPassword2);
		
		//Show Password of the JPasswordField.
		JCheckBox chckbxNewCheckBox = new JCheckBox("Show Password");
		chckbxNewCheckBox.setBounds(505, 283, 116, 21);
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Converts the echochar to letters for the visibility of user
				if (chckbxNewCheckBox.isSelected()) {
					jSPassword.setEchoChar((char)0);
					jSPassword2.setEchoChar((char)0);
				}else {
					jSPassword.setEchoChar('*');
					jSPassword2.setEchoChar('*');
				}
			}
		});
		chckbxNewCheckBox.setBackground(new Color(204, 153, 102));
		chckbxNewCheckBox.setBounds(230, 346, 116, 21);
		contentPane_1.add(chckbxNewCheckBox);
	}
}
