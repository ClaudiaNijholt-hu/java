import practicum2b.Voetbalclub;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class VoetbalclubTest {

    private Voetbalclub club;

    @BeforeEach
    public void setUp() {
        // Initialiseer een nieuwe Voetbalclub voor elke test
        club = new Voetbalclub("Ajax");
    }

    // Logische testgevallen
    @Test
    public void testClubNaamBijNullMoetDefaultNaamGebruikten() {
        Voetbalclub clubMetNullNaam = new Voetbalclub(null);
        assertTrue(clubMetNullNaam.toString().contains("FC"), "De naam moet 'FC' zijn als null wordt ingevoerd.");
    }

    @Test
    public void testLegeClubNaamMoetDefaultNaamGebruikten() {
        Voetbalclub clubMetLegeNaam = new Voetbalclub("");
        assertTrue(clubMetLegeNaam.toString().contains("FC"), "De naam moet 'FC' zijn als een lege string wordt ingevoerd.");
    }

    @Test
    public void testHerhaaldelijkResultatenVerwerkenGeeftCorrecteWedstrijdOptelling() {
        club.verwerkResultaat('w');
        club.verwerkResultaat('g');
        club.verwerkResultaat('v');
        assertTrue(club.toString().contains(" 3 "), "Het aantal gespeelde wedstrijden moet correct worden opgeteld.");
    }

    @Test
    public void testHerhaaldelijkResultatenVerwerkenGeeftCorrectePuntenOptelling() {
        club.verwerkResultaat('w');
        club.verwerkResultaat('g');
        club.verwerkResultaat('v');
        assertTrue(club.toString().contains(" 4"), "Het puntensaldo moet correct worden berekend.");
    }

    // Fysieke testgevallen
    @Test
    public void testCorrectPuntenBijWinst() {
        club.verwerkResultaat('w');
        assertTrue(club.toString().contains(" 3"), "Bij winst moeten 3 punten worden toegekend.");
    }

    @Test
    public void testCorrectPuntenBijGelijkspel() {
        club.verwerkResultaat('g');
        assertTrue(club.toString().contains(" 1"), "Bij gelijkspel moet 1 punt worden toegekend.");
    }

    @Test
    public void testFoutieveInvoerResultaatBeïnvloedtNietWedstrijden() {
        club.verwerkResultaat('x'); // Foutieve invoer
        assertTrue(club.toString().contains(" 0 "), "Het aantal gespeelde wedstrijden moet 0 blijven bij foutieve invoer.");
    }
}