import javax.swing.JOptionPane; //importerer fra klassebiblioteket

public class Hilsen //sier at klassen kan kalles opp av andre programmer
{
	public static void main (String[] args) //hovedmetoden som starter opp f�rst, finn ut hvorfor
	{
		String navn; // definerer variabel med tilh�rende datatype, her: oppretter lagringsplass for det som leses inn som tekstvariabelen navn
		navn = JOptionPane.showInputDialog ("Hva heter du?"); // kaller opp klassen JOptionPane og metoden showInputDialog, Parameteret i parentesene gir ledeteksten som st�r i hermetegn. Det som leses inn i dialogboksen lagres i variabelen navn
		String utskrift; //definerer variabelen utskrift med datatypen String
		utskrift = "Hei p� deg, " + navn; // variabelen utskrift defineres som teksten i hermetegn og det som er lest inn og lagret i variabelen navn
		JOptionPane.showMessageDialog (null, utskrift); //kaller opp klassen JOptionPane og metoden showMessageDialog, setter boksen p� midten og skriver det som er i variabelen utskrift
	}
}