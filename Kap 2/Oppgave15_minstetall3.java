import javax.swing.JOptionPane;

public class Oppgave15_minstetall3
{
   public static void main( String args[] )
   {
      String f�rsteSifferstreng;   // brukes ved innlesing
      String andreSifferstreng;    // brukes ved innlesing
      String tredjeSifferstreng; //brukes ved innlesing

      String resultat;        // tekststreng som brukes til utskrift

      int f�rstetall;          // f�rste tall som skal sammenliknes
      int andretall;          // andre tall som skal sammenliknes
      int tredjetall;         // tredjetall som skal sammenliknes

      int minstetall;         // deklarerer variabele minstetall som skrives ut i siste dialogboks

      f�rsteSifferstreng = JOptionPane.showInputDialog( "Skriv f�rste heltall:" );

      andreSifferstreng = JOptionPane.showInputDialog( "Skriv andre heltall:" );

      tredjeSifferstreng = JOptionPane.showInputDialog ( "Skriv tredje heltall:" );



      f�rstetall = Integer.parseInt( f�rsteSifferstreng );   // konverterer sifferstrenger til heltallsverdier
      andretall = Integer.parseInt( andreSifferstreng );
      tredjetall = Integer.parseInt ( tredjeSifferstreng ) ;


      if ( f�rstetall < andretall );
         minstetall = f�rstetall ;

      if ( f�rstetall > andretall )
         minstetall = andretall ;

      if ( andretall > tredjetall )
         minstetall = tredjetall  ;



      // Viser resultat av sammenlikningene
      JOptionPane.showMessageDialog( null, minstetall + " er minst av de tre tallene.",
              "Hvilket av tre tall er minst? ", JOptionPane.INFORMATION_MESSAGE );   //overskrift p� dialogboksen
   } // slutt p� main-metoden
} // slutt p� klassen Sammenlikning
