package res;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Question extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Question frame = new Question();
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
	public Question() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 544, 380);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Question#1: Who originally developed the Java Programming Language?");
		lblNewLabel.setBounds(47, 31, 449, 24);
		contentPane.add(lblNewLabel);
		
		JRadioButton ans1 = new JRadioButton("Timberners-Lee");
		buttonGroup.add(ans1);
		ans1.setBounds(47, 73, 103, 21);
		contentPane.add(ans1);
		
		JRadioButton ans2 = new JRadioButton("Guido Van Rossum");
		buttonGroup.add(ans2);
		ans2.setBounds(47, 105, 145, 21);
		contentPane.add(ans2);
		
		JRadioButton ans3 = new JRadioButton("James Gosling");
		buttonGroup.add(ans3);
		ans3.setBounds(47, 138, 103, 21);
		contentPane.add(ans3);
		
		JRadioButton ans4 = new JRadioButton("Mark Zeckerberg");
		buttonGroup.add(ans4);
		ans4.setBounds(47, 176, 103, 21);
		contentPane.add(ans4);
		
		JPanel panel = new JPanel();
		panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(ans1.isSelected()) {
					JOptionPane.showMessageDialog(null,"PLEASE TRY AGAIN!");
				} else if(ans2.isSelected()) {
					JOptionPane.showMessageDialog(null,"PLEASE TRY AGAIN!");
				} else if(ans3.isSelected()) {
					JOptionPane.showMessageDialog(null,"YOUR ANSWER IS CORRECT!");
				} else if(ans4.isSelected()) {
					JOptionPane.showMessageDialog(null,"PLEASE TRY AGAIN!");
				} else {
					JOptionPane.showMessageDialog(null,"PLEASE TRY AGAIN!");
				}
			}
		});
		panel.setBackground(new Color(153, 204, 255));
		panel.setBounds(300, 216, 145, 40);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("SUBMIT");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(10, 10, 125, 20);
		panel.add(lblNewLabel_1);
	}
}
