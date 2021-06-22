package br.com.projetoatm.view;

import java.util.Scanner;

import br.com.projetoatm.control.ContaCtrl;
import br.com.projetoatm.util.TelaUtil;

public class TelaSaque implements Tela {

	private ContaCtrl contaCtrl = new ContaCtrl();

	@SuppressWarnings("resource")
	@Override
	public void apresentar() {
                
            TelaUtil.limparTela();
            Scanner scanner = new Scanner(System.in);
            int opcao = 0;
            String msgRetorno = "";

            System.out.println( TelaUtil.montarTituloTela("SAQUE") );

            System.out.println("   1 - R$20         4 - R$100");
            System.out.println("   2 - R$40         5 - R$200");
            System.out.println("   3 - R$60         6 - Cancelar");

            System.out.println("\nEscolha a opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                        msgRetorno = contaCtrl.sacar(20L);
                        break;
                case 2:
                        msgRetorno = contaCtrl.sacar(40L);
                        break;
                case 3:
                        msgRetorno = contaCtrl.sacar(60L);
                        break;
                case 4:
                        msgRetorno = contaCtrl.sacar(100L);
                        break;
                case 5:
                        msgRetorno = contaCtrl.sacar(200L);
                        break;
                case 6:
                        new TelaMenu().apresentar(); 
                        break;
                default:
                        opcao = 6;
                        break;
            }

            System.out.println(msgRetorno);
            TelaUtil.exibirAperteEnterParaContinuar();

	}

}
