package br.com.caelum.contas.modelo;

import br.com.caelum.contas.exception.SaldoInsuficienteException;

public class ContaPoupanca extends Conta {

	/*public String getTipo() {
		
		return "Conta Poupan�a";
		
	}*/
	
	public String getTipo() {
		
		return super.getTipo()+" Poupan�a";
	}
	
	public void saca(double valor){
		if(valor<0)
			throw new IllegalArgumentException("Voc� tentou sacar um valor negativo");
		if(this.saldo < valor)
			throw new SaldoInsuficienteException(valor);
		
		else{
			double novoSaldo = this.saldo - valor;
			this.saldo = novoSaldo;
			}
	}
}
