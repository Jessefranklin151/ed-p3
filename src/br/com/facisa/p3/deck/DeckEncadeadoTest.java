package br.com.facisa.p3.deck;

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

class DeckEncadeadoTest {

    private DeckEncadeado deck = new DeckEncadeado();

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
    public void testeInsertItemFirst() throws ItemInvalidoException {

	Item item1 = new Item(1);
	Item item2 = new Item(2);
	Item item3 = new Item(3);

	deck.insertFirst(item1);
	Assert.assertEquals(item1, deck.peekFirst());
	deck.insertFirst(item2);
	Assert.assertEquals(item2, deck.peekFirst());
	deck.insertFirst(item3);
	Assert.assertEquals(item3, deck.peekFirst());

    }

    @Test
    public void testeInserirItemNulo() {

	Assertions.assertThrows(ItemInvalidoException.class, () -> {
	    deck.insertFirst(null);
	});

	Assertions.assertThrows(ItemInvalidoException.class, () -> {
	    deck.insertLast(null);
	});
    }

    @Test
    public void removerItensComListaVazia() {

	Assertions.assertThrows(EstruturaDeDadosVaziaException.class, () -> {
	    deck.removeFirst();
	});

	Assertions.assertThrows(EstruturaDeDadosVaziaException.class, () -> {
	    deck.removeLast();
	});
    }

    @Test
    public void testeInsertItemLast() throws ItemInvalidoException {
	Item item1 = new Item(1);
	Item item2 = new Item(2);
	Item item3 = new Item(3);

	deck.insertLast(item1);
	deck.insertLast(item2);
	deck.insertLast(item3);

    }

    @Test
    public void testPeekFirt() throws ItemInvalidoException {

	Item item1 = new Item(1);
	Item item2 = new Item(2);
	Item item3 = new Item(3);

	deck.insertFirst(item1);
	Assert.assertEquals(item1, deck.peekFirst());
	deck.insertFirst(item2);
	Assert.assertEquals(item2, deck.peekFirst());
	deck.insertFirst(item3);
	Assert.assertEquals(item3, deck.peekFirst());

    }

    @Test
    public void testePeekLast() throws ItemInvalidoException {

	Item item1 = new Item(1);
	Item item2 = new Item(2);
	Item item3 = new Item(3);

	deck.insertFirst(item1);
	Assert.assertEquals(item1, deck.peekLast());
	deck.insertFirst(item2);
	Assert.assertEquals(item1, deck.peekLast());
	deck.insertFirst(item3);
	Assert.assertEquals(item1, deck.peekLast());

    }

    @Test
    public void testeSize() throws ItemInvalidoException {

	Item item1 = new Item(1);
	Item item2 = new Item(2);
	Item item3 = new Item(3);

	deck.insertFirst(item1);
	Assert.assertEquals(1, deck.size());
	deck.insertFirst(item2);
	Assert.assertEquals(2, deck.size());
	deck.insertFirst(item3);
	Assert.assertEquals(3, deck.size());

    }

    @Test
    public void testeAdicionaFirtRemoveFirst() throws ItemInvalidoException, EstruturaDeDadosVaziaException {

	Item item1 = new Item(1);
	Item item2 = new Item(2);
	Item item3 = new Item(3);

	deck.insertFirst(item1);
	deck.insertFirst(item2);
	deck.insertFirst(item3);

	deck.removeFirst();
	Assert.assertEquals(item2, deck.peekFirst());
	deck.removeFirst();
	Assert.assertEquals(item1, deck.peekFirst());

    }

    @Test
    public void testeAdicionaLastRemoveFirst() throws ItemInvalidoException, EstruturaDeDadosVaziaException {

	Item item1 = new Item(1);
	Item item2 = new Item(2);
	Item item3 = new Item(3);

	deck.insertLast(item1);
	deck.insertLast(item2);
	deck.insertLast(item3);

	deck.removeFirst();
	Assert.assertEquals(item2, deck.peekFirst());
	deck.removeFirst();
	Assert.assertEquals(item3, deck.peekFirst());

    }

    @Test
    public void testeAdicionaFirtRemoveLast() throws ItemInvalidoException, EstruturaDeDadosVaziaException {

	Item item1 = new Item(1);

	deck.insertFirst(item1);

	deck.removeLast();

	Assert.assertEquals(false, deck.contains(item1));
	Assert.assertEquals(0, deck.size());

	Item item2 = new Item(2);
	Item item3 = new Item(3);

	deck.insertFirst(item2);
	deck.insertFirst(item3);

	deck.removeLast();
	Assert.assertEquals(false, deck.contains(item1));
	Assert.assertEquals(1, deck.size());
	deck.removeLast();
	Assert.assertEquals(false, deck.contains(item3));
	Assert.assertEquals(0, deck.size());

	deck.insertFirst(item1);
	deck.insertFirst(item2);
	deck.insertFirst(item3);

	deck.removeLast();
	Assert.assertEquals(false, deck.contains(item1));
    }

    @Test
    public void testeRemoverPorValor() throws ItemInvalidoException {

	Item item1 = new Item(1);
	Item item2 = new Item(2);
	Item item3 = new Item(3);

	deck.insertLast(item1);
	deck.insertLast(item2);
	deck.insertLast(item3);

	deck.removeByValue(item1);

	Assert.assertEquals(false, deck.contains(item1));
	Assert.assertEquals(2, deck.size());

    }

    @Test
    public void testeContains() throws ItemInvalidoException {

	Item item1 = new Item(1);
	Item item2 = new Item(2);
	Item item3 = new Item(3);
	Item item4 = new Item(4);

	deck.insertLast(item1);
	deck.insertLast(item2);
	deck.insertLast(item3);

	Assert.assertEquals(true, deck.contains(item1));
	Assert.assertEquals(true, deck.contains(item2));
	Assert.assertEquals(true, deck.contains(item3));
	Assert.assertEquals(false, deck.contains(item4));

    }

    @Test
    public void testeRemoverPeloIndex() throws ItemInvalidoException {

	Item item1 = new Item(1);

	deck.insertLast(item1);

	deck.removeByIndex(0);

	Assert.assertEquals(false, deck.contains(item1));
    }

}
