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

public class DonationProcess extends JFrame {
	
	private Image img_highfive = new ImageIcon(FrameLogin.class.getResource("res/highfive.jpg")).getImage().getScaledInstance(450, 600, Image.SCALE_SMOOTH);

	private JPanel contentPane;
	private JPanel OtherAmount;
	private JTextField txtCardNum;
	private JTextField txtmonth;
	private JTextField txtYear;
	private JTextField txtCVC;
	private JTextField txtName;

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
		
		JPanel Amount1 = new JPanel();
		Amount1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showConfirmDialog(null, "Are you sure you want to donate in this amount?");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				Amount1.setBackground(Color.RED);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				Amount1.setBackground(new Color(153, 153, 153));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				Amount1.setBackground(new Color(193, 193, 193));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				Amount1.setBackground(new Color(153, 153, 153));
			}
		});
		Amount1.setBorder(new LineBorder(Color.BLACK));
		Amount1.setBackground(Color.GRAY);
		Amount1.setBounds(391, 98, 106, 44);
		contentPane.add(Amount1);
		Amount1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("PHP 250");
		lblNewLabel_2.setFont(new Font("Cher Faust", Font.PLAIN, 14));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(10, 10, 86, 28);
		Amount1.add(lblNewLabel_2);
		
		JPanel Amount2 = new JPanel();
		Amount2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showConfirmDialog(null, "Are you sure you want to donate in this amount?");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				Amount2.setBackground(Color.RED);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				Amount2.setBackground(new Color(153, 153, 153));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				Amount2.setBackground(new Color(193, 193, 193));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				Amount2.setBackground(new Color(153, 153, 153));
			}
		});
		Amount2.setBorder(new LineBorder(Color.BLACK));
		Amount2.setBackground(Color.GRAY);
		Amount2.setBounds(507, 98, 106, 44);
		contentPane.add(Amount2);
		Amount2.setLayout(null);
		
		JLabel lblNewLabel_2_1 = new JLabel("PHP 1k");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setFont(new Font("Cher Faust", Font.PLAIN, 14));
		lblNewLabel_2_1.setBounds(10, 10, 86, 28);
		Amount2.add(lblNewLabel_2_1);
		
		JPanel Amount3 = new JPanel();
		Amount3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showConfirmDialog(null, "Are you sure you want to donate in this amount?");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				Amount3.setBackground(Color.RED);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				Amount3.setBackground(new Color(153, 153, 153));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				Amount3.setBackground(new Color(193, 193, 193));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				Amount3.setBackground(new Color(153, 153, 153));
			}
		});
		Amount3.setBorder(new LineBorder(Color.BLACK));
		Amount3.setBackground(Color.GRAY);
		Amount3.setBounds(623, 98, 106, 44);
		contentPane.add(Amount3);
		Amount3.setLayout(null);
		
		JLabel lblNewLabel_2_2 = new JLabel("PHP 2.5k");
		lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2.setFont(new Font("Cher Faust", Font.PLAIN, 14));
		lblNewLabel_2_2.setBounds(10, 10, 86, 28);
		Amount3.add(lblNewLabel_2_2);
		
		OtherAmount = new JPanel();
		OtherAmount.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				OtherAmount.setBackground(Color.GRAY);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				OtherAmount.setBackground(Color.RED);
			}
			@Override
			public void mousePressed(MouseEvent e) {
				OtherAmount.setBackground(Color.RED);
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				OtherAmount.setBackground(Color.RED);
			}
		});
		OtherAmount.setBorder(new LineBorder(Color.BLACK));
		OtherAmount.setBackground(Color.GRAY);
		OtherAmount.setBounds(739, 98, 106, 44);
		contentPane.add(OtherAmount);
		OtherAmount.setLayout(null);
		
		JLabel lblNewLabel_2_3 = new JLabel("Other");
		lblNewLabel_2_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_3.setFont(new Font("Cher Faust", Font.PLAIN, 14));
		lblNewLabel_2_3.setBounds(10, 10, 86, 28);
		OtherAmount.add(lblNewLabel_2_3);
		
		JLabel lblOther = new JLabel("");
		lblOther.setForeground(Color.BLUE);
		lblOther.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblOther.setBounds(401, 152, 96, 32);
		contentPane.add(lblOther);
		
		JLabel lblWarningMessage = new JLabel("");
		lblWarningMessage.setForeground(Color.RED);
		lblWarningMessage.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblWarningMessage.setBounds(582, 67, 232, 25);
		contentPane.add(lblWarningMessage);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new EmptyBorder(0, 0, 0, 0));
		panel_1.setBackground(Color.PINK);
		panel_1.setBounds(391, 190, 451, 268);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Add credit or debit card");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(0, 10, 165, 24);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblCardNum = new JLabel("Card Number:");
		lblCardNum.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCardNum.setBounds(0, 39, 103, 24);
		panel_1.add(lblCardNum);
		
		txtCardNum = new JTextField();
		txtCardNum.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				
			}
		});
		txtCardNum.setColumns(10);
		txtCardNum.setBounds(93, 39, 187, 24);
		panel_1.add(txtCardNum);
		
		JLabel lblMm = new JLabel("MM");
		lblMm.setHorizontalAlignment(SwingConstants.CENTER);
		lblMm.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMm.setBounds(298, 10, 40, 24);
		panel_1.add(lblMm);
		
		txtmonth = new JTextField();
		txtmonth.setColumns(10);
		txtmonth.setBounds(308, 39, 25, 24);
		panel_1.add(txtmonth);
		
		JLabel lblYy = new JLabel("YY");
		lblYy.setHorizontalAlignment(SwingConstants.CENTER);
		lblYy.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblYy.setBounds(348, 10, 25, 24);
		panel_1.add(lblYy);
		
		JLabel lblCvc_1 = new JLabel("/");
		lblCvc_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblCvc_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCvc_1.setBounds(330, 39, 25, 24);
		panel_1.add(lblCvc_1);
		
		txtYear = new JTextField();
		txtYear.setColumns(10);
		txtYear.setBounds(348, 39, 25, 24);
		panel_1.add(txtYear);
		
		txtCVC = new JTextField();
		txtCVC.setColumns(10);
		txtCVC.setBounds(402, 44, 40, 24);
		panel_1.add(txtCVC);
		
		JLabel lblCvc = new JLabel("CVC");
		lblCvc.setHorizontalAlignment(SwingConstants.CENTER);
		lblCvc.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCvc.setBounds(402, 10, 40, 24);
		panel_1.add(lblCvc);
		
		JLabel lblCardHolderName = new JLabel("Card Holder Name:");
		lblCardHolderName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCardHolderName.setBounds(0, 88, 165, 24);
		panel_1.add(lblCardHolderName);
		
		txtName = new JTextField();
		txtName.setColumns(10);
		txtName.setBounds(0, 122, 187, 24);
		panel_1.add(txtName);
		
		JLabel lblValidate = new JLabel("");
		lblValidate.setHorizontalAlignment(SwingConstants.CENTER);
		lblValidate.setForeground(Color.RED);
		lblValidate.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblValidate.setBounds(93, 173, 245, 24);
		panel_1.add(lblValidate);
		
		JPanel panelbtnDonate = new JPanel();
		panelbtnDonate.setLayout(null);
		panelbtnDonate.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelbtnDonate.setBackground(new Color(153, 153, 153));
		panelbtnDonate.setBounds(93, 207, 245, 40);
		panel_1.add(panelbtnDonate);
		
		JLabel lblDonate = new JLabel("DONATE");
		lblDonate.setHorizontalAlignment(SwingConstants.CENTER);
		lblDonate.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDonate.setBackground(Color.PINK);
		lblDonate.setBounds(10, 10, 225, 21);
		panelbtnDonate.add(lblDonate);

	}

	
}
