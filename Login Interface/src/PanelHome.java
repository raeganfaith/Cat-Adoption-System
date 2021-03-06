import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Image;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class PanelHome extends JPanel {
	private Image img_home = new ImageIcon(PanelAdopt.class.getResource("res/home.jpg")).getImage().getScaledInstance(520, 390, Image.SCALE_SMOOTH);
	/**
	 * Create the panel.
	 */
	public PanelHome() {
		setBackground(new Color(204, 153, 102));
		setBounds(0,0,524,454);
		setLayout(null);
		
		JLabel lblhome = new JLabel("");
		lblhome.setBounds(10, 78, 504, 314);
		lblhome.setIcon(new ImageIcon(img_home));
		add(lblhome);
		JLabel lblNewLabel = new JLabel("GOOD DAY " + "");
		lblNewLabel.setFont(new Font("Cher Faust", Font.PLAIN, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(158, 10, 190, 49);
		add(lblNewLabel);
		setVisible(true);//para maging visible dun sa dashboard

	}
}
