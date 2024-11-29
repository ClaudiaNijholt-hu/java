package practicum4a;

import practicum4a.Persoon;

public class Huis {
    // Attributen
    private String adres;
    private int bouwjaar;
    private Persoon huisbaas;

    // Constructor
    public Huis(String adres, int bouwjaar) {
        this.adres = adres;
        this.bouwjaar = bouwjaar;
    }

    // Setter voor huisbaas
    public void setHuisbaas(Persoon huisbaas) {
        this.huisbaas = huisbaas;
    }

    // Getter voor huisbaas
    public Persoon getHuisbaas() {
        return huisbaas;
    }

    // toString methode
    @Override
    public String toString() {
        return "Huis " + adres + " is gebouwd in " + bouwjaar + "\n" +
                "en heeft huisbaas " + huisbaas;
    }
}
