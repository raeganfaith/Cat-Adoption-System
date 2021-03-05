import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Image;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.border.LineBorder;

public class PanelDonate extends JPanel {
	private Image img_donate = new ImageIcon(PanelDonate.class.getResource("res/donatecats.jpg")).getImage().getScaledInstance(550, 430, Image.SCALE_SMOOTH);

	/**
	 * Create the panel.
	 */
	public PanelDonate() {
		setBackground(new Color(204, 153, 102));
		setBounds(0,0,524,454);
		setLayout(null);
		
		JLabel lbldonate = new JLabel("");
		lbldonate.setBounds(10, 41, 483, 358);
		add(lbldonate);
		lbldonate.setIcon(new ImageIcon(img_donate));
		
		JLabel lblNewLabel = new JLabel("HELP US SAVE AND PROTECT LIVES OF STREET CATS");
		lblNewLabel.setFont(new Font("Cher Faust", Font.PLAIN, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(38, 10, 442, 21);
		add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(128, 128, 128), 4));
		panel.setBackground(new Color(255, 153, 204));
		panel.setBounds(181, 409, 154, 45);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("DONATE");
		lblNewLabel_1.setFont(new Font("Cher Faust", Font.PLAIN, 18));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(10, 10, 134, 25);
		panel.add(lblNewLabel_1);

	}
}
