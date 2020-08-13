package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Cursor;
import javax.swing.JSlider;

public class GuiTest {

	private JFrame frame;
	private JPanel panel1;
	private JPanel panel2;
	private JPanel panel3;
	private JPanel panel4;
	private JPanel panel5;
	private JPanel panel6;
	private JPanel panel7;
	private JPanel panel8;
	private JPanel panel9;
	private JPanel panel10;
	private JPanel panel11;
	private JPanel panel12;
	private JPanel panel13;
	private JPanel panel14;
	private JPanel panel15;
	private JPanel panel16;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiTest window = new GuiTest();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GuiTest() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1000, 1000);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		panel1 = new JPanel();
		panel1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel1.setToolTipText("Case 1");
		panel1.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel1.setBackground(UIManager.getColor("PasswordField.selectionForeground"));
		panel1.setBounds(250, 250, 150, 150);
		frame.getContentPane().add(panel1);
		
		panel2 = new JPanel();
		panel2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel2.setToolTipText("Case 2");
		panel2.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel2.setBackground(UIManager.getColor("PasswordField.selectionForeground"));
		panel2.setBounds(400, 250, 150, 150);
		frame.getContentPane().add(panel2);
		
		panel3 = new JPanel();
		panel3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel3.setToolTipText("Case 3");
		panel3.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel3.setBackground(UIManager.getColor("PasswordField.selectionForeground"));
		panel3.setBounds(550, 250, 150, 150);
		frame.getContentPane().add(panel3);
		
		panel4 = new JPanel();
		panel4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel4.setToolTipText("Case 4");
		panel4.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel4.setBackground(UIManager.getColor("PasswordField.selectionForeground"));
		panel4.setBounds(700, 250, 150, 150);
		frame.getContentPane().add(panel4);
		
		panel5 = new JPanel();
		panel5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel5.setToolTipText("Case 5");
		panel5.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel5.setBackground(UIManager.getColor("PasswordField.selectionForeground"));
		panel5.setBounds(250, 400, 150, 150);
		frame.getContentPane().add(panel5);
	}
}
