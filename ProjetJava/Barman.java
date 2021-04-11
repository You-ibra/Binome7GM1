import java.util.*;
import java.util.HashMap;
import java.io.IOError;
import java.util.Scanner;


public class Barman {


	public HashMap<String,Boisson> listBoissons= new HashMap<String,Boisson>();
	public HashMap<String, Cocktail> listCocktails= new HashMap<String,Cocktail>();
	private HashMap<String, Integer> stock= new HashMap<String, Integer>();
	
	
	private int getStock(Boisson b) {
		String nom= b.getNom();
		if(!stock.containsKey(nom))
			return 0;
		else {
			return stock.get(nom);
			
		}
			
	}
	private int getStockC(Cocktail c) {
		String nom= c.getNom();
		if(!stock.containsKey(nom))
			return 0;
		else {
			return stock.get(nom);

		}
			
	}
	private void AfficherBoissonsdispo(HashMap<String,Boisson> listBoissons) {
		
		for(Map.Entry<String,Boisson> m:listBoissons.entrySet() ) {
			if((getStock(m.getValue()))>0) { // il faut que je définisse getStock
				System.out.println("Boisson: "+ m.getValue().getNom() + "prix : " + m.getValue().getPrix());
			}
		}
	}
	private void AfficherCocktailsdispo(HashMap<String,Cocktail> listCocktails) {
		
		for(Map.Entry<String,Cocktail> m: listCocktails.entrySet() ) {
			if((getStockC(m.getValue()))>0) { // il faut que je définisse getStock
				System.out.println("Cocktail: "+ m.getValue().getNom() + "prix : " + m.getValue().getPrix());
			}
		}
	}
	
	
	
	public void AfficherLaCarte(){
		System.out.println(" Voici les boissons qui sont disponibles ainsi que les prix associées : ");
		AfficherBoissonsdispo(listBoissons);
		System.out.println(" Voici les Cocktails qui sont disponibles ainsi que les prix associées : ");
		AfficherCocktailsdispo(listCocktails);
		
	}
	
	 private static String lireInfo() {
			 String infoLue;
			 Scanner s = new Scanner(System.in);
			 infoLue = s.nextLine();
			 s.close();
			return infoLue;
	 }

	

	public void AjouterBoissonStock(Boisson b, int quantitee) {
		String boissonAdd= b.getNom();
		if( stock.containsKey(boissonAdd)) {
			
			stock.put(boissonAdd,stock.get(boissonAdd)+quantitee);
			
		}
		else {
			listBoissons.put(b.getNom(), b);
			stock.put(boissonAdd, quantitee);
			
		}
	}
	
	public void supprimerBoissonStock() {
		System.out.println("Quelle boisson voulez vous supprimer?");
		String boissonDel= lireInfo();
		if( stock.containsKey(boissonDel)) {
			
			stock.remove(boissonDel);
			
		}
	}
	public void AjouterCocktailStock(Cocktail c, int quantitee) {
		String cocktailAdd= c.getNom();
		if( stock.containsKey(cocktailAdd)) {
			
			stock.put(cocktailAdd,stock.get(cocktailAdd)+quantitee);
			
		}
		else {
			stock.put(cocktailAdd, quantitee);
			listCocktails.put(c.getNom(), c);
			
		}
	}
	public void supprimerCocktailStock() {
		System.out.println("Quelle Cocktail voulez vous supprimer?");
		String cocktailDel= lireInfo();
		if( stock.containsKey(cocktailDel)) {
			
			stock.remove(cocktailDel);
			
		}
	}
	
	public void modifPrixBoisson(Boisson b, float prix) {
		
		if(listBoissons.containsValue(b)) {
			
			b.setPrix(prix);
		}
		
	}
	
	public void modifNomBoisson(Boisson b, String nom) {
		
		if(listBoissons.containsKey(b.getNom())) {
			
			b.setNom(nom);
		}
		
	}
	
	public void modifNomCocktail(Cocktail c, String nom) {
		
		if(listCocktails.containsKey(c.getNom())) {
			
			c.setNom(nom);
		}
		
	}

	public void modifPrixCocktail(Cocktail c, float prix) {
		
		if(listBoissons.containsValue(c)) {
			
			c.setPrix(prix);
		}
		
	}
	
	public HashMap<Boisson,Integer> ComposerCocktail() 
	{
		
		System.out.println(" Voici la liste des boissons disponibles ");
		AfficherBoissonsdispo(listBoissons);
		boolean vouloir= true;
		HashMap<Boisson,Integer> boissonVoulues=new HashMap<Boisson, Integer>();
	
		while(vouloir)
		{
			System.out.println("Quelle Boisson voulez vous? si vous n'en voulez plus ecrivez fin");
			String choix= lireInfo();	
			if(choix=="fin") {
				
				vouloir=false;
			}
			else {
				if(listBoissons.containsKey(choix)) {
					
					System.out.println("Quelle est la quantitée voulue?");
					int quantitee=lireNb();
					if(quantitee>getStock(listBoissons.get(choix))) {
						System.out.println("la quantitée maximale est "+ getStock(listBoissons.get(choix)));
						}
					else {
						boissonVoulues.put(listBoissons.get(choix),quantitee);
					}
				}
				else {
					System.out.println("Veuillez choisir une autre boisson");
					
				}
			}	
		}
		return boissonVoulues;
	}
	
	public void AjouterBoisson(Commande commande, Boisson b, int quantitee) {
		String boisson= b.getNom();
		if(stock.get(boisson)>0) {
			
			if(quantitee>stock.get(boisson)) {
				
				System.out.println("Il n'y a que "+ stock.get(boisson)  +" "+ boisson + "dans le stock");
				
			}
			else {
				
				commande.ajouterBoisson( listBoissons.get(boisson), quantitee);
			}
		}
		else {
			System.out.println("La boisson entrée n'est pas disponible");
			
		}
	}
		
		public void AjouterCocktail(Commande commande, Cocktail c, int quantitee) {

			String cocktail= c.getNom();
			if(stock.get(cocktail)>0) {
				
				if(quantitee>stock.get(cocktail)) {
					
					System.out.println("Il n'y a que "+ stock.get(cocktail)  +" "+ cocktail + "dans le stock");
					
				}
				else {
					
					commande.ajouterCocktail( listCocktails.get(cocktail), quantitee);
				}
			}
			else {
				System.out.println("Le cocktail entré n'est pas disponible");
				
			}
	}

    private static int lireNb() {
		 int nbLu;
		 Scanner s = new Scanner(System.in);
		 nbLu = s.nextInt();
		 s.close();
		 return nbLu;
		 

	}
    
    int i=2; 
    		
	public Commande passerCom() {
		
		Commande com = new Commande( i++);
		AfficherLaCarte();
		boolean encore = true;
		while (encore) {
			System.out.println("Quelle boisson voulez-vous ajouter ? (tapez fin pour terminer la commande)");
			String lu = lireInfo();
				if (lu=="fin") {
					encore=false;
				}
				else {
					if (stock.containsKey(lu)) {
						
						System.out.println("Quelle quantitée voulez vous?");
						int qte3= lireNb();
						if(qte3<=stock.get(lu)) {
							com.ajouterBoisson(listBoissons.get(lu), qte3);
							System.out.println("Ajout effectué");
						}
						else {
							System.out.println("L'ajout n'a pas été effectué");
						}
				}
					else {
						System.out.println("Veuillez choisir une boisson proposée");
					}
			}}
		return com;
	}
    
    
    
    public void ajouterBoissonAlcoolisee( boissonAlcoolisee boisson, int quantitee) {
		if (stock.get(boisson.getNom())>0) {
			stock.put(boisson.getNom(),stock.get(boisson.getNom())+quantitee);
		}
		else {
			stock.put(boisson.getNom(), quantitee);
		}
	}
	public void ajouterBoissonNonAlcoolisee(boissonNonAlcoolisee boisson, int quantitee) {
		if (stock.get(boisson.getNom())>0) {
			stock.put(boisson.getNom(),stock.get(boisson.getNom())+quantitee);
		}
		else {
			stock.put(boisson.getNom(), quantitee);
		}
	}


	
	public void MajStockApresCommande(Commande maCommande) {
		
		if (maCommande.getNbBoissonsTotal()>0 || maCommande.getNbCocktailsTotal()>0) {
			
			for( String nomBoisson: stock.keySet() ) {
				float qte =  stock.get(nomBoisson) - maCommande.getNbBoissons(listBoissons.get(nomBoisson));
				if(qte<0) {
					System.out.println("Les quantitées présentes dans le stock ne sont pas suffisantes");
				}
				else {
					int quantitee= (int) qte;
					stock.put(nomBoisson, quantitee);
				}
			}
			for( String nomCocktail: stock.keySet() ) { 
			
				float qte =  stock.get(nomCocktail) - maCommande.getNbCocktails(listCocktails.get(nomCocktail));
				if(qte<0) {
					System.out.println("Les quantitées présentes dans le stock ne sont pas suffisantes");
				}
				else {
					int quantitee= (int) qte;
					stock.put(nomCocktail, quantitee);
				}
			
		}
		
	}
	
}
	public boolean validerLaCommande(Commande maCommande) {
		
		boolean valider=true;
		for(Boisson b: maCommande.getCommandeDeBoissons().keySet()) {
			if(getStock(b)>= maCommande.getNbBoissons(b)){
				
				valider=true;
			}
			else {
				valider=false;
				return valider;
			}
		}
		for(Cocktail c: maCommande.getCommandeDeCocktails().keySet()) {
			if(getStockC(c)>= maCommande.getNbCocktails(c)){
					
					valider=true;
				}
				else {
					valider=false;
					return valider;
				}
			
		}
		return true;
		
		
		
	}

	public static void Facturer( Commande maCommande ) {
		
		maCommande.PrixCommande();
		
		
	}
	
public static void main(String[] args) {
		
		Barman barman= new Barman();
		Commande commande= new Commande(15);
		
		Boisson b1 = new Boisson(20,15,"coca");
		Boisson b2 = new Boisson(30,15,"fanta");
		Boisson b3 = new Boisson(45,5,"cafe");
		
		Cocktail c1= new Cocktail(25,10,"pina", new ArrayList<Boisson>( Arrays.asList(b1,b2)));
		Cocktail c2= new Cocktail(35,10,"colada", new ArrayList<Boisson>( Arrays.asList(b1,b2,b3)));
		 barman.listBoissons.put("coca", b1);
		 barman.listBoissons.put("fanta", b2);
		 barman.listBoissons.put("cafe", b3);
		 
		 barman.listCocktails.put("pina", c1);
		 barman.listCocktails.put("colada", c2);
		
		barman.AjouterBoissonStock(b1, 4);
		barman.AjouterBoissonStock(b2, 6);
		barman.AjouterBoissonStock(b3, 3);
		
		barman.AjouterCocktailStock(c2, 4);
		barman.AjouterCocktailStock(c1, 4);
		
		barman.AjouterBoisson(commande, b3, 2);
		barman.AjouterCocktail(commande, c2,3);
		int choix=-1;
		
		try {
			while (choix!=0) {
				afficherMenu();
				choix = saisieChoix(0,15);	
				System.out.println("\n--------------------------------------------");
				switch (choix){
					case 1 :  
						barman.AfficherLaCarte();
						break;
					case 2 :   
						barman.ComposerCocktail();
						break;
					case 3 :   
						Facturer(commande);
						break;									                    
					case 4 :   
						System.out.println( " De quelle boisson s'agit t-il?");
						String boisson= lireInfo();
						Boisson b= barman.listBoissons.get(boisson);
						System.out.println("Quelle est le nouveau nom de ?");
						String nom=lireInfo();
						barman.modifNomBoisson(b,nom);
						
						break;
					case 5 :
						System.out.println( " De quelle cocktail s'agit t-il?");
						String cocktail= lireInfo();
						Cocktail c= barman.listCocktails.get(cocktail);
						System.out.println("Quelle est le nouveau nom?");
						String nom1=lireInfo();
						barman.modifNomCocktail(c, nom1);
						break;
					case 6 :
						System.out.println( " De quelle boisson s'agit t-il?");
						String boisson1= lireInfo();
						Boisson bo1= barman.listBoissons.get(boisson1);
						System.out.println("Quel est le nouveau prix ");
						float nb1= saisieFloat();
						barman.modifPrixBoisson(bo1, nb1);
						break;
					case 7 :
						System.out.println( " De quelle cocktail s'agit t-il?");
						String cocktail1= lireInfo();
						Cocktail co1= barman.listCocktails.get(cocktail1);
						System.out.println("Quel est le nouveau prix de c1");
						Float nb= saisieFloat();
						barman.modifPrixCocktail(co1,nb);
						break;
					case 8 :
						System.out.println("Quel est le nom de la boisson que vous souhaitez ajouter ?");
						String nomB = lireInfo();
						if (!(barman.stock.containsKey(nomB))){
							System.out.println("Quel est le prix de la boisson que vous souhaitez ajouter ?");
							Float prix = saisieFloat();
							System.out.println("Quel est le stock de la boisson que vous souhaitez ajouter ?");
							int stock = lireNb();
							System.out.println("Quel est la contenance de la boisson que vous souhaitez ajouter ?");
							Float contenance=saisieFloat();
							Boisson boi = new Boisson(prix, contenance,nomB);
							barman.AjouterBoissonStock(boi, stock);
						}
						break;
					case 9 :
						barman.supprimerBoissonStock();
						break;
					case 10 :
						barman.supprimerCocktailStock();
						break;
					case 11 :
						System.out.println( "quelle boisson voulez vous ajouter à la commande?");
						String boisson3= lireInfo();
						Boisson bo3= barman.listBoissons.get(boisson3);
						System.out.println("Quel est la quantité de boisson ajoutée à la commande?");
						int qte2=lireNb();
						barman.AjouterBoisson(commande, bo3, qte2);
						
					break;
					case 12 :
						System.out.println("Quel est le nom de la boisson alcolisee que vous souhaitez ajouter ?");
						String nomAl = lireInfo();
						if (!(barman.stock.containsKey(nomAl))){
							System.out.println("Quel est le prix de la boisson que vous souhaitez ajouter ?");
							Float prix2 = saisieFloat();
							System.out.println("Quel est le stock de la boisson alcoolisee que vous souhaitez ajouter ?");
							int stock2 = lireNb();
							System.out.println("Quel est la contenance de la boisson que vous souhaitez ajouter ?");
							Float contenance=saisieFloat();
							System.out.println("Quel est le dégré d'alcool de la boisson alcoolisee que vous souhaitez ajouter ?");
							Float degreAlcool=saisieFloat();
							boissonAlcoolisee bA = new boissonAlcoolisee(prix2, contenance,nomAl, degreAlcool );
							barman.AjouterBoissonStock(bA, stock2);
						}
						
					break;
					case 13 :
						System.out.println("Quel est le nom de la boisson non alcolisee que vous souhaitez ajouter ?");
						String nomNAl = lireInfo();
						if (!(barman.stock.containsKey(nomNAl))){
							System.out.println("Quel est le prix de la boisson que vous souhaitez ajouter ?");
							Float prix1 = saisieFloat();
							System.out.println("Quel est le stock de la boisson non alcoolisee que vous souhaitez ajouter ?");
							int stock1 = lireNb();
							System.out.println("Quel est la contenance de la boisson que vous souhaitez ajouter ?");
							Float contenance=saisieFloat();
							System.out.println("Quel est le dégré de sucre de la boisson non alcoolisee que vous souhaitez ajouter ?");
							Float degreSucre=saisieFloat();
							boissonNonAlcoolisee bNA = new boissonNonAlcoolisee(prix1, contenance,nomNAl, degreSucre );
							barman.AjouterBoissonStock(bNA, stock1);
						}
					break;
					case 14 :
						commande.afficherCommande();
					break;
					case 15 :
						commande.PrixCommande();
					break;
					case 0 :   System.out.println("Vous avez quitté le menu");
						break;
				}
			}
			} catch (IOError e) {
				System.err.println("Erreur grave d'entrée/sortie, fin de l'application");
			} finally {
				// TODO : proposer une sauvegarde de la CDTheque si ce n'est pas
				// fait
			}
		}
		
		
	private static void afficherMenu() {
		System.out.println("");
		System.out.println("Menu :");
		System.out.println("(1) Afficher la carte");
		System.out.println("(2) Creer un cocktail");
		System.out.println("(3) Obtenir le prix de la commande");
		System.out.println("(4) Modifier le nom d'une boisson" );
		System.out.println("(5) Modifier le nom d'un cocktail");
		System.out.println("(6) Modifier le prix d'une boisson ");
		System.out.println("(7) Modifier le prix d'un cocktail");
		System.out.println("(8) Ajouter Boisson au stock");
		System.out.println("(9) Retirer une boisson du stock");
		System.out.println("(10) Retirer un cocktail du stock");
		System.out.println("(11) Ajouter Boisson à la commande" );
		System.out.println("(12) Ajouter Boisson alcoolisée au stock" );
		System.out.println("(13) Ajouter Boisson non alcoolisée au stock");
		System.out.println("(14) Afficher la commande");
		System.out.println("(15) Prix de la commande");
		System.out.println("(0) Quitter");
		System.out.println("");
	}
		
	private static int saisieChoix(int borneMin, int borneMax) {
		int choix = -1;
		boolean erreur;
		String lecture; // buffer de lecture clavier

		// lecture du choix jusqu'à ce qu'elle soit correcte
		do {
			try {
				erreur = false;
				lecture = lireInfo();
				choix = Integer.parseInt(lecture);
			} catch (NumberFormatException e) {
				// ce n'est pas un entier qui a été lu au clavier
				erreur = true;
			}
		} while (erreur || choix<0 || choix>11);
		return choix;
	}
	public static float saisieFloat(){
		boolean erreur;
		float choix = -1;
		String ISBN;
		do {
			try {
				erreur = false;
				ISBN = lireInfo();
				choix = Float.parseFloat(ISBN);
			} catch (NumberFormatException e) {
				erreur = true;
			}
		}while (erreur || choix<0);
		return choix;
	
	}
	
	public static void MenuClient() {
		
		Barman barman= new Barman();
        Commande maCommande = new Commande(47);
        
        System.out.println("Menu :");
		System.out.println("(1) Passer une commande");
		System.out.println("(2) Creer un cocktail");
		System.out.println("(3) annuler la commande ");
		System.out.println("(0) quitter le menu");
		

        int choix =saisieChoix(0,3);
        if(choix == 1){
            barman.passerCom();
        }
        else if(choix == 2){
            barman.ComposerCocktail();
        }
        else if(choix== 3) {
        	maCommande.AnnulerCommande();
        	
        }
        else if(choix==0) {
        	System.out.println("Vous quittez le menu, à la prochaine");
        	
        }
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
