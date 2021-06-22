package br.com.projetoatm.view;

import br.com.projetoatm.control.ContaCtrl;
import br.com.projetoatm.util.StringUtil;
import br.com.projetoatm.util.TelaUtil;

public class TelaSaldo implements Tela{
	
	private ContaCtrl contaCtrl = new ContaCtrl();
	
	public void apresentar() {
                TelaUtil.limparTela();
		System.out.println( TelaUtil.montarTituloTela("SALDO") );
		System.out.println("O saldo da conta é: R$" + StringUtil.doubleToString(contaCtrl.getSaldo()));
                
                TelaUtil.exibirAperteEnterParaContinuar();
	}

}
