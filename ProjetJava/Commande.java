
import java.util.HashMap;


public class Commande {

	 private int numero;
	 private HashMap<Boisson, Integer> commandeDeBoissons= new HashMap<Boisson,Integer>();
	 private HashMap<Cocktail, Integer> commandeDeCocktails = new HashMap<Cocktail,Integer>();
	
	 public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public HashMap<Boisson, Integer> getCommandeDeBoissons() {
		return commandeDeBoissons;
	}
	public void setCommandeDeBoissons(HashMap<Boisson, Integer> commandeDeBoissons) {
		this.commandeDeBoissons = commandeDeBoissons;
	}
	public HashMap<Cocktail, Integer> getCommandeDeCocktails() {
		return commandeDeCocktails;
	}
	public void setCommandeDeCocktails(HashMap<Cocktail, Integer> commandeDeCocktails) {
		this.commandeDeCocktails = commandeDeCocktails;
	}
	
	public Commande(int numero) {
		super();
		this.numero = numero;
	}
	

	public int getNbBoissonsTotal() {
		int compteur=0;
		for (HashMap.Entry<Boisson, Integer> entree : commandeDeBoissons.entrySet()) {
			
			compteur+=entree.getValue();
		}
		return compteur;
	}
	
	
	public int getNbCocktailsTotal() {
		int compteur=0;
		for (HashMap.Entry<Cocktail, Integer> entree : commandeDeCocktails.entrySet()) {
			
			compteur+=entree.getValue();
		}
		return compteur;
	}
	
	public int getNbBoissons(Boisson b) {
		return commandeDeBoissons.get(b);
		
	}
	
	public int getNbCocktails(Cocktail c) {
		return commandeDeCocktails.get(c);
		
	}
	
	public void ajouterBoisson(Boisson b, int quantitee) {
		
			if(this.commandeDeBoissons.containsKey(b)) {
				commandeDeBoissons.put(b, commandeDeBoissons.get(b)+quantitee);
				
			}
			else {
				
				commandeDeBoissons.put(b,quantitee);
			}
		}
		
	
	
	public void ajouterCocktail(Cocktail c, int quantitee) {
		
			if(this.commandeDeBoissons.containsKey(c)) {
				commandeDeBoissons.put(c, commandeDeBoissons.get(c)+quantitee);
				
			}
			else {
				
				commandeDeBoissons.put(c,quantitee);
			}
		}
		
	
	
	public void afficherCommande() {
		System.out.println("Le numero de commande est le "+ this.numero );
		System.out.println(" Voici les boissons composant votre commande et leur quantitée associée" );
		int compteur=1;
		int compteurbis=1;
		
		for (HashMap.Entry<Boisson, Integer> entree : commandeDeBoissons.entrySet()) {
			System.out.println("Boisson n°"+compteur+ " nom : "+ entree.getKey() + "quantitée"+ entree.getValue());
			
		}
		for (HashMap.Entry<Cocktail, Integer> entree1 : commandeDeCocktails.entrySet()) {
			System.out.println("Cocktail n°"+  compteurbis+ " nom : "+ entree1.getKey() + "quantitée"+ entree1.getValue());
			
		}
		PrixCommande();
		
	}
	
	public void AnnulerCommande() {
		commandeDeBoissons.clear();
		commandeDeCocktails.clear();
		
	}
	
	public void PrixCommande() {
		float prixTotal=0;
		System.out.println("Le prix de la commande est de :");
		if(commandeDeBoissons.size()+commandeDeCocktails.size() ==0) {
			System.out.println("0 $");}
		
		else {
			for (HashMap.Entry<Boisson, Integer> entree : commandeDeBoissons.entrySet()) {
				
			prixTotal+= ( entree.getKey() ).getPrix()*entree.getValue();
			
		}
			for (HashMap.Entry<Cocktail, Integer> entree1 : commandeDeCocktails.entrySet()) {
				
				prixTotal+= ( entree1.getKey() ).getPrix()*entree1.getValue();
				
			}
			
			System.out.println(prixTotal);	
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
