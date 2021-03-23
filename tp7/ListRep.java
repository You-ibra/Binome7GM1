

import java.io.*;

	public class ListRep
	{
		public static void main(String[] args) {
			listRep(new File("."));
		}
		public static void listRep(File rep) {
			if (rep.isDirectory()) {
				//liste les fichier du répertoire
				File t[]=rep.listFiles();
				for (int i=0;i<t.length;i++)
					listRep(t[i]);
			}
			else 
			{
				System.out.println("Le fichier est"+ rep);
				
			}
		}
	}