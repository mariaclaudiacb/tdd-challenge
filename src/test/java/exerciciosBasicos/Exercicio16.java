package exerciciosBasicos;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Baseado nos exercícios de http://www.devfuria.com.br/logica-de-programacao/
 */

public class Exercicio16 {

    /**
     * Exercício 16
     *
     * Número primo
     *
     * Faça um programa para identificar se um número é primo.
     *
     * Lembre-se que número primo, é um número natural, maior que 1, apenas divisível por si próprio e pela unidade.
     *
     * Dica: Implementar primeiro a função que descobre se é divisão exata e utilizar essa função para descobrir se um número é primo ou não
     *
     *
     */
    @Ignore
    @Test
    public void verificaSeTresDivididoPorUmEhExato() {

        assertTrue(ehDivisaoExata(3,1));
    }

    @Ignore
    @Test
    public void verificaSeTresDivididoPorTresEhExato() {

        assertTrue(ehDivisaoExata(3,3));
    }

    @Ignore
    @Test
    public void verificaSeTresDivididoPorDoisEhExato() {

        assertFalse(ehDivisaoExata(3,2));
    }

    @Ignore
    @Test
    public void doisEhPrimo() {

        assertTrue(ehPrimo(2));
    }

    @Ignore
    @Test
    public void tresEhPrimo() {

        assertTrue(ehPrimo(3));
    }

    @Ignore
    @Test
    public void quatroEhPrimo() {

        assertFalse(ehPrimo(4));
    }

    @Ignore
    @Test
    public void cincoEhPrimo() {

        assertTrue(ehPrimo(5));
    }

    @Ignore
    @Test
    public void seisEhPrimo() {

        assertFalse(ehPrimo(6));
    }

    @Ignore
    @Test
    public void seteEhPrimo() {

        assertTrue(ehPrimo(7));
    }

    @Ignore
    @Test
    public void oitoEhPrimo() {

        assertFalse(ehPrimo(8));
    }

    @Ignore
    @Test
    public void noveEhPrimo() {

        assertFalse(ehPrimo(9));
    }

    @Ignore
    @Test
    public void dezEhPrimo() {

        assertFalse(ehPrimo(10));
    }

    @Ignore
    @Test
    public void onzeEhPrimo() {

        assertTrue(ehPrimo(11));
    }

    @Ignore
    @Test
    public void dozeEhPrimo() {

        assertFalse(ehPrimo(12));
    }

    @Ignore
    @Test
    public void trezeEhPrimo() {

        assertTrue(ehPrimo(13));
    }

    // Função que descobre se o número é ou não primo.
    private boolean ehPrimo(int num) {

        // Aqui entra a lógica do programa.

        return false;
    }

    // Função que descobre se dois números possuem divisão exata.
    private boolean ehDivisaoExata(int dividendo, int divisor) {

        // Aqui entra a lógica do programa.

        return false;
    }

}
