package de.thb.fim.pizzaPronto.datenobjekt;

import java.util.ArrayList;

public class PizzaVO extends GerichtVO implements Cloneable {

	private static final long serialVersionUID = 1L;
	private int groesse;

	public PizzaVO(int nummer, String name, ArrayList<String> zutaten, float preis, int groesse) {
		super(nummer, name, zutaten, preis);
		this.setGroesse(groesse);
		this.setName(name);
		this.setZutaten(zutaten);
		this.setPreis(preis);
	}


	public int getGroesse() {
		return groesse;
	}

	public void setGroesse(int groesse) {
		this.groesse = groesse;
	}

	public PizzaVO() {
		this.name = null;
		this.zutaten = new ArrayList<String>();
		this.preis = 0.0f;
		this.groesse = 0;
	}

	public PizzaVO(int nummer, String name, ArrayList<String> zutaten, float preis) {
		super(nummer, name, zutaten, preis);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + groesse;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		PizzaVO other = (PizzaVO) obj;
		if (groesse != other.groesse)
			return false;
		return true;
	}

	public  String getGerichtName() {
		String bezeichnung;
		bezeichnung =GerichtArt.PIZZA.toString() +" " + this.groesse;

		return  bezeichnung;
	}

	//
	public int getGerichtNummer() {
		int nummerGericht = 0;
		nummerGericht = this.nummer * 10 + (this.groesse);
		return nummerGericht;

	}

	public Object clone() 
	 {
Object b=null;
try{
	b=super.clone();
}catch(CloneNotSupportedException e){
	System.err.println(e.getMessage());
}
return b;
 
	 }

}
