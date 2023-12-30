import java.util.List;

public class UtilaterBibliotheque extends Bibliotique {

    public void Recherche(String auteur) {
        System.out.println("livre cree par " + auteur); // Corrected variable name

        for (Livre l : super.getLVE()) {
            try {
                if (l.auteur.equals(auteur)) {
                    if (l instanceof LivreNumerque) { // Corrected syntax
                        System.out.println("livre numerique");
                        ((LivreNumerque) l).AfficherDetail(); // Corrected syntax
                    } else if (l instanceof LivrePapier) { // Corrected syntax
                        System.out.println("LivrePapier");
                        l.AfficherDetail(); // Corrected variable name
                    }
                }
            } catch (NullPointerException e) {
                // Handle the exception (e.g., print an error message)
                System.err.println("Error: Auteur is null for a book.");
            }
        }
    }
}
