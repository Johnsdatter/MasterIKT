import javax.swing.JOptionPane; // importerer fra klassebibliotek

public class Oppgave4_Desimaltall // åpner for at klassen kan hentes fra andre programmer
{
	public static void main (String args [] ) //klassens hovedmetode tom
	{
		String førsteSifferstreng; //deklarerer datatypen tekst og variabelens navn
		String andreSifferstreng; // deklarere datatype og variabelnavn

		double førstetall; //deklarere datatypen desimaltall og variabelens navn
		double andretall; //deklarerer datatypen desimaltall og variabelens navn
		double sum; //same, same

		//leser inn første desimaltall fra bruker i form av en sifferstreng:
		førsteSifferstreng = JOptionPane.showInputDialog ( "Skriv inn desimaltall, bruk desimalpunktum" ) ;
		//leser inn andre desimaltall fra bruker i form av en sifferstreng:
		andreSifferstreng = JOptionPane.showInputDialog ( "Skriv inn andre desimaltall, bruk desimalpunktum" );

		//Konverterer sifferstrengene til desimaltallverdier:
		førstetall = Double.parseDouble ( førsteSifferstreng ) ;
		andretall = Double.parseDouble ( andreSifferstreng ) ;

		//Adderer tallene og lagrer summen i variabelen sum:
		sum = førstetall + andretall;

		//viser resultatet som streng:
		JOptionPane.showMessageDialog ( null, førsteSifferstreng + "+" + andreSifferstreng + "=" + sum,

		"Resultater", JOptionPane.PLAIN_MESSAGE );
	} // slutt på main-metoden
} //slutt på klassen Addisjon