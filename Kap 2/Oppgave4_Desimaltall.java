import javax.swing.JOptionPane; // importerer fra klassebibliotek

public class Oppgave4_Desimaltall // �pner for at klassen kan hentes fra andre programmer
{
	public static void main (String args [] ) //klassens hovedmetode tom
	{
		String f�rsteSifferstreng; //deklarerer datatypen tekst og variabelens navn
		String andreSifferstreng; // deklarere datatype og variabelnavn

		double f�rstetall; //deklarere datatypen desimaltall og variabelens navn
		double andretall; //deklarerer datatypen desimaltall og variabelens navn
		double sum; //same, same

		//leser inn f�rste desimaltall fra bruker i form av en sifferstreng:
		f�rsteSifferstreng = JOptionPane.showInputDialog ( "Skriv inn desimaltall, bruk desimalpunktum" ) ;
		//leser inn andre desimaltall fra bruker i form av en sifferstreng:
		andreSifferstreng = JOptionPane.showInputDialog ( "Skriv inn andre desimaltall, bruk desimalpunktum" );

		//Konverterer sifferstrengene til desimaltallverdier:
		f�rstetall = Double.parseDouble ( f�rsteSifferstreng ) ;
		andretall = Double.parseDouble ( andreSifferstreng ) ;

		//Adderer tallene og lagrer summen i variabelen sum:
		sum = f�rstetall + andretall;

		//viser resultatet som streng:
		JOptionPane.showMessageDialog ( null, f�rsteSifferstreng + "+" + andreSifferstreng + "=" + sum,

		"Resultater", JOptionPane.PLAIN_MESSAGE );
	} // slutt p� main-metoden
} //slutt p� klassen Addisjon