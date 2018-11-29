package de.thb.fim.pizzaPronto.logik;

import java.time.LocalDateTime;
import java.util.LinkedList;

import de.thb.fim.pizzaPronto.datenobjekt.GerichtVO;
import de.thb.fim.pizzaPronto.datenobjekt.KundeVO;



//import java.time.LocalDate;

public class Bestellung implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
//	private static final int MAX_GERICHTE = 10;
	private LinkedList<GerichtVO> warenkorb=new LinkedList<GerichtVO>();
	private KundeVO kunde;
//	private int index;
	private LocalDateTime zeitstempelBestellung;
	private LocalDateTime zeitstempelAuslieferung;
	public String status;

	public Bestellung(LocalDateTime zeitstempelBestellung, KundeVO kunde) {
		this.setStatus(status);
		this.setZeitstempelBestellung(zeitstempelBestellung);
		this.setZeitstempelAuslieferung(zeitstempelAuslieferung);
//		warenkorb.add(new GerichtVO[10]);
		//warenkorb = new GerichtVO[MAX_GERICHTE];
//		index = 0;
		this.setKunde(kunde);
		setStatus("aufgegeben");
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public LinkedList<GerichtVO> getWarenkorb() {
		return warenkorb;
	}

	public void setWarenkorb(LinkedList<GerichtVO> warenkorb) {
		this.warenkorb = warenkorb;
	}

	public KundeVO getKunde() {
		return kunde;
	}

	public void setKunde(KundeVO kunde) {
		this.kunde = kunde;
	}
//
//	public int getIndex() {
//		return index;
//	}
//
//	public static int getMaxGerichte() {
//		return MAX_GERICHTE;
//	}

	public LocalDateTime getZeitstempelBestellung() {
		return zeitstempelBestellung;
	}

	public void setZeitstempelBestellung(LocalDateTime zeitstempelBestellung) {
		this.zeitstempelBestellung = zeitstempelBestellung;
	}

	public LocalDateTime getZeitstempelAuslieferung() {
		return zeitstempelAuslieferung;
	}

	public void setZeitstempelAuslieferung(LocalDateTime zeitstempelAuslieferung) {
		this.zeitstempelAuslieferung = zeitstempelAuslieferung;
	}

	public Bestellung() {
		this(null, null);
	}

	public void hinzufuegenGericht(GerichtVO gerichtVO) {
		for(@SuppressWarnings("unused") GerichtVO a:warenkorb){

		if (warenkorb.size()<10  ) {
			a= gerichtVO;
		warenkorb.get(0);

		}
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((kunde == null) ? 0 : kunde.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((warenkorb == null) ? 0 : warenkorb.hashCode());
		result = prime * result + ((zeitstempelAuslieferung == null) ? 0 : zeitstempelAuslieferung.hashCode());
		result = prime * result + ((zeitstempelBestellung == null) ? 0 : zeitstempelBestellung.hashCode());
		return result;
	}


	

	public void loescheGericht() {
		int x = 0;
		if (x > 0) {
			warenkorb.removeLast();

			x--;

		}

	}

	public GerichtVO getGericht(int index) {
		
		return warenkorb.get(index);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bestellung other = (Bestellung) obj;
		if (kunde == null) {
			if (other.kunde != null)
				return false;
		} else if (!kunde.equals(other.kunde))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (warenkorb == null) {
			if (other.warenkorb != null)
				return false;
		} else if (!warenkorb.equals(other.warenkorb))
			return false;
		if (zeitstempelAuslieferung == null) {
			if (other.zeitstempelAuslieferung != null)
				return false;
		} else if (!zeitstempelAuslieferung.equals(other.zeitstempelAuslieferung))
			return false;
		if (zeitstempelBestellung == null) {
			if (other.zeitstempelBestellung != null)
				return false;
		} else if (!zeitstempelBestellung.equals(other.zeitstempelBestellung))
			return false;
		return true;
	}

//	public int getAnzGerichte() {
//		return index + 1;
//	}

	
	
	public float berechneGesamtPreis() {
		float preis = 0.0f;
		for(GerichtVO a:warenkorb){
			if (a != null) {
				preis = preis + a.getPreis();
			}
		}

//		 for(int i=0;i<index;i++){
//		 preis=preis+ warenkorb[i].getPreis();
//		}
		return preis;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
	//	sb.append(" \nwarenkorb").append(Arrays.toString(warenkorb));
		sb.append("\n kunde : ").append(kunde);
		sb.append("\n index").append(warenkorb.size());
		sb.append("\nzeitstempelBestellung").append(zeitstempelBestellung);
		sb.append("\nzeitstempelAuslieferung = ").append(zeitstempelAuslieferung);
		sb.append("\n status : ").append(status);
	//	sb.append("\n").append(kunde);
		//sb.append(super.toString());
		return sb.toString();
	}

}