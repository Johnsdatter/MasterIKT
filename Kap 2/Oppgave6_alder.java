import javax.swing.JOptionPane; // importerer fra klassebibliotek

public class Oppgave6_alder // �pner for at klassen kan hentes fra andre programmer
{
	public static void main (String args [] ) //klassens hovedmetode tom
	{
		String navn; // definerer variabel med tilh�rende datatype, her: oppretter lagringsplass for det som leses inn som tekstvariabelen navn
		navn = JOptionPane.showInputDialog ( "Hva heter du?" ) ; // kaller opp klassen JOptionPane og metoden showInputDialog, Parameteret i parentesene blir teksten


		String f�dsels�rSifferstreng;	// definere variabelen f�dsels�r

		//leser inn f�rste tall fra bruker i form av en sifferstreng:
		f�dsels�rSifferstreng = JOptionPane.showInputDialog ( "Hvilket �rstall ble du f�dt?" ) ;



		int f�dsels�rtall; //deklarere datatypen heltall og variabelens navn
		int innev�rende�rstall = 2014 ; //deklarerer datatypen heltall og variabelens navn og verdi

		//Konverterer sifferstrengene til tallverdier:
		f�dsels�rtall = Integer.parseInt ( f�dsels�rSifferstreng ) ;

		int sum = innev�rende�rstall - f�dsels�rtall ; // NB! Kanskje dette ikke kan initialiseres, men m� gj�res som to operasjoner? Neida, gikk fint


		String utskrift; //definerer variabelen utskrift med datatypen String
		utskrift = "Hei p� deg, " + navn + ". I �r fyller du " + sum + " �r." ; // variabelen utskrift defineres som teksten i hermetegn og det som er lest inn og lagret i variabelen navn
		JOptionPane.showMessageDialog (null, utskrift, //kaller opp klassen JOptionPane og metoden showMessageDialog, setter boksen p� midten og skriver det som er i variabelen utskrift


		"Gratulerer", JOptionPane.PLAIN_MESSAGE );
	} // slutt p� main-metoden
} //slutt p� klassen