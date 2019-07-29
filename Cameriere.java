public class Cameriere {

    Ordine ordine, consegnaOrdine;
    Tavolo t = new Tavolo();

    public Tavolo getTavolo() {
        return t;
    }

    public Ordine getOrdine() {
        return ordine;
    }

    public Ordine consegnaOrdine() {
        return consegnaOrdine;
    }
}