package practicum2b;

public class Voetbalclub {
    // Attributen
    private String naam;
    private int aantalGewonnen;
    private int aantalGelijk;
    private int aantalVerloren;

    // Constructor
    public Voetbalclub(String naam) {
        if (naam == null || naam.trim().isEmpty()) {
            this.naam = "FC";
        } else {
            this.naam = naam.trim();
        }
        this.aantalGewonnen = 0;
        this.aantalGelijk = 0;
        this.aantalVerloren = 0;
    }

    // Methode om resultaten te verwerken
    public void verwerkResultaat(char ch) {
        if (ch == 'w') {
            aantalGewonnen++;
        } else if (ch == 'g') {
            aantalGelijk++;
        } else if (ch == 'v') {
            aantalVerloren++;
        } else {
            return;
        }
    }

    // Methode om het aantal gespeelde wedstrijden te berekenen
    public int aantalGespeeld() {
        return aantalGewonnen + aantalGelijk + aantalVerloren;
    }

    // Methode om het aantal gewonnen wedstrijden te berekenen
    public int aantalGewonnen() {
        return aantalGewonnen;
    }

    // Methode om het aantal gelijk gespeelde wedstrijden te berekenen
    public int aantalGelijk() {
        return aantalGelijk;
    }

    // Methode om het aantal verloren wedstrijden te berekenen
    public int aantalVerloren() {
        return aantalVerloren;
    }

    // Methode om het aantal behaalde punten te berekenen
    public int aantalPunten() {
        return (aantalGewonnen * 3) + (aantalGelijk * 1);
    }

    // toString methode
    @Override
    public String toString() {
        return String.format("%-12s %2d %2d %2d %2d %2d",
                naam, aantalGespeeld(), aantalGewonnen, aantalGelijk, aantalVerloren, aantalPunten());
    }
}
