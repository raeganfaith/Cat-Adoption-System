import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.SystemColor;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrameLogin extends JFrame {
	//To insert and resize images
	private Image img_logo = new ImageIcon(FrameLogin.class.getResource("res/logo.png")).getImage().getScaledInstance(250, 200, Image.SCALE_SMOOTH);
	private Image img_user = new ImageIcon(FrameLogin.class.getResource("res/pawlogo.png")).getImage().getScaledInstance(45, 50, Image.SCALE_SMOOTH);
	private Image img_pass = new ImageIcon(FrameLogin.class.getResource("res/keyy.png")).getImage().getScaledInstance(40, 45, Image.SCALE_SMOOTH);
	
	private JPanel contentPane;
	private JTextField txtUsername;
	private JPasswordField txtPassword;
	private JLabel lblLoginMessage = new JLabel("");
	public static ArrayList <String> email = new ArrayList();
	public static ArrayList <String> username = new ArrayList();
	public static ArrayList <String> password = new ArrayList();
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameLogin frame = new FrameLogin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public FrameLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 153, 102));
		contentPane.setBorder(new LineBorder(new Color(255, 153, 102), 2));
		setContentPane(contentPane);
		
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(176, 216, 250, 40);
		panel.setBackground(new Color(255, 255, 255));
		contentPane.add(panel);		
		panel.setLayout(null);
		
		txtUsername = new JTextField();
		txtUsername.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(txtUsername.getText().equals("Username")) {
					txtUsername.setText("");
				} else {
					txtUsername.selectAll();
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(txtUsername.getText().equals(""))
					txtUsername.setText("Username");
			}
		});
		txtUsername.setBorder(null);
		txtUsername.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtUsername.setText("Username");
		txtUsername.setBounds(54, 10, 170, 20);
		panel.add(txtUsername);
		txtUsername.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 0, 44, 40);
		panel.add(panel_2);
		panel_2.setBackground(new Color(255, 153, 153));
		panel_2.setForeground(new Color(255, 153, 204));
		panel_2.setLayout(null);
		
		JLabel lblUserLogo = new JLabel("");
		lblUserLogo.setBounds(0, 0, 45, 40);
		panel_2.add(lblUserLogo);
		lblUserLogo.setIcon(new ImageIcon(img_user));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(176, 266, 250, 40);
		panel_1.setBackground(Color.WHITE);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		txtPassword = new JPasswordField();
		txtPassword.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(txtPassword.getText().equals("Password")) {
					txtPassword.setEchoChar('*');//can also be changed to bullet
					txtPassword.setText("");
				} else {
					txtPassword.selectAll();
				}
				
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(txtPassword.getText().equals("")) {
					txtPassword.setText("Password");
					txtPassword.setEchoChar((char)0);//So that the password will default to text
				}
			}
		});
		txtPassword.setBorder(null);
		txtPassword.setEchoChar((char)0);//So that the password will default to text
		txtPassword.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtPassword.setText("Password");
		txtPassword.setBounds(56, 10, 170, 20);
		panel_1.add(txtPassword);
		
		JPanel pnlpass = new JPanel();
		pnlpass.setLayout(null);
		pnlpass.setForeground(new Color(255, 153, 204));
		pnlpass.setBackground(SystemColor.activeCaptionBorder);
		pnlpass.setBounds(0, 0, 46, 40);
		panel_1.add(pnlpass);
		
		JLabel lblPassLogo = new JLabel("");
		lblPassLogo.setBounds(0, 0, 39, 40);
		pnlpass.add(lblPassLogo);
		//lblIconUser.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassLogo.setIcon(new ImageIcon(img_pass));
		
		JPanel pnlBtnLogin = new JPanel();
		pnlBtnLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String user, pass;
				user = txtUsername.getText();
				pass = txtPassword.getText();
				if (username.contains(user)&&password.contains(pass)) {
					JOptionPane.showMessageDialog(null,"Login Successful!");
					FrameDashboard second = new FrameDashboard();
					second.setVisible(true);

				}else if(username.isEmpty()&&password.isEmpty()) {
					lblLoginMessage.setText("Please input all requirements!");
				
				}else {
					lblLoginMessage.setText("Username and Password didn't match!");
				}
		}	
			//Hovering buttons
			@Override
			public void mouseEntered(MouseEvent e) {
				pnlBtnLogin.setBackground(new Color(230, 130, 130));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				pnlBtnLogin.setBackground(new Color(255, 153, 153));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				pnlBtnLogin.setBackground(new Color(285, 183, 183));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				pnlBtnLogin.setBackground(new Color(230, 130, 130));
			}
});
		pnlBtnLogin.setBounds(176, 331, 90, 40);
		pnlBtnLogin.setBorder(new LineBorder(new Color(0, 0, 0)));
		pnlBtnLogin.setBackground(new Color(255, 153, 153));
		contentPane.add(pnlBtnLogin);
		pnlBtnLogin.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("   LOG IN");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(10, 10, 70, 21);
		pnlBtnLogin.add(lblNewLabel);
		
		JLabel CloseButton = new JLabel("X");
		CloseButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?", "Confirmation", JOptionPane.YES_NO_OPTION) == 0) {
					FrameLogin.this.dispose();
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
		CloseButton.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		CloseButton.setHorizontalAlignment(SwingConstants.CENTER);
		CloseButton.setBounds(570, 0, 30, 30);
		contentPane.add(CloseButton);
		
		JPanel panelbtnRegister = new JPanel();
		panelbtnRegister.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(JOptionPane.showConfirmDialog(null, "Do you want to register to a new account?", "Confirmation", JOptionPane.YES_NO_OPTION) == 0) {
					RegisterFrame third = new RegisterFrame();
					third.setVisible(true);
			}
				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				panelbtnRegister.setBackground(new Color(123, 123, 123));
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				panelbtnRegister.setBackground(new Color(153, 153, 153));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				panelbtnRegister.setBackground(new Color(193, 193, 193));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				panelbtnRegister.setBackground(new Color(153, 153, 153));
			}
		});
		panelbtnRegister.setLayout(null);
		panelbtnRegister.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelbtnRegister.setBackground(new Color(153, 153, 153));
		panelbtnRegister.setBounds(336, 331, 90, 40);
		contentPane.add(panelbtnRegister);
		
		JLabel lblRegister = new JLabel(" REGISTER");
		lblRegister.setBackground(Color.PINK);
		lblRegister.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblRegister.setBounds(10, 10, 70, 21);
		panelbtnRegister.add(lblRegister);
		
		JLabel lblIconLogo2 = new JLabel("");
		lblIconLogo2.setBounds(176, 10, 250, 201);
		contentPane.add(lblIconLogo2);
		lblIconLogo2.setIcon(new ImageIcon(img_logo));
		
		JLabel lblForgotPass = new JLabel("Forgot Password?");
		lblForgotPass.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ForgotPass fp = new ForgotPass();
				fp.setVisible(true);
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				lblForgotPass.setForeground(Color.RED);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				lblForgotPass.setForeground(Color.BLACK);
			}
		});
		lblForgotPass.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblForgotPass.setBounds(176, 375, 106, 15);
		contentPane.add(lblForgotPass);
		lblLoginMessage.setBounds(176, 310, 250, 21);
		contentPane.add(lblLoginMessage);
		lblLoginMessage.setForeground(new Color(204, 0, 0));
		lblLoginMessage.setFont(new Font("Arial", Font.PLAIN, 10));
		
		//Forgot Password
		JCheckBox chckbxNewCheckBox = new JCheckBox("Show Password");
		chckbxNewCheckBox.setBounds(357, 312, 152, 13);
		contentPane.add(chckbxNewCheckBox);
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			//Show Password
			public void actionPerformed(ActionEvent e) {
				if (chckbxNewCheckBox.isSelected()) {
					txtPassword.setEchoChar((char)0);
				}else {
					txtPassword.setEchoChar('*');//Can be changed to bullet •
				}
			}
		});
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 8));
		chckbxNewCheckBox.setBackground(new Color(204, 153, 102));
		setUndecorated(true);
		setLocationRelativeTo(null);
	}

	public void Back() {
		
	}
}
