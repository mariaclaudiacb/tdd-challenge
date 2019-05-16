package carteiraDigital;

import org.junit.Before;
import org.junit.Ignore;
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

    @Ignore
    @Test
    public void creditaCinquentaReais_depoisVinteECinco_DeveTerUmaSubcarteira() {
        carteiraDigitalMultipla.creditar(50.);

        assertEquals(50,carteiraDigitalMultipla.getSaldo(),0);
        assertEquals(1, carteiraDigitalMultipla.getQuantidadeSubCarteiras());

        carteiraDigitalMultipla.creditar(25.);
        assertEquals(75,carteiraDigitalMultipla.getSaldo(),0);
        assertEquals(1,carteiraDigitalMultipla.getQuantidadeSubCarteiras());
    }

    @Ignore
    @Test
    public void creditaCentoEVinteReais_DeveFicarComDuasSubcarteiras() {
        carteiraDigitalMultipla.creditar(120.);

        assertEquals(120,carteiraDigitalMultipla.getSaldo(),0);
        assertEquals(2, carteiraDigitalMultipla.getQuantidadeSubCarteiras());
    }

    @Ignore
    @Test
    public void creditaTrezentosEDezReais_DeveFicarComQuatroSubcarteiras() {
        carteiraDigitalMultipla.creditar(310.);

        assertEquals(310,carteiraDigitalMultipla.getSaldo(),0);
        assertEquals(4, carteiraDigitalMultipla.getQuantidadeSubCarteiras());
    }

    @Ignore
    @Test
    public void debitaCinquenta() throws SaldoInsuficienteException {
        carteiraDigitalMultipla.creditar(75.);

        assertEquals(75,carteiraDigitalMultipla.getSaldo(),0);
        assertEquals(1, carteiraDigitalMultipla.getQuantidadeSubCarteiras());

        carteiraDigitalMultipla.debitar(50.);

        assertEquals(25,carteiraDigitalMultipla.getSaldo(),0);
        assertEquals(1,carteiraDigitalMultipla.getQuantidadeSubCarteiras());
    }

    @Ignore
    @Test
    public void debitaCentoEVinte_DeveDiminuirUmaSubcarteira() throws SaldoInsuficienteException {
        carteiraDigitalMultipla.creditar(150.);

        assertEquals(150,carteiraDigitalMultipla.getSaldo(),0);
        assertEquals(2, carteiraDigitalMultipla.getQuantidadeSubCarteiras());

        carteiraDigitalMultipla.debitar(120.);

        assertEquals(30,carteiraDigitalMultipla.getSaldo(),0);
        assertEquals(1,carteiraDigitalMultipla.getQuantidadeSubCarteiras());
    }

    @Ignore
    @Test(expected = SaldoInsuficienteException.class)
    public void debitarSemSaldoSuficiente() throws SaldoInsuficienteException {
        carteiraDigitalMultipla.debitar(300.);
    }

    @Ignore
    @Test
    public void naoDeveDebitarNadaSeLancarException() {

        carteiraDigitalMultipla.creditar(200.);

        assertEquals(200.,carteiraDigitalMultipla.getSaldo(),0);

        try {
            carteiraDigitalMultipla.debitar(300.);
        } catch (SaldoInsuficienteException e) {
            assertEquals(200,carteiraDigitalMultipla.getSaldo(),0);
        }

    }
}