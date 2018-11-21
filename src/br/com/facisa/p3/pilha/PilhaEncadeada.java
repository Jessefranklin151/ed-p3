package br.com.facisa.p3.pilha;

import br.com.facisa.p3.Item;
import br.com.facisa.p3.exceptions.EstruturaDeDadosVaziaException;
import br.com.facisa.p3.exceptions.ItemInvalidoException;

public class PilhaEncadeada {

    private Item primeiroItem;
    private int contador;

    public void push(Item item) throws ItemInvalidoException {

	if (item == null) {
	    throw new ItemInvalidoException();
	}

	if (primeiroItem == null) {
	    this.primeiroItem = item;
	    contador++;
	} else {

	    Item temp = primeiroItem;

	    while (temp != null && temp.getProximo() != null) {
		temp = temp.getProximo();
	    }

	    temp.setProximo(item);
	    contador++;

	}

    }

    public Item pop() throws EstruturaDeDadosVaziaException {

	if (primeiroItem == null) {
	    throw new EstruturaDeDadosVaziaException("Pilha");
	}

	Item ret = null;
	Item temp = primeiroItem;
	Item anterior = primeiroItem;

	if (primeiroItem.getProximo() == null) {
	    primeiroItem = null;
	}

	while (temp != null && temp.getProximo() != null) {
	    anterior = temp;
	    temp = temp.getProximo();
	}

	ret = temp;
	anterior.setProximo(null);
	contador--;

	return ret;

    }

    public Item top() throws EstruturaDeDadosVaziaException {

	if (primeiroItem == null) {
	    throw new EstruturaDeDadosVaziaException("Pilha");
	} else {

	    if (primeiroItem.getProximo() == null) {
		return primeiroItem;
	    }

	    Item temp = primeiroItem;

	    while (temp != null && temp.getProximo() == null) {
		temp = temp.getProximo();
	    }

	    return temp.getProximo();

	}
    }

    public int size() {
	return contador;
    }

    public boolean isEmpty() {
	return contador == 0;
    }

}
