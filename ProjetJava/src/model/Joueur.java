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
	
	public Joueur(int id, String nom, ArrayList<Carte> cartes, boolean joueurAction) {
		super();
		this.id = id;
		this.nom = nom;
		this.cartes = cartes;
		this.joueurAction = joueurAction;
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

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
