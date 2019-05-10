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

        int indice = subcarteiras.size() - 1;

        if (subcarteiras.get(indice).getSaldo() + valor > 100) {
            Double valorCreditar = 100 - subcarteiras.get(indice).getSaldo();
            Double valorrestante = valor - valorCreditar;

            subcarteiras.get(indice).creditar(valorCreditar);

            adicionarCarteira();

            creditar(valorrestante);
        } else {
            subcarteiras.get(indice).creditar(valor);
        }
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

        int indice = subcarteiras.size() - 1;

        if (subcarteiras.get(indice).getSaldo() > valor) {
            subcarteiras.get(indice).debitar(valor);
        } else {

            Double valorRestante = valor - subcarteiras.get(indice).getSaldo();
            subcarteiras.remove(indice);
            debitar(valorRestante);
        }
    }

    @Override
    public Double getSaldo() {
        return subcarteiras.stream().map(carteira -> carteira.getSaldo()).reduce((a,b) -> a+b).orElse(0.);
    }

    public int getQuantidadeSubCarteiras() {
        return subcarteiras.size();
    }

}
