package practicum6a;

import java.time.LocalDate;

public class Game {
    private String naam;
    private int releaseJaar;
    private double nieuwPrijs;

    public Game(String naam, int releaseJaar, double nieuwPrijs) {
        this.naam = naam;
        this.releaseJaar = releaseJaar;
        this.nieuwPrijs = nieuwPrijs;
    }

    public double huidigeWaarde() {
        int huidigeJaar = LocalDate.now().getYear();
        int leeftijd = huidigeJaar - releaseJaar;

        // Waarde daalt met 30% per jaar
        double waarde = nieuwPrijs * Math.pow(0.7, leeftijd);

        // Afronden op 2 decimalen
        return Math.round(waarde * 100) / 100.0;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Game other = (Game) obj;
        return naam.equalsIgnoreCase(other.naam) && releaseJaar == other.releaseJaar;
    }

    @Override
    public String toString() {
        return String.format(
                "%s, uitgegeven in %d; nieuwprijs: €%.2f nu voor: €%.2f",
                naam, releaseJaar, nieuwPrijs, huidigeWaarde()
        );
    }

    // Getters voor naam en releasejaar, als deze nodig zijn
    public String getNaam() {
        return naam;
    }

    public int getReleaseJaar() {
        return releaseJaar;
    }
}
