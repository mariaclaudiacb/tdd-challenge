package exerciciosVetor;


/**
 * Baseado nos exercícios de http://www.devfuria.com.br/logica-de-programacao/
 */

public class ExercicioVetor5 {


    /**
     *  Exercício 5
     *
     *  Valores repetidos em vetor
     *
     *  Faça um programa que identifique se em um determinado vetor, existem ou não valores repetidos.
     */
    /*@Test
    public void maiorEMenorIndice() {

        int[] vetor = {6,10,4,21,9};

        assertEquals(3,indiceDoMaiorValor(vetor)); // O maior valor é 21, seu índice é 3

        assertEquals(2,indiceDoMenorValor(vetor)); // O menor valor é 4, seu índice é 2
    }

    @Test
    public void maiorEMenorIndice2() {

        int[] vetor = {45,8,70,9,19,64,100,2,8,10};

        assertEquals(6,indiceDoMaiorValor(vetor)); // O maior valor é 100, seu índice é 3

        assertEquals(7,indiceDoMenorValor(vetor)); // O menor valor é 2, seu índice é 7
    }

    private int indiceDoMaiorValor(int[] vetor) {

        // Escreva sua lógica abaixo

        int valorMaior = -1;
        int indiceMaior = 0;

        for (int i = 0 ; i<vetor.length;i++) {
            if (valorMaior < vetor[i]) {
                valorMaior = vetor[i];
                indiceMaior = i;
            }
        }

       return indiceMaior;
    }

    private int indiceDoMenorValor(int[] vetor) {

        // Escreva sua lógica abaixo

        int valorMenor = Integer.MAX_VALUE;
        int indiceMenor = 0;

        for (int i = 0 ; i<vetor.length;i++) {
            if (valorMenor > vetor[i]) {
                valorMenor = vetor[i];
                indiceMenor = i;
            }
        }

        return indiceMenor;
    }*/
}
