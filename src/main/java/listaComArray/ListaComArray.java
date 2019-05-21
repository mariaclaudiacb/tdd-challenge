package listaComArray;

public class ListaComArray implements Lista {

    private int[] array;

    public ListaComArray(int tamanho) {
        array = new int[tamanho];
    }

    public ListaComArray() {
        limpa();
    }

    @Override
    public int tamanho() {
        return array.length;
    }

    @Override
    public boolean contem(int valor) {
        return indiceDe(valor) != -1;
    }

    @Override
    public boolean estaVazia() {
        return array.length == 0;
    }

    @Override
    public boolean adiciona(int valor) {

        int[] novoArray = new int[array.length + 1];

        copiaValores(array,novoArray);
        novoArray[array.length] = valor;

        array = novoArray;

        return true;
    }

    @Override
    public boolean remove(int valor) {

        int indice = indiceDe(valor);

        if (array.length - 1 - indice >= 0)
            System.arraycopy(array, indice + 1, array, indice, array.length - 1 - indice);

        int[] arrayMenor = new int[array.length -1];

        copiaValores(array, arrayMenor);

        array = arrayMenor;

        return true;
    }

    @Override
    public void limpa() {
        array = new int[0];
    }

    @Override
    public int pega(int indice) {
        return array[indice];
    }

    @Override
    public int coloca(int indice, int valor) {
        return array[indice] = valor;
    }

    @Override
    public int indiceDe(int valor) {

        for (int i = 0 ; i < array.length ; i++) {
            if (array[i] == valor) {
                return i;
            }
        }

        return -1;
    }

    private void copiaValores(int[] origem, int[] destino) {

        int tamanhoMenor = origem.length;
        if (destino.length < tamanhoMenor) {
            tamanhoMenor = destino.length;
        }

        System.arraycopy(origem, 0, destino, 0, tamanhoMenor);
    }
}
