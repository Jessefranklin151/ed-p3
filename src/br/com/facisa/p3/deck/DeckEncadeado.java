package br.com.facisa.p3.deck;

import br.com.facisa.p3.Item;
import br.com.facisa.p3.exceptions.EstruturaDeDadosVaziaException;
import br.com.facisa.p3.exceptions.ItemInvalidoException;

public class DeckEncadeado {

    private Item primeiroItem;
    private int contador;

    public void insertFirst(Item item) throws ItemInvalidoException {

	if (item == null) {
	    throw new ItemInvalidoException();
	}

	if (primeiroItem == null) {
	    this.primeiroItem = item;
	    contador++;
	} else {
	    item.setProximo(primeiroItem);
	    primeiroItem = item;
	    contador++;
	}

    }

    public void insertLast(Item item) throws ItemInvalidoException {

	if (item == null) {
	    throw new ItemInvalidoException();
	}

	if (primeiroItem == null) {
	    this.primeiroItem = item;
	    contador++;
	} else {

	    Item aux = primeiroItem;

	    while (aux.getProximo() != null) {
		aux = aux.getProximo();
	    }
	    aux.setProximo(item);
	    contador++;

	}

    }

    public Item removeFirst() throws EstruturaDeDadosVaziaException {

	if (primeiroItem == null || contador == 0) {
	    throw new EstruturaDeDadosVaziaException("Deck");
	}

	Item ret = primeiroItem;

	if (primeiroItem != null) {
	    primeiroItem = primeiroItem.getProximo();
	    contador--;
	}

	return ret;

    }

    public Item removeLast() throws EstruturaDeDadosVaziaException {

	if (primeiroItem == null || contador == 0) {
	    throw new EstruturaDeDadosVaziaException("Deck");
	}

	Item ret = null;

	if (primeiroItem.getProximo() == null) {
	    ret = primeiroItem;
	    primeiroItem = null;
	    contador--;
	    return ret;
	}

	Item temp = primeiroItem;
	Item anterior = primeiroItem;

	while (temp != null && temp.getProximo() != null) {
	    anterior = temp;
	    temp = temp.getProximo();
	}

	ret = temp;
	anterior.setProximo(null);
	contador--;

	return ret;

    }

    public void removeByValue(Item item) {

	if (item != null) {
	    if (item.equals(primeiroItem)) {
		primeiroItem = primeiroItem.getProximo();
		contador--;
	    } else {
		Item temp = primeiroItem;

		while (temp != null && temp.getProximo() != null && !temp.getProximo().equals(item)) {
		    temp = temp.getProximo();
		}
		if (temp.getProximo().equals(item)) {
		    temp.setProximo(temp.getProximo().getProximo());
		    contador--;
		}
	    }
	}

    }

    public void removeByIndex(int pos) {

	if (pos == 0) {
	    primeiroItem = primeiroItem.getProximo();
	    contador--;
	} else {

	    Item temp = primeiroItem;

	    for (int i = 0; i < pos - 1; i++) {
		temp = temp.getProximo();
	    }

	    temp.setProximo(temp.getProximo().getProximo());
	    contador--;
	}

    }

    public int size() {
	return contador;
    }

    public boolean isEmpty() {

	return contador == 0;
    }

    public Item peekFirst() {
	return primeiroItem;
    }

    public Item peekLast() {

	Item temp = primeiroItem;

	while (temp != null && temp.getProximo() != null) {
	    temp = temp.getProximo();
	}

	return temp;

    }

    public boolean contains(Item item) {

	if (item != null) {

	    Item temp = primeiroItem;

	    while (temp != null && !temp.equals(item)) {
		temp = temp.getProximo();
	    }

	    if (temp != null && temp.equals(item)) {
		return true;
	    }
	}

	return false;

    }
}
