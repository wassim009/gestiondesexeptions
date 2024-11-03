package a;

import java.util.Scanner;

public class ConversionEnEntier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un nombre : ");
        String saisie = scanner.nextLine();

        try {
            int nombre = convertirEnEntier(saisie);
            System.out.println("Nombre converti : " + nombre);
        } catch (NumberFormatException e) {
            System.out.println("Erreur : La saisie '" + saisie + "' n’est pas un nombre valide.");
        } finally {
            System.out.println("Bloc finally : Conversion terminée.");
        }

        scanner.close();
    }

    public static int convertirEnEntier(String nombre) throws NumberFormatException {
        return Integer.parseInt(nombre);
    }
}

