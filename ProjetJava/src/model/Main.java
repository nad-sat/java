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

		Joueur j1 = new Joueur(0, "Tom", new Carte[]{Carte.carte1,Carte.carte2,Carte.carte3,Carte.carte4,Carte.carte5,Carte.carte6,Carte.carte7,Carte.carte8});
		Joueur j2 = new Joueur(0, "Tom", new Carte[]{Carte.carte1,Carte.carte2,Carte.carte3,Carte.carte4,Carte.carte5,Carte.carte6,Carte.carte7,Carte.carte8});		
		
		game  = new Partie(1,new Joueur[]{j1,j2},System.currentTimeMillis());
		
	     Util.print("partie numero "+game.getId(),0);
	}

}
