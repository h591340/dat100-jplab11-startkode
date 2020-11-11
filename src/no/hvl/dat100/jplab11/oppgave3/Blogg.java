package no.hvl.dat100.jplab11.oppgave3;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Blogg {

	// TODO: objektvariable 
	private Innlegg [] innleggtabell;
	private int nesteledig;

	public Blogg() {
		//throw new UnsupportedOperationException(TODO.constructor("Blogg"));
		innleggtabell=new Innlegg[20];
	}

	public Blogg(int lengde) {
		//throw new UnsupportedOperationException(TODO.constructor("Blogg"));
		innleggtabell=new Innlegg[lengde];
	}

	public int getAntall() {
		//throw new UnsupportedOperationException(TODO.method());
		return this.nesteledig;
	}
	
	public Innlegg[] getSamling() {
		//throw new UnsupportedOperationException(TODO.method());
		return this.innleggtabell;

	}
	
	public int finnInnlegg(Innlegg innlegg) {
		int found=0;
		for(int i=0;i<innleggtabell.length;i++)
		{
			if(innleggtabell[i].erLik(innlegg))
			{
				found=i;
			}
			
		}
		return found;
		
		//throw new UnsupportedOperationException(TODO.method());
		
	}

	public boolean finnes(Innlegg innlegg) {
		if(innlegg.getId()==nesteledig)
		{
			return true;
		}
		else 
			return false;
		//throw new UnsupportedOperationException(TODO.method());
	}

	public boolean ledigPlass() {
		//throw new UnsupportedOperationException(TODO.method());
		if(nesteledig<innleggtabell.length-1)
		{
			return true;
		}
		else
			return false;

	}
	
	public boolean leggTil(Innlegg innlegg) {

		//throw new UnsupportedOperationException(TODO.method());
		if(ledigPlass()==true)
		{
			innleggtabell[nesteledig]=innlegg;
			nesteledig++;
			return true;
		}
		return false;
		
	}
	
	public String toString() {
		//throw new UnsupportedOperationException(TODO.method());
		String resultat;
		resultat=""+nesteledig+"\n";
		for(int i=0;i<nesteledig;i++)
		{
			resultat+=innleggtabell[i].toString();
		}
		return resultat;
		}
	

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}