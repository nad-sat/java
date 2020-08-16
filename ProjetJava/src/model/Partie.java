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
	private ArrayList<Joueur> listeJoueurs = new ArrayList<Joueur>(); 
	private int tour = 1 ;
	private long debutJeu;
	private long finJeu;
	private Joueur vainqueur;
	private ArrayList<Carte> carteListpartie = new ArrayList<Carte>();
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
	public ArrayList<Carte> getCarteListpartie() {
		return carteListpartie;
	}
	public void setCarteListpartie(ArrayList<Carte> carteListpartie) {
		this.carteListpartie = carteListpartie;
	}
   //  si toute les cartes ont été jouées
	 public boolean allfoundCarte() {
		 boolean foundcarte = true;
		 for (Carte c: this.getCarteListpartie()) {
			 if (c.isFoundcarte()== false) {
				 foundcarte= false;
			 }
		 }
		 
		 return foundcarte ;
	 }
	 
	 
	 /**
	 * Une methode qui arrete le jeu une fois quand toute les cartes ont été jouées
	 * @return  
	 *  Une méthode CompareCarte qui permet de comparer deux cartes 
	 *
	 */
	
	 
	 public void stopPartie(){
		 boolean stopPartie = this.allfoundCarte();
		 if(stopPartie == true)
		 {
			 Util.print( "la partie est terminée",0);
			 for (Joueur j : this.getListeJoueurs()) {
				 j.compteGain();
			 }
			 
		 }
		 
		 }
	 
	/**
	 * @param args
	 */

}
