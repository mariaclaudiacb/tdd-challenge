package carteiraDigital;

import java.util.ArrayList;
import java.util.List;

public class CarteiraDigitalMultipla extends CarteiraDigital {

    private List<CarteiraDigital> subcarteiras;

    public CarteiraDigitalMultipla() {
        subcarteiras = new ArrayList<CarteiraDigital>();
    }

    @Override
    public void creditar(Double valor) {

        if (valor == 0) {
            return;
        }

        if (subcarteiras.size() == 0) {
            adicionarCarteira();
        }

        CarteiraDigital ulimaCarteira = pegaUltimaCarteiraAdicionada();

        if (saldoResultanteMaiorQueLimite(ulimaCarteira.getSaldo(),valor)) {
            Double valorCreditar = 100 - ulimaCarteira.getSaldo();
            Double valorRestante = valor - valorCreditar;

            ulimaCarteira.creditar(valorCreditar);

            adicionarCarteira();

            creditar(valorRestante);
        } else {
            ulimaCarteira.creditar(valor);
        }
    }
    
    private boolean saldoResultanteMaiorQueLimite(Double saldo, Double valor) {
        return saldo + valor > 100;
    }
    
    private CarteiraDigital pegaUltimaCarteiraAdicionada() {
        int indice = subcarteiras.size() - 1;
        return subcarteiras.get(indice);
    }

    private void adicionarCarteira() {
        CarteiraDigital carteiraDigital = new CarteiraDigital();
        subcarteiras.add(carteiraDigital);
    }

    @Override
    public void debitar(Double valor) throws SaldoInsuficienteException {

        if (saldoInsuficiente(valor)) {
            throw new SaldoInsuficienteException();
        }

        CarteiraDigital ulimaCarteira = pegaUltimaCarteiraAdicionada();

        if (ulimaCarteira.getSaldo() > valor) {
            ulimaCarteira.debitar(valor);
        } else {

            Double valorRestante = valor - ulimaCarteira.getSaldo();
            removerUltimaCarteira();
            debitar(valorRestante);
        }
    }
    
    private void removerUltimaCarteira() {
        int indice = subcarteiras.size() - 1;
        subcarteiras.remove(indice);
    }

    @Override
    public Double getSaldo() {
        return subcarteiras.stream().map(carteira -> carteira.getSaldo()).reduce((a,b) -> a+b).orElse(0.);
    }

    public int getQuantidadeSubCarteiras() {
        return subcarteiras.size();
    }

}
