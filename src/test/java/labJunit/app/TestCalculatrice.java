package labJunit.app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCalculatrice {

	@Test
	void testSomme() {
		Calculatrice c = new Calculatrice();
		assertEquals(4,c.somme(1, 3));
	}

	@Test
	void testProduit() {
		Calculatrice c = new Calculatrice();
		assertEquals(6,c.produit(2, 3));
	}
}
