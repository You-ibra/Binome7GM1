
public class Canard extends Animal{
	
	private String CouleurPlume;
	private String genre;
	private static Regime regime= new Regime ("Viande",10,15);
	

	public Canard(String nom, int poids, Regime regime, String couleurPlume, String genre) {
		super(nom, poids, regime);
		CouleurPlume = couleurPlume;
		this.genre = genre;
	}
	public String getCouleurPlume() {
		return(this.CouleurPlume);
	}
	public String getGenre() {
		return(this.genre);
	}
	@Override
	public String crier() {
		
		return super.crier()+" ce Canard de" + getPoids()+ "kg aux belles plumes" + getCouleurPlume() + getGenre();
	}


	
	
}
