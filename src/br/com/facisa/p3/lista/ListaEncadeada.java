
package br.com.facisa.p3.lista;

import br.com.facisa.p3.Item;

public class ListaEncadeada {

    private Item primeiroItem;
    private int contador;

    public void add(Item item) {

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

    public void remove(Item item) {

	if (item != null) {
	    if (item.equals(primeiroItem)) {
		primeiroItem = primeiroItem.getProximo();
		contador--;
	    } else {
		Item temp = primeiroItem;

		while (temp != null && temp.getProximo() != null && !temp.getProximo().equals(item)) {
		    temp = temp.getProximo();
		}

		temp.setProximo(temp.getProximo());
		contador--;
	    }
	}

    }

    public int tamanho() {
	return contador;
    }

    public void remove(int pos) {

	if (pos == 0) {
	    primeiroItem = primeiroItem.getProximo();
	} else {

	    Item temp = primeiroItem;

	    for (int i = 0; i < pos - 1; i++) {
		temp = temp.getProximo();
	    }

	    temp.setProximo(temp.getProximo().getProximo());
	    contador--;
	}

    }

    public Item get(int pos) {

	Item temp = primeiroItem;

	for (int i = 0; i < pos; i++) {
	    temp = temp.getProximo();
	}

	return temp;
    }

    public void clear() {
	this.primeiroItem = null;
	this.contador = 0;
    }

    public boolean contains(Item item) {

	boolean achou = false;
	Item temp = primeiroItem;

	while (temp != null && temp.equals(item)) {
	    temp = temp.getProximo();
	}

	return achou;

    }

}
