  package de.thb.fim.pizzaPronto.datenobjekt;

import java.io.Serializable;

public abstract class PersonVO implements Serializable
{
	
	
	private static final long serialVersionUID = 1L;
	public String nachname;
	public String vorname;
	protected String strasse;
	protected int hausNr;

	public PersonVO(String nachname, String vorname, String strasse, int hausNr) {
		this.setNachname(nachname);
		this.setHausNr(hausNr);
		this.setVorname(vorname);
		this.setStrasse(strasse);
		// this.setStrasse(gehalt);
	}

	public PersonVO(String nachname, String vorname) {
		this.setNachname(nachname);
		this.setVorname(vorname);

	}

	public PersonVO() {
		this(null, null, null, 0);
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(" \n nachname").append(this.getNachname());
		sb.append("\n vorname").append(this.getVorname());
		sb.append("\n strasse").append(this.getStrasse());
		sb.append("  \n hausNr").append(hausNr);

		return sb.toString();
	}

	public int hashCode() {
		final int magic = 31;
		int result = 1;
		result = magic * result + hausNr;
		result = magic * result + ((nachname == null) ? 0 : nachname.hashCode());
		result = magic * result + ((strasse == null) ? 0 : strasse.hashCode());
		result = magic * result + ((vorname == null) ? 0 : vorname.hashCode());
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PersonVO other = (PersonVO) obj;
		if (hausNr != other.hausNr)
			return false;
		if (nachname == null) {
			if (other.nachname != null)
				return false;
		} else if (!nachname.equals(other.nachname))
			return false;
		if (strasse == null) {
			if (other.strasse != null)
				return false;
		} else if (!strasse.equals(other.strasse))
			return false;
		if (vorname == null) {
			if (other.vorname != null)
				return false;
		} else if (!vorname.equals(other.vorname))
			return false;
		return true;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getStrasse() {
		return strasse;
	}

	public void setStrasse(String strasse) {
		this.strasse = strasse;
	}

	public int getHausNr() {
		return hausNr;
	}

	public void setHausNr(int hausNr) {
		this.hausNr = hausNr;
	}
}