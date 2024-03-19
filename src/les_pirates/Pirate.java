package les_pirates;

public class Pirate {
	
	private int PV = 5;
	private String nom;
	private Couleur couleur;
	private int position;
	private Arme arme;
	
	public Pirate(int pV, String nom, Couleur couleur, int position, Arme arme) {
		super();
		PV = pV;
		this.nom = nom;
		this.couleur = couleur;
		this.position = position;
		this.arme = arme;
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

	public Arme getArme() {
		return arme;
	}

	public int getPosition() {
		return position;
	}
	
	public void setPV(int pV) {
		PV = pV;
	}
	
	public void setArme(Arme arme) {
		this.arme = arme;
	}
	
	public void appliquerEffet(int position) {
		
	}
	
}
