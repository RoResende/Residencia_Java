package br.com.caelum.contas.modelo;

public class ContaPoupanca extends Conta {

	/*public String getTipo() {
		
		return "Conta Poupan�a";
		
	}*/
	
	public String getTipo() {
		
		return super.getTipo()+" Poupan�a";
	}
	
	public double getValorImposto() {
		return this.getSaldo()*0.01;
	}
}
