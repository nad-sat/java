package view;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;

import controller.Controller;
import model.Carte;
import model.Joueur;
import model.JoueurCarte;
import model.Main;

public class Gui extends View {
	
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
	private JButton btnNewButton;
	
	public Gui(JoueurCarte model, Controller controller) {
		super(model, controller);
		
		
		this.setLayout(null);
		this.setBounds(100, 100, 1000, 1000);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Memory");
		
		panel1 = new JPanel();
		panel1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel1.setToolTipText("Case 1");
		panel1.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel1.setBackground(Color.WHITE);
		panel1.setBounds(250, 250, 150, 150);
		this.getContentPane().add(panel1);
		Gui.clickbouton(this, panel1, 0);
		
		
		
		panel2 = new JPanel();
		panel2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel2.setToolTipText("Case 2");
		panel2.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel2.setBackground(Color.WHITE);
		panel2.setBounds(400, 250, 150, 150);
		this.getContentPane().add(panel2);
		Gui.clickbouton(this, panel2,1);
		
		panel3 = new JPanel();
		panel3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel3.setToolTipText("Case 3");
		panel3.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel3.setBackground(Color.WHITE);
		panel3.setBounds(550, 250, 150, 150);
		this.getContentPane().add(panel3);
		Gui.clickbouton(this, panel3, 2);
		
		
		panel4 = new JPanel();
		panel4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel4.setToolTipText("Case 4");
		panel4.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel4.setBackground(Color.WHITE);
		panel4.setBounds(700, 250, 150, 150);
		this.getContentPane().add(panel4);
		Gui.clickbouton(this, panel4, 3);
		
		panel5 = new JPanel();
		panel5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel5.setToolTipText("Case 5");
		panel5.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel5.setBackground(Color.WHITE);
		panel5.setBounds(250, 400, 150, 150);
		this.getContentPane().add(panel5);
		Gui.clickbouton(this, panel5, 4);
		
		panel6 = new JPanel();
		panel6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel6.setToolTipText("Case 6");
		panel6.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel6.setBackground(Color.WHITE);
		panel6.setBounds(400, 400, 150, 150);
		this.getContentPane().add(panel6);
		Gui.clickbouton(this, panel6, 5);
		
		panel7 = new JPanel();
		panel7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel7.setToolTipText("Case 7");
		panel7.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel7.setBackground(Color.WHITE);
		panel7.setBounds(550, 400, 150, 150);
		this.getContentPane().add(panel7);
		Gui.clickbouton(this, panel7, 6);
		
		panel8 = new JPanel();
		panel8.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel8.setToolTipText("Case 8");
		panel8.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel8.setBackground(Color.WHITE);
		panel8.setBounds(700, 400, 150, 150);
		this.getContentPane().add(panel8);
		Gui.clickbouton(this, panel8, 7);

		panel9 = new JPanel();
		panel9.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel9.setToolTipText("Case 9");
		panel9.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel9.setBackground(Color.WHITE);
		panel9.setBounds(250, 550, 150, 150);
		this.getContentPane().add(panel9);
		Gui.clickbouton(this, panel9, 8);
		
		panel10 = new JPanel();
		panel10.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel10.setToolTipText("Case 10");
		panel10.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel10.setBackground(Color.WHITE);
		panel10.setBounds(400,550, 150, 150);
		this.getContentPane().add(panel10);
		Gui.clickbouton(this, panel10, 9);
		
		panel11 = new JPanel();
		panel11.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel11.setToolTipText("Case 11");
		panel11.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel11.setBackground(Color.WHITE);
		panel11.setBounds(550,550, 150, 150);
		this.getContentPane().add(panel11);
		Gui.clickbouton(this, panel11, 10);
		
		panel12 = new JPanel();
		panel12.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel12.setToolTipText("Case 12");
		panel12.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel12.setBackground(Color.WHITE);
		panel12.setBounds(700,550, 150, 150);
		this.getContentPane().add(panel12);
		Gui.clickbouton(this, panel12, 11);
		
		panel13 = new JPanel();
		panel13.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel13.setToolTipText("Case 13");
		panel13.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel13.setBackground(Color.WHITE);
		panel13.setBounds(250, 700, 150, 150);
		this.getContentPane().add(panel13);
		Gui.clickbouton(this, panel13, 12);
		
		panel14 = new JPanel();
		panel14.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel14.setToolTipText("Case 14");
		panel14.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel14.setBackground(Color.WHITE);
		panel14.setBounds(400,700, 150, 150);
		this.getContentPane().add(panel14);
		Gui.clickbouton(this, panel14, 13);
		
		panel15 = new JPanel();
		panel15.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel15.setToolTipText("Case 15");
		panel15.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel15.setBackground(Color.WHITE);
		panel15.setBounds(550,700, 150, 150);
		this.getContentPane().add(panel15);
		Gui.clickbouton(this, panel15,14 );
		
		panel16 = new JPanel();
		panel16.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel16.setToolTipText("Case 16");
		panel16.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel16.setBackground(Color.WHITE);
		panel16.setBounds(700,700, 150, 150);
		this.getContentPane().add(panel16);
		Gui.clickbouton(this, panel16, 15);
		
		btnNewButton = new JButton("vos cartes gagnées");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				model.generecarte();}
		});
		btnNewButton.setBounds(485, 151, 122, 44);
		this.getContentPane().add(btnNewButton);
		
			
		
	}

	
	// ajouter un mouselistener sur les panels
		public static void clickbouton(Gui gui, JPanel p, int v) {
			p.addMouseListener(new MouseAdapter() {
				// 
			@Override
			
			public void mousePressed(MouseEvent e) {
			gui.getModel().carteSelection(Main.game.getCarteListpartie().get(v));
			Gui.changeColorCase(gui, p);
			}
				
			});
			
		}
		
		//  fonctionne pas 
		public static void changeColorCase(Gui gui, JPanel p) {
				 
		 
		  for(Carte c : Main.game.getCarteListpartie()) {
			  
		 
			 if (c.isFoundcarte()) {
				 p.setBackground(Color.BLUE);	 
			 }
			 // si la carte est séléctionnée
			 else if(gui.getModel().getSelectionCarte().contains(c)){
				 p.setBackground(Color.gray);	
				 
			 }
			 
			 else { p.setBackground(Color.WHITE);
			 }
			 }
		 }
	}
		

