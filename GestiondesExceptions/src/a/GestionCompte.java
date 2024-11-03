package a;

public class GestionCompte {
	public static void main(String[] args) {
        Compte compte = new Compte(500);

        try {
            compte.retirer(600);
        } catch (SoldeInsuffisantException e) {
            System.out.println(e.getMessage());
        }
    }
}

