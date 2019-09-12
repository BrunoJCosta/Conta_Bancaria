package Rendimento;

import Interno.TesouroDireto;

public class RendimentoTD implements Rendimento{
	
	TesouroDireto TD;
	
	public RendimentoTD (TesouroDireto tesouro) {
		this.TD = tesouro;
	}
	
	//Calcular o rendimento do tesouro direto
	@Override
	public double calcularRendimento(double valor) {
		double novoSaldo = (TD.Estrato() + valor) * 0.065;
		return novoSaldo;
	}
}
