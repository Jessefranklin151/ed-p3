package br.com.facisa.p3.lineares.fila;

import br.com.facisa.p3.lineares.Item;
import br.com.facisa.p3.lineares.exceptions.ItemInvalidoException;

public class FilaEncadeada {

	private Item primeiroItem;
	private int contador;

	public void enqueue(Item item) throws ItemInvalidoException {
		
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

	public Item dequeue() {

		Item ret = primeiroItem;

		if (primeiroItem != null) {
			primeiroItem = primeiroItem.getProximo();
			contador--;
		}

		return ret;

	}

	public Item front() {
		return primeiroItem;
	}

	public int size() {
		return contador;
	}

	public boolean isEmpty() {
		return contador == 0;
	}
}
