
public class boissonNonAlcoolisee extends Boisson{


		private double DegreSucre;
		
		public boissonNonAlcoolisee(double prix, double contenance, String nom, double degreSucre) {
			super(prix, contenance, nom);

			DegreSucre = degreSucre;
		}


		public double getDegreSucre() {
			return DegreSucre;
		}

		public void setDegreSucre(double degreSucre) {
			DegreSucre = degreSucre;
		}
		

	
	
	
}
