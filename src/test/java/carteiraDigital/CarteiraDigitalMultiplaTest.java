package carteiraDigital;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarteiraDigitalMultiplaTest {

    private CarteiraDigitalMultipla carteiraDigitalMultipla;

    @Before
    public void setUp() {
        carteiraDigitalMultipla = new CarteiraDigitalMultipla();

        assertEquals(0,carteiraDigitalMultipla.getQuantidadeSubCarteiras());
        assertEquals(0,carteiraDigitalMultipla.getSaldo(),0);
    }

    @Test
    public void creditaCinquentaReais_depoisVinteECinco() {
        carteiraDigitalMultipla.creditar(50.);

        assertEquals(50,carteiraDigitalMultipla.getSaldo(),0);
        assertEquals(1, carteiraDigitalMultipla.getQuantidadeSubCarteiras());

        carteiraDigitalMultipla.creditar(25.);
        assertEquals(75,carteiraDigitalMultipla.getSaldo(),0);
        assertEquals(1,carteiraDigitalMultipla.getQuantidadeSubCarteiras());
    }

    @Test
    public void creditaCentoEVinteReais() {
        carteiraDigitalMultipla.creditar(120.);

        assertEquals(120,carteiraDigitalMultipla.getSaldo(),0);
        assertEquals(2, carteiraDigitalMultipla.getQuantidadeSubCarteiras());
    }

    @Test
    public void creditaTrezentosEDezReais() {
        carteiraDigitalMultipla.creditar(310.);

        assertEquals(310,carteiraDigitalMultipla.getSaldo(),0);
        assertEquals(4, carteiraDigitalMultipla.getQuantidadeSubCarteiras());
    }

    @Test
    public void debitaCinquenta() throws SaldoInsuficienteException {
        carteiraDigitalMultipla.creditar(75.);

        assertEquals(75,carteiraDigitalMultipla.getSaldo(),0);
        assertEquals(1, carteiraDigitalMultipla.getQuantidadeSubCarteiras());

        carteiraDigitalMultipla.debitar(50.);

        assertEquals(25,carteiraDigitalMultipla.getSaldo(),0);
        assertEquals(1,carteiraDigitalMultipla.getQuantidadeSubCarteiras());
    }

    @Test
    public void debitaCentoEVinte() throws SaldoInsuficienteException {
        carteiraDigitalMultipla.creditar(150.);

        assertEquals(150,carteiraDigitalMultipla.getSaldo(),0);
        assertEquals(2, carteiraDigitalMultipla.getQuantidadeSubCarteiras());

        carteiraDigitalMultipla.debitar(120.);

        assertEquals(30,carteiraDigitalMultipla.getSaldo(),0);
        assertEquals(1,carteiraDigitalMultipla.getQuantidadeSubCarteiras());
    }

    @Test(expected = SaldoInsuficienteException.class)
    public void debitarSemSaldoSuficiente() throws SaldoInsuficienteException {
        carteiraDigitalMultipla.debitar(300.);
    }
}