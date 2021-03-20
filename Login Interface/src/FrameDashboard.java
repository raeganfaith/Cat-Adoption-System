//To import built-in and user-defined packages into your java source file
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FrameDashboard extends JFrame {
	
	private Image img_logo = new ImageIcon(FrameLogin.class.getResource("res/logo.png")).getImage().getScaledInstance(250, 200, Image.SCALE_SMOOTH);
	
	private JPanel contentPane;
	
	private PanelHome panelHome;
	private PanelAbout panelAbout;
	private PanelAdopt panelAdopt;
	private PanelDonate panelDonate;
	
	//Launch the application.
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameDashboard frame = new FrameDashboard();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public FrameDashboard() {
		setBackground(new Color(153, 153, 153));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 850, 484);
		setUndecorated(true);
		setLocationRelativeTo(null); //To Center
		contentPane = new JPanel();
		contentPane.setFont(new Font("STCaiyun", Font.PLAIN, 20));
		contentPane.setBackground(new Color(204, 153, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panelHome = new PanelHome();
		panelAbout = new PanelAbout();
		panelAdopt = new PanelAdopt();
		panelDonate = new PanelDonate();
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 153, 153));
		panel.setBounds(0, 0, 295, 484);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblIconLogo2 = new JLabel("");
		lblIconLogo2.setBounds(20, 20, 275, 199);
		panel.add(lblIconLogo2);
		lblIconLogo2.setIcon(new ImageIcon(img_logo));
		
		JPanel paneHome = new JPanel();
		paneHome.addMouseListener(new PanelButtonMouseAdapter(paneHome) {
			//Allows to show the panelHome after clicking the paneHome(Home NavBar).
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(panelHome);
			}
		});
		paneHome.setBorder(new EmptyBorder(0, 0, 0, 0));
		paneHome.setBounds(0, 229, 295, 39);
		panel.add(paneHome);
		paneHome.setBackground(new Color(153, 153, 153));
		paneHome.setLayout(null);
		
		JLabel lblHome = new JLabel("HOME");
		lblHome.setFont(new Font("Cher Faust", Font.PLAIN, 20));
		lblHome.setHorizontalAlignment(SwingConstants.CENTER);
		lblHome.setBounds(94, 10, 89, 19);
		paneHome.add(lblHome);
		
		JPanel paneAbout = new JPanel();
		paneAbout.addMouseListener(new PanelButtonMouseAdapter(paneAbout) {
			//Allows to show the panelAbout after clicking the paneAbout(About NavBar).
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(panelAbout);
			}
		});
		paneAbout.setLayout(null);
		paneAbout.setBorder(new EmptyBorder(0, 0, 0, 0));
		paneAbout.setBackground(new Color(153, 153, 153));
		paneAbout.setBounds(0, 278, 295, 39);
		panel.add(paneAbout);
		
		JLabel lblAbout = new JLabel("ABOUT");
		lblAbout.setHorizontalAlignment(SwingConstants.CENTER);
		lblAbout.setFont(new Font("Cher Faust", Font.PLAIN, 20));
		lblAbout.setBounds(94, 10, 89, 19);
		paneAbout.add(lblAbout);
		
		JPanel paneAdopt = new JPanel();
		paneAdopt.addMouseListener(new PanelButtonMouseAdapter(paneAdopt) {
			//Allows to show the panelAdopt after clicking the paneAdopt(Adopt NavBar).
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(panelAdopt);
			}
		});
		paneAdopt.setLayout(null);
		paneAdopt.setBorder(new EmptyBorder(0, 0, 0, 0));
		paneAdopt.setBackground(new Color(153, 153, 153));
		paneAdopt.setBounds(0, 327, 295, 39);
		panel.add(paneAdopt);
		
		JLabel lblAdopt = new JLabel("ADOPT");
		lblAdopt.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdopt.setFont(new Font("Cher Faust", Font.PLAIN, 20));
		lblAdopt.setBounds(95, 10, 89, 19);
		paneAdopt.add(lblAdopt);
		
		JPanel paneDonate = new JPanel();
		paneDonate.addMouseListener(new PanelButtonMouseAdapter(paneDonate) {
			//Allows to show the panelDonate after clicking the paneDonate(Donate NavBar).
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(panelDonate);
			}
		});
		paneDonate.setLayout(null);
		paneDonate.setBorder(new EmptyBorder(0, 0, 0, 0));
		paneDonate.setBackground(new Color(153, 153, 153));
		paneDonate.setBounds(0, 380, 295, 39);
		panel.add(paneDonate);
		
		JLabel lblDonate = new JLabel("DONATE");
		lblDonate.setHorizontalAlignment(SwingConstants.CENTER);
		lblDonate.setFont(new Font("Cher Faust", Font.PLAIN, 20));
		lblDonate.setBounds(96, 10, 89, 19);
		paneDonate.add(lblDonate);
		
		JPanel panesignout = new JPanel();
		panesignout.addMouseListener(new PanelButtonMouseAdapter(panesignout) {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(JOptionPane.showConfirmDialog(null, "Are you sure you want to signout?") == 0) {
					//To close the FrameDashboard automatically
					FrameDashboard.this.dispose();
				}	
				
			}
		});
		
		panesignout.setLayout(null);
		panesignout.setBorder(new EmptyBorder(0, 0, 0, 0));
		panesignout.setBackground(new Color(153, 153, 153));
		panesignout.setBounds(0, 429, 295, 39);
		panel.add(panesignout);
		
		JLabel lblSignout = new JLabel("SIGNOUT");
		lblSignout.setHorizontalAlignment(SwingConstants.CENTER);
		lblSignout.setFont(new Font("Cher Faust", Font.PLAIN, 20));
		lblSignout.setBounds(96, 10, 89, 19);
		panesignout.add(lblSignout);
		
		JLabel lblClose = new JLabel("X");
		lblClose.addMouseListener(new MouseAdapter() {
			//Confirmation and function of Close Button
			@Override
			public void mouseClicked(MouseEvent e) {
				if(JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?", "Confirmation", JOptionPane.YES_NO_OPTION) == 0) {
					FrameDashboard.this.dispose();
			}
		}
			//Hover Effects of the Close Button
			@Override
			public void mouseEntered(MouseEvent e) {
				lblClose.setForeground(Color.RED);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				lblClose.setForeground(Color.BLACK);
			}
			});
		lblClose.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		lblClose.setHorizontalAlignment(SwingConstants.CENTER);
		lblClose.setBounds(820, 0, 30, 30);
		contentPane.add(lblClose);
		
		JPanel panelMainContent = new JPanel();
		panelMainContent.setBounds(305, 20, 524, 454);
		contentPane.add(panelMainContent);
		panelMainContent.setLayout(null);
		//Create muna kayo ng panel tas after nun eto lagay niyo para maconnect niyo mga nagawa niyong panel. 
		panelMainContent.add(panelHome);
		panelMainContent.add(panelAbout);
		panelMainContent.add(panelAdopt);
		panelMainContent.add(panelDonate);
		
		
		
		menuClicked(panelHome);
	}
	//To hide the panels when no action is performed
	public void menuClicked(JPanel panel) {
		panelHome.setVisible(false);
		panelAbout.setVisible(false);
		panelAdopt.setVisible(false);
		panelDonate.setVisible(false);
		
		panel.setVisible(true);
	}
	//For switching different panels
	private class PanelButtonMouseAdapter extends MouseAdapter{
		
		JPanel panel;
		public PanelButtonMouseAdapter(JPanel panel) {
			this.panel = panel;
		}
		@Override 
		public void mouseEntered(MouseEvent e) {
			panel.setBackground(new Color(100, 100, 100));
		}
		@Override
		public void mouseExited(MouseEvent e) {
			panel.setBackground(new Color(153, 153, 153));
		}
		@Override
		public void mousePressed(MouseEvent e) {
			panel.setBackground(new Color(100, 100, 100));
		}
		@Override
		public void mouseReleased(MouseEvent e) {
			panel.setBackground(new Color(100, 100, 100));
		}
	}
}
