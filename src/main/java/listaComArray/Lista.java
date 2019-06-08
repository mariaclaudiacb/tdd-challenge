package listaComArray;

public interface Lista {

    /**
     *
     * Retorna o tamanho da nossa lista
     */
    public int tamanho();

    /**
     *
     * Verifica se um determinado valor está na nossa lista, retorna -1 se não estiver
     */
    public boolean contem(int valor);

    /**
     *
     * Verifica se nossa lista está vazia
     */
    public boolean estaVazia();

    /**
     *
     * Adiciona um valor à nossa lista, esse valor será adicionado após o último indice existente, por exemplo se nossa lista tiver {1,2,3}, e adicionarmos o valor 5,
     * ele será adicionado após o último íncice: {1,2,3,5}
     */
    public boolean adiciona(int valor);

    /**
     *
     * Remove um valor de nossa lista, ele irá diminuir um valor no tamanho de nossa lista e trazer para a esquerda os valores que permanecem, por exemplo
     * na lista {1,4,5} se removermos o 4 nossa lista ficará {1,5}, ou seja, sem um espaço em brando entre o 1 e o 5.
     */
    public boolean remove(int valor);

    /**
     * Remove todos elementos da lista e ela fica com tamanho zero
     */
    public void limpa();

    /**
     * Pega uma valor de um índice específico
     *
     */
    public int pega(int indice);

    /**
     *
     * Colocar um valor em um índice específico, se o índice não existir deixa ele lançar a exceção que já normalmente o array lança
     */
    public int coloca(int indice, int valor);

    /**
     *
     * Retorna o índice de um valor espeífico
     */
    public int indiceDe(int valor);

}
