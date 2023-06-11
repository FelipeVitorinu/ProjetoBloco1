package conta.model;

public abstract class CadastroCliente {
	private int numeroConta;
	private String nome;
	private String telefone;
	private String email;
	private String bairro;
	private String rua;
	private int numero;
	private String complemento;

	// Método construtor

	public CadastroCliente(int numeroConta, String nome, String telefone, String email, String bairro, String rua,
			int numero, String complemento) {
		super();
		this.numeroConta = numeroConta;
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.bairro = bairro;
		this.rua = rua;
		this.numero = numero;
		this.complemento = complemento;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public void statusConta() {
		System.out.println("\n\tNúmero Conta: " + this.numeroConta);
		System.out.println("\tNome: " + this.nome);
		System.out.println("\tTelefone: " + this.telefone);
		System.out.println("\tEmail: " + this.email);
		System.out
				.println("\tEndereço: " + this.rua + ", " + this.numero + ", " + this.bairro + ", " + this.complemento);

	}

}
