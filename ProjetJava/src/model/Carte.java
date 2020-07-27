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
	private Image image;


	public Carte(int id, String nom, double gain, Image image) {
		super();
		this.id = id;
		this.nom = nom;
		this.gain = gain;
		this.image = image;
	}


	public Carte() {
		super();
		// TODO Auto-generated constructor stub
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

	
	public Image getImage() {
		return image;
	}


	public void setImage(Image image) {
		this.image = image;
	}


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
