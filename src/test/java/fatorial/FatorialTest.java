package fatorial;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.assertThrows;

public abstract class FatorialTest {

    protected Fatorial fatorial;

    @Test
    void calcularFatorialDeZero() throws FatorialNumeroNegativoException {
        Assertions.assertEquals(1, fatorial.calcularFatorial(0));
    }

    @Test
    void calcularFatorialDeUm() throws FatorialNumeroNegativoException {
        Assertions.assertEquals(1, fatorial.calcularFatorial(1));
    }

    @Test
    public void calcularFatorialDeDois() throws FatorialNumeroNegativoException {
        Assertions.assertEquals(2, fatorial.calcularFatorial(2));
    }

    @Test
    public void calcularFatorialDeTres() throws FatorialNumeroNegativoException {
        Assertions.assertEquals(6, fatorial.calcularFatorial(3));
    }

    @Test
    public void calcularFatorialDeQuatro() throws FatorialNumeroNegativoException {
        Assertions.assertEquals(24, fatorial.calcularFatorial(4));
    }

    @Test
    public void calcularFatorialDeCinco() throws FatorialNumeroNegativoException {
        Assertions.assertEquals(120, fatorial.calcularFatorial(5));
    }

    @Test
    public void calcularFatorialDeSeis() throws FatorialNumeroNegativoException {
        Assertions.assertEquals(720, fatorial.calcularFatorial(6));
    }

    @Test
    public void calcularFatorialDeSete() throws FatorialNumeroNegativoException {
        Assertions.assertEquals(5040, fatorial.calcularFatorial(7));
    }

    @Test
    public void calcularFatorialDeNumeroNegativo() {

        assertThrows(FatorialNumeroNegativoException.class, new Executable() {
            public void execute() throws Throwable {
                fatorial.calcularFatorial(-2);
            }
        });
    }
}