import javax.swing.JOptionPane; // importerer fra klassebibliotek

public class Forogetternavn //gir klassen navn, og lar den kalles opp fra andre programmer
{
	public static void main(String[] args) //hovedmetode som starter opp
	{
		String fornavn, etternavn, utskrift; //deklarere variablenes navn og datatype. Siden det er samme datatype skiller jeg dem bare ad vha komma
		fornavn = JOptionPane.showInputDialog ("Hva er ditt fornavn?"); // leser inn verdi i variabelen fornavn
		etternavn = JOptionPane.showInputDialog ("Hva er ditt etternavn?"); //leser inn verdi i variabelen etternavn
		utskrift = "Da tror jeg forsyne meg du heter " + fornavn + " " + etternavn + "!";
		JOptionPane.showMessageDialog (null, utskrift);
	}
}
