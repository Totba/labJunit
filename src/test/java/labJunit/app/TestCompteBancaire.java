package labJunit.app;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TestCompteBancaire {
    @Test
    void testDebiterSolde() {
        CompteBancaire cb = new CompteBancaire();
        cb.debiterSolde(500);
        assertEquals(-500, cb.getSolde());
    }

    @Test
    void testCrediterSolde() {
        CompteBancaire cb = new CompteBancaire();
        cb.crediterSolde(1000);
        assertEquals(1000, cb.getSolde());
    }
}
