
import java.util.*;
public class Env {

	private Map<String, Double> tableau = new HashMap<String, Double>();

	public Env(Map<String, Double> tableau) {
		super();
		this.tableau = tableau;
	}

	public Map<String, Double> getTableau() {
		return tableau;
	}

	public void associer(String nom, double valeur) {
		tableau.put(nom, valeur);
		
		
		
	}
	
	public double obtenirValeur(String nom) {
		if(tableau.containsKey(nom)) {
			return tableau.get(nom)	;
		}
		
	}
	

	@Override
	public String toString() {
		return "Env [tableau=" + tableau + "]";
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
}
