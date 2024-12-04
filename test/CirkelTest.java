import org.junit.jupiter.api.Test;
import practicum3b.Cirkel;

import static org.junit.jupiter.api.Assertions.*;

public class CirkelTest {

    @Test
    public void testCirkelWordtCorrectAangemaaktMetGeldigeRadius() {
        Cirkel c1 = new Cirkel(10, 5, 5);
        assertNotNull(c1, "Een cirkel met een geldige radius moet succesvol worden aangemaakt.");
    }

    @Test
    public void testCirkelMetRadiusNulGeeftIllegalArgumentException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Cirkel(0, 10, 10);
        });
        assertEquals("Radius moet groter dan 0 zijn!", exception.getMessage(),
                "De foutmelding moet aangeven dat de radius groter dan 0 moet zijn.");
    }

    @Test
    public void testCirkelMetNegatieveRadiusGeeftIllegalArgumentException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Cirkel(-5, 10, 10);
        });
        assertEquals("Radius moet groter dan 0 zijn!", exception.getMessage(),
                "De foutmelding moet aangeven dat de radius groter dan 0 moet zijn.");
    }
}
