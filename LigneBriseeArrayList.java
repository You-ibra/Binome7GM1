import java.util.ArrayList;

public class LigneBriseeArrayList {

	private ArrayList<Point> liste= new ArrayList<Point>();

	public LigneBriseeArrayList(ArrayList<Point> liste) {
		if (liste.size()<2){
			throw new ArithmeticException("La liste doit contenir au moins 2 points !!!" ); 
		}
		else {
		this.liste = liste;
		}
	}

	public ArrayList<Point> getListe() {
		return liste;
	}

	public void setListe(ArrayList<Point> liste) {
		this.liste = liste;
	}

	@Override
	public String toString() {
		return "LigneBriseeArrayList [liste=" + liste + "]";
	}



	public boolean contientPoint(Point p) {
		for( Point p1 : liste) {
			if(p1.equals(p))
				{ 		
					return true;
				}
			
		}
		return false;
	}
	
	public void addPoint(Point p1) {
		if(!contientPoint(p1)) {
			liste.add(p1);
		}
		else{
			System.out.println("Le point appartient déja à la liste ! :)");
		}
		
	}
	
	public int nbPoints() {
		return(liste.size());
	}
	
	public void deletePoint(Point p1) {
		liste.remove(p1);
	
	}
	
	
}
