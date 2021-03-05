import javax.swing.JPanel;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;

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
		lblNewLabel.setBounds(160, 24, 187, 55);
		add(lblNewLabel);
		
		JLabel lblAbout = new JLabel("");
		lblAbout.setHorizontalAlignment(SwingConstants.CENTER);
		lblAbout.setBounds(10, 81, 492, 346);
		//lblAbout.setIcon(new ImageIcon(img_about));
		add(lblAbout);

	}

}
