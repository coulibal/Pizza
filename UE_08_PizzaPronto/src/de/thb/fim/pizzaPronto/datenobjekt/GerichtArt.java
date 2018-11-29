package de.thb.fim.pizzaPronto.datenobjekt;

public enum GerichtArt {

	PIZZA("PizzaVO"), PASTA("PastaVO");

	private String bezeichnung;

	private GerichtArt(String bezeichnung) {

		this.bezeichnung = bezeichnung;

	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		GerichtArt art = GerichtArt.PIZZA;
		switch (art) {
		case PIZZA: {
			if (this.getBezeichnung() == "PizzaVO") {
				sb.append("pizzaVO");

				break;
			}
		}
		case PASTA: {
			if (this.getBezeichnung() == "PastaVO") {
				sb.append("PASTAVO");

				break;
			}
		}
		}
		//sb.append(bezeichnung);
		return sb.toString();
	}

	public String getBezeichnung() {
		return bezeichnung;
	}

	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}

}