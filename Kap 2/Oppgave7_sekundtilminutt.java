import javax.swing.JOptionPane; // importerer fra klassebibliotek

public class Oppgave7_sekundtilminutt // �pner for at klassen kan hentes fra andre programmer
{
	public static void main (String args [] ) //klassens hovedmetode tom
	{
		String sekundSifferstreng ; //deklarerer datatypen tekst og variabelens navn

		int sekundtall ; //deklarere datatypen heltall og variabelens navn

		//leser inn sekund fra bruker i form av en sifferstreng:
		sekundSifferstreng = JOptionPane.showInputDialog ( "Skriv inn antall sekunder" ) ;

		//Konverterer sifferstrengen til tallverdi:
		sekundtall = Integer.parseInt ( sekundSifferstreng ) ;

		int sum = sekundtall / 60 ; //deklarerer datatypen heltall og variabelens navn samt regner ut hvor mange minutter det utgj�r

		//viser resultatet:
		JOptionPane.showMessageDialog ( null, sekundtall + " sekunder utgj�r " + sum + " minutter." );

	} // slutt p� main-metoden
} //slutt p� klassen Addisjon