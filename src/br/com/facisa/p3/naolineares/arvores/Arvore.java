package br.com.facisa.p3.naolineares.arvores;

import br.com.facisa.p3.naolineares.Node;
import br.com.facisa.p3.naolineares.exceptions.NodeInvalidoException;

public class Arvore {

	private Node raiz;

	public void adicionar(Integer valor) {
		adicionar(this.raiz, valor);
	}

	public void adicionar(Node node, Integer valor) {

		if (raiz == null) {
			this.raiz = new Node(valor);
		} else {

			if (valor >= node.getValor()) {
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

	public void adicionar(Character letra) {
		adicionar(this.raiz, letra);
	}

	public void adicionar(Node node, Character letra) {

		// TODO:terminar.
		if (this.raiz == null) {
			this.raiz = new Node(letra);
		} else {

			if (node.getEsquerda() == null) {
				node.setEsquerda(new Node(letra));
			} else if (node.getDireita() == null) {
				node.setDireita(new Node(letra));
			} else {
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

		if (numero >= node.getValor()) {
			if (node != null && node.getValor() != numero) {
				return findNodeByValue(node.getDireita(), numero);
			}
		} else {
			if (node != null && node.getValor() != numero) {
				return findNodeByValue(node.getEsquerda(), numero);
			}
		}

		return node;

	}

	public Integer getAltura() {
		return getAltura(raiz);
	}

	private Integer getAltura(Node node) {

		if (node == null) {
			return 0;
		}

		Integer tamanhoDireita = getAltura(node.getDireita());
		Integer tamanhoEsquerda = getAltura(node.getEsquerda());

		if (tamanhoDireita >= tamanhoEsquerda) {
			return tamanhoDireita + 1;
		} else {
			return tamanhoEsquerda + 1;
		}

	}

	public Node removerNode(Node node) throws NodeInvalidoException {

		if (contains(node)) {
			return removerNode(raiz, node.getValor());
		}

		return null;

	}

	public boolean contains(Node node) {

		// TODO: terminar método.
		if (node == null) {

		}
		return true;
	}

	private Node removerNode(Node node, Integer valor) throws NodeInvalidoException {

		if (this.raiz == null) {
			throw new NodeInvalidoException("Node invalido para remocao");
		} else {

			if (valor < node.getValor()) {
				node.setEsquerda(removerNode(node.getEsquerda(), valor));
			} else if (valor > node.getValor()) {
				node.setDireita(removerNode(node.getEsquerda(), valor));
			} else if (node.getDireita() != null && node.getEsquerda() != null) {
				
				node.setValor(encontraMinimo(node.getDireita()).getValor());
				node.setDireita(apagaValorMinimo(node.getDireita()));
			} else {
				node = (node.getEsquerda() != null) ? node.getEsquerda() : node.getDireita();
			}

		}

		return node;

	}
	
	public int contaFolhas(Arvore a) {
		return quantidadeFolhas(a.getRaiz());
	}



	private Node apagaValorMinimo(Node node) {
		
		if (node == null) {
			return node;
		} else if (node.getEsquerda() != null) {
			node.setEsquerda(apagaValorMinimo(node.getEsquerda()));
			return node;
		} else {
			return node.getDireita();
		}
		
	}

	private Node encontraMinimo(Node node) {

		if (node != null) {
			while (node.getEsquerda() != null) {
				node = node.getEsquerda();
			}
		}

		return node;

	}

	public int quantidadeFolhas(Arvore a) {
		return quantidadeFolhas(a.raiz);
	}

	public int quantidadeFolhas() {

		return quantidadeFolhas(this.raiz);

	}

	private int quantidadeFolhas(Node node) {

		if (node == null) {
			return 0;
		}

		if (node.getDireita() == null && node.getEsquerda() == null) {
			return 1;
		}

		int tamanhoDireita = quantidadeFolhas(node.getDireita());
		int tamanhoEsquerda = quantidadeFolhas(node.getEsquerda());

		return tamanhoDireita + tamanhoEsquerda;

	}
	
	public Node getRaiz() {
		return this.raiz;
	}

}
