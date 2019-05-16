package exerciciosBasicos;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Baseado nos exercícios de http://www.devfuria.com.br/logica-de-programacao/
 */

public class Exercicio12 {

    /**
     * Exercício 12
     *
     * Valor positivo ou negativo
     *
     * Crie uma função que descubra se um valor é positivo ou negativo (considere o valor zero como positivo)
     *
     */

    @Ignore
    @Test
    public void verificaSeDoisEhPositivo() {

        assertTrue(ehPositivo(2));
    }

    @Ignore
    @Test
    public void verificaSeMenosTresEhPositivo() {

        assertFalse(ehPositivo(-3));
    }

    @Ignore
    @Test
    public void verificaSeZeroEhPositivo() {

        assertTrue(ehPositivo(0));
    }

    private boolean ehPositivo(int numero) {

        // Escreva sua lógica abaixo

        return false;
    }

}
