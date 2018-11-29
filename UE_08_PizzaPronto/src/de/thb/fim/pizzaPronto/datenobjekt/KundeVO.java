package de.thb.fim.pizzaPronto.datenobjekt;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;

import de.thb.fim.pizzaPronto.exceptions.KundeZuJungException;
import de.thb.fim.pizzaPronto.exceptions.KundekeinGeburtsdatumException;
import de.thb.fim.pizzaPronto.logik.Bestellung;



public class KundeVO extends PersonVO implements Comparable<KundeVO>,Comparator<KundeVO> {

	private static final long serialVersionUID = 1L;
	private static int naechsteID = 0;
	private int Id;
	private Geschlecht geschlecht;
	public LocalDate geburtsdatum;
	private short alter;
	private Bestellung bestellung;

	public KundeVO(String vorname, String nachname, String strasse, int hausNr, Geschlecht geschlecht,
			LocalDate geburtsdatum, Bestellung bestellung) {
		super(vorname, nachname, strasse, hausNr);
		this.getId();
		this.setGeschlecht(geschlecht);
		try {
			this.setGeburtsdatum(geburtsdatum);
		} catch (KundekeinGeburtsdatumException e) {
			System.out.println("KEINE GEBURTSDATUM");
		} catch (KundeZuJungException e) {
			System.out.println("kunde zu jung");
		}

		this.setAlter(alter);
		Id = naechsteID++;
		this.setBestellung(bestellung);

	}

	public Bestellung getBestellung() {
		return bestellung;
	}

	public void setBestellung(Bestellung bestellung) {
		this.bestellung = bestellung;
	}

	public static int getNaechsteID() {
		return naechsteID;
	}

	public int getId() {
		return Id;
	}

	public short getAlter() {
		return alter;
	}

	public void setAlter(short alter) {
		this.alter = alter;
	}

	public Geschlecht getGeschlecht() {
		return geschlecht;
	}

	public void setGeschlecht(Geschlecht geschlecht2) {
		this.geschlecht = geschlecht2;
	}

	public LocalDate getGeburtsdatum() {
		return geburtsdatum;
	}

	public void setGeburtsdatum(LocalDate geburtsdatum) throws KundekeinGeburtsdatumException, KundeZuJungException {
		this.geburtsdatum = geburtsdatum;

		if (geburtsdatum == null) {
			throw new KundekeinGeburtsdatumException("kein geburtsDatum");
		}
		LocalDate altesGeburtsdatum = this.geburtsdatum;
		if (this.berecheneAlter() < 18) {

			this.geburtsdatum = altesGeburtsdatum;
			throw new KundeZuJungException("der Kunde ist zu jung");
		} 
		// if (this.berecheneAlter() < 18 || this.berecheneAlter() > 59) {
		// this.geburtsdatum = null;
		// }
	}

	public KundeVO(String vorname, String nachname, Geschlecht geschlecht, LocalDate geburtsDatum) {
		this.vorname = vorname;
		this.nachname = nachname;
		this.geschlecht = geschlecht;
		this.geburtsdatum = geburtsDatum;

	}

	public KundeVO(String nachname, String vorname, Geschlecht geschlecht) {
		this.nachname = nachname;
		this.vorname = vorname;
		this.geschlecht = geschlecht;
	}

	public KundeVO(String nachname, String vorname) {
		this.nachname = nachname;
		this.vorname = vorname;
	}

	public short berecheneAlter() throws KundekeinGeburtsdatumException {
		short alter = -1;
		Period birthday;
		// LocalDate geburtsDatum = LocalDate.of(1985, 01, 19);

		LocalDate heutigenDatum = LocalDate.now();
		if (geburtsdatum != null) {
			birthday = Period.between(geburtsdatum, heutigenDatum);
			alter = (short) birthday.getYears();
		}

		else {
			throw new KundekeinGeburtsdatumException("Kein geburtsDatum gegeben");
		}
		return alter;

	}

	public String getGeburtsdatumStr() throws KundekeinGeburtsdatumException {
		if (this.getGeburtsdatum() != null) {
			return geburtsdatum.format(DateTimeFormatter.ofPattern("dd.MMM.yyyy"));
		} else {
			throw new KundekeinGeburtsdatumException("keine GeburtsDatum");
		}
	}

	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (obj.getClass() != this.getClass()) {
			return false;
		}
		KundeVO Kunde;
		Kunde = (KundeVO) obj;
		if (this.nachname.equals(Kunde.getNachname()) && this.vorname == Kunde.getVorname()
				&& this.geburtsdatum == Kunde.getGeburtsdatum() && this.Id == Kunde.getId()
				&& this.alter == Kunde.getAlter())
			return true;

		else
			return false;
	}

	public boolean hasBestellung() {

		if (bestellung != null) {
			return true;
		}
		return false;
	}

	public int hashCode() {
		int hc = 20;
		final int hashMagic = 25;
		hc = hc * hashMagic + vorname.hashCode();
		hc = hc * hashMagic + nachname.hashCode();
		// hc = hc * hashMagic + geschlecht.hashCode();
		// hc = (int) Id;
		// hc = (int) naechsteID;
		// hc = ((geburtsdatum == null) ? 0 : geburtsdatum.hashCode());

		return hc;
	}

	public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append("\nhausNr : ").append(this.hausNr);
		sb.append("\nStrasse :").append(this.strasse);
		sb.append("\nvorname :").append(this.vorname);
		sb.append("\nnachname :").append(nachname);
		sb.append("\nGeschlecht:").append(this.geschlecht);
		sb.append("\nGeburtsDatum:").append(this.geburtsdatum);
		try {
			sb.append(" \n berechner alter :").append(this.berecheneAlter());
		} catch (KundekeinGeburtsdatumException e) {

			e.printStackTrace();
		}
		// sb.append("\nAlter :").append(this.alter);
		sb.append("\nBestellung : ").append(this.bestellung);
		// sb.append(super.toString());
		return sb.toString();
	}

	   public int compareTo(KundeVO other) {
		 int last = this.nachname.compareTo(other.nachname);
	        return last == 0 ? this.vorname.compareTo(other.vorname) : last;	
	        
	}

	
	public int compare(KundeVO one, KundeVO two) {
		
		return (one.geburtsdatum.compareTo(two.geburtsdatum));
	}

}
