package br.com.facisa.p3.naolineares.arvores;

import br.com.facisa.p3.naolineares.Node;

public class Arvore {

	private Node raiz;
	
	public void adicionar(Integer valor) {
		adicionar(this.raiz, valor);
	}
	
	
	public void adicionar(Node node, Integer valor) {
		
		if (raiz == null) {
			this.raiz = new Node(valor);
		} else {
			
			if (valor > node.getValor()) {
				if (node.getDireita() == null) {
					node.setDireita(new Node(valor));
				} else {
					adicionar(node.getDireita(), valor);
				}
			} else {
				if (node.getEsquerda() == null) {
					node.setEsquerda(new Node(valor));
				} else {
					adicionar(node.getEsquerda(), valor);
				}
			}
		}
		
	}
}
