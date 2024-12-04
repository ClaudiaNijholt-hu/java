import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import practicum4b.Auto;
import practicum4b.AutoHuur;
import practicum4b.Klant;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AutoHuurTest {

    private AutoHuur ah1, ah2;
    private Klant k;
    private Auto a1, a2;

    @BeforeEach
    public void setUp() {
        // Setup code die wordt hergebruikt in elke test
        k = new Klant("Mijnheer de Vries");
        k.setKorting(10.0);

        // Eerste AutoHuur
        ah1 = new AutoHuur();
        ah1.setHuurder(k);
        a1 = new Auto("Peugeot 207", 50);
        ah1.setGehuurdeAuto(a1);
        ah1.setAantalDagen(4);

        // Tweede AutoHuur
        ah2 = new AutoHuur();
        ah2.setHuurder(k);
        a2 = new Auto("Ferrari", 3500);
        ah2.setGehuurdeAuto(a2);
        ah2.setAantalDagen(1);
    }

    @Test
    public void testAutoHuurEersteAutoInstellen() {
        // Vergelijk het type van de eerste auto
        assertEquals("Peugeot 207", a1.toString().split(": ")[1].split(" met")[0]);
    }

    @Test
    public void testEersteAutoPrijsInstellen() {
        // Vergelijk de prijs per dag van de eerste auto
        assertEquals(50, a1.getPrijsPerDag());
    }

    @Test
    public void testAutoHuurTweedeAutoInstellen() {
        // Vergelijk het type van de tweede auto
        assertEquals("Ferrari", a2.toString().split(": ")[1].split(" met")[0]);
    }

    @Test
    public void testTweedeAutoPrijsInstellen() {
        // Vergelijk de prijs per dag van de tweede auto
        assertEquals(3500, a2.getPrijsPerDag());
    }
}
