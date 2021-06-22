package br.com.projetoatm.view;

import java.util.Scanner;

import br.com.projetoatm.control.HomeCtrl;
import br.com.projetoatm.util.TelaUtil;

public class TelaMenu implements Tela {

	private int opcao;
	private HomeCtrl homeCtrl= new HomeCtrl();

	public void apresentar() {
                TelaUtil.limparTela();
		Scanner scanner = new Scanner(System.in);
                
                System.out.println( TelaUtil.montarTituloTela("MENU") );
                System.out.println("1 - Saldo");
                System.out.println("2 - Saque");
                System.out.println("3 - Deposito");
                System.out.println("4 - Sair");

                System.out.println("\nEscolha a opção: ");
                opcao = scanner.nextInt();
                
               homeCtrl.abrir(opcao);

	}

}
