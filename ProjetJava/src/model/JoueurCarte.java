package model;

import java.util.LinkedList;

public class JoueurCarte extends Joueur {

	private LinkedList<Carte> carteJoueur = new LinkedList <Carte>();
	
	
	
	public LinkedList<Carte> getCarteJoueur() {
		return carteJoueur;
	}

	public void setCarteJoueur(LinkedList<Carte> carteJoueur) {
		this.carteJoueur = carteJoueur;
	}

	public void generecarte() {
		  Util.print("=======================",0);
		
		  Util.print("Vos combinaisons trouvées:",0);
		  for(Carte c:this.carteJoueur) {
			  Util.print(""+c.getImage().getNom(),0);
		  }
		  Util.print("=======================",0);
	}
	
	public JoueurCarte(int id, String nom, Carte[] cartes) {
		super(id, nom, cartes);
		// TODO Auto-generated constructor stub
	}

}
