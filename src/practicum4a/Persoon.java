package practicum4a;

public class Persoon {
    // Attributen
    private String naam;
    private int leeftijd;

    // Constructor
    public Persoon(String naam, int leeftijd) {
        this.naam = naam;
        this.leeftijd = leeftijd;
    }

    // Getters
    public String getNaam() {
        return naam;
    }

    public int getLeeftijd() {
        return leeftijd;
    }

    // toString methode
    @Override
    public String toString() {
        return naam + "; leeftijd " + leeftijd + " jaar";
    }
}
