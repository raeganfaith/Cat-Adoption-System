import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JTextField;
import com.toedter.calendar.JDayChooser;
import com.toedter.calendar.JDateChooser;
import com.toedter.components.JLocaleChooser;
import javax.swing.JCheckBox;
import javax.swing.border.LineBorder;

public class AdoptionProcedure extends JFrame {
	
	private Image img_adopt = new ImageIcon(FrameLogin.class.getResource("res/AdoptCat.jpg")).getImage().getScaledInstance(450, 600, Image.SCALE_SMOOTH);
	
	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField txtAddress;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdoptionProcedure frame = new AdoptionProcedure();
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
	public AdoptionProcedure() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 850, 484);
		setUndecorated(true);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbladoptnekoimg = new JLabel("");
		lbladoptnekoimg.setBounds(0, 0, 380, 484);
		lbladoptnekoimg.setIcon(new ImageIcon(img_adopt));
		contentPane.add(lbladoptnekoimg);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(378, 0, 472, 77);
		contentPane.add(panel);
		
		JLabel lblAdopt = new JLabel("Adoption Process");
		lblAdopt.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdopt.setForeground(Color.WHITE);
		lblAdopt.setFont(new Font("Cher Faust", Font.PLAIN, 17));
		lblAdopt.setBounds(44, 10, 388, 57);
		panel.add(lblAdopt);
		
		JLabel CloseButton = new JLabel("X");
		CloseButton.setForeground(Color.WHITE);
		CloseButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?", "Confirmation", JOptionPane.YES_NO_OPTION) == 0) {
					AdoptionProcedure.this.dispose();
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
		CloseButton.setForeground(Color.WHITE);
		CloseButton.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		CloseButton.setBounds(442, 0, 30, 30);
		panel.add(CloseButton);
		
		JLabel lblNewLabel = new JLabel("Please answer the following:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(390, 87, 195, 23);
		contentPane.add(lblNewLabel);
		
		JLabel lblChooseYourMethod = new JLabel("Choose your method:");
		lblChooseYourMethod.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblChooseYourMethod.setBounds(390, 120, 195, 23);
		contentPane.add(lblChooseYourMethod);
		
		JLabel lbldate = new JLabel("Choose your date of pick up");
		lbldate.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbldate.setBounds(410, 174, 195, 23);
		contentPane.add(lbldate);
		lbldate.setVisible(false);
		
		JDateChooser dateChooser = new JDateChooser();
		JDateChooser date = dateChooser;
		dateChooser.setBounds(458, 208, 144, 23);
		contentPane.add(dateChooser);
		date.setVisible(false);
		
		JRadioButton rdbPickup = new JRadioButton("Pick-Up ");
		rdbPickup.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lbldate.setVisible(true);
				date.setVisible(true);
			}
		});
		buttonGroup.add(rdbPickup);
		rdbPickup.setFont(new Font("Tahoma", Font.PLAIN, 17));
		rdbPickup.setBackground(Color.PINK);
		rdbPickup.setBounds(390, 153, 144, 21);
		contentPane.add(rdbPickup);
		
		JLabel lbldeliver = new JLabel("Enter your address here:");
		lbldeliver.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbldeliver.setBounds(649, 175, 195, 23);
		contentPane.add(lbldeliver);
		lbldeliver.setVisible(false);
		
		txtAddress = new JTextField();
		txtAddress.setBounds(649, 200, 167, 77);
		contentPane.add(txtAddress);
		txtAddress.setColumns(10);
		txtAddress.setVisible(false);
		
		JRadioButton rdbDeliver = new JRadioButton("Deliver");
		rdbDeliver.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lbldeliver.setVisible(true);
				txtAddress.setVisible(true);
			}
		});
		buttonGroup.add(rdbDeliver);
		rdbDeliver.setFont(new Font("Tahoma", Font.PLAIN, 17));
		rdbDeliver.setBackground(Color.PINK);
		rdbDeliver.setBounds(627, 153, 117, 24);
		contentPane.add(rdbDeliver);
		
		
		JCheckBox PrivacyTerms = new JCheckBox("I have read and agree to the ");
		PrivacyTerms.setFont(new Font("Tahoma", Font.PLAIN, 12));
		PrivacyTerms.setBackground(Color.PINK);
		PrivacyTerms.setBounds(406, 339, 183, 21);
		contentPane.add(PrivacyTerms);
		
		JLabel lblTerms = new JLabel("Terms of Use");
		lblTerms.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TermsOfUse use = new TermsOfUse();
				use.setVisible(true);
			}
			//Hovering effects to determine that it is clickable.
			@Override
			public void mouseEntered(MouseEvent e) {
				lblTerms.setForeground(Color.RED);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				lblTerms.setForeground(Color.BLUE);
			}
		});
		lblTerms.setForeground(new Color(0, 102, 255));
		lblTerms.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblTerms.setBounds(589, 339, 79, 21);
		contentPane.add(lblTerms);
		
		textField_1 = new JTextField();
		textField_1.setText("and");
		textField_1.setForeground(Color.BLACK);
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_1.setColumns(10);
		textField_1.setBorder(null);
		textField_1.setBackground(Color.PINK);
		textField_1.setBounds(666, 339, 20, 21);
		contentPane.add(textField_1);
		
		JLabel lblValidate = new JLabel("");
		lblValidate.setForeground(Color.RED);
		lblValidate.setHorizontalAlignment(SwingConstants.CENTER);
		lblValidate.setBounds(446, 308, 331, 23);
		contentPane.add(lblValidate);
		
		JLabel lblPrivacy = new JLabel("Privacy Policy.");
		lblPrivacy.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				PrivacyTerms privacy = new PrivacyTerms();
				privacy.setVisible(true);
			}
			//Hovering effects to determine that it is clickable.
			@Override
			public void mouseEntered(MouseEvent e) {
				lblPrivacy.setForeground(Color.RED);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				lblPrivacy.setForeground(Color.BLUE);
			}
		});
		lblPrivacy.setForeground(new Color(0, 102, 204));
		lblPrivacy.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPrivacy.setBounds(686, 339, 77, 23);
		contentPane.add(lblPrivacy);
		
		JPanel panelbtnAdopt = new JPanel();
		panelbtnAdopt.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String address;
				Date date;
				boolean privacy;
				address = txtAddress.getText();
				date = dateChooser.getDate();
				privacy = PrivacyTerms.isSelected();
				if(!(rdbPickup.isSelected() || rdbDeliver.isSelected())){
					lblValidate.setText("Please choose your method of adoption!");
				} else if(rdbDeliver.isSelected() && address.equals("")) {
					lblValidate.setText("Please input your address!");
				} else if(rdbPickup.isSelected() && date == null) {
					lblValidate.setText("Please input date for your Pick up!");
				} else if(privacy == false) {
					lblValidate.setText("Please agree to the Privacy and Terms Conditions!");
				}
				else {
					AdoptionProcedure.this.dispose();
					JOptionPane.showMessageDialog(null, "Successfully Adopted!");
								
				}			
			}
			//Hover effects
			@Override
			public void mouseEntered(MouseEvent e) {
				panelbtnAdopt.setBackground(new Color(123, 123, 123));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panelbtnAdopt.setBackground(new Color(153, 153, 153));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				panelbtnAdopt.setBackground(new Color(193, 193, 193));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				panelbtnAdopt.setBackground(new Color(153, 153, 153));
			}
		});
		panelbtnAdopt.setLayout(null);
		panelbtnAdopt.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelbtnAdopt.setBackground(new Color(153, 153, 153));
		panelbtnAdopt.setBounds(495, 382, 245, 40);
		contentPane.add(panelbtnAdopt);
		
		JLabel lblAdopt_1 = new JLabel("ADOPT");
		lblAdopt_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdopt_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAdopt_1.setBackground(Color.PINK);
		lblAdopt_1.setBounds(10, 10, 225, 21);
		panelbtnAdopt.add(lblAdopt_1);
		
		

	}
}
