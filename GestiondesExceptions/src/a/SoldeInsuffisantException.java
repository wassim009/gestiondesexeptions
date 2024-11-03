package a;

public class SoldeInsuffisantException extends Exception {
	public SoldeInsuffisantException(String message) {
        super(message);
    }
}

class Compte {
    private double solde;

    public Compte(double soldeInitial) {
        this.solde = soldeInitial;
    }

    public void retirer(double montant) throws SoldeInsuffisantException {
        if (montant > solde) {
            throw new SoldeInsuffisantException("Erreur : Solde insuffisant !");
        }
        solde -= montant;
    }

    public double getSolde() {
        return solde;
    }
}

 
