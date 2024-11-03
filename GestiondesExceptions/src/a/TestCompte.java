package a;

public class TestCompte {
	public static void main(String[] args) {
        Compte compte = new Compte(500);

        try {
            compte.retirer(-100);
        } catch (MontantNegatifException e) {
            System.out.println(e.getMessage());
        }
    }
}
