public class LivrePapier extends Livre {
    private int nombreDePages; // Corrected variable name

    public LivrePapier(String titre, String auteur, double prix, int nombreDePages) {
        super(titre, auteur, prix);
        this.nombreDePages = nombreDePages; // Corrected variable name
    }
    public int getNombr() {
    	return nombreDePages;
    }
    public void setNombre(int nombreDePages) {
      this.nombreDePages=nombreDePages;
    }

    public void AfficherDetail() {
        super.AfficherDetail();
        System.out.println("nombre de pages: " + nombreDePages); // Corrected variable name
    }
}
