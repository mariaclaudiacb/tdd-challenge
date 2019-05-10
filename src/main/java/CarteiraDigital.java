public class CarteiraDigital {

    private Double saldo;

    CarteiraDigital() {
        saldo = 0.;
    }

    public void creditar(Double valor) {
        saldo += valor;
    }

    protected boolean saldoInsuficiente(Double valor) {
        return valor > getSaldo();
    }

    public void debitar(Double valor) throws SaldoInSuficienteException {
        if (saldoInsuficiente(valor)) {
            throw new SaldoInSuficienteException();
        }
        saldo -= valor;
    }

    public Double getSaldo() {
        return saldo;
    }

}
