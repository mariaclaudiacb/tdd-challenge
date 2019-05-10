package fatorial;

public class FatorialComLoop implements Fatorial {
    
    @Override
    public int calcularFatorial(int valor) throws FatorialNumeroNegativoException {

        if (valor < 0) {
            throw new FatorialNumeroNegativoException();
        }

        if (valor == 0 || valor == 1) {
            return 1;
        }

        int acumulador = 1;
        int contador = 1;

        while (contador <= valor) {
            acumulador *= contador;
            contador++;
        }

        return acumulador;
    }

}
