
public class Regime {
	String nom;
	float prix;
	int poids;
	
	
	
	public Regime(String nom, float prix, int poids) {
		this.nom = nom;
		this.prix = prix;
		this.poids = poids;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public float getPrix() {
		return prix;
	}
	public void setPrix(float prix) {
		this.prix = prix;
	}
	public int getPoids() {
		return poids;
	}
	public void setPoids(int poids) {
		this.poids = poids;
	}
	
	
	
	
	
}
