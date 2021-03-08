import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;

public class AdoptionProcedure extends JFrame {
	
	private Image img_adopt = new ImageIcon(FrameLogin.class.getResource("res/AdoptCat.jpg")).getImage().getScaledInstance(450, 600, Image.SCALE_SMOOTH);
	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdoptionProcedure frame = new AdoptionProcedure();
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
	public AdoptionProcedure() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 850, 484);
		setUndecorated(true);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbladoptnekoimg = new JLabel("");
		lbladoptnekoimg.setBounds(0, 0, 380, 484);
		lbladoptnekoimg.setIcon(new ImageIcon(img_adopt));
		contentPane.add(lbladoptnekoimg);
	}

}
