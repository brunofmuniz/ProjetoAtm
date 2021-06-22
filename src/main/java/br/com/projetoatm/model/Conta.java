package br.com.projetoatm.model;

import java.util.ArrayList;
import java.util.List;

public class Conta {
	
	private String numero;
	
	private String pin;
	
	private double saldo;
	
	public Conta(String numero, String pin) {
		this.numero = numero;
		this.pin = pin;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public String getNumero() {
		return this.numero;
	}

	public void depositar(double valor) {
		this.saldo += valor;
	}

	public void sacar(double valorSaque) {
		this.saldo -= valorSaque;
	}

        @Override
        public String toString() {
            return "Conta{" + "numero=" + numero + ", pin=" + pin + ", saldo=" + saldo + '}';
        }

}
