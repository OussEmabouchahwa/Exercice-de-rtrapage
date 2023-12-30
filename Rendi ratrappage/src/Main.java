
public class Main {

	public static void main(String[] args) {
		Bibliotique b =new Bibliotique();
		LivrePapier l1= new LivrePapier("clean code","Robert",39.99,400);
		LivreNumerque l2= new LivreNumerque("designe patterns","erich gamma",29.99,10);
		b.Ajouter(l1);
		b.Ajouter(l2);
		b.AfficherCatalogue();
		l1.Emprunter();
		b.AfficherCatalogue();
		l2.Emprunter();
		b.AfficherCatalogue();
		l1.Retourne();
		b.AfficherCatalogue();
		UtilaterBibliotheque c = new UtilaterBibliotheque();
		c.Ajouter(l1);
		c.Ajouter(l2);
		c.Recherche("Robert");
		
		

	}

}
