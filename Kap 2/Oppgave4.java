import javax.swing.JOptionPane; // importerer fra klassebibliotek

public class Oppgave3 // �pner for at klassen kan hentes fra andre programmer
{
	public static void main (String args [] ) //klassens hovedmetode tom
	{
		String f�rsteSifferstreng; //deklarerer datatypen tekst og variabelens navn
		String andreSifferstreng; // deklarere datatype og variabelnavn

		int f�rstetall; //deklarere datatypen heltall og variabelens navn
		int andretall; //deklarerer datatypen heltall og variabelens navn
		int sum; //same, same

		//leser inn f�rste tall fra bruker i form av en sifferstreng:
		f�rsteSifferstreng = JOptionPane.showInputDialog ( "Skriv inn f�rste hele tall" ) ;
		//leser inn andre tall fra bruker i form av en sifferstreng:
		andreSifferstreng = JOptionPane.showInputDialog ( "Skriv inn andre hele tall" );

		//Konverterer siffersktrengene til tallverdier:
		f�rstetall = Integer.parseInt ( f�rsteSifferstreng ) ;
		andretall = Integer.parseInt ( andreSifferstreng ) ;

		//Adderer tallene og lagrer summen i variabelen sum:
		sum = f�rstetall + andretall;

		//viser resultatet som streng:
		JOptionPane.showMessageDialog ( null, f�rsteSifferstreng + "+" + andreSifferstreng + "=" + sum,

		"Resultater", JOptionPane.PLAIN_MESSAGE );
	} // slutt p� main-metoden
} //slutt p� klassen Addisjon