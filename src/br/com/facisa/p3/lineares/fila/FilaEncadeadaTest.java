package br.com.facisa.p3.lineares.fila;

import org.junit.Assert;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.facisa.p3.lineares.Item;
import br.com.facisa.p3.lineares.exceptions.ItemInvalidoException;

class FilaEncadeadaTest {

	private FilaEncadeada fila = new FilaEncadeada();

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
	public void testeEnqueue() throws ItemInvalidoException {

		Item item = new Item(1);

		fila.enqueue(item);

		Assert.assertEquals(1, fila.size());
	}

	@Test
	public void testeDequeue() throws ItemInvalidoException {

		Item item = new Item(1);

		fila.enqueue(item);

		Assert.assertEquals(item, fila.dequeue());

		Assert.assertEquals(0, fila.size());

	}

	@Test
	public void testeFront() throws ItemInvalidoException {

		Item item = new Item(1);
		Item item2 = new Item(2);

		fila.enqueue(item);
		fila.enqueue(item2);

		Assert.assertEquals(item, fila.front());

	}

	@Test
	public void testeSize() throws ItemInvalidoException {

		Item item = new Item(1);
		Item item2 = new Item(2);

		Assert.assertEquals(0, fila.size());
		fila.enqueue(item);
		Assert.assertEquals(1, fila.size());
		fila.enqueue(item2);
		Assert.assertEquals(2, fila.size());

	}

	@Test
	public void testeIsEmpty() throws ItemInvalidoException {

		Item item = new Item(1);

		Assert.assertEquals(true, fila.isEmpty());
		fila.enqueue(item);
		Assert.assertEquals(false, fila.isEmpty());

	}
	
	@Test
	public void testeEnqueueItemInvalido() {
		
		Item item = new Item(1);

		Assertions.assertThrows(ItemInvalidoException.class, () -> {
			fila.enqueue(item);
		});
		
	}
}
