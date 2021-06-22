package br.com.projetoatm.control;

import br.com.projetoatm.model.Conta;
import br.com.projetoatm.util.LoginOuSenhaInvalidoException;
import br.com.projetoatm.view.TelaMenu;

public class LoginCtrl {

	public static Conta conta;

	public void login(String conta, String pin) throws LoginOuSenhaInvalidoException {
	
            //TO-DO: Modificar para fazer do banco
            if (conta.equals("12345") && pin.equals("67890")) {
			this.conta = new Conta(conta, pin);
			TelaMenu menu = new TelaMenu();
			menu.apresentar();
			return;
		}

		throw new LoginOuSenhaInvalidoException();
	}

}
