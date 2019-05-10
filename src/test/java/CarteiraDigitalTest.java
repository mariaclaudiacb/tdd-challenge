import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CarteiraDigitalTest {

    private CarteiraDigital carteiraDigital;

    @BeforeEach
    public void setUp() {
        carteiraDigital = new CarteiraDigital();

        carteiraDigital.creditar(200.);
        assertEquals(200,carteiraDigital.getSaldo());
    }

    @Test
    public void creditar() {
        carteiraDigital.creditar(50.);

        assertEquals(250,carteiraDigital.getSaldo());
    }

    @Test
    public void debitar() throws SaldoInsuficienteException {
        carteiraDigital.debitar(75.);

        assertEquals(125, carteiraDigital.getSaldo());
    }

    @Test
    public void debitarSemSaldoSuficiente() {
        assertThrows(SaldoInsuficienteException.class, new Executable() {
            public void execute() throws Throwable {
                carteiraDigital.debitar(300.);
            }
        });
    }

}