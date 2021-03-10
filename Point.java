
public class Point implements Comparable<Point>{
	 private int x; 
	 private int y;
	 private static int compteur=0; 
	 
	public Point() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
		compteur++;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public static int getCompteur() {
		return compteur;
	}
	public static void setCompteur(int compteur) {
		Point.compteur = compteur;
	}
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Point))
			return false;
		Point other = (Point) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}

	
    public int compareTo(Point pt) {
        if(! pt.equals(this)) {
            double norme = Math.sqrt(this.x*this.x + this.y*this.y) ;
            double normePt =Math.sqrt( pt.getX()*pt.getX() + pt.getY()*pt.getY());
            if(norme >= normePt) {
                return 1;
            }
            if(norme < normePt) {
                return -1;
            }
        }
        return 0;
    }
	
	


}
