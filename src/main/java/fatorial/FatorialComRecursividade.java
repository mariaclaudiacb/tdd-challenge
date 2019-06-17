package fatorial;

import javax.swing.*;

public class FatorialComRecursividade implements Fatorial {

    @Override
    public int calcularFatorial(int valor) throws FatorialNumeroNegativoException {
        if(valor == 0 ||  valor == 1){
            return 1;
        }
        if(valor < 0){
            throw new FatorialNumeroNegativoException();
        }
        return valor * calcularFatorial(valor -1);
    }
}
