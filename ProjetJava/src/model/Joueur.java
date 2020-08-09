/**
 * 
 */
package model;

import java.util.ArrayList;
import java.util.Observable;

/**
 * @author nadia
 *
 */
public class Joueur extends Observable {
	private int id;
	private String nom;
	private ArrayList<Carte> cartes = new ArrayList<Carte>();
	private boolean joueurAction = true;
	private ArrayList<Carte> selectionCarte = new ArrayList<Carte>();
	
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
	
	
	
	public ArrayList<Carte> getSelectionCarte() {
		return selectionCarte;
	}
	public void setSelectionCarte(ArrayList<Carte> selectionCarte) {
		this.selectionCarte = selectionCarte;
	}
	
	// selectionner les cartes
	public void carteSelection(Carte c) {
	// bloquer le joueur si ce n'est pas son tour	
		if (this.isJoueurAction()== false) {
			return ;
		}
		Util.print( "le" +this.nom+ " a sélectionné une carte " + c.getImage().getNom(),0);
		this.getSelectionCarte().add(c);
		//vérifier si on a deux cartes et comparer les deux cartes
		if (this.getSelectionCarte().size()==2) {
			boolean b = Carte.CompareCarte(this.getSelectionCarte().get(0),this.getSelectionCarte().get(1)) ;
		
			if (b== true) {
			//supprimer les deux cartes de la parties
				Main.game.getCarteListpartie().removeAll(this.getSelectionCarte());
			//ajouter dans la liste des joueurs	
				this.getCartes().addAll(this.getSelectionCarte());
			 // supprimer tout de la sélection 
				this.getSelectionCarte().clear();
				Util.print( "les deux cartes sont les même",0);
			}
			else if (b==false) {
				this.getSelectionCarte().clear();
				this.setJoueurAction(false);
				Util.print( "les deux cartes ne sont pas les même",0);
			}
			 // bloquer le joueur et passer la main 
			
			
		}
		
		
			
	}
	
}
