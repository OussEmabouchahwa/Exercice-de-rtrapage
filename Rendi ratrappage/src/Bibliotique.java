import java.util.ArrayList;
import java.util.List;

public class Bibliotique {
    private List<Livre> LV;

    public Bibliotique() {
        LV = new ArrayList<>();
    }

    public List<Livre> getLVE() {
        return LV;
    }

    public void setLVE(List<Livre> LV) {
        this.LV = LV;
    }
    public void Ajouter(Livre a) {
    	LV.add(a);
    }

    public void AfficherCatalogue() {
        for (Livre item : LV) {
            item.AfficherDetail();
        }
    }
   
}
