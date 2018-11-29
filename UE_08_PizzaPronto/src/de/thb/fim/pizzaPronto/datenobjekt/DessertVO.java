package de.thb.fim.pizzaPronto.datenobjekt;

import java.util.ArrayList;

public class DessertVO extends GerichtVO implements Cloneable {

	private static final long serialVersionUID = 1L;
	public DessertVO(int nummer, String name, ArrayList<String> zutaten, float preis) {
		super(nummer, name, preis);
	}

	public DessertVO() {
		this(0, null, null,0.0f);
	}

	public ArrayList<String> getZutaten() {
		return zutaten;
	}

	public void setZutaten(ArrayList<String> zutaten) {
		this.zutaten = zutaten;
	}

	//
	public String getGerichtName() {
		String nameGericht = null;
		nameGericht = super.name;

		return nameGericht;
	}

	public int getGerichtNummer() {
		int nummerGericht = 0;
		nummerGericht = super.nummer;
		return nummerGericht;
	}
	public Object clone() throws
	CloneNotSupportedException {
	return super.clone();
	}
}
