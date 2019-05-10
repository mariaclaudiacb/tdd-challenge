public class CarteiraDigital {

    private Double saldo;

    CarteiraDigital() {
        saldo = 0.;
    }

    public void creditar(Double valor) {
        saldo += valor;
    }

    public void debitar(Double valor) throws SaldoInSuficienteException {
        if (valor > saldo) {
            throw new SaldoInSuficienteException();
        }
        saldo -= valor;
    }

    public Double getSaldo() {
        return saldo;
    }

}
