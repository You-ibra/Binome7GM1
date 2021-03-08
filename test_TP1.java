
public class test {

	public static void main(String[] args) {
		
		Rational fraction = new Rational(24,12); //On peut mettre un denom=0
		System.out.println("le numerateur est " + fraction.getNum()+ " le denominateur est " + fraction.getDenom());
		System.out.println(fraction);
		
		Rational fraction1 = new Rational(1,3);
		fraction1.mult(fraction);
		System.out.println(fraction1);

		fraction1.add(fraction);
		System.out.println(fraction1);
		}

}
