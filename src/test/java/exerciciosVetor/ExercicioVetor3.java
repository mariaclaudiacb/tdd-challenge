package exerciciosVetor;


import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotSame;

/**
 * Baseado nos exercícios de http://www.devfuria.com.br/logica-de-programacao/
 */

public class ExercicioVetor3 {


    /**
     *  Exercício 3
     *
     *  Crie um algoritmo para copiar um vetor (utilize laço de repetição).
     */
    @Ignore
    @Test
    public void copiarVetorUmAcinco() {

        int[] vetor = {1,2,3,4,5};

        int[] copiaVetor = copiaVetor(vetor);

        //Note que o teste espera que o retorno não seja o mesmo objeto, porém igual nos valores

        assertNotSame(copiaVetor,vetor);
        assertArrayEquals(vetor,copiaVetor);
    }

    @Ignore
    @Test
    public void copiarVetorUmADez() {

        int[] vetor = {1,2,3,4,5,6,7,8,9,10};

        int[] copiaVetor = copiaVetor(vetor);

        //Note que o teste espera que o retorno não seja o mesmo objeto, porém igual nos valores

        assertNotSame(copiaVetor,vetor);
        assertArrayEquals(vetor,copiaVetor);
    }

    private int[] copiaVetor(int[] vetor) {

        // Escreva sua lógica abaixo

        return null;
    }
}
