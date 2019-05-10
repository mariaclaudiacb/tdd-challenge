package fatorial;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public abstract class FatorialTest {

    protected Fatorial fatorial;

    @Ignore
    @Test
    public void calcularFatorialDeZero() throws FatorialNumeroNegativoException {
        assertEquals(1, fatorial.calcularFatorial(0));
    }

    @Ignore
    @Test
    public void calcularFatorialDeUm() throws FatorialNumeroNegativoException {
        assertEquals(1, fatorial.calcularFatorial(1));
    }

    @Ignore
    @Test
    public void calcularFatorialDeDois() throws FatorialNumeroNegativoException {
        assertEquals(2, fatorial.calcularFatorial(2));
    }

    @Ignore
    @Test
    public void calcularFatorialDeTres() throws FatorialNumeroNegativoException {
        assertEquals(6, fatorial.calcularFatorial(3));
    }

    @Ignore
    @Test
    public void calcularFatorialDeQuatro() throws FatorialNumeroNegativoException {
        assertEquals(24, fatorial.calcularFatorial(4));
    }

    @Ignore
    @Test
    public void calcularFatorialDeCinco() throws FatorialNumeroNegativoException {
        assertEquals(120, fatorial.calcularFatorial(5));
    }

    @Ignore
    @Test
    public void calcularFatorialDeSeis() throws FatorialNumeroNegativoException {
        assertEquals(720, fatorial.calcularFatorial(6));
    }

    @Ignore
    @Test
    public void calcularFatorialDeSete() throws FatorialNumeroNegativoException {
        assertEquals(5040, fatorial.calcularFatorial(7));
    }

    @Ignore
    @Test(expected = FatorialNumeroNegativoException.class)
    public void calcularFatorialDeNumeroNegativo() throws FatorialNumeroNegativoException {
        fatorial.calcularFatorial(-2);
    }
}