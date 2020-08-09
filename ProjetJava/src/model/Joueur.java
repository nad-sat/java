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
	private ArrayList<Carte> cartes = new ArrayList<Carte>();
	private boolean joueurAction = false;
	
// constructeurs 
	@Deprecated
	public Joueur(int id, String nom, ArrayList<Carte> cartes) {
		super();
		this.id = id;
		this.nom = nom;
		this.cartes = cartes;
	}
	public Joueur(int id, String nom,Carte[] cartes) {
		super();
		this.id = id;
		this.nom = nom;
		for(Carte cartelist:cartes) {
			this.cartes.add(cartelist);
		}
		
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
	
	
}
