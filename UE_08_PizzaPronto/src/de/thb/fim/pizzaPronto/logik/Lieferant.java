package de.thb.fim.pizzaPronto.logik;

import java.time.LocalDateTime;
import java.util.Random;

import exceptions.KeinKundeException;

public class Lieferant extends Angestellter implements Fahrer {
	
	private static final long serialVersionUID = 1L;
	float gehalt;
	String strasse;
	int urlaubsTage;

	public Lieferant(String vorname, String nachname, String strasse, int hausNr, String personalNummer) {
		super(vorname, nachname, strasse, hausNr, personalNummer);
	}

	public Lieferant(String vorname, String nachname) {
		super(vorname, nachname);
	}

	public Lieferant() {
		this(null, null, null, 0, null);
	}

	public String arbeiten() throws KeinKundeException{

		StringBuilder sb = new StringBuilder();

		if (this.aktuellerKunde == null || (this.getAktuellerKunde().hasBestellung()) == false) {
			throw new KeinKundeException("kein Kunde vorhanden");
			
		}

		//sb.append("Keine Bestellung  vorhanden");

		if (!this.getAktuellerKunde().getBestellung().getStatus().equals("fertig")) {
			return "\nFahre zu Kunde :  " + "  ///// " + this.getNachname() + " ///  " + this.getStrasse() + " ////"
					+ this.getHausNr() + " ///  " + "Dienstleistung vom Lieferant , " + this.getPersonalNummer()
					+ " :Bestellung fertig um 01.05.2015 15:06 ";
		}
		if (this.getAktuellerKunde().getBestellung().getStatus().equals("fertig")) {
//		
			this.getAktuellerKunde().getBestellung().setStatus("ausgelifert");
			System.out.print(("  Die Bestellung KOmmt um " + " //// " ));
	fahreFahrzeug();

		}
		return sb.toString();
	}

	public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(" \n nachname").append(this.getNachname());
		sb.append("\n vorname").append(this.getVorname());
		sb.append("\n strasse").append(this.getStrasse());
		sb.append("  \n hausNR").append(this.getHausNr());
		sb.append("\n personalnummer").append(this.getPersonalNummer());

		return sb.toString();
	}
	public int fahreFahrzeug(){
			Random zufall = new Random();

			zufall.nextInt(120);
			int fahrzeit = zufall.nextInt(120);
	if(	fahrzeit< MAX_FAHRZEIT){

			System.out.print( LocalDateTime.now().plusMinutes(fahrzeit));

			
		}
	
	return 0;  
	}

	}
