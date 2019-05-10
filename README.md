Classe CarteiraDigital
	possui saldo
	construida com saldo zero
	metodos creditar, debitar e verificarSaldo (getSaldo)
	nao pode ter saldo menor que zero
	metodo debitar recebe um valor a debitar, se não tem saldo suficiente lança uma exception (SaldoInSuficienteException)

Classe CarteiraDigitalMultipla
	extende CarteiraDigital
	possui uma lista de carteirasDigitais
	possui metodo que verifica a quantidade de subcarteiras
	metodo getSaldo pega a soma dos saldos de todas as subcarteiras
	cada subcarteira pode possuir no máximo 100 reais
	o método credidar adiciona o valor às subcarteiras, se a subcarteira tiver o valor máximo ele cria mais uma e adiciona o valor restante
	metodo debitar se tiver saldo somando todas as subcarteiras (getSaldo) ele passa por todas, subtraindo os valores de cada uma até quitar o valor (percorre do maior indice até o menor), também lança exceptio se não tiver saldo suficiente

