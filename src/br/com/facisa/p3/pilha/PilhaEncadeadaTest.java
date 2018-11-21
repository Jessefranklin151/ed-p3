package br.com.facisa.p3.pilha;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.facisa.p3.Item;

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
    public void testePush() {

	Item item1 = new Item(1);

	pilha.push(item1);

    }
}
