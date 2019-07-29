public class PrenotazioneBuilder {

	private int orario, nPersone, id;
	private char data;
	private Tavolo t = new Tavolo();

	public PrenotazioneBuilder setGiorno(char data) {
		this.data = data;
		return this;
	}

	public PrenotazioneBuilder setOrario(int orario) {
		this.orario = orario;
		return this;
	}

	public PrenotazioneBuilder setNPersone(int nPersone) {
		this.nPersone = nPersone;
		return this;
	}

	public PrenotazioneBuilder setTavolo(Tavolo t) {
		this.t = t;
		return this;
	}

	public Prenotazione build() {
        Prenotazione prenotazione = new Prenotazione();
        Cliente c = new Cliente();
        prenotazione.t = this.t;
        prenotazione.data = this.data;
        prenotazione.orario = this.orario;
        prenotazione.nPersone = this.nPersone;
        return prenotazione;
    }
}