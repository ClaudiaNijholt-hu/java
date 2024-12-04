import org.junit.jupiter.api.Test;
import practicum4a.Persoon;
import practicum4a.Huis;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HuisbaasTest {

    @Test
    public void testHuisbaasInstellenEnGetHuisbaas() {
        Huis h1 = new Huis("Nijenoord 1", 1970);
        Persoon p1 = new Persoon("Ronald Plasterk", 52);
        h1.setHuisbaas(p1);

        Huis h2 = new Huis("Vredenburg", 1991);
        Persoon p2 = new Persoon("Annie Brouwers", 59);
        h2.setHuisbaas(p2);

        assertEquals("Ronald Plasterk; leeftijd 52 jaar", h1.getHuisbaas().toString());

        assertEquals("Annie Brouwers; leeftijd 59 jaar", h2.getHuisbaas().toString());
    }
}