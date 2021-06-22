package br.com.projetoatm.util;

public class SaldoInsuficienteException extends Exception {

	public SaldoInsuficienteException() {
		super("\nSaldo Insuficiente.");
	}
	
}
