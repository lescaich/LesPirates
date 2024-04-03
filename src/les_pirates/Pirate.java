package les_pirates;

public class Pirate {
	
	private int PV = 5;
	private String nom;
	private Couleur couleur;
	private int position = 0;
	
	public Pirate(int pV, String nom, Couleur couleur) {
		super();
		PV = pV;
		this.nom = nom;
		this.couleur = couleur;
	}
	
	public int getPV() {
		return PV;
	}
	
	public String getNom() {
		return nom;
	}
	
	public Couleur getCouleur() {
		return couleur;
	}

	public int getPosition() {
		return position;
	}
	
	public void setPV(int pV) {
		PV = pV;
	}
	
	public void seDeplace(int nbCases) {
		position += nbCases;
	}
	
}
