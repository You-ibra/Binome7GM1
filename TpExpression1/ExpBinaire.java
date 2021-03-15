
public abstract class ExpBinaire extends ExpAbstraite{

	private ExpAbstraite opGauche;
	private ExpAbstraite opDroite;
	
	
	
	public ExpBinaire(ExpAbstraite opGauche, ExpAbstraite opDroite) {
		super();
		this.opGauche = opGauche;
		this.opDroite = opDroite;
	}

	public ExpAbstraite getOpGauche() {
		return opGauche;
	}

	public ExpAbstraite getOpDroite() {
		return opDroite;
	}

	@Override
	public String toString() {
		return "ExpBinaire [opGauche=" + opGauche + ", opDroite=" + opDroite + "]";
	}


	
	
	
}
