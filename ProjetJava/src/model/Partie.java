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
	private ArrayList<Joueur> listeJoueurs = new ArrayList<Joueur>(); ;
	private int tour = 1 ;
	private long debutJeu;
	private long finJeu;
	private Joueur vainqueur;
	
	@Deprecated

	public Partie(int id, ArrayList<Joueur> listeJoueurs, long debutJeu) {
		super();
		this.id = id;
		this.listeJoueurs = listeJoueurs;
		this.debutJeu = debutJeu;

	}
	public Partie(int id,Joueur[]listeJoueurs,long debutJeu ) {
		super();
		this.id = id;
		for(Joueur joueurs:listeJoueurs) {
			this.listeJoueurs.add(joueurs);}
		this.debutJeu = debutJeu;
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

}
