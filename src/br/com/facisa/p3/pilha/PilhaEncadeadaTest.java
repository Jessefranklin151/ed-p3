package br.com.facisa.p3.pilha;

import org.junit.Assert;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.facisa.p3.Item;
import br.com.facisa.p3.exceptions.EstruturaDeDadosVaziaException;
import br.com.facisa.p3.exceptions.ItemInvalidoException;

class PilhaEncadeadaTest {

    private PilhaEncadeada pilha = new PilhaEncadeada();

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
    }

    @Test
    public void testePush() throws ItemInvalidoException {

	Item item1 = new Item(1);

	pilha.push(item1);
	Assert.assertEquals(1, pilha.size());
    }

    @Test
    public void testeAdicionarItemComListaVazia() {

	Assertions.assertThrows(EstruturaDeDadosVaziaException.class, () -> {
	    pilha.pop();
	});

    }

    @Test
    public void adicionarItemNulo() {

	Assertions.assertThrows(ItemInvalidoException.class, () -> {
	    pilha.push(null);
	});

    }

    @Test
    public void testPop() throws EstruturaDeDadosVaziaException, ItemInvalidoException {

	Item item1 = new Item(1);

	pilha.push(item1);

	Assert.assertEquals(item1, pilha.pop());
	Assert.assertEquals(0, pilha.size());

	Item item2 = new Item(2);
	Item item3 = new Item(2);

	pilha.push(item2);
	pilha.push(item3);

	Assert.assertEquals(item3, pilha.pop());
	Assert.assertEquals(item2, pilha.pop());
    }

    @Test
    public void testTop() throws ItemInvalidoException, EstruturaDeDadosVaziaException {

	Item item1 = new Item(1);
	Item item2 = new Item(2);

	pilha.push(item1);
	pilha.push(item2);

	Assert.assertEquals(item2, pilha.top());
	Assert.assertEquals(item2, pilha.pop());
	Assert.assertEquals(item1, pilha.top());

    }

}
