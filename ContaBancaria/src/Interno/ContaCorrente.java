package Interno;

public class ContaCorrente extends Conta {
	public ContaCorrente(String agencia, Cliente titular, String bandeira) {
		super(agencia, titular, bandeira);
	}

	@Override
	public void depositar(double valor) {
		if (valor >= 0) {
			setSaldo(valor);
		} else System.out.println("N�o � permitido depositar valor negativo");
	}
	
}
