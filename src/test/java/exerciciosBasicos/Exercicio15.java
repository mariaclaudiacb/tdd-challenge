package exerciciosBasicos;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Baseado nos exercícios de http://www.devfuria.com.br/logica-de-programacao/
 */

public class Exercicio15 {

    /**
     * Exercício 15
     *
     * Somar dígitos
     *
     * Faça um programa para somar os dígitos de um inteiro
     *
     * Sem utilizar recursos de string, ou seja, trabalhe apenas com tipos numéricos.
     *
     * Somar dígitos significa que dados um número qualquer, exemplo, 2015, devemos somar seus dígitos:
     *
     * 2  +  0 +  1 +  5
     * O resultado esperado para o número acima seria 8.
     *
     *
     * Dica1: Você pode utilizar o operador módulo (%) de 10 para pegar o algarismo mais à direita de um número
     * Dica2: Treinar operador de loop neste exercício
     *
     */
    @Ignore
    @Test
    public void somarDigitosDeUm() {

        assertEquals(1,somarDigitos(1));
    }

    @Ignore
    @Test
    public void somarDigitosDeVinteEDois() {

        assertEquals(4,somarDigitos(22));
    }

    @Ignore
    @Test
    public void somarDigitosDeQuarentaEUm() {

        assertEquals(5,somarDigitos(41));
    }

    @Ignore
    @Test
    public void somarDigitosDeCentoENoventaEQuatro() {

        assertEquals(14,somarDigitos(194));
    }

    @Ignore
    @Test
    public void somarDigitosDeDoisMilEQuinze() {

        assertEquals(8,somarDigitos(2015));
    }

    private int somarDigitos(int numero) {

        // Aqui entra a lógica do programa.

        return 0;
    }

}
