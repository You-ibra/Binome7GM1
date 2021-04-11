import java.util.*;
public class Cocktail extends Boisson {

	 private String nom;
	 private double contenance;
	 private List<Boisson> boissons;


//getters 	   
	
	 public String getNom(){
	        return this.nom;
	    }

	 public double getContenance(){
	        return this.contenance;
	    }


    public List<Boisson> getBoissons() {
        return boissons;
    }

 


	public Cocktail(double prix, double contenance, String nom,  List<Boisson> boisson
			) {
		super(prix, contenance, nom);
		this.boissons = boisson;

	}

	@Override
    public String toString() {
    String cocktail;
    String composition;
    cocktail = "(" +"Cocktail " + "Nom : " + getNom() + ", Contenance : " + getContenance() + " ml, Prix : " + getPrix() + " €)";
    System.out.println("Composition : ");
    composition = "(";
    for(Boisson boissons : this.boissons){
        composition += boissons.getNom() + ",";
    }
    composition += ")";
    System.out.println(cocktail);
    return composition;
    }

 

    public double getPrix(){
        double prix = 0;
        for(Boisson boissons : this.boissons){
            prix += boissons.getPrix();
        }
        prix = prix*(1+10/100);
        return prix;
    }
    
//    public boolean Possibilite(HashMap<Boisson, Integer>) {
//    	
//        boolean disponibilite=true;
//        Iterator it = stockBoisson.entrySet().iterator();
//        while (disponibilité && it.hasnext()) {
//            if(!stockBoisson.containsKey())
//               {
//                   disponible= false;
//               }
//               else
//               {
//                   i+= 1;
//               }
//            return disponible;
//    	}
//
//    }
// 
//
    
    
    
    public double getDegAlcool(){
    	float degAlcool=0;
    	for (int i=0;i<this.boissons.size();i++) {
    		if(boissons.get(i) instanceof boissonAlcoolisee ) {
    			boissonAlcoolisee b = (boissonAlcoolisee) boissons.get(i);
    			
    			degAlcool+=b.getDegreAlcool(); 
    		}
    		
    	}
    	return degAlcool;

    }

 

    public double getDegSucre(){
    	float degSucre=0;
    	for (int i=0;i<this.boissons.size();i++) {
    		if(boissons.get(i) instanceof boissonNonAlcoolisee) {
    			boissonNonAlcoolisee b= (boissonNonAlcoolisee) boissons.get(i);
    			degSucre+=b.getDegreSucre(); 
    		}
    		
    	}
    	return degSucre;
    	
    	
    }

    public String getNomA(boissonAlcoolisee b) {
    	return b.getNom();
    	
    }

    public String getNomN(boissonNonAlcoolisee b) {
    	return b.getNom();
    	
    }

        
    
}
 
