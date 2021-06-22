package br.com.projetoatm.view;

import java.util.Scanner;

import br.com.projetoatm.control.ContaCtrl;
import br.com.projetoatm.util.StringUtil;
import br.com.projetoatm.util.TelaUtil;

public class TelaDeposito implements Tela{
	
	private ContaCtrl contaCtrl = new ContaCtrl();
	
	private double valor;
	
	@SuppressWarnings("resource")
	public void apresentar() {
                TelaUtil.limparTela();
		System.out.println( TelaUtil.montarTituloTela("DEPOSITO") );
		System.out.println("Informe o valor: ");
		Scanner scanner = new Scanner(System.in);
		valor = scanner.nextDouble();
                
                if (valor >=0){
                
                    if (valor == 0){
                        
                        System.out.println("\nOperação cancelada.");
                        TelaUtil.exibirAperteEnterParaContinuar();
                    }else{
                        
                        TelaUtil.exibirAperteEnterParaContinuar("Insira o envelope de depósito "
                                + "e aperte ENTER para continuar...", false);
                        contaCtrl.depositar(valor);
                        TelaUtil.exibirAperteEnterParaContinuar("Depósito feito com sucesso!\n"
                                + "Seu novo saldo é: R$" + StringUtil.doubleToString(contaCtrl.getSaldo()),true);
                    }
                }else{
                    
                    System.out.println("Valor inválido. Operação cancelada.");
                    TelaUtil.exibirAperteEnterParaContinuar();
                }
                
		
                
                }
                
	}

