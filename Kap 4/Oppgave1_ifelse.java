import javax.swing.JOptionPane;

public class Oppgave1_ifelse
{
   public static void main( String args[] )
   {
      String førsteSifferstreng;   // brukes ved innlesing
      String resultat;        // tekststreng som brukes til utskrift

      int førstetall;          // første tall som skal sammenliknes

      førsteSifferstreng =
              JOptionPane.showInputDialog( "Skriv inn et heltall:" );

      // konverterer sifferstrenger til heltallsverdier
      førstetall = Integer.parseInt( førsteSifferstreng );

      // initialiserer utskriftsstrengen til en tom streng
      resultat = "";

      if ( førstetall % 3 == 0 )
         resultat = resultat + førstetall + " er delelig med 3." ;

      else
         resultat = resultat + førstetall + " er ikke delelig med 3." ;

      // Viser resultat av sammenlikningene
      JOptionPane.showMessageDialog( null, resultat,
              "Er tallet delelig med 3?",
         JOptionPane.INFORMATION_MESSAGE );
   } // slutt på main-metoden
} // slutt på klassen Sammenlikning
