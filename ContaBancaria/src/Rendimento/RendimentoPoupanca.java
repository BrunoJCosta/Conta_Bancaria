package Rendimento;

import Interno.ContaPoupanca;

public class RendimentoPoupanca implements Rendimento {
	
	ContaPoupanca CP;
	
	public RendimentoPoupanca (ContaPoupanca poupanca) {
		this.CP = poupanca;
	}
	
	//Calcular o rendimento da Popanca
	@Override
	public double calcularRendimento(double valor) {
		double novoSaldo = (CP.Estrato() + valor) * 0.056;
		return novoSaldo;
	}
}