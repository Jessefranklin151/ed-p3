package br.com.facisa.p3;

import br.com.facisa.p3.naolineares.arvores.Arvore;

//import br.com.facisa.p3.lista.ListaEncadeada;

public class Testes {

	public static void main(String[] args) {

		Arvore arvore = new Arvore();

		arvore.adicionar(5);
		arvore.adicionar(3);
		arvore.adicionar(8);
		arvore.adicionar(1);
		arvore.adicionar(4);
		arvore.adicionar(50);
		arvore.adicionar(6);
		arvore.adicionar(51);
		arvore.adicionar(53);
		
		arvore.imprimeEmOrdem();
		
		
		
		
		

	}
}
