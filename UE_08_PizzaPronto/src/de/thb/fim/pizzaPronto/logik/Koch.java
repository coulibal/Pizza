package de.thb.fim.pizzaPronto.logik;

import java.awt.Color;

import de.thb.fim.pizzaPronto.datenobjekt.SpeiseKarte;
import exceptions.BestellungFalscherStatusException;
import exceptions.KeinKundeException;


public class Koch extends Angestellter {
	
	private static final long serialVersionUID = 1L;
	private Color farbeSchuerze;

	public Koch(String vorname, String nachname, String strasse, int hausNr, String personalNummer) {
		super(vorname, nachname, strasse, hausNr, personalNummer);
		this.setFarbeSchuerze(farbeSchuerze);

	}

	public Color getFarbeSchuerze() {
		return farbeSchuerze;
	}

	public void setFarbeSchuerze(Color farbeSchuerze) {
		this.farbeSchuerze = farbeSchuerze;
	}

	public Koch(String vorname, String nachname, Color farbeSchuerze) {
		this.vorname = vorname;
		this.nachname = nachname;
		this.farbeSchuerze = farbeSchuerze;

	}

	public Koch() {

		this(null, null, null, 0, null);
	}

	//
	public String arbeiten() throws BestellungFalscherStatusException, KeinKundeException{
		StringBuilder sb = new StringBuilder();

		if (this.aktuellerKunde == null || (this.getAktuellerKunde().hasBestellung()) == false) {
			throw new KeinKundeException("Keine Kunde");
			
		}
		System.out.println(sb.append("keine Bestellung vorhanden"));

		if (this.getAktuellerKunde().getBestellung().getStatus() != "aufgegeben") {

			throw new BestellungFalscherStatusException("falschenstatus");
		} else {
			System.out.println(sb.append(" \nkeine Bestellung zum Abarbeiten vorhanden"));

			this.getAktuellerKunde().getBestellung().setStatus("fertig");
			return " \n„Dienstleistung vom Koch" + this.getPersonalNummer() + " bestellung fertig";

		}
	}

	public SpeiseKarte erstelltSpeiseKarte() {
		/*
		 * String names[] = { "Cheese", "Cheese", " Black Olives" };
		 * 
		 * GerichtVO[] brandenburg = new GerichtVO[3]; brandenburg[0] = new
		 * PizzaVO(1, "Popeye", new String[] { "Schinken", "Spinat",
		 * "Champignon", "Ei" }, 7.00f, 1);
		 * 
		 * brandenburg[1] = new PastaVO(12, "Bolognese", new String[] {
		 * "Hackfleischsauce" }, 6.40f, 5);
		 * 
		 * brandenburg[2] = new DessertVO(21, "Hausgemachter Obstsalat",
		 * names,2.30f);
		 */
		SpeiseKarte mensa = new SpeiseKarte();

		return mensa;
		// Color farbeSchuerze;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(" \n nachname ").append(this.getNachname());
		sb.append("\n vorname ").append(this.getVorname());
		sb.append("\n strasse ").append(this.getStrasse());
		sb.append("  \n hausNR ").append(this.getHausNr());
		sb.append("\n personalnummer ").append(this.getPersonalNummer());

		return sb.toString();
	}

}
