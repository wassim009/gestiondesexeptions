package a;

public class MontantNegatifException  extends Exception {
	    public MontantNegatifException(String message) {
	        super(message);
	    }
	}

	class Compte {
	    private double solde;

	    public Compte(double soldeInitial) {
	        this.solde = soldeInitial;
	    }

	    public void verser(double montant) throws MontantNegatifException {
	        if (montant < 0) {
	            throw new MontantNegatifException("Erreur : Le montant à verser ne peut pas être négatif.");
	        }
	        solde += montant;
	    }

	    public void retirer(double montant) throws MontantNegatifException {
	        if (montant < 0) {
	            throw new MontantNegatifException("Erreur : Le montant à retirer ne peut pas être négatif.");
	        }
	        solde -= montant;
	    }

	    public double getSolde() {
	        return solde;
	    }
	}
}
