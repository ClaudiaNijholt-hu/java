import org.junit.jupiter.api.Test;
import practicum3b.Cirkel;

public class CirkelTest {
    @Test
    public void test() {
        Cirkel c1 = null, c2 = null;

        // Uitkomst;
        // Zonder try catch stop de applicatie tijdens het uitvoeren

        // Verklaring:
        // De code compileert nog steeds omdat de IllegalArgumentException
        // een runtime exception is, en de compiler vereist niet dat je die moet afvangen.
        // De code zal compileren, maar de applicatie zal stoppen tijdens uitvoering wanneer
        // de uitzondering optreedt.

        try {
            c1 = new Cirkel(10, 0, 0);
            c2 = new Cirkel(0, 10, 10);
        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        }

        System.out.println(c1);
        System.out.println(c2);
    }
}
