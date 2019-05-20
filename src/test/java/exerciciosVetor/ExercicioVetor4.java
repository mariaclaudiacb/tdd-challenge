package exerciciosVetor;


import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Baseado nos exercícios de http://www.devfuria.com.br/logica-de-programacao/
 */

public class ExercicioVetor4 {


    /**
     *  Exercício 4
     *
     *  Maior e menor índice do vetor
     *
     *  Dado um vetor qualquer sem valores repetidos, descubra qual é o índice do maior valor e o índice do menor valor.
     */
    @Ignore
    @Test
    public void maiorEMenorIndice() {

        int[] vetor = {6,10,4,21,9};

        assertEquals(3,indiceDoMaiorValor(vetor)); // O maior valor é 21, seu índice é 3

        assertEquals(2,indiceDoMenorValor(vetor)); // O menor valor é 4, seu índice é 2
    }

    @Ignore
    @Test
    public void maiorEMenorIndice2() {

        int[] vetor = {45,8,70,9,19,64,100,2,8,10};

        assertEquals(6,indiceDoMaiorValor(vetor)); // O maior valor é 100, seu índice é 3

        assertEquals(7,indiceDoMenorValor(vetor)); // O menor valor é 2, seu índice é 7
    }

    private int indiceDoMaiorValor(int[] vetor) {

        // Escreva sua lógica abaixo

        return 0;
    }

    private int indiceDoMenorValor(int[] vetor) {

        // Escreva sua lógica abaixo

        return 0;
    }
}
