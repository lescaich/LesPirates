package les_pirates;

public class Affichage {

	public Affichage() {
		// The display class has no attributes
	}
	
	public static void main(String[] args) {
		Case case0 = new Case(0);
		Case case1 = new Case(1);
		Case case2 = new Case(2);
		Pirate pirate = new Pirate(5, "Bill", Couleur.BLEU);
		//System.out.println(case0.getNumero());
		//System.out.println(case1.getNumero());
		//System.out.println();
		System.out.println("Position Bill : ");
		System.out.println(pirate.getPosition());
		System.out.println("Bill avance d'1 case. ");
		pirate.seDeplace(1);
		System.out.println("Position Bill : ");
		System.out.println(pirate.getPosition());
		System.out.println("Bill avance d'1 case. ");
		pirate.seDeplace(1);
		System.out.println("Position Bill : ");
		System.out.println(pirate.getPosition());
	}
	
}
