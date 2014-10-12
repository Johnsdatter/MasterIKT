import javax.swing.JOptionPane;

public class Oppgave15_minstetall3
{
   public static void main( String args[] )
   {
      String førsteSifferstreng;   // brukes ved innlesing
      String andreSifferstreng;    // brukes ved innlesing
      String tredjeSifferstreng; //brukes ved innlesing

      String resultat;        // tekststreng som brukes til utskrift

      int førstetall;          // første tall som skal sammenliknes
      int andretall;          // andre tall som skal sammenliknes
      int tredjetall;         // tredjetall som skal sammenliknes

      int minstetall;         // deklarerer variabele minstetall som skrives ut i siste dialogboks

      førsteSifferstreng = JOptionPane.showInputDialog( "Skriv første heltall:" );

      andreSifferstreng = JOptionPane.showInputDialog( "Skriv andre heltall:" );

      tredjeSifferstreng = JOptionPane.showInputDialog ( "Skriv tredje heltall:" );



      førstetall = Integer.parseInt( førsteSifferstreng );   // konverterer sifferstrenger til heltallsverdier
      andretall = Integer.parseInt( andreSifferstreng );
      tredjetall = Integer.parseInt ( tredjeSifferstreng ) ;


      if ( førstetall < andretall );
         minstetall = førstetall ;

      if ( førstetall > andretall )
         minstetall = andretall ;

      if ( andretall > tredjetall )
         minstetall = tredjetall  ;



      // Viser resultat av sammenlikningene
      JOptionPane.showMessageDialog( null, minstetall + " er minst av de tre tallene.",
              "Hvilket av tre tall er minst? ", JOptionPane.INFORMATION_MESSAGE );   //overskrift på dialogboksen
   } // slutt på main-metoden
} // slutt på klassen Sammenlikning
