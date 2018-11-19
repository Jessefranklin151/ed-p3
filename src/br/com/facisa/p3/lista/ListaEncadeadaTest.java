package br.com.facisa.p3.lista;

import org.junit.Assert;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.facisa.p3.Item;

class ListaEncadeadaTest {

    private ListaEncadeada lista = new ListaEncadeada();

    @BeforeAll
    static void setUpBeforeClass() throws Exception {
    }

    @AfterAll
    static void tearDownAfterClass() throws Exception {
    }

    @BeforeEach
    void setUp() throws Exception {

	lista.clear();
    }

    @AfterEach
    void tearDown() throws Exception {
    }

    @Test
    public void testeAdicionarElemento() {

	Assert.assertEquals(0, lista.tamanho());
	lista.add(new Item(11));
	lista.add(new Item(10));
	lista.add(new Item(9));
	lista.add(new Item(12));
	Assert.assertEquals(4, lista.tamanho());
    }

    @Test
    public void testeRemoverElemtento() {

	Item item = new Item(11);
	Item item2 = new Item(10);
	Item item3 = new Item(9);
	Item item4 = new Item(12);

	lista.add(item);
	lista.add(item2);
	lista.add(item3);
	lista.add(item4);

	Assert.assertEquals(4, lista.tamanho());

	lista.remove(item2);

	Assert.assertEquals(false, lista.contains(item2));
	Assert.assertEquals(3, lista.tamanho());
    }

    @Test
    public void testeRemoverItemPorPosicao() {

	Item item = new Item(11);
	Item item2 = new Item(10);
	Item item3 = new Item(9);
	Item item4 = new Item(12);

	lista.add(item);
	lista.add(item2);
	lista.add(item3);
	lista.add(item4);

	Assert.assertEquals(4, lista.tamanho());

	lista.remove(1);

	Assert.assertEquals(false, lista.contains(item2));
	Assert.assertEquals(3, lista.tamanho());

    }

    @Test
    public void testeRemoverUltimaPosicao() {

	Item item = new Item(11);
	Item item2 = new Item(10);
	Item item3 = new Item(9);
	Item item4 = new Item(12);

	lista.add(item);
	lista.add(item2);
	lista.add(item3);
	lista.add(item4);

	lista.remove(4);

	Assert.assertEquals(false, lista.contains(item4));
	Assert.assertEquals(3, lista.tamanho());

    }

}
