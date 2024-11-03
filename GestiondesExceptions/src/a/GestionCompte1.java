import java.util.InputMismatchException;
import java.util.Scanner;

public class GestionCompte1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Compte compte = new Compte(500);

        try {
            System.out.print("Entrez un montant à retirer : ");
            double montant = scanner.nextDouble();

            if (montant < 0) {
                throw new MontantNegatifException("Erreur : Le montant à retirer ne peut pas être négatif.");
            }

            compte.retirer(montant);
            System.out.println("Retrait réussi. Nouveau solde : " + compte.getSolde());
            
        } catch (MontantNegatifException e) {
            System.out.println(e.getMessage());
        } catch (SoldeInsuffisantException e) {
            System.out.println("Erreur : Solde insuffisant !");
        } catch (InputMismatchException e) {
            System.out.println("Erreur : Vous devez entrer un nombre valide.");
        } finally {
            System.out.println("Bloc finally : Opération terminée.");
        }

        scanner.close();
    }
}
