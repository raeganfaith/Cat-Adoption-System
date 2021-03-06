import javax.swing.JPanel;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;
import javax.swing.JTextPane;
import javax.swing.border.LineBorder;

public class PanelAbout extends JPanel {
	//private Image img_about = new ImageIcon(PanelAdopt.class.getResource("res/about.PNG")).getImage().getScaledInstance(520, 390, Image.SCALE_SMOOTH);
	/**
	 * Create the panel.
	 */
	public PanelAbout() {
		setBackground(new Color(204, 153, 102));
		setBounds(0,0,524,454);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ABOUT US");
		lblNewLabel.setFont(new Font("Cher Faust", Font.PLAIN, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(160, 10, 187, 55);
		add(lblNewLabel);
		
		JTextPane txtpnAboutAdoptNeko = new JTextPane();
		txtpnAboutAdoptNeko.setBorder(new LineBorder(Color.GRAY, 3));
		txtpnAboutAdoptNeko.setBackground(Color.PINK);
		txtpnAboutAdoptNeko.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtpnAboutAdoptNeko.setText(" About Adopt Neko\r\n Adopt Neko is a system and organization that helps cats who need homes. \r\n It is also a directory of nearly 11,000 animal shelters and adoption\r\n organizations across the 1600 Amphitheatre Parkway\r\n Aurora Boulevard, Manila 2451\r\n Philippines. \r\n Organizations maintain their own home pages and available cat for adoption.\r\n\r\n Our mission\r\n -To use technology and the resources it can generate to:\r\n -Increase public awareness of the availability of high-quality adoptable cats\r\n -Increase the overall effectiveness of pet adoption programs across\r\n Philippines to the extent that the euthanasia of adoptable cats is eliminated\r\n -Elevate the status of pets to that of family member\r\n From the comfort of their personal computers, cat lovers\r\n can search for a cat that best matches their needs.\r\n They can then reference a shelter\u2019s web page and discover what services it offers. \r\n\r\n Adopt Neko also includes discussion forums, a pet-care resource directory and a\r\n library of free pet-care articles to help keep pets in their homes.\r\n\r\n Adopt Neko is updated DAILY.");
		txtpnAboutAdoptNeko.setBounds(10, 60, 491, 384);
		add(txtpnAboutAdoptNeko);

	}
}
