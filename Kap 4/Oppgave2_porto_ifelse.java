import javax.swing.JOptionPane ;

public class Oppgave2_porto_ifelse
{
	public static void main ( String [] args )
	{
		String vektSifferstreng ; //deklarerer tekstvariabelen for innlesing av verdi. Kan denne bare utvide linje 10?


		vektSifferstreng = JOptionPane.showInputDialog ( "Skriv inn vekt i gram" ) ; //gir variabelen verdi ved input dialogboks

		int vekt = Integer.parseInt ( vektSifferstreng ) ; // deklarerer datavarialbelen vekt og datatypen heltall og gjør om tekstvariabel til datatype integer
		double porto = 0.00 ; //deklarerer variabel,

		if (vekt <= 20 )
			porto = 9.00;
		else if (vekt <= 50 )
			porto =14.00 ;
		else if ( vekt <= 100 )
			porto = 17.00 ;
		else if ( vekt <= 350 )
			porto = 27 ;
		else if (vekt <= 1000 )
			porto = 67.00 ;
		else if ( vekt <= 2000 )
			porto = 145.00 ;

		if (vekt <= 2000 )
		JOptionPane.showMessageDialog ( null, "Porto er kr " + porto, "Porto", JOptionPane.PLAIN_MESSAGE );
		else
		JOptionPane.showMessageDialog ( null, " Sendingen er for tung" ) ;

	} //slutt på main-metoden
} //slutt på klassen








