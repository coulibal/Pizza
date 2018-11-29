package de.thb.fim.pizzaPronto.datenobjekt;

public enum Geschlecht {
	M(1), W(2), I(3), U(4);
	private int nummer;

	private Geschlecht(int nummer) {
		this.nummer = nummer;
	}

	public int toNummer() {

		return this.getNummer();
	}

	public int getNummer() {
		return nummer;
	}

	public void setNummer(int nummer) {
		this.nummer = nummer;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		Geschlecht mensch = Geschlecht.M;
		switch (mensch) {
		case M: {
			if (this.getNummer() == 1) {

				sb.append(" Geschlecht " + " Männlich");
				break;
			}
		}
		case W: {
			if (this.getNummer() == 2) {

				sb.append(" Geschlecht " + " Weiblich");
				break;
			}
		}
		case I: {
			if (this.getNummer() == 3) {

				sb.append(" Geschlecht " + " INtersexuel");
				break;
			}
		}
		case U:
			if (this.getNummer() == 4) {

				sb.append(" Geschlecht " + " Unbekannt");
				break;
			}
		}

		return sb.toString();
	}

}
