
public class Vachee extends Animal{

	private int nbTacheCouleur;
	private String genre;
	private static Regime regime= new Regime ("Poulet",15,30);


	public Vachee(String nom, int poids, Regime regime, int nbTacheCouleur, String genre) {
		super(nom, poids, regime);
		this.nbTacheCouleur = nbTacheCouleur;
		this.genre = genre;
	}


	public int getNbTacheCouleur() {
		return nbTacheCouleur;
	}


	public void setNbTacheCouleur(int nbTacheCouleur) {
		this.nbTacheCouleur = nbTacheCouleur;
	}


	public String getGenre() {
		return genre;
	}


	public void setGenre(String genre) {
		this.genre = genre;
	}



	@Override
	public String crier() {
		// TODO Auto-generated method stub
		return super.crier() + " la vache a " + getNbTacheCouleur() +" taches qui tachent, il crie... il meugle" ;
	}


	

	
}
