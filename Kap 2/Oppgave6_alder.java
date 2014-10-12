import javax.swing.JOptionPane; // importerer fra klassebibliotek

public class Oppgave6_alder // åpner for at klassen kan hentes fra andre programmer
{
	public static void main (String args [] ) //klassens hovedmetode tom
	{
		String navn; // definerer variabel med tilhørende datatype, her: oppretter lagringsplass for det som leses inn som tekstvariabelen navn
		navn = JOptionPane.showInputDialog ( "Hva heter du?" ) ; // kaller opp klassen JOptionPane og metoden showInputDialog, Parameteret i parentesene blir teksten


		String fødselsårSifferstreng;	// definere variabelen fødselsår

		//leser inn første tall fra bruker i form av en sifferstreng:
		fødselsårSifferstreng = JOptionPane.showInputDialog ( "Hvilket årstall ble du født?" ) ;



		int fødselsårtall; //deklarere datatypen heltall og variabelens navn
		int inneværendeårstall = 2014 ; //deklarerer datatypen heltall og variabelens navn og verdi

		//Konverterer sifferstrengene til tallverdier:
		fødselsårtall = Integer.parseInt ( fødselsårSifferstreng ) ;

		int sum = inneværendeårstall - fødselsårtall ; // NB! Kanskje dette ikke kan initialiseres, men må gjøres som to operasjoner? Neida, gikk fint


		String utskrift; //definerer variabelen utskrift med datatypen String
		utskrift = "Hei på deg, " + navn + ". I år fyller du " + sum + " år." ; // variabelen utskrift defineres som teksten i hermetegn og det som er lest inn og lagret i variabelen navn
		JOptionPane.showMessageDialog (null, utskrift, //kaller opp klassen JOptionPane og metoden showMessageDialog, setter boksen på midten og skriver det som er i variabelen utskrift


		"Gratulerer", JOptionPane.PLAIN_MESSAGE );
	} // slutt på main-metoden
} //slutt på klassen