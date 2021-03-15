
import java.util.LinkedList ;

public class Zoo {
	
	private String nom ;
	private LinkedList < Animal > animaux ;
	float coutGlobal;
	
	
	public Zoo ( String nom ) {
	this.nom = nom ;
	animaux = new LinkedList < Animal >() ;
	}
	public int getNbAnimaux () {
	return animaux.size () ;
	}
	public void ajouterAnimal ( Animal animal ) {
	animaux.add(animal);
	}
	public void crier () {
	for ( Animal a : animaux ) {
	System.out.println(a.crier());
	}
	}
	@Override
	public String toString () {
	return " Le zoo " + nom + " contient : " + animaux ;
	}
	
	public float coutGlobal() {
		for(Animal a : animaux) {
			coutGlobal=coutGlobal+a.calculPrix();
			
		}
		return coutGlobal;
	}
	
}
