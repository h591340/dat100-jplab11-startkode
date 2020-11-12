package no.hvl.dat100.jplab11.oppgave1;

import no.hvl.dat100.jplab11.common.TODO;

public abstract class Innlegg {
	protected int id;
	protected String bruker;
	protected String dato;
	protected int likes;
	
	
	
	// TODO - deklarering av objektvariable
	
	public Innlegg() {
		
	}
	
	public Innlegg(int id, String bruker, String dato) {
		this.id=id;
		this.bruker=bruker;
		this.dato=dato;
		this.likes=0;

		// TODO 
		
	}

	public Innlegg(int id, String bruker, String dato, int likes) {

		// TODO - START
		this.id=id;
		this.bruker=bruker;
		this.dato=dato;
		this.likes=likes;
		
		//throw new UnsupportedOperationException(TODO.constructor("Innlegg"));
	}
	
	public String getBruker() {
		
		//throw new UnsupportedOperationException(TODO.method());
		return this.bruker;

	}

	public void setBruker(String bruker) {
		//throw new UnsupportedOperationException(TODO.method());
		this.bruker=bruker;
	}

	public String getDato() {
		//throw new UnsupportedOperationException(TODO.method());
		return this.dato;
		
	}

	public void setDato(String dato) {
		//throw new UnsupportedOperationException(TODO.method());
		this.dato=dato;
	}

	public int getId() {
		//throw new UnsupportedOperationException(TODO.method());
		return this.id;
	}

	public int getLikes() {
		//throw new UnsupportedOperationException(TODO.method());
		return this.likes;

	}
	
	public void doLike () {
		//throw new UnsupportedOperationException(TODO.method());
		this.likes++;
	}
	
	public boolean erLik(Innlegg innlegg) {
		//throw new UnsupportedOperationException(TODO.method());
		if(this.getId()==innlegg.id)
		{
			return true;
		}
		else
			return false;

	}
	
	@Override
	public String toString() {
		
		//throw new UnsupporteSdOperationException(TODO.method());
		String resultat;
		resultat=this.id+"\n"+this.bruker+"\n"+this.dato+"\n"+this.likes+"\n";
		return resultat;
	}
	
	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
