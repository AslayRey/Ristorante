public class Prenotazione {

	int orario, nPersone;
	char data;
	Tavolo t = new Tavolo();

	public char getGiorno() {
		return data;
	}

	public int getOrario() {
		return orario;
	}

	public int getNPersone() {
		return nPersone;
	}

	public Tavolo getTavolo() { return t; }
}