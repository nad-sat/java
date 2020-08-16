/**
 * 
 */
package model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Observable;

/**
 * @author nadia
 *
 */
public class Joueur extends Observable {
	private int id;
	private String nom;
	private LinkedList<Carte> cartes = new LinkedList<Carte>();
	private boolean joueurAction = true;
	private LinkedList<Carte> selectionCarte = new  LinkedList<Carte>();
	
// constructeurs 
	@Deprecated
	public Joueur(int id, String nom, LinkedList<Carte> cartes) {
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

	public LinkedList<Carte> getCartes() {
		return cartes;
	}

	public void setCartes(LinkedList<Carte> cartes) {
		this.cartes = cartes;
	}

	public boolean isJoueurAction() {
		return joueurAction;
	}

	public void setJoueurAction(boolean joueurAction) {
		this.joueurAction = joueurAction;
	}
	
	
	
	public LinkedList<Carte> getSelectionCarte() {
		return selectionCarte;
	}
	public void setSelectionCarte(LinkedList<Carte> selectionCarte) {
		this.selectionCarte = selectionCarte;
	}
	
	
	/**
	 *
	 * @param c qui correspond à la carte   
	 *  Une méthode carteSelection  qui permet au joueur  sélectionner la cartes  
	 *  bloquer le joueur si ce n'est pas son tour 
	 *  de le  bloquer si la paire a été trouvée
	 */
	// selectionner les cartes
	public void carteSelection(Carte c) {
	// bloquer le joueur si ce n'est pas son tour	
		if (this.isJoueurAction()== false) {
			return ;
		}
		// empeche le joueur d'utiliser la carte trouvée
		if (c.isFoundcarte()== true) {
			return ;
		}
		
		if (this.getSelectionCarte().contains(c)) {
			return ;
		}
		Util.print( "le joueur " +this.nom+ " a sélectionné une carte " + c.getImage().getNom(),0);
		this.getSelectionCarte().add(c);
		//vérifier si on a deux cartes et comparer les deux cartes
		if (this.getSelectionCarte().size()==2) {
			boolean b = Carte.CompareCarte(this.getSelectionCarte().get(0),this.getSelectionCarte().get(1)) ;
		
			if (b== true) {
			//déja trouvé les deux cartes de la parties
				this.getSelectionCarte().get(0).setFoundcarte(true);
				this.getSelectionCarte().get(1).setFoundcarte(true);
			//ajouter dans la liste des joueurs	
				this.getCartes().addAll(this.getSelectionCarte());
			 // supprimer tout de la sélection 
				this.getSelectionCarte().clear();
				Util.print( "les deux cartes sont les même",0);
				
			}
			else if (b==false) {
				Util.print( "les deux cartes ne sont pas les même",0);
				 for(Joueur j : Main.game.getListeJoueurs() ){
					 
					 if (!j.equals(this)) {
						 j.setJoueurAction(true);
							// lorsque le joueur fini avec la console , l'autre prend la main 
							 Main.control.setModel(j);
							 Main.console.setModel(j);
							 Main.gui.setModel(j);
							 Util.print( "c'est au tour du joueur "+j.getNom(),0);
					 }
					 
				 }

				this.getSelectionCarte().clear();
				this.setJoueurAction(false);
				
			}
			 //arreter le jeu
			Main.game.stopPartie();	
		}
			
	}
	/**
	 * Une méthode CompteGain  qui calcule les gains du joueur  à chaque fois qu'il trouve la paire 
	 * @return gains 
	 * 
	 *
	 */
	public double compteGain(){
		double gain = 0.0;
		for (Carte c:this.getCartes()) {
			gain += c.getGain();
		}
		Util.print( "le joueur " +this.nom+ " a gagné : " +gain+" euros" ,0);
		return gain;
				
	}
}
