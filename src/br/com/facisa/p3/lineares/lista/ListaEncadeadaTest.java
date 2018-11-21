package br.com.facisa.p3.lineares.lista;

import org.junit.Assert;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.facisa.p3.lineares.Item;

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
    }

    @AfterEach
    void tearDown() throws Exception {
    	lista.clear();
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

	Item item = new Item(1);
	Item item2 = new Item(2);
	Item item3 = new Item(3);
	Item item4 = new Item(4);

	lista.add(item);
	lista.add(item2);
	lista.add(item3);
	lista.add(item4);

	Assert.assertEquals(4, lista.tamanho());

	lista.remove(item2);
	
	Assert.assertEquals(3, lista.tamanho());
	Assert.assertEquals(false, lista.contains(item2));
    }

    @Test
    public void testeRemoverItemPorPosicao() {

	Item item = new Item(1);
	Item item2 = new Item(2);
	Item item3 = new Item(3);
	Item item4 = new Item(4);

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

	Item item = new Item(9); // 0
	Item item2 = new Item(10); // 1
	Item item3 = new Item(11); // 2
	Item item4 = new Item(12); // 3 vai ser deletado.

	lista.add(item);
	lista.add(item2);
	lista.add(item3);
	lista.add(item4);

	lista.remove(3);

	Assert.assertEquals(false, lista.contains(item4));
	Assert.assertEquals(3, lista.tamanho());
	Assert.assertEquals(null, lista.get(3));

    }

}
