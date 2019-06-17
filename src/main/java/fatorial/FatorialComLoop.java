package fatorial;

public class FatorialComLoop implements Fatorial {

    @Override
    public int calcularFatorial(int valor) throws FatorialNumeroNegativoException {

        int acumulador = 1;
        while (valor > 1) {
            acumulador *= valor--;
        }
        if(valor < 0){
            throw new FatorialNumeroNegativoException();
        }
        return acumulador;
    }

}
