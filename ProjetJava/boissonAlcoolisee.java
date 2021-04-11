
public class boissonAlcoolisee extends Boisson{
	

	private double DegreAlcool;
	
	public boissonAlcoolisee(double prix, double contenance, String nom,  double degreAlcool) {
		super(prix, contenance, nom);

		DegreAlcool = degreAlcool;
	}


	public double getDegreAlcool() {
		return DegreAlcool;
	}

	public void setDegreAlcool(double degreAlcool) {
		DegreAlcool = degreAlcool;
	}
	
	
	
	
	
	

}
