package Interno;

import Rendimento.RendimentoTD;

public class TesouroDireto extends Conta {

	private RendimentoTD taxaRendimento;

	public TesouroDireto(String agencia, Cliente titular, String bandeira,double valorAbertura) {
		taxaRendimento = new RendimentoTD(this);
		this.depositar(valorAbertura);
		try {
			if (this.Estrato()>100) {
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
		if (valor > 0)	{
			setSaldo(Estrato() + valor + taxaRendimento.calcularRendimento(valor));
		} else System.out.println("Não é permitido depositar valor = 0 ou menor");
	}
}