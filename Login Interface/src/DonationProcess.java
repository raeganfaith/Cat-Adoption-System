import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class DonationProcess extends JFrame {
	
	private Image img_highfive = new ImageIcon(FrameLogin.class.getResource("res/highfive.jpg")).getImage().getScaledInstance(450, 600, Image.SCALE_SMOOTH);

	private JPanel contentPane;
	private JTextField txtCardNum;
	private JTextField txtCVC;
	private JTextField txtName;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField txtOther;
	private JLabel lblValidate1 = new JLabel("");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DonationProcess frame = new DonationProcess();
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
	public DonationProcess() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 850, 484);
		setUndecorated(true);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel DonateCatPic = new JLabel("");
		DonateCatPic.setBounds(0, 0, 381, 484);
		DonateCatPic.setIcon(new ImageIcon(img_highfive));
		contentPane.add(DonateCatPic);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(378, 0, 472, 57);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Donate and help us support lives of abandoned cats!");
		lblNewLabel.setBounds(44, 10, 388, 42);
		panel.add(lblNewLabel);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Cher Faust", Font.PLAIN, 17));
		
		JLabel CloseButton = new JLabel("X");
		CloseButton.setForeground(Color.WHITE);
		CloseButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?", "Confirmation", JOptionPane.YES_NO_OPTION) == 0) {
					DonationProcess.this.dispose();
				}
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				CloseButton.setForeground(Color.RED);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				CloseButton.setForeground(Color.WHITE);
			}
		});
		CloseButton.setHorizontalAlignment(SwingConstants.CENTER);
		CloseButton.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		CloseButton.setBounds(442, 0, 30, 30);
		panel.add(CloseButton);
		
		JLabel lblNewLabel_1 = new JLabel("Select your desired amount:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(391, 67, 249, 32);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblWarningMessage = new JLabel("");
		lblWarningMessage.setForeground(Color.RED);
		lblWarningMessage.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblWarningMessage.setBounds(582, 67, 58, 25);
		contentPane.add(lblWarningMessage);
		
		JPanel panelMain = new JPanel();
		panelMain.setBorder(new EmptyBorder(0, 0, 0, 0));
		panelMain.setBackground(Color.PINK);
		panelMain.setBounds(391, 190, 451, 268);
		contentPane.add(panelMain);
		panelMain.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Add credit or debit card");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(0, 10, 165, 24);
		panelMain.add(lblNewLabel_3);
		
		JLabel lblCardNum = new JLabel("Card Number:");
		lblCardNum.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCardNum.setBounds(0, 39, 103, 24);
		panelMain.add(lblCardNum);
		
		txtCardNum = new JTextField();
		txtCardNum.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				String CardNum = txtCardNum.getText(); //get 
				int length = CardNum.length();
				
				char c = e.getKeyChar();
				
				//check for number 0 to 9
				if(e.getKeyChar()>='0' && e.getKeyChar()<='9') {
					//check fot the length not more than 16 digit
					if(length<16) {
						txtCardNum.setEditable(true);
					} else {
						txtCardNum.setEditable(false);
					}
				} else {
					//allows the backspace and delete for edit
					if(e.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || e.getExtendedKeyCode()==KeyEvent.VK_DELETE) {
						txtCardNum.setEditable(true);
					} else {
						txtCardNum.setEditable(false);
					}
				}
			}
		});
		txtCardNum.setColumns(10);
		txtCardNum.setBounds(127, 39, 187, 24);
		panelMain.add(txtCardNum);
		
		txtCVC = new JTextField();
		txtCVC.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				String cvc = txtCVC.getText(); //get 
				int length = cvc.length();
				
				char c = e.getKeyChar();
				
				//check for number 0 to 9
				if(e.getKeyChar()>='0' && e.getKeyChar()<='9') {
					//check fot the length not more than 11 digit
					if(length<3) {
						txtCVC.setEditable(true);
					} else {
						txtCVC.setEditable(false);
					}
				} else {
					//allows the backspace and delete for edit
					if(e.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || e.getExtendedKeyCode()==KeyEvent.VK_DELETE) {
						txtCVC.setEditable(true);
					} else {
						txtCVC.setEditable(false);
					}
				}
			}
			
		});
		txtCVC.setColumns(10);
		txtCVC.setBounds(324, 39, 40, 24);
		panelMain.add(txtCVC);
		
		JLabel lblCvc = new JLabel("CVC");
		lblCvc.setHorizontalAlignment(SwingConstants.CENTER);
		lblCvc.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCvc.setBounds(324, 5, 40, 24);
		panelMain.add(lblCvc);
		
		JLabel lblCardHolderName = new JLabel("Card Holder Name:");
		lblCardHolderName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCardHolderName.setBounds(0, 88, 165, 24);
		panelMain.add(lblCardHolderName);
		
		JLabel lblValidate1 = new JLabel("");
		lblValidate1.setHorizontalAlignment(SwingConstants.CENTER);
		lblValidate1.setForeground(Color.RED);
		lblValidate1.setBounds(93, 170, 245, 27);
		panelMain.add(lblValidate1);
		
		txtName = new JTextField();
		txtName.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				char c = e.getKeyChar();
				if(Character.isLetter(c) || Character.isWhitespace(c) || Character.isISOControl(c)) {
					txtName.setEditable(true);
				} else {
					txtName.setEditable(false);
				}
			}	
		});
		txtName.setColumns(10);
		txtName.setBounds(131, 91, 187, 24);
		panelMain.add(txtName);
		
		JPanel panelbtnDonate = new JPanel();
		panelbtnDonate.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String name, card, month, year;
				name = txtName.getText();
				card = txtCardNum.getText();
				if(name.equals("")||card.equals("")) {
					//JOptionPane.showConfirmDialog(null, "Please input all Requirements ?");
					lblValidate1.setText("Please input all Requirements!");
				}else {
					lblValidate1.setText("");
				}
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				panelbtnDonate.setBackground(new Color(123, 123, 123));
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				panelbtnDonate.setBackground(new Color(153, 153, 153));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				panelbtnDonate.setBackground(new Color(193, 193, 193));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				panelbtnDonate.setBackground(new Color(153, 153, 153));
			}
		});
		panelbtnDonate.setLayout(null);
		panelbtnDonate.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelbtnDonate.setBackground(new Color(153, 153, 153));
		panelbtnDonate.setBounds(93, 207, 245, 40);
		panelMain.add(panelbtnDonate);
		
		JLabel lblDonate = new JLabel("DONATE");
		lblDonate.setHorizontalAlignment(SwingConstants.CENTER);
		lblDonate.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDonate.setBackground(Color.PINK);
		lblDonate.setBounds(10, 10, 225, 21);
		panelbtnDonate.add(lblDonate);
		
		
		
		JRadioButton rdb250 = new JRadioButton("PHP 250");
		buttonGroup.add(rdb250);
		rdb250.setFont(new Font("Tahoma", Font.PLAIN, 17));
		rdb250.setBackground(Color.PINK);
		rdb250.setBounds(401, 98, 101, 32);
		contentPane.add(rdb250);
		
		JRadioButton rdb500 = new JRadioButton("PHP 500");
		buttonGroup.add(rdb500);
		rdb500.setFont(new Font("Tahoma", Font.PLAIN, 17));
		rdb500.setBackground(Color.PINK);
		rdb500.setBounds(401, 132, 101, 32);
		contentPane.add(rdb500);
		
		JRadioButton rdb1k = new JRadioButton("PHP 1,000");
		buttonGroup.add(rdb1k);
		rdb1k.setFont(new Font("Tahoma", Font.PLAIN, 17));
		rdb1k.setBackground(Color.PINK);
		rdb1k.setBounds(503, 100, 101, 32);
		contentPane.add(rdb1k);
		
		JRadioButton rdb2k = new JRadioButton("PHP 2,000");
		buttonGroup.add(rdb2k);
		rdb2k.setFont(new Font("Tahoma", Font.PLAIN, 17));
		rdb2k.setBackground(Color.PINK);
		rdb2k.setBounds(503, 132, 101, 32);
		contentPane.add(rdb2k);
		
		JRadioButton rdbOther = new JRadioButton("Other Amount");
		rdbOther.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtOther.setVisible(true);
			}
		});
		buttonGroup.add(rdbOther);
		rdbOther.setFont(new Font("Tahoma", Font.PLAIN, 17));
		rdbOther.setBackground(Color.PINK);
		rdbOther.setBounds(619, 100, 137, 32);
		contentPane.add(rdbOther);
		
		txtOther = new JTextField();
		txtOther.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				String phoneNumber = txtOther.getText(); //get 
				int length = phoneNumber.length();
				
				char c = e.getKeyChar();
				
				//check for number 0 to 9
				if(e.getKeyChar()>='0' && e.getKeyChar()<='9') {
					//check fot the length not more than 10 digit
					if(length<12) {
						txtOther.setEditable(true);
					} else {
						txtOther.setEditable(false);
					}
				} else {
					//allows the backspace and delete for edit
					if(e.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || e.getExtendedKeyCode()==KeyEvent.VK_DELETE) {
						txtOther.setEditable(true);
					} else {
						txtOther.setEditable(false);
					}
				}
			}
		});
		txtOther.setBounds(629, 133, 137, 25);
		contentPane.add(txtOther);
		txtOther.setColumns(10);
		txtOther.setVisible(false);
		
		
		

	}
}
