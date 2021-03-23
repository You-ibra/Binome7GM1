import java.io.*;
public class copie {

	public static void main(String[] args) {
		
	}

		public static void copierFichier(File file) {
		try {	
			
		
			FileWriter fw=new FileWriter("essai.txt");
			BufferedWriter bw= new BufferedWriter(fw);
			FileReader f = new FileReader(file);         
			BufferedReader b = new BufferedReader(f);  
			String ligne;
		
			while((ligne= b.readLine())!=null)
			{
				bw.write(ligne);
				bw.newLine();
			
			}
			bw.close();
			b.close();
		}
		catch (Exception e) {
            System.out.println("Erreur "+e);
        }
		
		
		}
		
		
		
	

}
