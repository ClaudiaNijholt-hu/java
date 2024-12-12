import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import practicum5.Klas;
import practicum5.Leerling;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CijferTest {

    private Klas klas;

    @BeforeEach
    public void init() {
        klas = new Klas("V1Z");
    }

    @Test
    public void testWijzigCijfer() {
        // Wijzig het cijfer voor Hans
        assertEquals(0, klas.wijzigCijfer("Hans", 7.6));
    }

    @Test
    public void testWijzigCijferLeerlingNietGevonden() {
        // Probeer een niet-bestaande leerling te wijzigen
        assertEquals(-1, klas.wijzigCijfer("Piet", 8.0));
    }
}