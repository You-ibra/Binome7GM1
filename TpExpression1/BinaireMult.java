
public  class BinaireMult extends ExpBinaire{

	public BinaireMult(ExpAbstraite opGauche, ExpAbstraite opDroite) {
		super(opGauche, opDroite);
		// TODO Auto-generated constructor stub
	}

	
	public String toStringInfixe(){
		
		return super.getOpGauche().toStringInfixe()+ "*" + super.getOpDroite().toStringInfixe();
		
	}
	
	
	public double evaluer(Env env) {
		return super.getOpGauche().evaluer(env)* super.getOpDroite().evaluer(env);
}

	
	
	
	
}
