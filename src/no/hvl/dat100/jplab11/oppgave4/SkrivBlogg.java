package no.hvl.dat100.jplab11.oppgave4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave3.*;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {

		//throw new UnsupportedOperationException(TODO.method());
		try
		{
			PrintWriter writer=new PrintWriter(mappe+filnavn);
			writer.print(samlinge.toString());
			writer.close();
			return true;
		}
		catch(FileNotFoundException s )
		{
			System.out.print("Fil:"+filnavn+", på mappe "+mappe+",  har ikke funnet.");
			return false;
		}
		
	}
}
