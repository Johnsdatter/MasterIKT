import javax.swing.JOptionPane; // importerer fra klassebibliotek

public class Oppgave3 // åpner for at klassen kan hentes fra andre programmer
{
	public static void main (String args [] ) //klassens hovedmetode tom
	{
		String førsteSifferstreng; //deklarerer datatypen tekst og variabelens navn
		String andreSifferstreng; // deklarere datatype og variabelnavn

		int førstetall; //deklarere datatypen heltall og variabelens navn
		int andretall; //deklarerer datatypen heltall og variabelens navn
		int sum; //same, same

		//leser inn første tall fra bruker i form av en sifferstreng:
		førsteSifferstreng = JOptionPane.showInputDialog ( "Skriv inn første hele tall" ) ;
		//leser inn andre tall fra bruker i form av en sifferstreng:
		andreSifferstreng = JOptionPane.showInputDialog ( "Skriv inn andre hele tall" );

		//Konverterer siffersktrengene til tallverdier:
		førstetall = Integer.parseInt ( førsteSifferstreng ) ;
		andretall = Integer.parseInt ( andreSifferstreng ) ;

		//Adderer tallene og lagrer summen i variabelen sum:
		sum = førstetall + andretall;

		//viser resultatet som streng:
		JOptionPane.showMessageDialog ( null, førsteSifferstreng + "+" + andreSifferstreng + "=" + sum,

		"Resultater", JOptionPane.PLAIN_MESSAGE );
	} // slutt på main-metoden
} //slutt på klassen Addisjon