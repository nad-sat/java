/**
 * 
 */
package model;

/**
 * @author nadia
 *
 */
public class Image {
	private int id;
	private String nom;
	private String locationImg;
	
	

	public Image(int id, String nom, String locationImg) {
		super();
		this.id = id;
		this.nom = nom;
		this.locationImg = locationImg;
	}

// les getters et setters

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



	public String getLocationImg() {
		return locationImg;
	}



	public void setLocationImg(String locationImg) {
		this.locationImg = locationImg;
	}

	public static Image creationImage() {
		Image i = null;
		
		//TODO
		
		return i;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
