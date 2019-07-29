public class OrdineBuilder {

    private int id, nPiatti;
    private float costo;
    private boolean pagato;
    private Cameriere cameriere;
    private Tavolo t = new Tavolo();

    public OrdineBuilder setId(int id) {
        this.id = id;
        return this;
    }

    public OrdineBuilder setNPiatti(int nPiatti) {
        this.nPiatti = nPiatti;
        return this;
    }

    public OrdineBuilder setCameriere(Cameriere cameriere) {
        this.cameriere = cameriere;
        return this;
    }

    public OrdineBuilder setCosto(float costo) {
        this.costo = costo;
        return this;
    }

    public OrdineBuilder setPagato(boolean pagato) {
        this.pagato = pagato;
        return this;
    }

    public OrdineBuilder setTavolo(Tavolo t) {
        this.t = t;
        return this;
    }

    public Ordine build() {
        Ordine ordine = new Ordine();
        ordine.id = this.id;
        ordine.nPiatti = this.nPiatti;
        ordine.cameriere = this.cameriere;
        ordine.costo = this.costo;
        ordine.t = this.t;
        ordine.pagato = this.pagato;
        return ordine;
    }
}