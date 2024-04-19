package labJunit.app;

public class Main {

	public static void main(String[] args) {
		Calculatrice c = new Calculatrice();
		
		double s = c.somme(10, 20);
		System.out.println("La somme de 10 et 20 : "+s);
		
		double p = c.produit(10, 20);
		System.out.println("Le produit de 10 et 20 : "+p);

		CompteBancaire cb = new CompteBancaire();

		cb.crediterSolde(1000);

		System.out.println("Solde après crédit de 1000 : "+cb.getSolde());

		cb.debiterSolde(500);

		System.out.println("Solde après débit de 500 : "+cb.getSolde());
	}
}
