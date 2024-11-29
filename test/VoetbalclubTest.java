import org.junit.jupiter.api.Test;
import practicum2b.Voetbalclub;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VoetbalclubTest {
    @Test
    public void test() {
        Voetbalclub ajx = new Voetbalclub("Ajax");
        Voetbalclub feij = new Voetbalclub("Feijenoord");

        feij.verwerkResultaat('w');
        feij.verwerkResultaat('w');
        feij.verwerkResultaat('w');
        feij.verwerkResultaat('g');

        System.out.println("Feijenoord punten: " + feij.aantalPunten());
        System.out.println("Ajax gespeeld: " + ajx.aantalGespeeld());
        System.out.println();

        System.out.println(ajx);
        System.out.println(feij);
    }

    @Test
    public void testVerwerkResultaat() {
        Voetbalclub fc = new Voetbalclub("");

        // Verwerk enkele resultaten
        fc.verwerkResultaat('w'); // Winst
        fc.verwerkResultaat('g'); // Gelijkspel
        fc.verwerkResultaat('v'); // Verlies
        fc.verwerkResultaat('x'); // Ongeldige invoer

        System.out.println(fc);

        // Controleer of de waarden correct zijn bijgewerkt
        assertEquals(1, fc.aantalGewonnen(), "Aantal gewonnen moet 1 zijn");
        assertEquals(1, fc.aantalGelijk(), "Aantal gelijkspel moet 1 zijn");
        assertEquals(1, fc.aantalVerloren(), "Aantal verloren moet 1 zijn");
        assertEquals(3, fc.aantalGespeeld(), "Aantal gespeelde wedstrijden moet 3 zijn");
        assertEquals(4, fc.aantalPunten(), "Aantal punten moet 4 zijn (1x winst en 1x gelijkspel)");
    }
}
