import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;

import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import javax.swing.JScrollBar;
import javax.swing.border.LineBorder;
import javax.swing.JCheckBox;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;


public class PrivacyTerms extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrivacyTerms frame = new PrivacyTerms();
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
	public PrivacyTerms() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 153, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		//contentPane.setVisible(true);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 600, 81);
		panel.setBackground(Color.GRAY);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel PrivacyPolicy = new JLabel("Privacy Policy");
		PrivacyPolicy.setBounds(186, 26, 206, 34);
		PrivacyPolicy.setHorizontalAlignment(SwingConstants.CENTER);
		PrivacyPolicy.setFont(new Font("Cher Faust", Font.PLAIN, 30));
		panel.add(PrivacyPolicy);
		
		JLabel CloseButton = new JLabel("X");
		CloseButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?", "Confirmation", JOptionPane.YES_NO_OPTION) == 0) {
					PrivacyTerms.this.dispose();
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
		CloseButton.setBounds(570, 0, 30, 30);
		panel.add(CloseButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBackground(Color.DARK_GRAY);
		scrollPane.setBounds(20, 91, 551, 235);
		contentPane.add(scrollPane);
		
		JTextPane txtpnPrivacyPolicyLast = new JTextPane();
		txtpnPrivacyPolicyLast.setBackground(Color.LIGHT_GRAY);
		txtpnPrivacyPolicyLast.setEditable(false);
		scrollPane.setViewportView(txtpnPrivacyPolicyLast);
		txtpnPrivacyPolicyLast.setText("Privacy Policy\r\n\r\nLast updated: March 7, 2021\r\n\r\nAdopt Neko operates http://www.adoptneko.com. This page informs you of our policies regarding the collection, use and disclosure of Personal Information we receive from users of the Site.\r\n\r\nWe use your Personal Information only for providing and improving the Site. By using the Site, you agree to the collection and use of information in accordance with this policy.\r\n\r\nInformation Collection And Use\r\n\r\nWhile using our Site, we may ask you to provide us with certain personally identifiable information that can be used to contact or identify you. Personally identifiable information may include, but is not limited to your name.\r\n\r\nLog Data\r\n\r\nLike many site operators, we collect information that your browser sends whenever you visit our Site AdoptNeko.com.\r\n\r\nThis Log Data may include information such as your computer's Internet Protocol address, browser type, browser version, the pages of our Site that you visit, the time and date of your visit, the time spent on those pages and other statistics.\r\n\r\nIn addition, we may use third party services such as Google Analytics that collect, monitor and analyze this \u2026\r\n\r\nCommunications\r\n\r\nWe may use your Personal Information to contact you with newsletters, marketing or promotional materials and other information that ...\r\n\r\n\r\nCookies\r\n\r\nCookies are files with small amount of data, which may include an anonymous unique identifier. Cookies are sent to your browser from a web site and stored on your computer's hard drive.\r\n\r\nLike many sites, we use \"cookies\" to collect information. You can instruct your browser to refuse all cookies or to indicate when a cookie is being sent. However, if you do not accept cookies, you may not be able to use some portions of our Site.\r\n\r\nSecurity\r\n\r\nThe security of your Personal Information is important to us, but remember that no method of transmission over the Internet, or method of electronic storage, is 100% secure. While we strive to use commercially acceptable means to protect your Personal Information, we cannot guarantee its absolute security.\r\n\r\nChanges To This Privacy Policy\r\n\r\nThis Privacy Policy is effective as of February 16 and will remain in effect except with respect to any changes in its provisions in the future, which will be in effect immediately after being posted on this page.\r\n\r\nWe reserve the right to update or change our Privacy Policy at any time and you should check this Privacy Policy periodically. Your continued use of the Service after we post any modifications to the Privacy Policy on this page will constitute your acknowledgment of the modifications and your consent to abide and be bound by the modified Privacy Policy.\r\n\r\nIf we make any material changes to this Privacy Policy, we will notify you either through the email address you have provided us, or by placing a prominent notice on our website.\r\n\r\nContact Us\r\n\r\nIf you have any questions about this Privacy Policy, please contact us.\r\n");
		
		
		JCheckBox PrivacyCheckBox = new JCheckBox("Check here to indicate that you have read and agree to the Privacy Policy of Adopt Neko");
		PrivacyCheckBox.setBackground(new Color(255, 153, 153));
		PrivacyCheckBox.setBounds(20, 324, 551, 21);
		contentPane.add(PrivacyCheckBox);
		
		JPanel pnlAgreeButton = new JPanel();
		pnlAgreeButton.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				boolean checkbox;
				checkbox = PrivacyCheckBox.isSelected();
				if(checkbox == false) {
					JOptionPane.showMessageDialog(null,"Please Check the box if you want to proceed!");
				} else {
					PrivacyTerms.this.dispose();
					
					
				}
			}
			//Hovering buttons
			@Override
			public void mouseEntered(MouseEvent e) {
				pnlAgreeButton.setBackground(new Color(230, 130, 130));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				pnlAgreeButton.setBackground(new Color(255, 153, 153));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				pnlAgreeButton.setBackground(new Color(285, 183, 183));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				pnlAgreeButton.setBackground(new Color(230, 130, 130));
			}
		});
		pnlAgreeButton.setLayout(null);
		pnlAgreeButton.setBorder(new LineBorder(new Color(0, 0, 0)));
		pnlAgreeButton.setBackground(new Color(255, 153, 153));
		pnlAgreeButton.setBounds(486, 360, 85, 30);
		contentPane.add(pnlAgreeButton);
		
		JLabel lblNewLabel = new JLabel("I agree");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 0, 65, 30);
		pnlAgreeButton.add(lblNewLabel);
		
		
		
		//JScrollPane scrollBar = new JScrollPane(txtpnPrivacyPolicyLast, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		//contentPane.add(scrollBar);
		
		
		
		//JScrollBar scrollBar = new JScrollBar();
		//scrollBar.setBounds(560, 106, 17, 268);
		//contentPane.add(scrollBar);
	}
}
