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
	private boolean foundcarte = false;
	private static ArrayList<Carte> carteList0 = new ArrayList<Carte>();
	private static ArrayList<Carte> carteList1 = new ArrayList<Carte>();
	private int numCarte;

public Carte(int id, String nom, double gain, Image image,int numCarte ) {
		super();
		this.id = id;
		this.nom = nom;
		this.gain = gain;
		this.image = image;
		this.numCarte = numCarte;
		
		if (numCarte==0) {
			Carte.carteList0.add(this);	
		}
		
		else if (numCarte==1){
			Carte.carteList1.add(this);	
		}
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
	

	
	public static ArrayList<Carte> getCarteList0() {
		return carteList0;
	}



	public static void setCarteList0(ArrayList<Carte> carteList0) {
		Carte.carteList0 = carteList0;
	}



	public static ArrayList<Carte> getCarteList1() {
		return carteList1;
	}



	public static void setCarteList1(ArrayList<Carte> carteList1) {
		Carte.carteList1 = carteList1;
	}



	public int getNumCarte() {
		return numCarte;
	}



	public void setNumCarte(int numCarte) {
		this.numCarte = numCarte;
	}



/**
 * Une méthode CompareCarte qui permet de comparer les symbol de deux  cartes 
 * @param s1
 * @param s2
 * @return true or false
 *
 */
	public static  boolean CompareCarte(Carte s1,Carte s2) {
		
		if (s1.getImage().getNom().equals(s2.getImage().getNom())) { 
			return true ;
		}
		else  return false;
	}
/**
 * Une méthode melangeCarte qui permet de mélanger les cartes 
 * @param p
 */
	public  static void  melangeCarte( Partie p) {
	 Collections.shuffle(p.getCarteListpartie());
		
	};
	
	
	public boolean isFoundcarte() {
		return foundcarte;
	}

	public void setFoundcarte(boolean foundcarte) {
		this.foundcarte = foundcarte;
	}

// Création des cartes 
	
	public static final Carte carte1 = new Carte(0,"carte1",10,Image.image1,0);
	public static final Carte carte2 = new Carte(1,"carte2",9,Image.image2,0);
	public static final Carte carte3 = new Carte(2,"carte3",8,Image.image3,0);
	public static final Carte carte4 = new Carte(3,"carte4",7,Image.image4,0);
	public static final Carte carte5 = new Carte(4,"carte5",6,Image.image5,0);
	public static final Carte carte6 = new Carte(5,"carte6",5,Image.image6,0);
	public static final Carte carte7 = new Carte(6,"carte5",4,Image.image7,0);
	public static final Carte carte8 = new Carte(7,"carte7",3,Image.image8,0);
 
	public static final Carte carte1_1 = new Carte(0,"carte1",10,Image.image1,1);
	public static final Carte carte2_1 = new Carte(1,"carte2",9,Image.image2,1);
	public static final Carte carte3_1 = new Carte(2,"carte3",8,Image.image3,1);
	public static final Carte carte4_1 = new Carte(3,"carte4",7,Image.image4,1);
	public static final Carte carte5_1 = new Carte(4,"carte5",6,Image.image5,1);
	public static final Carte carte6_1 = new Carte(5,"carte6",5,Image.image6,1);
	public static final Carte carte7_1 = new Carte(6,"carte5",4,Image.image7,1);
	public static final Carte carte8_1 = new Carte(7,"carte7",3,Image.image8,1);
}
