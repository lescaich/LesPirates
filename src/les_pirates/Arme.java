package les_pirates;

public class Arme {
	
	private int force;
	private String nom;
	private Case caseCourante;

	public Arme(int force, String nom, Case caseCourante) {
		super();
		this.force = force;
		this.nom = nom;
		this.caseCourante = caseCourante;
	}

	public int getForce() {
		return force;
	}

	public String getNom() {
		return nom;
	}

	public Case getCaseCourante() {
		return caseCourante;
	}
	
}
