/**
 * 
 */
package model;

import java.util.ArrayList;

/**
 * @author nadia
 *
 */
public class Joueur {
	private int id;
	private String nom;
	private ArrayList<Carte> cartes;
	private boolean joueurAction = false;
	
// constructeurs 
	
	public Joueur(int id, String nom, boolean joueurAction) {
		super();
		this.id = id;
		this.nom = nom;
		this.cartes = cartes;
		this.joueurAction = joueurAction;
		Carte.cartes.add(this);
	}


// Getters et Setters

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public ArrayList<Carte> getCartes() {
		return cartes;
	}

	public void setCartes(ArrayList<Carte> cartes) {
		this.cartes = cartes;
	}

	public boolean isJoueurAction() {
		return joueurAction;
	}

	public void setJoueurAction(boolean joueurAction) {
		this.joueurAction = joueurAction;
	}
	
	
	/**public static Joueur creationJoueur(Carte[] carte) {
		Joueur j = null;
		
		//TODO 
		
		return j;
	}*/
	
	public static final Joueur joueur1 = new Joueur(1,"Tom",Carte.carte1,false);
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
