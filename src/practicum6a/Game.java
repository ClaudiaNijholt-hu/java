package practicum6a;

import java.time.LocalDate;

public class Game {
    private String naam;
    private int releaseJaar;
    private double nieuwprijs;

    public Game(String naam, int releaseJaar, double nieuwprijs) {
        this.naam = naam;
        this.releaseJaar = releaseJaar;
        this.nieuwprijs = nieuwprijs;
    }

    public double huidigeWaarde() {
        int jarenOud = LocalDate.now().getYear() - releaseJaar;
        return nieuwprijs * Math.pow(0.7, jarenOud);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Game otherGame = (Game) obj;
        return naam.equals(otherGame.naam) && releaseJaar == otherGame.releaseJaar;
    }

    @Override
    public String toString() {
        return String.format("%s, uitgegeven in %d; nieuwprijs: €%.2f nu voor: €%.2f",
                naam, releaseJaar, nieuwprijs, huidigeWaarde());
    }
}