public abstract class Livre implements Empruntable {
    protected String titre;
    protected String auteur; // Corrected typo
    protected double prix;
    protected boolean disponible; // Corrected typo
  public static boolean test = true;
    public Livre(String titre, String auteur, double prix) {
        test = true;
	  this.titre = titre;
        this.auteur = auteur;
        this.prix = prix;
        this.disponible = test;
    }

    // Getters and setters...

    public void setDespo(boolean disponible) { // Corrected method name
        this.disponible = disponible;
    }

    public void AfficherDetail() {
        System.out.println("titre: " + titre);
        System.out.print("auteur: " + auteur+",");
        System.out.print("prix: " + prix+",");
        System.out.print("disponible: " + disponible+",");
    }

    public void Emprunter() {
        try {
            if (this.disponible) {
                test = false;
                this.disponible = false;
                System.out.println("Le livre " + this.titre + " a été emprunté");
            } else {
                throw new LivreNonDisponibleException("Le livre " + this.titre + " n'est pas disponible pour l'emprunt.");
            }
        } catch (LivreNonDisponibleException e) {
            System.out.println(e.getMessage());
        }
    }

    public void Retourne() {
    	test =false;
        this.disponible = true;
        System.out.println("le livre"+ this.titre+"a ete retuorne ");

    }
    public static class LivreNonDisponibleException extends Exception {
        public LivreNonDisponibleException(String message) {
            super(message);
        }
    }
}

