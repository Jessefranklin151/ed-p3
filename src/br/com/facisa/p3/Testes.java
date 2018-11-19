package br.com.facisa.p3;

import java.util.LinkedList;

public class Testes {

    public static void main(String[] args) {

	LinkedList<Item> itens = new LinkedList<Item>();
//	ListaEncadeada itens = new ListaEncadeada();

	Item item1 = new Item(1);
	Item item2 = new Item(2);
	Item item3 = new Item(3);
	Item item4 = new Item(4);
	Item item5 = new Item(5);

	itens.add(item1);
	itens.add(item2);
	itens.add(item3);
	itens.add(item4);
	itens.add(item5);

	System.out.println(itens.get(0));
	System.out.println(itens.get(1));
	System.out.println(itens.get(2));
	System.out.println(itens.get(3));
	System.out.println(itens.get(4));

//	for (Item item : itens) {
//	    System.out.println(item);
//	}
//
//	itens.remove(2);
//
//	for (Item item : itens) {
//	    System.out.println(item);
//	}

    }
}
