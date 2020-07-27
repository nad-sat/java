/**
 * 
 */
package model;

/**
 * @author nadia
 *
 *La classe Carte qui contient une liste de carte.
 *
 */
public class Carte {
	private int id;
	private String nom;
	private double gain;

	public Carte(int id, String nom, Double gain) {
		super();
		this.id = id;
		this.nom = nom;
		this.gain = gain;
	}


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



	public double getGain() {
		return gain;
	}



	public void setGain(double gain) {
		this.gain = gain;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
