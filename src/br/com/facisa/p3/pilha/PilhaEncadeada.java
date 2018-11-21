package br.com.facisa.p3.pilha;

import br.com.facisa.p3.Item;

public class PilhaEncadeada {

    private Item primeiroItem;
    private int contador;

    public void push(Item item) {

	if (primeiroItem != null) {
	    this.primeiroItem = item;
	} else {

	    Item temp = primeiroItem;

	    while (temp != null && temp.getProximo() != null) {
		temp = temp.getProximo();
	    }

	    temp.setProximo(item);
	    contador++;

	}

    }

    public Item pop() {

	Item ret = null;

	Item temp = primeiroItem;

	if (contador == 1) {
	    return temp;
	} else {
	    for (int i = 1; i < contador - 1; i++) {
		temp = temp.getProximo();
	    }
	}

	ret = temp.getProximo();

	temp.setProximo(temp.getProximo().getProximo());

	return ret;

    }

    public Item top() {
	return null;
    }

    public int size() {
	return contador;
    }

    public boolean isEmpty() {
	return contador == 0;
    }

}
