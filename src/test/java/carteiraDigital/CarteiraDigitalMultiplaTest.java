package carteiraDigital;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CarteiraDigitalMultiplaTest {

    private CarteiraDigitalMultipla carteiraDigitalMultipla;

    @BeforeEach
    void setUp() {
        carteiraDigitalMultipla = new CarteiraDigitalMultipla();

        assertEquals(0,carteiraDigitalMultipla.getQuantidadeSubCarteiras());
        assertEquals(0,carteiraDigitalMultipla.getSaldo());
    }

    @Test
    void creditaCinquentaReais_depoisVinteECinco() {
        carteiraDigitalMultipla.creditar(50.);

        assertEquals(50,carteiraDigitalMultipla.getSaldo());
        assertEquals(1, carteiraDigitalMultipla.getQuantidadeSubCarteiras());

        carteiraDigitalMultipla.creditar(25.);
        assertEquals(75,carteiraDigitalMultipla.getSaldo());
        assertEquals(1,carteiraDigitalMultipla.getQuantidadeSubCarteiras());
    }

    @Test
    void creditaCentoEVinteReais() {
        carteiraDigitalMultipla.creditar(120.);

        assertEquals(120,carteiraDigitalMultipla.getSaldo());
        assertEquals(2, carteiraDigitalMultipla.getQuantidadeSubCarteiras());
    }

    @Test
    void creditaTrezentosEDezReais() {
        carteiraDigitalMultipla.creditar(310.);

        assertEquals(310,carteiraDigitalMultipla.getSaldo());
        assertEquals(4, carteiraDigitalMultipla.getQuantidadeSubCarteiras());
    }

    @Test
    public void debitaCinquenta() throws SaldoInsuficienteException {
        carteiraDigitalMultipla.creditar(75.);

        assertEquals(75,carteiraDigitalMultipla.getSaldo());
        assertEquals(1, carteiraDigitalMultipla.getQuantidadeSubCarteiras());

        carteiraDigitalMultipla.debitar(50.);

        assertEquals(25,carteiraDigitalMultipla.getSaldo());
        assertEquals(1,carteiraDigitalMultipla.getQuantidadeSubCarteiras());
    }

    @Test
    public void debitaCentoEVinte() throws SaldoInsuficienteException {
        carteiraDigitalMultipla.creditar(150.);

        assertEquals(150,carteiraDigitalMultipla.getSaldo());
        assertEquals(2, carteiraDigitalMultipla.getQuantidadeSubCarteiras());

        carteiraDigitalMultipla.debitar(120.);

        assertEquals(30,carteiraDigitalMultipla.getSaldo());
        assertEquals(1,carteiraDigitalMultipla.getQuantidadeSubCarteiras());
    }

    @Test
    public void debitarSemSaldoSuficiente() {
        assertThrows(SaldoInsuficienteException.class, new Executable() {
            public void execute() throws Throwable {
                carteiraDigitalMultipla.debitar(300.);
            }
        });
    }
}