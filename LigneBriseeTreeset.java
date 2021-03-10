

import java.util.Set;
import java.util.TreeSet;
public class LigneBriseeTreeset {

	Set<Point> arbre = new TreeSet<Point>();

	
	public LigneBriseeTreeset(TreeSet<Point> arbre1) {
		if (arbre1.size()<2){
			throw new ArithmeticException("La liste doit contenir au moins 2 points !!!" ); 
		}
		else {
		this.arbre = arbre1;
		}

	}
	
	
	public Set<Point> getArbre() {
		return arbre;
	}

	public void setArbre(Set<Point> arbre) {
		this.arbre = arbre;
	}



	@Override
	public String toString() {
		return "LigneBriseeTreeset [arbre=" + arbre + "]";
	}



		
		public void addPoint(Point p1) {
			if(! arbre.contains(p1)) {
				arbre.add(p1);
			}
			else{
				System.out.println("Le point appartient déja à la liste ! :)");
			}
		}
		
		
		
			public void deletePoint(Point p1) {
				arbre.remove(p1);
			
			}

	

	
	
	
	
	
}
