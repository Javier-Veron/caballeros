import static org.junit.jupiter.api.Assertions.*;

class ConstelacionTest {

    Constelacion c1 = new Constelacion(1000);
    Constelacion c2 = new Constelacion(999);

    @org.junit.jupiter.api.Test
    void cercanaAlSol() {

        assertFalse(c1.cercanaAlSol());
        assertTrue(c2.cercanaAlSol());

    }
}