package exerciciosVetor;


import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Baseado nos exercícios de http://www.devfuria.com.br/logica-de-programacao/
 */

public class ExercicioVetor5 {


    /**
     * Exercício 5
     * <p>
     * Valores repetidos em vetor
     * <p>
     * Faça um programa que identifique se em um determinado vetor, existem ou não valores repetidos.
     */

    @Test
    public void verificaVetorComValorRepetido() {

        int[] vetor = {6, 10, 4, 21, 9, 10};

        assertTrue(verificaSePossuiValorRepetido(vetor));
    }

    @Test
    public void verificaVetorComValorRepetido2() {

        int[] vetor = {6, 10, 4, 21, 9, 6};

        assertTrue(verificaSePossuiValorRepetido(vetor));
    }

    @Test
    public void verificaVetorSemValorRepetido() {

        int[] vetor = {1, 2, 3, 4, 5, 6};

        assertFalse(verificaSePossuiValorRepetido(vetor));
    }

    private boolean verificaSePossuiValorRepetido(int[] vetor) {

        for (int i = 0; i < vetor.length; i++) {
            for (int j = 0; j < vetor.length; j++) {
                if (vetor[i] == vetor[j]) {
                    return true;
                }

            }
        }
        return false;
    }
}

