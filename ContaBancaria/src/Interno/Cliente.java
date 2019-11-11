package Interno;

public class Cliente {
	private int numero;
	private String nome;
	private String CPF;
	private String RG;
	private int idade;
	
	//Constructor! Caso o cliente tenha a idade menor que 18 anos ele n�o cadastra e continua a opera��o;
	public Cliente(String nome,String CPF,String RG, int anos) {
		try {
			if (anos >= 18) {
				this.nome = nome;
				this.CPF = CPF;
				this.RG = RG;
				this.idade = anos;
			} else this.remover(this);
		} catch (Exception e) {
			System.out.println("N�o � permitido cadastro com idade menor que 18 anos");
		}
	}
	
	// gets e sets
	public int getNumero() {
		return numero;
	}
	protected void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String getNome() {
		return nome;
	}
	public String getCPF() {
		return CPF;
	}
	public String getRG() {
		return RG;
	}
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int anos) {
		this.idade =anos;
	}
	
	// metodo remorver Cliente caso o mesmo tiver idade menor que 18 anos
	@SuppressWarnings("null")
	private void remover(Cliente c) {
		idade = (Integer) null;
		c = null;
	}
	
	// Reescrito o toString
	@Override
	public String toString() {
		if (this.CPF != null)
		return " (Numero da Conta:  "+ numero + " | nome: " + nome + " | CPF: " + CPF + " | RG: " + RG + " | Idade: " + idade + ")";
		else return "N�o existe esse Cliente";
	}
	// Reescrito o equals	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Cliente) {
			return ((Cliente) obj).numero == this.getNumero();
		} else return false;
	}

}
