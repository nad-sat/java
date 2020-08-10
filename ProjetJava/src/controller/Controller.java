package controller;

import model.Joueur;
import model.Main;
import model.Util;
import view.View;

public class Controller {

	
	private Joueur model;
	private View vue;

	public Controller(Joueur model, View vue) {

		this.model = model;
	}


	public Controller(Joueur model) {
		this.model = model;
	}

	/**
	 * @return the model
	 */
	public Joueur getModel() {
		return model;
	}

	/**
	 * @param model the model to set
	 */
	public void setModel(Joueur model) {
		this.model = model;
	}

	/**
	 * @return the vue
	 */
	public View getVue() {
		return vue;
	}

	/**
	 * @param vue the vue to set
	 */
	public void setVue(View vue) {
		this.vue = vue;
	}

	public void addView(View vue) {
		this.vue = vue;
	}
// methode qui fait le lien entre console et model
	public void commandSelection(int c) {
		//exception pour la carte16 
	 try {
		//conversion integer en carte
		 this.getModel().carteSelection(Main.game.getCarteListpartie().get(c));
	 }
	 catch (IndexOutOfBoundsException e) {
		 Util.print( "Cette carte n'existe pas",1);
	}
	}

} 
