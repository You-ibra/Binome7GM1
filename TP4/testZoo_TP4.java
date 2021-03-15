
public class testZoo {

	public static void main(String[] args) {

		
		Zoo EISTI = new Zoo("EISTI");
		Regime r1=new Regime("light",40,60);
		Canard Julie = new Canard("Julie",15,r1,"rouge","c1");
		Canard Sahar = new Canard("Sahar",17,r1,"bleu","c2");
		Canard Nicolas = new Canard("Nicolas",35,r1,"marron","c3");
		Vachee Benoit = new Vachee("Benoit",40,r1,6,"c4");
		Canard Sebastien = new Canard("Sebastien",20,r1,"rouge","c5");
		Canard Sylvain = new Canard("Sylvain",12,r1,"vert","c6");
		Canard Catherine= new Canard("Catherine",14,r1,"violet","c7");
		EISTI.ajouterAnimal(Julie);
		EISTI.ajouterAnimal(Sahar);
		EISTI.ajouterAnimal(Benoit);
		EISTI.ajouterAnimal(Nicolas);
		EISTI.ajouterAnimal(Sebastien);
 		EISTI.ajouterAnimal(Sylvain);
		EISTI.ajouterAnimal(Catherine);

		EISTI.crier();
		
		
		
		
	}

}
