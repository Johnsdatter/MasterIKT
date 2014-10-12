import javax.swing.JOptionPane; // importerer fra klassebibliotek

public class Oppgave8_sekunderomformet // åpner for at klassen kan hentes fra andre programmer
{
	public static void main (String args [] ) //klassens hovedmetode tom
	{
		String sekundSifferstreng ; //deklarerer datatypen tekst og variabelens navn

		int sekundtall ; //deklarere datatypen heltall og variabelens navn

		//leser inn sekund fra bruker i form av en sifferstreng:
		sekundSifferstreng = JOptionPane.showInputDialog ( "Skriv inn antall sekunder" ) ;

		//Konverterer sifferstrengen til tallverdi:
		sekundtall = Integer.parseInt ( sekundSifferstreng ) ;

		int timesum = sekundtall / 3600 ; //deklarerer datatypen heltall og variabelens navn samt regner ut hvor mange timer det utgjør
		int minuttsum = sekundtall / 60 - (timesum * 60) ; //skjønner ikke hvorfor det ikke gikk med =sekundtall-(timesum*3600)/60 ?
		int sekundsum = sekundtall - (timesum * 3600 + minuttsum * 60) ;

		//viser resultatet:
		JOptionPane.showMessageDialog ( null, sekundtall + " sekunder utgjør " + timesum + " timer, " + minuttsum + " minutter og " + sekundsum + " sekunder." );

	} // slutt på main-metoden
} //slutt på klassen