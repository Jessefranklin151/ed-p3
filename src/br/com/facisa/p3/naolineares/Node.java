package br.com.facisa.p3.naolineares;

public class Node {

	private Integer valor;
	private Node esquerda;
	private Node direita;
	private Node pai;
	private Character letra;
	
	public Node(Character letra) {
		this.letra = letra;
	}

	public Character getLetra() {
		return letra;
	}

	public void setLetra(Character letra) {
		this.letra = letra;
	}

	@Override
	public String toString() {
		return "Node [valor=" + valor + "]";
	}

	public Node(Integer valor, Node esquerda, Node direita, Node pai) {
		this.valor = valor;
		this.esquerda = esquerda;
		this.direita = direita;
		this.pai = pai;
	}
	
	public Node(Integer valor) {
		this.valor = valor;
	}

	public Node(Integer valor, Node pai) {
		this.valor = valor;
		this.pai = pai;
	}

	public Integer getValor() {
		return valor;
	}

	public void setValor(Integer valor) {
		this.valor = valor;
	}

	public Node() {
	}

	public Node getEsquerda() {
		return esquerda;
	}

	public void setEsquerda(Node esquerda) {
		this.esquerda = esquerda;
	}

	public Node getDireita() {
		return direita;
	}

	public void setDireita(Node direita) {
		this.direita = direita;
	}

	public Node getPai() {
		return pai;
	}

	public void setPai(Node pai) {
		this.pai = pai;
	}

}
