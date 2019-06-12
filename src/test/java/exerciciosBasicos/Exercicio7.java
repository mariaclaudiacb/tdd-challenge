package exerciciosBasicos;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Baseado nos exercícios de http://www.devfuria.com.br/logica-de-programacao/
 */

public class Exercicio7 {

    /**
     * Exercício 7
     *
     * Custo de fabricação de um carro
     *
     * O custo de um carro novo ao consumidor é obtido com a seguinte fórmula:
     *
     * custo final = custo de fábrica +
     *               (custo de fábrica * percentual do distribuidor) +
     *               (custo de fábrica * percentual de impostos)
     *
     *  Implemente uma função que calcule o custo final do carro
     *
     */
    @Test
    public void carroDeDezMil() {
        assertEquals(17300,custoFinalDoCarro(10000,.28,.45),0);
    }

    @Test
    public void carroDeQuarentaECincoMil() {
        assertEquals(77850,custoFinalDoCarro(45000,.28,.45),0);
    }

    @Test
    public void carroDeTrintaESeteMil() {
        assertEquals(64010,custoFinalDoCarro(37000,.28,.45),0);
    }

    @Test
    public void carroDeTrintaESeteMilComPercentuaisDiferentes() {
        assertEquals(62900,custoFinalDoCarro(37000,.20,.50),0);
    }

    @Test
    public void carroDeQuarentaECincoMilComPercentuaisDiferentes() {
        assertEquals(80550,custoFinalDoCarro(45000,.30,.49),0);
    }

    private double custoFinalDoCarro(double custoDeFabrica, double percentualDistribuidor, double percentualDeImpostos) {
        double custoFinal = custoDeFabrica + (custoDeFabrica * percentualDistribuidor) + (custoDeFabrica * percentualDeImpostos);


        return custoFinal;
    }

}
