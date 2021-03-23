
import java.io.*;


	public class EcritFichier
	{

		public static void main(String[] args)

		{
			try {

				
					FileWriter fw=new FileWriter("essai.txt");
					BufferedWriter bw= new BufferedWriter(fw);
					bw.write(" Ecris que des choses sympathiques");
					bw.newLine();

					bw.write("Voici autre chose de sympathoque");
					bw.newLine();
					bw.write("Youssef et yacine sont gentils");
					bw.close();

			}

				catch (Exception e)
				{ 	System.out.println("Erreur "+e);}
			
			}
		}
	
	
	