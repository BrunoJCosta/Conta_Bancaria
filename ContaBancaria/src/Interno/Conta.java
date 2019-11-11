package Interno;

public abstract class Conta {
	private static int numeroTotal = 0;
	private String agencia;
	private Cliente titular;
	private String bandeira;
	private double saldo;

	protected Conta() {}; 
	public Conta(String agencia, Cliente titular,String bandeira) {
		try {
			if (titular.getCPF() != null) {
				Conta.setNumeroTotal();
				titular.setNumero(numeroTotal);
				this.agencia = agencia;
				this.titular = titular;
				this.bandeira = bandeira;
			} else this.remover(this);
		} catch (Exception e) {
			System.out.println("Esse cliente Não existe para se cadastrar nessa Conta");
		}	
	}
	
	public static int getNumeroTotal() {
		return numeroTotal;
	}
	public static void setNumeroTotal() {
		numeroTotal++;
	}
	
	public String getAgencia() {
		return agencia;
	}
	protected void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	protected void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public String getBandeira() {
		return bandeira;
	}
	protected void setBandeira(String bandeira) {
		this.bandeira = bandeira;
	}
	
	public double getSaldo() {
		return saldo;
	}
	protected void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double Estrato() {
		return saldo;
	}
	public void sacar(double valor) {
		if (saldo > valor) {
			this.saldo -= valor;
		} else	if (valor<0) System.out.println("N�o � permitido sacar valor negativo");
		else System.out.println("Esse saque � maior do que o seu saldo");
	}
	public abstract void depositar(double valor);

	public void transferir(Conta conta,double valor) {
		if (this != conta) {
			this.sacar(valor);
			conta.depositar(valor);
		} else System.out.println("Voc� N�o pode transferir para a mesma conta");
	}

	@SuppressWarnings("null")
	protected boolean remover(Conta c) {
		saldo = (Integer) null;
		c = null;
		return true;
	}
	
	@Override
	public String toString() {
		if (titular != null) {
		return "\nagencia: "+ agencia + "\ntitular: " + titular + "\nbandeira: " + bandeira + "\nsaldo: " + saldo;
		} else return "Essa conta n�o existe";
	}
}
