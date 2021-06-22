package br.com.projetoatm.util;

public class LoginOuSenhaInvalidoException extends Exception {

	public LoginOuSenhaInvalidoException() {
		super("\nConta e/ou pin inválido(s), tente novamente.");
	}
	
}
