
public class LivreNumerque extends Livre implements IntLivreNumerique{
 private double taile;
 public LivreNumerque (String titre, String auteur, double prix ,double taile) {
	 super(titre, auteur, prix);
	 this.taile=taile;
 }
 public double getTaile() {
	 return taile;
 }
 public void setTaile(double taile) {
	 this.taile=taile;
 }
 public void AfficherDetail() {
     super.AfficherDetail();
     System.out.println("taille de livre: " + taile); // Corrected variable name
 }
 public void Telecharge() {
     System.out.println("livre est en coure de telechargement"); // Corrected variable name

 }
}
