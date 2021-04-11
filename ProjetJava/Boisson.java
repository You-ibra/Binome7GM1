
public class Boisson {

	private double prix;
	private double contenance;
	private String nom ;
	
	//getters and setters
	


	public double getPrix() {
		return prix;
	}
	
	public Boisson(double prix, double contenance, String nom) {
		super();
		this.prix = prix;
		this.contenance = contenance;
		this.nom = nom;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}
	
	public double getContenance() {
		return contenance;
	}
	
	public void setContenance(double contenance) {
		this.contenance = contenance;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "Boisson : " + this.getNom() +
				this.getPrix() + "€ les" + this.getContenance() + "mL."
				;
	}
	
	
	
}
