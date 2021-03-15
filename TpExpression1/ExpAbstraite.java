
public abstract class ExpAbstraite {

    abstract public String toStringInfixe();

	@Override
	public String toString() {
		return "Je suis une expression et me voila en notation infixée" +    toStringInfixe()    ;
	}

	

	
	public abstract double evaluer(Env env);
		
		

	
	
	
}
