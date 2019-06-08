package listaComArray;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class ListaComArrayTest {

    private Lista list;

    @Before
    public void setUp() throws Exception {
        list = new ListaComArray();

        assertEquals(0,list.tamanho());
    }

    @Ignore
    @Test
    public void controiComTamanhoPreDefinido() {
        list = new ListaComArray(5);

        assertEquals(5,list.tamanho());
    }

    @Ignore
    @Test
    public void verificaSeEstaVazia() {
        assertTrue(list.estaVazia());
    }

    @Ignore
    @Test
    public void verificaSeEstaVaziaAposAdicionarValor() {

        assertTrue(list.adiciona(1));

        assertFalse(list.estaVazia());
    }

    @Ignore
    @Test
    public void size_mudaQuandoAdicionaValor() {

        assertTrue(list.adiciona(1));
        assertEquals(1,list.tamanho());
    }

    @Ignore
    @Test
    public void pegaValorAdicionado() {

        assertTrue(list.adiciona(2));

        assertEquals(2,list.pega(0));

        assertTrue(list.adiciona(3));

        assertEquals(3,list.pega(1));
    }

    @Ignore
    @Test
    public void verificaIndiceDe() {
        assertTrue(list.adiciona(2));
        assertTrue(list.adiciona(3));

        assertEquals(1,list.indiceDe(3));
        assertEquals(-1,list.indiceDe(4));
    }

    @Ignore
    @Test
    public void verificaIndiceDeValorQueNaoExisteNaLista() {
        assertTrue(list.adiciona(2));
        assertTrue(list.adiciona(3));

        assertEquals(-1,list.indiceDe(4));
    }

    @Ignore
    @Test
    public void verificaSeValorExisteNaLista() {
        assertTrue(list.adiciona(2));
        assertTrue(list.adiciona(3));

        assertTrue(list.contem(3));
    }

    @Ignore
    @Test
    public void verificaSeValorExisteNaLista_NaoExiste() {
        assertTrue(list.adiciona(2));
        assertTrue(list.adiciona(3));

        assertFalse(list.contem(4));
    }

    @Ignore
    @Test
    public void limpaLista() {
        assertTrue(list.adiciona(2));

        assertEquals(1,list.tamanho());

        list.limpa();

        assertEquals(0,list.tamanho());
    }

    @Ignore
    @Test
    public void colocaNoIndiceEspecifico() {

        assertTrue(list.adiciona(2));

        assertEquals(2,list.pega(0));

        list.coloca(0,4);

        assertEquals(4,list.pega(0));
    }

    @Ignore
    @Test
    public void removeValorDoMeio() {
        assertTrue(list.adiciona(2));
        assertTrue(list.adiciona(3));
        assertTrue(list.adiciona(4));

        list.remove(3);

        assertEquals(2,list.tamanho());

        assertEquals(2,list.pega(0));
        assertEquals(4,list.pega(1));
    }

    @Ignore
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void tentaPegarValorAcimaDoIndice() {

        list.pega(5);
    }
}