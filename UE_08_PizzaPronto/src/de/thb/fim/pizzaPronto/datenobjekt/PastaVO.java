package de.thb.fim.pizzaPronto.datenobjekt;

import java.util.ArrayList;

public class PastaVO extends GerichtVO implements Cloneable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2752188090366672299L;
	private int pastaSorte;

	public PastaVO(int nummer, String name, ArrayList<String> zutaten, float preis, int pastaSorte) {
		super(nummer, name, zutaten, preis);
		this.setPastaSorte(pastaSorte);
	}

	public int getPastaSorte() {
		return pastaSorte;
	}

	public void setPastaSorte(int pastaSorte) {
		this.pastaSorte = pastaSorte;
	}

	public PastaVO() {
		this(0, null, new ArrayList<String>(), 0.0f, 0);
	}

	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + pastaSorte;
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		PastaVO other = (PastaVO) obj;
		if (pastaSorte != other.pastaSorte)
			return false;
		return true;
	}

	public String getGerichtName() {
		//
		String bezeichnung;
		bezeichnung = GerichtArt.PASTA.toString() + " "+this.pastaSorte;

		return bezeichnung;
	}

	//
	public int getGerichtNummer() {
		int nummerGericht = 0;
		nummerGericht = this.nummer * 100 + super.nummer;
		return nummerGericht;
	}

	public Object clone() throws CloneNotSupportedException{
		
		 			return super.clone();
		
	}

	

}
