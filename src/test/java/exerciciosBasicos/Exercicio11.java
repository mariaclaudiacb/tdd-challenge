package exerciciosBasicos;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Baseado nos exercícios de http://www.devfuria.com.br/logica-de-programacao/
 */

public class Exercicio11 {

    /**
     * Exercício 11
     *
     * Valor par ou ímpar
     *
     * Crie uma função que descubra se um valor é par ou ímpar.
     *
     * Neste exercício nós utilizarmos o operador módulo %.
     *
     * A operação módulo encontra o resto da divisão de um número por outro.
     *
     * Dados dois números a (o dividendo) e b o divisor, a modulo b (a mod b) é o resto da divisão de a por b.
     *
     * Por exemplo, 7 mod 3 seria 1, enquanto 9 mod 3 seria 0.
     *
     * Lembrando que determinamos se um número é par ou ímpar se ele é divisível ou não por dois respectivamente
     *
     */
    @Test
    public void verificaSeDoisEhPar() {

        assertTrue(ehPar(2));
    }

    @Test
    public void verificaSeTresEhPar() {

        assertFalse(ehPar(3));
    }

    @Test
    public void verificaSeVinteEhPar() {

        assertTrue(ehPar(20));
    }

    @Test
    public void verificaSeTrintaEUmEhPar() {

        assertFalse(ehPar(31));
    }


    private boolean ehPar(int numero) {

        // Escreva sua lógica abaixo

        return numero % 2 == 0;
    }

}
