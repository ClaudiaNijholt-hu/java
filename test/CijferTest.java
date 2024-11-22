import org.junit.jupiter.api.Test;

public class CijferTest {
    @Test
    public void testCijfer() {
        Klas k = new Klas("V1Z");
        Leerling l = new Leerling("Hans");
        k.voegLeerlingToe(l);
        l = new Leerling("Jan");
        k.voegLeerlingToe(l);
        l = new Leerling("Wim");
        k.voegLeerlingToe(l);

        System.out.println(k);

        // Wijzig het cijfer van Hans naar 7.6
        k.wijzigCijfer("Hans", 7.6);

        System.out.println(k.toString());
        System.out.println("Aantal leerlingen: " + k.aantalLeerlingen());
    }
}
