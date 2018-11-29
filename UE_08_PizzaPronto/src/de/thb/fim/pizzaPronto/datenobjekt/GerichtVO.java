package de.thb.fim.pizzaPronto.datenobjekt;

import java.io.Serializable;
import java.util.ArrayList;

public abstract class GerichtVO implements Cloneable,Serializable {

	private static final long serialVersionUID = 1L;
	protected int nummer;
	protected String name;
	 	ArrayList<String> zutaten =new ArrayList <String>();
	protected float preis;

	public GerichtVO(int nummer, String name, ArrayList<String> zutaten, float preis) {
		this.setNummer(nummer);
		this.setName(name);
		this.setZutaten(zutaten);
		this.setPreis(preis);
	}

	public int getNummer() {
		return nummer;
	}

	public void setNummer(int nummer) {
		this.nummer = nummer;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<String> getZutaten() {
		return zutaten;
	}

	public void setZutaten(ArrayList<String> zutaten) {
		this.zutaten = zutaten;
	}

	public float getPreis() {
		return preis;
	}

	public void setPreis(float preis) {
		this.preis = preis;
	}

	public GerichtVO(int nummer, String name, float preis) {
		this.setNummer(nummer);
		this.setName(name);
		this.setPreis(preis);
		this.zutaten = new ArrayList<>();
	}

	public GerichtVO() {
		this(0, null, null, 0.0f);
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + nummer;
		result = prime * result + Float.floatToIntBits(preis);
		result = prime * result + ((zutaten == null) ? 0 : zutaten.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GerichtVO other = (GerichtVO) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (nummer != other.nummer)
			return false;
		if (Float.floatToIntBits(preis) != Float.floatToIntBits(other.preis))
			return false;
		if (zutaten == null) {
			if (other.zutaten != null)
				return false;
		} else if (!zutaten.equals(other.zutaten))
			return false;
		return true;
	}

	public Object clone() throws CloneNotSupportedException{
		
		 			return super.clone();
	}
		
	public abstract String getGerichtName();

	public abstract int getGerichtNummer();

	public String toStringZutaten() {
		StringBuilder sb = new StringBuilder();
		if (this.getZutaten() != null) {
			for (String x : this.getZutaten()) {
				sb.append(x);
				sb.append("  ");
			}
//			sb.delete(sb.length() - 2, sb.length());

		} else
			return null;
		return sb.toString();
	}

	public String toString() {
		// public GerichtVO(int nummer,String name,String[]zutaten,float preis)

		StringBuilder sb = new StringBuilder();

		sb.append(" \nnummer ").append(this.nummer);
		sb.append(" \nname ").append(this.name);
		sb.append(" \npreis ").append(this.preis);
//		sb.append(" \nzutaten ").append(zutaten.size());
		return sb.toString();
	}

}
