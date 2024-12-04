package practicum4a;

public class Huis {
    // Attributen
    private String adres;
    private int bouwjaar;
    private Persoon huisbaas;

    // Constructor
    public Huis(String adr, int bwjr) {
        this.adres = adr;
        this.bouwjaar = bwjr;
    }

    // Setter voor huisbaas
    public void setHuisbaas(Persoon hb) {
        this.huisbaas = hb;
    }

    // Getter voor huisbaas
    public Persoon getHuisbaas() {
        return huisbaas;
    }

    // toString methode
    @Override
    public String toString() {
        return "Huis " + adres + " is gebouwd in " + bouwjaar + "\n" +
                "en heeft huisbaas " + (huisbaas != null ? huisbaas.toString() : "onbekend");
    }
}