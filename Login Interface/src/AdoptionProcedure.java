import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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

public class AdoptionProcedure extends JFrame {
	
	private Image img_adopt = new ImageIcon(FrameLogin.class.getResource("res/AdoptCat.jpg")).getImage().getScaledInstance(450, 600, Image.SCALE_SMOOTH);
	
	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField textField;

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
		panel.setBounds(378, 0, 472, 57);
		contentPane.add(panel);
		
		JLabel lblAdopt = new JLabel("Adoption Process");
		lblAdopt.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdopt.setForeground(Color.WHITE);
		lblAdopt.setFont(new Font("Cher Faust", Font.PLAIN, 17));
		lblAdopt.setBounds(44, 10, 388, 42);
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
		lblNewLabel.setBounds(390, 67, 195, 23);
		contentPane.add(lblNewLabel);
		
		JLabel lblChooseYourMethod = new JLabel("Choose your method:");
		lblChooseYourMethod.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblChooseYourMethod.setBounds(390, 100, 195, 23);
		contentPane.add(lblChooseYourMethod);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Pick-Up ");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnNewRadioButton.setBackground(Color.PINK);
		rdbtnNewRadioButton.setBounds(386, 132, 79, 21);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnDeliver = new JRadioButton("Deliver");
		buttonGroup.add(rdbtnDeliver);
		rdbtnDeliver.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnDeliver.setBackground(Color.PINK);
		rdbtnDeliver.setBounds(623, 132, 117, 24);
		contentPane.add(rdbtnDeliver);
		
		JLabel lblEnterYourAddress = new JLabel("Enter your address here:");
		lblEnterYourAddress.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEnterYourAddress.setBounds(645, 154, 195, 23);
		contentPane.add(lblEnterYourAddress);
		
		textField = new JTextField();
		textField.setBounds(645, 179, 167, 41);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblChooseYourDate = new JLabel("Choose your date of pick up");
		lblChooseYourDate.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblChooseYourDate.setBounds(406, 153, 195, 23);
		contentPane.add(lblChooseYourDate);
		
		JLabel lblNewLabel_1 = new JLabel("Date: ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(406, 186, 38, 23);
		contentPane.add(lblNewLabel_1);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(454, 187, 144, 19);
		contentPane.add(dateChooser);

	}
}
