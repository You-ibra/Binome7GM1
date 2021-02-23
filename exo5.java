import java.util.Scanner;
import java.lang.Integer;

public class exo12 {
	public static int[] Conv(String[] listeArguments) 
		{
		int tab[listeArguments.length];
		for (int i = 0; i < listeArguments.length; i++) {
			tab[i]=java.lang.Integer.parseInt(listeArguments[i]);
		}
		
	}
	}
	public static int Somme(int[] tab)
    {
        int somme = 0;

 

        for (int i=0; i < tab.length; i++)
            somme = somme + tab[i];

 

        return somme;
    }
}

	public static void main(String[] arg)
	{
		int[] tab= new int[arg.length];
		tab=conv(arg);
		System.out.println(somme(tab));
		
		}
		
		

		
	
	
	
	
	
	
	
	
	
}
