package les_pirates;

public class Case {
	
	private int numero;
	private Effet effet;
	private Arme arme;
	
	public Case(int numero, Effet effet) {
		super();
		this.numero = numero;
		this.effet = effet;
	}

	public int getNumero() {
		return numero;
	}
	
	public Effet getEffet() {
		return effet;
	}
	
	
}
