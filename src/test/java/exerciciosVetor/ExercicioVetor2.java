package exerciciosVetor;


import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Baseado nos exercícios de http://www.devfuria.com.br/logica-de-programacao/
 */

public class ExercicioVetor2 {


    /**
     *  Exercício 2
     *
     *  Escreva um algoritmo para carregar um vetor com os números de 1 (inclusive) a n (inclusive) em ordem crescente.
     */
    @Test
    public void carregaVetorUmAcinco() {

        int[] vetor = carregaVetor(5);

        int[] expected = {1,2,3,4,5};
        assertArrayEquals(expected,vetor);
    }

    @Test
    public void carregaVetorUmADez() {

        int[] vetor = carregaVetor(10);

        int[] expected = {1,2,3,4,5,6,7,8,9,10};
        assertArrayEquals(expected,vetor);
    }

    private int[] carregaVetor(int valorMaximo) {

        // Escreva sua lógica abaixo

        int[] vetor = new int[valorMaximo];

        for (int i = 0 ; i < valorMaximo ; i++) {
            vetor[i] = i+1;
        }
        return vetor;
    }
}
