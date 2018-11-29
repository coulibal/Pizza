package de.thb.fim.pizzaPronto.datenobjekt;

import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 * Beispiellösung Programmierung II Speisekarte repräsentiert ein Speisekarten
 * Objekt.
 *
 */

public class SpeiseKarte {
	ArrayList<GerichtVO> speisen = new ArrayList<GerichtVO>();
	// private static final int ANZ_GERICHTE = 18;

	/**
	 * Defaultkonstruktor
	 * 
	 */
	public SpeiseKarte() {
		initSpeiseKarte();
	}

	/**
	 * Methode initialisiert die Speisekarte und erstellt alle Gericht-Objekte.
	 * 
	 */
	private void initSpeiseKarte() {
		// this.speisen = new GerichtVO[ANZ_GERICHTE];
		ArrayList<String> zutaten = new ArrayList<String>();
		zutaten.add("schincken");
		zutaten.add("EI");
		zutaten.add("Curry");
		zutaten.add("Tomate");
		zutaten.add("salz");
		
		ArrayList<String> zutaten2 = new ArrayList<String>();
zutaten2.add("schincken");
zutaten2.add("salmi");
zutaten2.add("Zwiebeln");
zutaten2.add("Tomatensauce");

		speisen.add(new PizzaVO(30, "magaritha", zutaten, 7.00f, 1));
		speisen.add(new PizzaVO(30, "Spinnat", zutaten, 8.00f, 2));
		speisen.add(new PizzaVO(30, "Hawaii", zutaten, 7.90f, 10));
		speisen.add(new PizzaVO(30, "Hawaii", zutaten, 5.00f, 8));
		speisen.add(new PizzaVO(30, "Popeye", zutaten, 6.20f, 9));
		speisen.add(new PizzaVO(30, "Spinnat", zutaten, 9.00f, 3));

		// hier folgen die weiteren Gerichte

		

		speisen.add(new PastaVO(30, "Bolognese", zutaten2, 5.00f, 1));
		speisen.add(new PastaVO(30, "Bolognese", zutaten2, 4.25f, 1));
		speisen.add(new PastaVO(30, "Alla pana", zutaten2, 5.00f, 1));
		speisen.add(new PastaVO(30, "Alla pana", zutaten2, 7.00f, 5));

		speisen.add(new PastaVO(30, "Bolognese", zutaten2, 6.00f, 4));
		speisen.add(new PastaVO(30, "Popeye", zutaten, 6.30f, 3));
		speisen.add(new PastaVO(30, "Napoli", zutaten, 7.00f, 2));
		speisen.add(new PastaVO(30, "Napoli", zutaten, 7.00f, 8));
		
		speisen.add(new DessertVO(30, "Hausgemachter Obstsalat", zutaten, 2.30f));
		speisen.add(new DessertVO(2, "Hausgemachter Pannacotta", zutaten, 2.60f));
		speisen.add(new DessertVO(1, "Hausgemachter Tiramissu", zutaten, 2.80f));
	}

	/**
	 * Gibt das Objekt in menschenlesbarer Form zurück. Ruft dazu getter der
	 * einzelnen Gerichte auf. Setzt die Initialisierungsreihenfolge voraus:
	 * Pizza, Pasta, Dessert
	 * 
	 * @return - der komplette String
	 * 
	 */
	public String toString() {
		StringBuffer sb = new StringBuffer();
		DecimalFormat dFormat = new DecimalFormat(".00"); // Formatierung der
															// Preisangabe ...

		sb.append("SPEISEKARTE PIZZA PRONTO\n\n");
		// erst die Pizzen
		sb.append(
				"Prima Spezialpizzen: \n   1 normal (Durchmseser ca. 26 cm) und \n   2 grande (Durchmesser ca. 32 cm)\n");
		int i = 0;
		do {
			sb.append(speisen.get(i).getNummer() + "\t");
			sb.append(speisen.get(i).getName() + "\t");
			sb.append(speisen.get(i).toStringZutaten());
			sb.append("\n\tPreis:\t\t\t" + dFormat.format(speisen.get(i).getPreis()) + " Euro");
			if (speisen.get(i).getNummer() == speisen.get(i + 1).getNummer()) {
				sb.append("\n\tPreis:\t\t\t" + dFormat.format(speisen.get(i + 1).getPreis()) + " Euro");
				sb.append("\n");
				i += 2;
			}
		} while (i < speisen.size() && speisen.get(i) instanceof PizzaVO);

		// Pasta

		sb.append("\nPrima Spezial Nudelgerichte: \n4  Spaghetti\n5  Tortellini\n6  Gnocchi\n");
		do {
			sb.append(" " + speisen.get(i).getNummer() + "\t");
			sb.append(speisen.get(i).getName() + "\t");

			sb.append(speisen.get(i).toStringZutaten());

			sb.append("\n\tPreis:\t\t\t" + dFormat.format(speisen.get(i).getPreis()) + " Euro");
			if (speisen.get(i).getNummer() == speisen.get(i + 1).getNummer()
					&& speisen.get(i).getNummer() == speisen.get(i + 2).getNummer()) {
				i += 3;
			}
			sb.append("\n");
		} while (i < speisen.size() && speisen.get(i) instanceof PastaVO);

		sb.append("\nPrima Desserts\n");
		do {
			sb.append(speisen.get(i).getNummer() + "\t");
			sb.append(speisen.get(i).getName() + "\t");

			sb.append(speisen.get(i).toStringZutaten());

			sb.append("\n\tPreis:\t\t\t" + dFormat.format(speisen.get(i).getPreis()) + " Euro");
			sb.append("\n");
			i++;
		} while (i < speisen.size() && speisen.get(i) instanceof DessertVO);

		return sb.toString();
	}

	// /
	// / Getter und Setter
	// /
	public GerichtVO getGericht(int index) {
		if (index >= 0 && index < speisen.size())
			return speisen.get(index);
		else
			return null;
	}

	public int getAnzGerichte() {
		return speisen.size();
	}

} // Ende Klasse
