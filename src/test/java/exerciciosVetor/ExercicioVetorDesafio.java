package exerciciosVetor;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Baseado nos exercícios de http://www.devfuria.com.br/logica-de-programacao/
 */

public class ExercicioVetorDesafio {


    /**
     *  Exercício Desafio
     *
     *  Soma de Gaus
     *
     *  Crie um método que some todos os valores de 0 a 100 sem utilizar laços de repetição (Ver soma de Gaus)
     */

    @Test
    public void somaValoresUmACem() {

        int[] vetor = new int[100];

        for (int i = 0; i < 100; i++) {
            vetor[i] = i+1;
        }
        assertEquals(5050,somaDeGaus(vetor));
    }

    private int somaDeGaus(int[] vetor) {

        // Escreva sua lógica abaixo

        return (vetor[0] + vetor[vetor.length - 1]) * 50;
    }
}
