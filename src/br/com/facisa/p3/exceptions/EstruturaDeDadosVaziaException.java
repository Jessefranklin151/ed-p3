package br.com.facisa.p3.exceptions;

public class EstruturaDeDadosVaziaException extends Exception {

    public EstruturaDeDadosVaziaException(String msg) {
	super("A " + msg + " est� vazia");
    }

    private static final long serialVersionUID = 1L;

}
