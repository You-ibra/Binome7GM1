import java.io.*;
public class lireFichier {

	
	public static void main(String args[]) {
		LireFichier();
	
	}

	public static void LireFichier() {
		
	try {
		
		File file= new File("fichier.txt");
		FileReader f = new FileReader(file);         
		BufferedReader b = new BufferedReader(f);  
		String ligne;
		
		while((ligne= b.readLine())!=null)
		{
			System.out.println(ligne);
			
		}
		b.close();
	}
	catch (Exception e)
		{ 	System.out.println("Erreur "+e);
	
		}

	}
	
}
    
    


