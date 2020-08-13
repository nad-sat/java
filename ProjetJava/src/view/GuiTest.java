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
		
		panel6 = new JPanel();
		panel6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel6.setToolTipText("Case 6");
		panel6.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel6.setBackground(UIManager.getColor("PasswordField.selectionForeground"));
		panel6.setBounds(400, 400, 150, 150);
		frame.getContentPane().add(panel6);
		
		panel7 = new JPanel();
		panel7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel7.setToolTipText("Case 7");
		panel7.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel7.setBackground(UIManager.getColor("PasswordField.selectionForeground"));
		panel7.setBounds(550, 400, 150, 150);
		frame.getContentPane().add(panel7);
		
		panel8 = new JPanel();
		panel8.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel8.setToolTipText("Case 8");
		panel8.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel8.setBackground(UIManager.getColor("PasswordField.selectionForeground"));
		panel8.setBounds(700, 400, 150, 150);
		frame.getContentPane().add(panel8);

		panel9 = new JPanel();
		panel9.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel9.setToolTipText("Case 9");
		panel9.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel9.setBackground(UIManager.getColor("PasswordField.selectionForeground"));
		panel9.setBounds(250, 550, 150, 150);
		frame.getContentPane().add(panel9);
		
		panel10 = new JPanel();
		panel10.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel10.setToolTipText("Case 10");
		panel10.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel10.setBackground(UIManager.getColor("PasswordField.selectionForeground"));
		panel10.setBounds(400,550, 150, 150);
		frame.getContentPane().add(panel10);
		
		panel11 = new JPanel();
		panel11.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel11.setToolTipText("Case 11");
		panel11.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel11.setBackground(UIManager.getColor("PasswordField.selectionForeground"));
		panel11.setBounds(550,550, 150, 150);
		frame.getContentPane().add(panel11);
		
		panel12 = new JPanel();
		panel12.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel12.setToolTipText("Case 12");
		panel12.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel12.setBackground(UIManager.getColor("PasswordField.selectionForeground"));
		panel12.setBounds(700,550, 150, 150);
		frame.getContentPane().add(panel12);
		
		panel13 = new JPanel();
		panel13.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel13.setToolTipText("Case 13");
		panel13.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel13.setBackground(UIManager.getColor("PasswordField.selectionForeground"));
		panel13.setBounds(250, 700, 150, 150);
		frame.getContentPane().add(panel13);
		
		panel14 = new JPanel();
		panel14.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel14.setToolTipText("Case 14");
		panel14.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel14.setBackground(UIManager.getColor("PasswordField.selectionForeground"));
		panel14.setBounds(400,700, 150, 150);
		frame.getContentPane().add(panel14);
		
		panel15 = new JPanel();
		panel15.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel15.setToolTipText("Case 15");
		panel15.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel15.setBackground(UIManager.getColor("PasswordField.selectionForeground"));
		panel15.setBounds(550,700, 150, 150);
		frame.getContentPane().add(panel15);
		
		panel16 = new JPanel();
		panel16.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel16.setToolTipText("Case 16");
		panel16.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel16.setBackground(UIManager.getColor("PasswordField.selectionForeground"));
		panel16.setBounds(700,700, 150, 150);
		frame.getContentPane().add(panel16);
		
	}
}
