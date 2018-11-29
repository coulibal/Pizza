package de.thb.fim.pizzaPronto.logik;



import de.thb.fim.pizzaPronto.datenobjekt.KundeVO;
import de.thb.fim.pizzaPronto.datenobjekt.PersonVO;
import exceptions.BestellungFalscherStatusException;
import exceptions.KeinBestellungException;
import exceptions.KeinKundeException;


public abstract class Angestellter extends PersonVO {
	
	private static final long serialVersionUID = 1L;
	public String personalNummer;
	protected float gehalt;
	protected int urlaubsTage;
	protected KundeVO aktuellerKunde;

	public Angestellter(String vorname, String nachname, String strasse, int hausNr, String personalNummer) {
		super(vorname, nachname, strasse, hausNr);
		this.personalNummer = personalNummer;
	}

	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((aktuellerKunde == null) ? 0 : aktuellerKunde.hashCode());
		result = prime * result + Float.floatToIntBits(gehalt);
		result = prime * result + ((personalNummer == null) ? 0 : personalNummer.hashCode());
		result = prime * result + urlaubsTage;
		return result;
	}

	public Angestellter(String vorname, String nachname) {
		super(vorname, nachname);

	}

	public Angestellter() {
		this(null, null, null, 0, null);
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Angestellter other = (Angestellter) obj;
		if (aktuellerKunde == null) {
			if (other.aktuellerKunde != null)
				return false;
		} else if (!aktuellerKunde.equals(other.aktuellerKunde))
			return false;
		if (Float.floatToIntBits(gehalt) != Float.floatToIntBits(other.gehalt))
			return false;
		if (personalNummer == null) {
			if (other.personalNummer != null)
				return false;
		} else if (!personalNummer.equals(other.personalNummer))
			return false;
		if (urlaubsTage != other.urlaubsTage)
			return false;
		return true;
	}

	public String arbeiterFuerKunde(KundeVO kunde) throws KeinKundeException, BestellungFalscherStatusException,KeinBestellungException {
		if(kunde==null){
			throw new KeinKundeException("kein kunde Vorhanden");
		}
		String s;
		this.setAktuellerKunde(kunde);
		s = this.getAktuellerKunde().toString()+ this.arbeiten();
		return s;
	}

	public void setAktuellerKunde(KundeVO aktuellerKunde) {
		this.aktuellerKunde = aktuellerKunde;
	}

	public abstract String arbeiten() throws KeinKundeException, BestellungFalscherStatusException,KeinBestellungException;

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(" \n nachname").append(this.getNachname());
		sb.append("\n vorname").append(this.getVorname());
		sb.append("\n strasse").append(this.getStrasse());
		sb.append("  \n hausNR").append(this.getHausNr());
		sb.append("\n personalnummer").append(this.getPersonalNummer());

		return sb.toString();
	}

	public String getPersonalNummer() {
		return personalNummer;
	}

	public void setPersonalNummer(String personalNummer) {
		this.personalNummer = personalNummer;
	}

	public float getGehalt() {
		return gehalt;
	}

	public void setGehalt(float gehalt) {
		this.gehalt = gehalt;
	}

	public int getUrlaubsTage() {
		return urlaubsTage;
	}

	public void setUrlaubsTage(int urlaubsTage) {
		this.urlaubsTage = urlaubsTage;
	}

	public KundeVO getAktuellerKunde() {
		return aktuellerKunde;
	}

}
