/**
 * 
 */
package model;

import controller.Controller;
import view.ConsoleView;
import view.Gui;
import view.View;

/**
 * @author nadia
 *
 */
public class Main {

	// récupération de la partie dans n'importe quelle classe
	
	public static Partie game;
	public static Controller control;
	public static View console;
	public static Gui gui;
	
	/**
	 * une méthode main 
	 * @param args
	 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JoueurCarte j1 = new JoueurCarte(0, "Tom", new Carte[]{});
		JoueurCarte j2 = new JoueurCarte(0, "Claude", new Carte[]{});	
		
		//ajout des cartes dans la game
		game  = new Partie(1,new JoueurCarte[]{j1,j2},System.currentTimeMillis());
		game.getCarteListpartie().addAll(Carte.getCarteList0());
		game.getCarteListpartie().addAll(Carte.getCarteList1());
		
		control = new Controller(j1);
		console = new ConsoleView(j1,control);
		control.addView(console);
		
		gui = new Gui(j1, control);
		gui.setVisible(true);
		
		//game.getCarteListpartie().add(Carte.carte1);
		//game.getCarteListpartie().add(Carte.carte1);
		
        Carte.melangeCarte(game);
		//  afficher l 'info de la partie 
        
	     Util.print("partie numero "+game.getId(),0);
	    
	   // j1.carteSelection(game.getCarteListpartie().get(0)); 
	   //j1.carteSelection(game.getCarteListpartie().get(1));  
	    
	     
	     
	     
	}

}
