
public class Variable extends ExpAbstraite{
	
	private String nom;

	
	
	public Variable(String nom) {
		super();
		this.nom = nom;
	}




	public String getNom() {
		return nom;
	}


	
	
	public String toStringInfixe() {
		return this.nom;
		
		
	}

	public double evaluer(Env env) {
		
		return env.obtenirValeur(nom);
	}
	
}
	
	
	

