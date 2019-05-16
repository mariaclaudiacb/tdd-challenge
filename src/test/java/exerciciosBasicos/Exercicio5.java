package exerciciosBasicos;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Baseado nos exercícios de http://www.devfuria.com.br/logica-de-programacao/
 */

public class Exercicio5 {

    /**
     * Exercício 5
     *
     * Média simples de 3 números
     *
     * Faça um programa que calcule a média simples (aritmética) de 3 valores quaisquer.
     */
    @Ignore
    @Test
    public void mediaDeSeisSeteEOito() {
        assertEquals(7,media(6,7,8));
    }

    @Ignore
    @Test
    public void mediaDeDoisSeteEDez() {
        assertEquals(6,media(2,7,10));
    }

    @Ignore
    @Test
    public void mediaDeVinteQuatroENove() {
        assertEquals(11,media(20,4,9));
    }

    private int media(int valor1, int valor2, int valor3) {

        // Escreva sua lógica abaixo




        return 0;
    }

}
