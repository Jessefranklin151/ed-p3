package br.com.facisa.p3.lineares.exceptions;

public class EstruturaDeDadosVaziaException extends Exception {

    public EstruturaDeDadosVaziaException(String msg) {
	super("A " + msg + " está vazia");
    }

    private static final long serialVersionUID = 1L;

}
