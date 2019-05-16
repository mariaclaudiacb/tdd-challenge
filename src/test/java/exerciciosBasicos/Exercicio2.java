package exerciciosBasicos;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Baseado nos exercícios de http://www.devfuria.com.br/logica-de-programacao/
 */

public class Exercicio2 {

    /**
     * Exercício 2
     *
     * O dobro de um número qualquer
     *
     * Faça uma função para calcular o dobro de um número qualquer.
     */
    @Ignore
    @Test
    public void oDobroDeUm() {

        assertEquals(2, dobro(1));
    }

    @Ignore
    @Test
    public void oDobroDeDois() {

        assertEquals(4, dobro(2));
    }

    @Ignore
    @Test
    public void oDobroDeTres() {

        assertEquals(6, dobro(3));
    }

    @Ignore
    @Test
    public void oDobroDeNove() {

        assertEquals(18, dobro(9));
    }

    @Ignore
    @Test
    public void oDobroDeQuarenta() {

        assertEquals(80, dobro(40));
    }

    private int dobro(int numeroQualquer) {

        // Escreva sua lógica abaixo


        return 0;
    }
}
