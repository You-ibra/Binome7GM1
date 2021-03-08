

public class Rational {
	
	public int num;
	public int denom;
	
	public int pgcd(int a, int b) {
		if (b==0)
		{
			return a;
		}
		else {
			return pgcd(b, a%b );
		}
		
	}

	public Rational(int nume, int denomi) {
		 if (denomi==0) {
			 throw new ArithmeticException("Erreur, le denominateur ne peut pas être nul" ); 
		 }
		else 
		{
			if (pgcd(nume, denomi)==1)
				{
				this.num=nume;
				this.denom=denomi;
				}
			else
			{
				this.num=nume/pgcd(nume,denomi);
				this.denom=denomi/pgcd(nume,denomi);
			}
		}
	}
	public int getNum() {
		return(this.num);
	
	}
	public int getDenom() {
		return(this.denom);
	}
	
		
	public String toString() {
		return(this.getNum()+"/"+ this.getDenom() );
	}
	
	public void mult(Rational frac) {
		this.num=frac.num*this.num;
		this.denom=frac.denom*this.denom;
		
	}
	
	public void add(Rational frac) {
		this.num= (this.num)*(frac.denom) + (this.denom)*frac.num;
		this.denom=this.denom*frac.denom;
	}
}
