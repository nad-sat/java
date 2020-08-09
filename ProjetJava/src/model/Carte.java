/**
 * 
 */
package model;

import java.util.ArrayList;
import java.util.Collections;

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
	private static ArrayList<Carte> carteList = new ArrayList<Carte>();

	public Carte(int id, String nom, double gain, Image image) {
		super();
		this.id = id;
		this.nom = nom;
		this.gain = gain;
		this.image = image;
		Carte.carteList.add(this);
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
	

	public static ArrayList<Carte> getCarteList() {
		return carteList;
	}


	public static void setCarteList(ArrayList<Carte> carteList) {
		Carte.carteList = carteList;
	}

 // COMPARAISON DE DEUX CARTES

	public static  boolean CompareCarte(Carte s1,Carte s2) {
		
		if (s1.equals(s2)) { 
			return true ;
		}
		else  return false;
	}
//mélange les cartes du jeu
	public  static void  melangeCarte( Partie p) {
	 Collections.shuffle(p.getCarteListpartie());
		
	};
	
/**	public static Carte creationCarte(Image image) {
		Carte c = null;
		
		//TODO
		
		return c;
	}
	
*/	
	public static final Carte carte1 = new Carte(0,"carte1",10,Image.image1);
	public static final Carte carte2 = new Carte(1,"carte2",9,Image.image2);
	public static final Carte carte3 = new Carte(2,"carte3",8,Image.image3);
	public static final Carte carte4 = new Carte(3,"carte4",7,Image.image4);
	public static final Carte carte5 = new Carte(4,"carte5",6,Image.image5);
	public static final Carte carte6 = new Carte(5,"carte6",5,Image.image6);
	public static final Carte carte7 = new Carte(6,"carte5",4,Image.image7);
	public static final Carte carte8 = new Carte(7,"carte7",3,Image.image8);
	
	/**
	 * @param args
	 */
	
}
