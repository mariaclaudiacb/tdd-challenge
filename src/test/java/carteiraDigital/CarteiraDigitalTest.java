package carteiraDigital;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarteiraDigitalTest {

    private CarteiraDigital carteiraDigital;

    @Before
    public void setUp() {
        carteiraDigital = new CarteiraDigital();

        carteiraDigital.creditar(200.);
        assertEquals(200,carteiraDigital.getSaldo(),0);
    }

    @Ignore
    @Test
    public void creditar() {
        carteiraDigital.creditar(50.);

        assertEquals(250,carteiraDigital.getSaldo(),0);
    }

    @Ignore
    @Test
    public void debitar() throws SaldoInsuficienteException {
        carteiraDigital.debitar(75.);

        assertEquals(125, carteiraDigital.getSaldo(),0);
    }

    @Ignore
    @Test(expected = SaldoInsuficienteException.class)
    public void debitarSemSaldoSuficiente() throws SaldoInsuficienteException {
        carteiraDigital.debitar(300.);
    }

}