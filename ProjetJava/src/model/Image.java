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


	public static final Image image1 = new Image(0,"elephant","");
	public static final Image image2 = new Image(1,"lion","");
	public static final Image image3 = new Image(2,"girafe","");
	public static final Image image4 = new Image(3, "chien", "");
	public static final Image image5 = new Image(4, "lapin", "");
	public static final Image image6 = new Image(5, "chat", "");
	public static final Image image7 = new Image(6, "loup", "");
	public static final Image image8 = new Image(7, "oiseau", "");
	

}
