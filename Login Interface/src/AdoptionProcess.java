import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

public class AdoptionProcess extends JFrame {
	
	private Image img_neko = new ImageIcon(FrameLogin.class.getResource("res/neko.png")).getImage().getScaledInstance(200, 150, Image.SCALE_SMOOTH);

	private JPanel contentPane;
	private final JLabel lbtnCLOSE = new JLabel("X");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdoptionProcess frame = new AdoptionProcess();
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
	public AdoptionProcess() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 621, 451);
		setLocationRelativeTo(null); //To position the frame to the center
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 153, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNeko = new JLabel("");
		lblNeko.setBounds(22, 164, 169, 110);
		contentPane.add(lblNeko);
		lblNeko.setIcon(new ImageIcon(img_neko));
		
		JLabel lblNewLabel = new JLabel("THANK YOU FOR ADOPTING!");
		lblNewLabel.setFont(new Font("Cher Faust", Font.PLAIN, 25));
		lblNewLabel.setBounds(201, 198, 310, 45);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(153, 153, 153));
		panel.setBounds(0, 154, 621, 130);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lbtnCLOSE = new JLabel("X");
		lbtnCLOSE.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?", "Confirmation", JOptionPane.YES_NO_OPTION) == 0) {
					AdoptionProcess.this.dispose();
				}
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				lbtnCLOSE.setForeground(Color.RED);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lbtnCLOSE.setForeground(Color.BLACK);
			}
		});
		
		lbtnCLOSE.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		lbtnCLOSE.setHorizontalAlignment(SwingConstants.CENTER);
		lbtnCLOSE.setBounds(583, -3, 38, 36);
		contentPane.add(lbtnCLOSE);
		setVisible(true);
		setUndecorated(true);
		
		
	}

}
