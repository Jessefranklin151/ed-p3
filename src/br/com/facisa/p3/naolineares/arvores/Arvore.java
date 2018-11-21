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
					node.setDireita(new Node(valor, node));

				} else {
					adicionar(node.getDireita(), valor);
				}
			} else {
				if (node.getEsquerda() == null) {
					node.setEsquerda(new Node(valor, node));
				} else {
					adicionar(node.getEsquerda(), valor);
				}
			}
		}

	}

	public void imprimeEmOrdem() {
		// vai pelo meio.
		imprimeEmOrdem(this.raiz);
	}

	private void imprimeEmOrdem(Node node) {

		if (node != null) {
			imprimeEmOrdem(node.getEsquerda());
			System.out.println(node.getValor());
			imprimeEmOrdem(node.getDireita());
		}

	}

	public void imprimeEmPreOrdem() {
		imprimeEmPreOrdem(this.raiz);
	}

	private void imprimeEmPreOrdem(Node node) {

		if (node != null) {
			System.out.println(node.getValor());
			imprimeEmPreOrdem(node.getEsquerda());
			imprimeEmPreOrdem(node.getDireita());
		}

	}

	public void imprimeEmPosOrdem() {
		imprimeEmPosOrdem(this.raiz);
	}

	private void imprimeEmPosOrdem(Node node) {

		if (node != null) {
			imprimeEmPosOrdem(node.getEsquerda());
			imprimeEmPosOrdem(node.getDireita());
			System.out.println(node.getValor());
		}

	}

	public Node getRaiz(Node node) {
		
		if (node.getPai() != null) {
			return getRaiz(node.getPai());
		}
		
		return node;
		
	}

	public Node findNodeByValue(Integer numero) {
		return findNodeByValue(this.raiz, numero);
	}

	private Node findNodeByValue(Node node, Integer numero) {
		
		if (node != null && node.getValor() != numero) {
			return findNodeByValue(node.getEsquerda(), numero);
		}
		
		if (node != null && node.getValor() != numero) {
			return findNodeByValue(node.getDireita(), numero);
		}
		
	}
	
	
	
	// TODO: exibirRaiz.
	// TODO: removeMinimo, encontraMinimo, remover(Node, valor).
}
