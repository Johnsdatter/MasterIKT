import javax.swing.JOptionPane;

public class Oppgave1_ifelse
{
   public static void main( String args[] )
   {
      String f�rsteSifferstreng;   // brukes ved innlesing
      String resultat;        // tekststreng som brukes til utskrift

      int f�rstetall;          // f�rste tall som skal sammenliknes

      f�rsteSifferstreng =
              JOptionPane.showInputDialog( "Skriv inn et heltall:" );

      // konverterer sifferstrenger til heltallsverdier
      f�rstetall = Integer.parseInt( f�rsteSifferstreng );

      // initialiserer utskriftsstrengen til en tom streng
      resultat = "";

      if ( f�rstetall % 3 == 0 )
         resultat = resultat + f�rstetall + " er delelig med 3." ;

      else
         resultat = resultat + f�rstetall + " er ikke delelig med 3." ;

      // Viser resultat av sammenlikningene
      JOptionPane.showMessageDialog( null, resultat,
              "Er tallet delelig med 3?",
         JOptionPane.INFORMATION_MESSAGE );
   } // slutt p� main-metoden
} // slutt p� klassen Sammenlikning
