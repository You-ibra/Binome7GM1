
public class Constante extends ExpAbstraite {
	
	private double valeur;
	
	


	public Constante(double valeur) {
		super();
		this.valeur = valeur;
	}




	public double getValeur() {
		return valeur;
	}


	
	
	public String toStringInfixe() {
		return "La valeur est"+ this.valeur;
		
		
	}


	public double evaluer(Env env) {
		return this.valeur;
	}
	
	
}
