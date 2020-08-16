import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.Carte;
import model.Joueur;
import model.Main;
import model.Partie;

class TestUnitaire {

	@Test
	void test() {
		
		Joueur j1 = new Joueur(0, "Tom", new Carte[]{});
		Joueur j2 = new Joueur(0, "Claude", new Carte[]{});		
		//ajout des cartes dans la game
		Main.game  = new Partie(1,new Joueur[]{j1,j2},System.currentTimeMillis());
		
		Main.game.getCarteListpartie().add(Carte.carte1	);
		Main.game.getCarteListpartie().add(Carte.carte1_1);
		assertEquals(2,Main.game.getCarteListpartie().size());
	}

	// vérifie que le joueuer recupère bien les cartes qu'il a gagné
	
	@Test
	void test2() {
		
		Joueur j1 = new Joueur(0, "Tom", new Carte[]{});
		Joueur j2 = new Joueur(0, "Claude", new Carte[]{});		
		//ajout des cartes dans la game
		Main.game  = new Partie(1,new Joueur[]{j1,j2},System.currentTimeMillis());
		
		Main.game.getCarteListpartie().add(Carte.carte1	);
		Main.game.getCarteListpartie().add(Carte.carte1_1);
		j1.carteSelection(Main.game.getCarteListpartie().get(0));
		j1.carteSelection(Main.game.getCarteListpartie().get(1));
		assertEquals(2,j1.getCartes().size());
	}
}
