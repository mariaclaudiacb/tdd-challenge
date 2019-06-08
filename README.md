# Desafios TDD

Alguns desafios de programação criados para treinar TDD

## Objetivos

Aprender a utilizar TDD, aprender na prática alguns conceitos da linguagem Java, como recursividade, herança, polimorfismo e etc. Além de aprender a utilizar o git para versionar o código.

## Getting Started

* Fazer fork deste projeto no github
* Clonar o projeto a partir do próprio fork
```
git clone endereco_git
cd tdd-challenge
```

* Criar um branch (resolucao) para implementar os métodos 
```
git checkout -b resolucao
```
* Desenvolver soluções removendo os @Ignore dos testes aos poucos até fazer todos os testes passarem
* Ao final pode commitar o código (pode ir commitando aos poucos durante o desenvolvimento também)
```
git commit -a -m "Mensagem do commit"
git push
```

**Adicional:** Comando para trocar de branch:
```
git checkout nome_do_branch
``` 

## Exercícios básicos

Uma lista de exercícios básicos para treinar lógica de programação. Sem focar tanto em orientação a objetos, o objetivo dos exercícios é fazer pensar um pouco em como resolver alguns problemas computacionalmente.


## Desafio fatorial

1. Implementar o método calculaFatorial utilizando loop (Classe FatorialComLoop)
2. Implementar o método calculaFatorial utilizando recursividade (Classe FatorialComRecursividade)

## Desafio da Carteira Digital

### Classe CarteiraDigital:
* Possui saldo
* Construída com saldo zero
* Métodos creditar, debitar e verificarSaldo (getSaldo)
* Não pode ter saldo menor que zero
* Método debitar recebe um valor a debitar, se não tem saldo suficiente lança uma exception (SaldoInsuficienteException)

### Classe CarteiraDigitalMultipla
* Extende CarteiraDigital
* Possui uma lista de carteiras digitais (subcarteiras)
* Possui método que verifica a quantidade de subcarteiras
* Método getSaldo pega a soma dos saldos de todas as subcarteiras, se não tiver nenhuma retorna zero
* Cada subcarteira pode possuir no máximo 100 reais de saldo
* O método creditar adiciona o valor às subcarteiras, se a subcarteira tiver o valor máximo ele cria mais uma e adiciona o valor restante
* O método debitar, se tiver saldo somando todas as subcarteiras (getSaldo) passa por todas, subtraindo os valores de cada uma até quitar o valor (percorre do maior indice até o menor), também lança exception se não tiver saldo suficiente
* Se uma subcarteira ficar vazia ao debitar deve ser removida
