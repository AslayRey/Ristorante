public class Ordine {

    int id, nPiatti;
    float costo;
    boolean pagato;
    Cameriere cameriere;
    Tavolo t = new Tavolo();

    public int getId() {
        return id;
    }

    public int getNPiatti() {
        return nPiatti;
    }

    public Cameriere getCameriere() {
        return cameriere;
    }

    public float getCosto() { return costo; }

    public boolean getPagato() { return pagato; }

    public Tavolo getTavolo() { return t; }
}