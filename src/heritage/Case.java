package heritage;

import java.util.ArrayList;

import entite.Player;
import enumeration.TypeCase;

public abstract class Case {

	ArrayList<Player> JoueurSurCase;
	String nom; // nom de la case
	TypeCase Type;
	
	public Case(String nom){
		this.nom=nom;
	}
	
	public abstract int Loyer();
	
	
}
