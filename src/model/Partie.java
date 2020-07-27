/**
 * 
 */
package model;

import java.util.ArrayList;

/**
 * @author nadia
 *
 */
public class Partie {
	private int id;
	private ArrayList<Joueur> listeJoueurs;
	private int tour;
	private long debutJeu;
	private long finJeu;
	private Joueur vainqueur;
	
	
	
	public Partie(int id, ArrayList<Joueur> listeJoueurs, int tour, long debutJeu, long finJeu, Joueur vainqueur) {
		super();
		this.id = id;
		this.listeJoueurs = listeJoueurs;
		this.tour = tour;
		this.debutJeu = debutJeu;
		this.finJeu = finJeu;
		this.vainqueur = vainqueur;
	}

	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public ArrayList<Joueur> getListeJoueurs() {
		return listeJoueurs;
	}


	public void setListeJoueurs(ArrayList<Joueur> listeJoueurs) {
		this.listeJoueurs = listeJoueurs;
	}



	public int getTour() {
		return tour;
	}



	public void setTour(int tour) {
		this.tour = tour;
	}


	public long getDebutJeu() {
		return debutJeu;
	}



	public void setDebutJeu(long debutJeu) {
		this.debutJeu = debutJeu;
	}


	public long getFinJeu() {
		return finJeu;
	}


	public void setFinJeu(long finJeu) {
		this.finJeu = finJeu;
	}


	public Joueur getVainqueur() {
		return vainqueur;
	}


	public void setVainqueur(Joueur vainqueur) {
		this.vainqueur = vainqueur;
	}


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
