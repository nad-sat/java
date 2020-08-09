/**
 * 
 */
package model;

/**
 * @author nadia
 *
 */
public class Main {

	// récupération de la partie dans n'importe quelle classe
	
	public static Partie game;
	/**
	 * @param args
	 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Joueur j1 = new Joueur(0, "Tom", new Carte[]{});
		Joueur j2 = new Joueur(0, "Claude", new Carte[]{});		
		//ajout des cartes dans la game
		game  = new Partie(1,new Joueur[]{j1,j2},System.currentTimeMillis());
		game.getCarteListpartie().addAll(Carte.getCarteList());
		game.getCarteListpartie().addAll(Carte.getCarteList());
        Carte.melangeCarte(game);
		//  afficher l 'info de la partie 
	     Util.print("partie numero "+game.getId(),0);
	    
	    j1.carteSelection(game.getCarteListpartie().get(0)); 
	    j1.carteSelection(game.getCarteListpartie().get(1));  
	    
	}

}
