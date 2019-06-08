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


## Desafio Fatorial

1. Implementar o método calculaFatorial utilizando loop (Classe FatorialComLoop)
2. Implementar o método calculaFatorial utilizando recursividade (Classe FatorialComRecursividade)

## Desafio Lista Dinâmica
Os arrays no java possuem tamanho fixo, isso dificulta quando queremos adicionar ou remover valores sem antes saber qual a quantidade de valores iremos adicionar. Porém existe uma estrutura de dados chamada **lista**, a qual possui tamanho dinâmico, podemos adicionar e remover valores sem nos preocuparmos com o tamanho atual da lista.

##### Desafio Lista:
Criar uma lista utilizando arrays. Aumentando e diminuindo o tamanho de um array, devemos criar uma lista com tamanho dinâmico.
* Implementar a classe ListaComArray utilizando um array, cuja interface é a classe Lista.
* Essa classe possui dois construtores, um vai construir nossa lista com tamanho zero, outro com um tamanho pré definido
* **Dica:** Para alterar o tamanho do array será necessário criar um novo array, maior e menor e copiar os valores do antigo para o novo. Será necessário criar um método que faça essa cópia de valores de um para o outro.

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
* Se uma subtcarteira ficar vazia ao debitar deve ser removida
