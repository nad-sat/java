package controller;

import model.Joueur;
import view.View;

public class Controller {

	
	private Joueur model;
	private View vue;

	public Controller(Joueur model, View vue) {

		this.model = model;
	}

	@Deprecated
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



} 
