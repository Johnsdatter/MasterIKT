import javax.swing.JOptionPane ;

public class Kursbok2
{
	public void visTittel ( String kursnavn ) //henter metoden visTittel og parameterlista hvor variablene til metoden angis med datatype og navn, parameterparene adskilles med komma
	{
		JOptionPane.showMessageDialog ( null, "Kursbok for " + kursnavn ); //kaller opp metoden for dialogboks og viser hva som skal vises i den
	}
}