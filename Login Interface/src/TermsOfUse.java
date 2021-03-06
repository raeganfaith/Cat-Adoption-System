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


public class TermsOfUse extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TermsOfUse frame = new TermsOfUse();
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
	public TermsOfUse() {
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
		
		JLabel PrivacyPolicy = new JLabel("Terms of Use");
		PrivacyPolicy.setBounds(186, 26, 206, 34);
		PrivacyPolicy.setHorizontalAlignment(SwingConstants.CENTER);
		PrivacyPolicy.setFont(new Font("Cher Faust", Font.PLAIN, 30));
		panel.add(PrivacyPolicy);
		
		JLabel CloseButton = new JLabel("X");
		CloseButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?", "Confirmation", JOptionPane.YES_NO_OPTION) == 0) {
					TermsOfUse.this.dispose();
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
		txtpnPrivacyPolicyLast.setText("Terms of Use\r\n\r\nWhat we expect from you, which establishes certain rules for using our services\r\nContent in Adopt Neko services, which describes the intellectual property rights to the\r\ncontent you find in our services \u2014 whether that content belongs to you, Adopt Neko, or others\r\nIn case of problems or disagreements, which describes other legal rights you have,\r\nand what to expect in case someone violates these terms\r\nUnderstanding these terms is important because, by using our services,\r\nyou\u2019re agreeing to these terms.\r\n\r\nBesides these terms, we also publish a Privacy Policy.\r\nAlthough it\u2019s not part of these terms, we encourage\r\nyou to read it to better understand how you can update,\r\nmanage, export, and delete your information.\r\n\r\nService provider\r\nAdopt Neko services are provided by, and you\u2019re contracting with:\r\nAdopt Neko Inc. organized under the laws of the county Philippines\r\nand operating under the laws of the Philippines\r\n\r\n1600 Amphitheatre Parkway\r\nAurora Boulevard, Manila 2451\r\nPhilippines\r\n\r\nAge requirements\r\n-If you\u2019re under the age required to manage your own Adopt Neko Account,\r\nyou must have your parent or legal guardian\u2019s permission to use a\r\nAdopt Neko Account. Please have your parent or legal guardian read these\r\nterms with you.\r\n\r\n-If you\u2019re a parent or legal guardian, and you allow your child to use the\r\nservices, then these terms apply to you and you\u2019re responsible for your\r\nchild\u2019s activity on the services.\r\nSome Adopt Neko services have additional age requirements as described in their\r\nservice-specific additional terms and policies.\r\n\r\nWe want to make these terms easy to understand, so we\u2019ve used examples\r\nfrom our services. But not all services mentioned may be available in\r\nyour country.\r\n\r\nIf these terms conflict with the service-specific additional terms,\r\nthe additional terms will govern for that service.\r\n\r\nIf it turns out that a particular term is not valid or enforceable,\r\nthis will not affect any other terms.\r\n\r\nIf you don\u2019t follow these terms or the service-specific additional terms,\r\nand we don\u2019t take action right away, that doesn\u2019t mean we\u2019re giving up\r\nany rights that we may have, such as taking action in the future.\r\n\r\nWe may update these terms and service-specific additional terms (1)\r\nto reflect changes in our services or how we do business \u2014 for example,\r\nwhen we add new services, features, technologies, pricing, or benefits\r\n(or remove old ones), (2) for legal, regulatory, or security reasons,\r\nor (3) to prevent abuse or harm.\r\n\r\nIf we materially change these terms or service-specific additional terms,\r\nwe\u2019ll provide you with reasonable advance notice and the opportunity to\r\nreview the changes, except (1) when we launch a new service or feature,\r\nor (2) in urgent situations, such as preventing ongoing abuse or responding\r\nto legal requirements. If you don\u2019t agree to the new terms, you should remove\r\nyour content and stop using the services. You can also end your relationship\r\nwith us at any time by closing your Adopt Neko Account\r\n");
		
		
		JCheckBox PrivacyCheckBox = new JCheckBox("Check here to indicate that you have read and agree to the Adopt Neko's Terms of Use");
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
					TermsOfUse.this.dispose();
					
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
