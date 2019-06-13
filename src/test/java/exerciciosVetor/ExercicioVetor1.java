package exerciciosVetor;


import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Baseado nos exercícios de http://www.devfuria.com.br/logica-de-programacao/
 */

public class ExercicioVetor1 {


    /**
     *  Exercício 1
     *
     *  Exercício de lógica de programação onde criaremos uma função para somar um vetor.
     */
    @Test
    public void somaValores1() {

        int[] vetor = new int[]{10,20,30,0};

        assertEquals(60,somaValoresVetor(vetor));
    }

    @Test
    public void somaValores2() {

        int[] vetor = new int[]{10,20,30,40};

        assertEquals(100,somaValoresVetor(vetor));
    }

    @Test
    public void somaValores3() {

        int[] vetor = new int[]{12,20,10,40,9};

        assertEquals(91,somaValoresVetor(vetor));
    }

    private int somaValoresVetor(int[] vetor) {
        int acumulado = 0;
        for(int valor : vetor){
            acumulado += valor;
        }
        System.out.println(acumulado);
        return acumulado;
    }
}
