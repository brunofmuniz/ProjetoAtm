package br.com.projetoatm.control;

import br.com.projetoatm.view.Tela;
import br.com.projetoatm.view.TelaDeposito;
import br.com.projetoatm.view.TelaLogin;
import br.com.projetoatm.view.TelaMenu;
import br.com.projetoatm.view.TelaSaldo;
import br.com.projetoatm.view.TelaSaque;

public class HomeCtrl {
	
	private Tela tela;
	
	public void abrir(int opcao) {
		
		switch (opcao) {
                    case 1:
                            tela = new TelaSaldo();
                            break;
                    case 2:
                            tela = new TelaSaque();
                            
                            break;
                    case 3:
                            tela = new TelaDeposito();
                            break;
                    case 4:
                            tela = new TelaLogin();
                            break;
                    default:
                            tela = new TelaMenu(); 
                            break;
		}
		
		tela.apresentar();
                
                tela = new TelaMenu(); 
                tela.apresentar();
		
	}

}
