package br.com.facisa.p3.deck;

import org.junit.Assert;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.facisa.p3.Item;

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
	public void testeInsertItemFirst() {
		
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
	public void testeInsertItemLast() {
		Item item1 = new Item(1);
		Item item2 = new Item(2);
		Item item3 = new Item(3);
		
		deck.insertLast(item1);
		deck.insertLast(item2);
		deck.insertLast(item3);
		
	}
	
	@Test
	public void testPeekFirt() {
		
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
	public void testePeekLast() {
		
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
	
	
 	

}
