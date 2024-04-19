package labJunit.app;

public class CompteBancaire {
    private double solde;

    public void debiterSolde (double montant) {
        solde -= montant;
    }

    public void crediterSolde (double montant) {
        solde += montant;
    }

    public double getSolde() {
        return solde;
    }
}
