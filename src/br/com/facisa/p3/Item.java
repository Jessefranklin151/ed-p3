package br.com.facisa.p3;

public class Item {

    private Item proximoItem;

    private Integer valor;

    public Item() {
    }

    public Integer getValor() {
	return valor;
    }

    public void setValor(Integer valor) {
	this.valor = valor;
    }

    public Item(Integer valor) {
	super();
	this.valor = valor;
    }

    public Item getProximo() {
	return proximoItem;
    }

    public void setProximo(Item proximoItem) {
	this.proximoItem = proximoItem;
    }

    @Override
    public String toString() {
	return "Item valor= " + valor;
    }

}
