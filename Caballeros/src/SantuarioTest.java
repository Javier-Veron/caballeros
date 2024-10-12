import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class SantuarioTest {

    Santuario s1 = new Santuario();
    Santuario s2 = new Santuario();
    Santuario s3 = new Santuario();
    Santuario s4 = new Santuario();
    Santuario s5 = new Santuario();

    Caballero c1 = new Caballero("Javier",10,300,new Constelacion("Capricornio",1200,true));
    Caballero c2 = new Caballero("Ulises",12,200,new Constelacion("Picis",1000,false));
    Caballero c3 = new Caballero("Leonel",14,100,new Constelacion("Cancer",999,false));
    Caballero c4 = new Caballero("Marcelo",16,200,new Constelacion("Virgo",600,true));

    @Test
    void posibleHades() {
        s1.listaCaballeros.add(c1);
        assertTrue(s1.posibleHades());

        s2.listaCaballeros.add(c2);
        s2.listaCaballeros.add(c3);
        assertFalse(s2.posibleHades());

        s3.listaCaballeros.add(c2);
        s3.listaCaballeros.add(c1);
        s3.listaCaballeros.add(c3);
        assertTrue(s3.posibleHades());
    }

    @Test
    void caballerosConConstelacionesCercanasAlSol() {

        s1.listaCaballeros.add(c1);
        s1.listaCaballeros.add(c2);
        s1.listaCaballeros.add(c3);
        s1.listaCaballeros.add(c4);

        s2.listaCaballeros.add(c3);
        s2.listaCaballeros.add(c4);

        s3.listaCaballeros.add(c4);
        s3.listaCaballeros.add(c2);
        s3.listaCaballeros.add(c1);
        s3.listaCaballeros.add(c3);

        s4.listaCaballeros.add(c4);
        s4.listaCaballeros.add(c3);

        assertEquals(s2.listaCaballeros,s1.caballerosConConstelacionesCercanasAlSol());
        assertEquals(s4.listaCaballeros,s3.caballerosConConstelacionesCercanasAlSol());
    }

    @Test
    void precoces() {
        s1.listaCaballeros.add(c1);
        s1.listaCaballeros.add(c2);
        s1.listaCaballeros.add(c3);
        s1.listaCaballeros.add(c4);

        assertEquals(1,s1.precoces());

        s2.listaCaballeros.add(c2);
        s2.listaCaballeros.add(c3);
        s2.listaCaballeros.add(c4);

        assertEquals(0,s2.precoces());
    }

    @Test
    void caballerosPoderos() {

        s4.listaCaballeros.add(c1);

        s1.listaCaballeros.add(c1);
        s1.listaCaballeros.add(c2);
        s1.listaCaballeros.add(c3);
        s1.listaCaballeros.add(c4);

        assertEquals(s4.listaCaballeros,s1.caballerosPoderos());


        s2.listaCaballeros.add(c2);
        s2.listaCaballeros.add(c3);
        s2.listaCaballeros.add(c4);

        assertEquals(s5.listaCaballeros,s2.caballerosPoderos());


        s3.listaCaballeros.add(c2);
        s3.listaCaballeros.add(c3);
        s3.listaCaballeros.add(c4);
        s3.listaCaballeros.add(c1);

        assertEquals(s4.listaCaballeros,s3.caballerosPoderos());
    }
}