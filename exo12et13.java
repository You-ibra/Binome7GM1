import java.util.Scanner;
import java.lang.Integer;

public class exo12 {
	public static void main(String[] listeArguments) 
		{
		int tab[listeArguments.length];
		for (int i = 0; i < listeArguments.length; i++) {
			tab[i]=parseInt(String listeArguments[i]);
		}
	public static int somme(int[] tab)
    {
        int somme = 0;

 

        for (int i=0; i < tab.length; i++)
            somme = somme + tab[i];

 

        return somme;
    }
}