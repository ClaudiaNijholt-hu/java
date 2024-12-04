package practicum4a;

public class Persoon {
    // Attributen
    private String naam;
    private int leeftijd;

    // Constructor
    public Persoon(String nm, int lft) {
        this.naam = nm;
        this.leeftijd = lft;
    }

    // toString methode
    @Override
    public String toString() {
        return naam + "; leeftijd " + leeftijd + " jaar";
    }
}
