package exerciciosBasicos;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Baseado nos exercícios de http://www.devfuria.com.br/logica-de-programacao/
 */

public class Exercicio6 {

    /**
     * Exercício 6
     *
     * Descobrir os dias de 'n' meses
     *
     * Considerando que todos os meses tenham 30 dias, calcular o total de dias de n meses
     */

    @Test
    public void quantidadeDeDiasDeUmMes() {
        assertEquals(30,dias(1));
    }

    @Test
    public void quantidadeDeDiasDeDoisMeses() {
        assertEquals(60,dias(2));
    }

    @Test
    public void quantidadeDeDiasDeDezMeses() {
        assertEquals(300,dias(10));
    }

    @Test
    public void quantidadeDeDiasDeQuarentaENoveMeses() {
        assertEquals(1470,dias(49));
    }

    private int dias(int quantidadeDeMeses) {

    int numdias = quantidadeDeMeses * 30;



        return numdias;
    }

}
