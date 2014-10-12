import javax.swing.JOptionPane; // importerer fra klassebibliotek

public class Oppgave5_Sirkelareal // åpner for at klassen kan hentes fra andre programmer
{
	public static void main (String args [] ) //klassens hovedmetode tom
	{
		String radiusSifferstreng; //deklarerer datatypen tekst og variabelens navn
		String piSifferstreng; // deklarerer datatype og variabelnavn

		double radiustall; //deklarere datatypen desimaltall og variabelens navn
		double pitall = 3.14 ; //deklarerer datatypen desimaltall og variabelens navn og verdi
		double areal; //same, same

		//leser inn radien i desimaltall fra bruker i form av en sifferstreng:
		radiusSifferstreng = JOptionPane.showInputDialog ( "Skriv inn sirkelens radius. Bruk desimalpunktum." ) ;
		//leser inn andre desimaltall fra bruker i form av en sifferstreng:


		//Konverterer sifferstrengene til desimaltallverdier:
		radiustall = Double.parseDouble ( radiusSifferstreng ) ;

		//multipliserer tallene og lagrer produktet i variabelen areal:
		areal = radiustall * radiustall * pitall;

		//viser resultatet som streng:
		JOptionPane.showMessageDialog ( null, "Arealet er " + areal ,

		"Resultat", JOptionPane.PLAIN_MESSAGE );
	} // slutt på main-metoden
} //slutt på klassen