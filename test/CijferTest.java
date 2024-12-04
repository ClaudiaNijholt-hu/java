import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import practicum5.Klas;
import practicum5.Leerling;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CijferTest {

    private Klas klas;

    @BeforeEach
    public void setUp() {
        klas = new Klas("V1Z");
        klas.voegLeerlingToe(new Leerling("Hans"));
        klas.voegLeerlingToe(new Leerling("Jan"));
        klas.voegLeerlingToe(new Leerling("Wim"));
    }

    @Test
    public void testWijzigCijfer() {
        // Wijzig het cijfer van Hans naar 7.6
        klas.wijzigCijfer("Hans", 7.6);

        // Assert dat het aantal leerlingen in de klas gelijk blijft
        assertEquals(3, klas.aantalLeerlingen());
    }
}