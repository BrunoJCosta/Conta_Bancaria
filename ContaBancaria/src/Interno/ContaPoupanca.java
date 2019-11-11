package Interno;

import Rendimento.RendimentoPoupanca;

public class ContaPoupanca extends Conta {

	private RendimentoPoupanca taxaRendimento;

	public ContaPoupanca(String agencia, Cliente titular, String bandeira,double valorAbertura) {
		taxaRendimento = new RendimentoPoupanca(this);
		this.depositar(valorAbertura);
		try {
			if (this.Estrato()>50) {
				Conta.setNumeroTotal();
				titular.setNumero(Conta.getNumeroTotal());
				this.setAgencia(agencia);
				this.setTitular(titular);
				this.setBandeira(bandeira);
			} else this.remover(this);
		} catch (Exception e) {
			System.out.println("Não é possivel cadastrar essa conta pois o valor é menor que o permitido");
		}
	}
	
	@Override
	public void depositar(double valor) {
		if (valor > 0)
			this.setSaldo((Estrato() + valor) + taxaRendimento.calcularRendimento(valor));
		else System.out.println("Não e permitido depositar valor negativo ou valor=0");
	}
}