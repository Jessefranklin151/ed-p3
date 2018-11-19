package br.com.facisa.p3.lista;

public class ListaEncadeada {

    private Item primeiroItem;
    private int contador;

    public void adicionar(Item item) {

	if (primeiroItem == null) {
	    this.primeiroItem = item;
	    contador++;
	} else {

	    Item aux = primeiroItem;

	    while (aux.getProximoItem() != null) {
		aux = aux.getProximoItem();
	    }

	    aux.setProximoItem(item);
	    contador++;
	}

    }

    public void remover(Item item) {

	if (item != null) {
	    if (item.equals(primeiroItem)) {
		primeiroItem = primeiroItem.getProximoItem();
		contador--;
	    } else {
		Item temp = primeiroItem;

		while (temp != null && temp.getProximoItem() != null && !temp.getProximoItem().equals(item)) {
		    temp = temp.getProximoItem();
		}

		temp.setProximoItem(temp.getProximoItem());
		contador--;
	    }
	}

    }

    public int tamanho() {
	return contador;
    }

    public void remover(int pos) {

	for (int i = 0; i < pos; i++) {

	}

    }

    public Item obter() {
	return null;
    }

}
