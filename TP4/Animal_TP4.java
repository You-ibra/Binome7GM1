
public class Animal {
	
	private String nom;
	private int poids;
	private Regime regime;
	
	

	public Animal(String nom, int poids, Regime regime) {
		super();
		this.nom = nom;
		this.poids = poids;
		this.regime = regime;
	}

	
	public String getNom() {
		return nom;
	}




	public void setNom(String nom) {
		this.nom = nom;
	}




	public int getPoids() {
		return poids;
	}




	public void setPoids(int poids) {
		this.poids = poids;
	}




	public Regime getRegime() {
		return regime;
	}




	public void setRegime(Regime regime) {
		this.regime = regime;
	}



	public String crier() {
		return(this.nom  + " crie");
		
	}
	
	public String toString() {
		return(" le nom de l'animal est : " + this.nom+ "son poids est " + this.poids );
		
	}
	
	public float calculPrix() {
		return(regime.getPrix()*regime.getPoids());
	}
	
	

	
	
}
