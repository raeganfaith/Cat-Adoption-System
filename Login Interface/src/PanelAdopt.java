import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.border.LineBorder;

public class PanelAdopt extends JPanel {
	private Image img_cat = new ImageIcon(PanelAdopt.class.getResource("res/cat1.png")).getImage().getScaledInstance(150, 230, Image.SCALE_SMOOTH);
	private Image img_cat1 = new ImageIcon(PanelAdopt.class.getResource("res/cat3.png")).getImage().getScaledInstance(150, 230, Image.SCALE_SMOOTH);
	private Image img_cat2 = new ImageIcon(PanelAdopt.class.getResource("res/cat2.png")).getImage().getScaledInstance(190, 230, Image.SCALE_SMOOTH);

	/**
	 * Create the panel.
	 */
	public PanelAdopt() {
		setBackground(new Color(204, 153, 102));
		setSize(524,454);
		setLayout(null);
		
		JLabel lblCat = new JLabel("");
		lblCat.setBounds(10, 107, 159, 220);
		lblCat.setIcon(new ImageIcon(img_cat));
		add(lblCat);
		
		JPanel panelAdoptcat = new JPanel();
		panelAdoptcat.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(JOptionPane.showConfirmDialog(null, "Do you promise to give this cat a home?", "Confirmation", JOptionPane.YES_NO_OPTION) == 0) {
					AdoptionProcess third = new AdoptionProcess();
					third.setVisible(true);
				}
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				panelAdoptcat.setBackground(new Color(235, 133, 170));
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				panelAdoptcat.setBackground(new Color(255, 153, 204));
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				panelAdoptcat.setBackground(new Color(285, 183, 234));
			}
			
			@Override
			public void mouseReleased(MouseEvent e) {
				panelAdoptcat.setBackground(new Color(255, 153, 204));
			}
		});
		panelAdoptcat.setBorder(new LineBorder(new Color(153, 153, 153), 4));
		panelAdoptcat.setBackground(new Color(255, 153, 204));
		panelAdoptcat.setBounds(29, 337, 131, 42);
		add(panelAdoptcat);
		panelAdoptcat.setLayout(null);
		
		JLabel lblAdopt = new JLabel("ADOPT ME!");
		lblAdopt.setBounds(7, 5, 116, 33);
		lblAdopt.setFont(new Font("Cher Faust", Font.PLAIN, 20));
		lblAdopt.setHorizontalAlignment(SwingConstants.CENTER);
		panelAdoptcat.add(lblAdopt);
		
		JLabel lblcat3 = new JLabel("");
		lblcat3.setBounds(365, 107, 149, 220);
		lblcat3.setIcon(new ImageIcon(img_cat1));
		add(lblcat3);
		
		JPanel paneladoptcat1 = new JPanel();
		paneladoptcat1.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				if(JOptionPane.showConfirmDialog(null, "Do you promise to give this cat a home?", "Confirmation", JOptionPane.YES_NO_OPTION) == 0) {
					AdoptionProcess third = new AdoptionProcess();
					third.setVisible(true);
				}
				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				paneladoptcat1.setBackground(new Color(225, 225, 200));
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				paneladoptcat1.setBackground(new Color(255, 255, 204));
			}
				
			@Override
			public void mousePressed(MouseEvent e) {
				paneladoptcat1.setBackground(new Color(295, 295, 294));
			}
			
			@Override
			public void mouseReleased(MouseEvent e) {
				paneladoptcat1.setBackground(new Color(255, 255, 204));
			}
		});
		
		paneladoptcat1.setLayout(null);
		paneladoptcat1.setBorder(new LineBorder(new Color(153, 153, 153), 4));
		paneladoptcat1.setBackground(new Color(255, 255, 204));
		paneladoptcat1.setBounds(362, 337, 131, 42);
		add(paneladoptcat1);
		
		JLabel lblAdopt_1 = new JLabel("ADOPT ME!");
		lblAdopt_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdopt_1.setFont(new Font("Cher Faust", Font.PLAIN, 20));
		lblAdopt_1.setBounds(7, 5, 116, 33);
		paneladoptcat1.add(lblAdopt_1);
		
		JLabel lblcat2 = new JLabel("");
		lblcat2.setBounds(169, 107, 190, 220);
		lblcat2.setIcon(new ImageIcon(img_cat2));
		add(lblcat2);
		
		JPanel paneladoptcat2 = new JPanel();
		paneladoptcat2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(JOptionPane.showConfirmDialog(null, "Do you promise to give this cat a home?", "Confirmation", JOptionPane.YES_NO_OPTION) == 0) {
					AdoptionProcess third = new AdoptionProcess();
					third.setVisible(true);
			}
		}
			@Override
			public void mouseEntered(MouseEvent e) {
				paneladoptcat2.setBackground(new Color(235, 133, 70));
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				paneladoptcat2.setBackground(new Color(255, 153, 102));
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				paneladoptcat2.setBackground(new Color(295, 193, 152));
			}
			
			@Override
			public void mouseReleased(MouseEvent e) {
				paneladoptcat2.setBackground(new Color(255, 153, 102));
			}
		});
		paneladoptcat2.setLayout(null);
		paneladoptcat2.addMouseListener(new MouseAdapter() {
			
		});
		paneladoptcat2.setBorder(new LineBorder(new Color(153, 102, 0), 4));
		paneladoptcat2.setBackground(new Color(255, 153, 102));
		paneladoptcat2.setBounds(192, 337, 131, 42);
		add(paneladoptcat2);
		
		JLabel lblAdopt_1_1 = new JLabel("ADOPT ME!");
		lblAdopt_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdopt_1_1.setFont(new Font("Cher Faust", Font.PLAIN, 20));
		lblAdopt_1_1.setBounds(7, 5, 116, 33);
		paneladoptcat2.add(lblAdopt_1_1);
		
		JLabel lblAllPawsMatters = new JLabel("ALL PAWS MATTERS! HELP US FIND A NEW HOME");
		lblAllPawsMatters.setHorizontalAlignment(SwingConstants.CENTER);
		lblAllPawsMatters.setFont(new Font("Cher Faust", Font.PLAIN, 22));
		lblAllPawsMatters.setBounds(29, 35, 485, 50);
		add(lblAllPawsMatters);

	}
}
