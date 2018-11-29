package de.thb.fim.pizzaPronto.datenobjekt;


import java.awt.Color;

public class KochVO {

	private String nachname;
	private String vorname;
	private Color farbeSchuerze;

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public Color getFarbeSchuerze() {
		return farbeSchuerze;
	}

	public void setFarbeSchuerze(Color farbeSchuerze) {
		this.farbeSchuerze = farbeSchuerze;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public KochVO(String vorname, String nachname, Color farbeSchuerze) {
		this.setVorname(vorname);
		this.setNachname(nachname);
		this.setFarbeSchuerze(farbeSchuerze);

	}

	public String getNachname() {
		return nachname;
	}

	public void SetNachname(String nachname) {
		this.nachname = nachname;
	}

	public KochVO() {
		this(null, null, null);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		KochVO other = (KochVO) obj;
		if (farbeSchuerze == null) {
			if (other.farbeSchuerze != null)
				return false;
		} else if (!farbeSchuerze.equals(other.farbeSchuerze))
			return false;
		if (nachname == null) {
			if (other.nachname != null)
				return false;
		} else if (!nachname.equals(other.nachname))
			return false;
		if (vorname == null) {
			if (other.vorname != null)
				return false;
		} else if (!vorname.equals(other.vorname))
			return false;
		return true;
	}

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((farbeSchuerze == null) ? 0 : farbeSchuerze.hashCode());
		result = prime * result + ((nachname == null) ? 0 : nachname.hashCode());
		result = prime * result + ((vorname == null) ? 0 : vorname.hashCode());
		return result;
	}

	public String toString() {
		String nachnmaeUndVornmame;
		nachnmaeUndVornmame = "vorname :" + this.vorname + "nachname ;" + this.nachname;
		return nachnmaeUndVornmame;

	}
}
