import javax.swing.JOptionPane ;

public class Kursbok3
{
	private String kursnavn; //datafelt (attributt/instansvariabel/objektvariabel) tilgjengelig bare innen klassen

	public void setKursnavn ( String navn )  //metode/klassens operasjon : overfører verdien fra parameteret navn til datafeltet kursnavn der metoden kalles opp
	{
		kursnavn = navn ; //
	}

	public String getKursnavn ()//metode (klassens operasjon) som returnerer vedrien til datafeltet kursnavn der metoden kalles opp
	{
		return kursnavn;
	}

	public void visTittel ()
	{
		JOptionPane.showMessageDialog ( null, "Kursbok for " + kursnavn ) ;
	}
}