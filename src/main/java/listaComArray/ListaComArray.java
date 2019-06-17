package listaComArray;

public class ListaComArray implements Lista {

    private int[] array;

   public ListaComArray(int tamanho) {
        array = new int[tamanho];
   }

    public ListaComArray() {
        array = new int[0];
    }

    @Override
    public int tamanho() {
        return  array.length;
    }

    @Override
    public boolean contem(int valor) {
        for (int i =0; i< array.length; i++){
            if(array[i] == valor){
                return true;
            }
        }
        return false;

    }

    @Override
    public boolean estaVazia() {
       if (array.length == 0){
           return true;
       }else{
           return false;
       }
    }

    @Override
    public boolean adiciona(int valor) {
        int [] arrayadd = new int[array.length + 1];
        System.arraycopy(array,0, arrayadd ,0, array.length);
        arrayadd[array.length] = valor;
        array = arrayadd;
        return true;
   }

    @Override
    public boolean remove(int valor) {
        int[] array2 = new int[array.length -1];
        int indice = indiceDe(valor);
        boolean achou = false;

        for(int i = 0; i < array.length; i++){

            if (i == indice) {
                achou = true;
                continue;
            }

            if (!achou) {
                array2[i] = array[i];
            } else {
                array2[i-1] = array[i];
            }
        }
        array = array2;
        return false;
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
        return 0;
    }

    @Override
    public int indiceDe(int valor) {
        for (int i =0; i< array.length; i++){
            if(array[i] == valor){
                return i;
            }
        }
        return -1;
    }
}
