package exemplo;

public class Conta {

	protected int numConta;
	protected String tipo;
	protected String titular;
	protected double saldo;
	protected boolean contaBloqueada;
	protected String cpf;
	protected int senha;

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean getContaBloqueada() {
		return contaBloqueada;
	}

	public void setContaBloqueada(boolean contaBloqueada) {
		this.contaBloqueada = contaBloqueada;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void transferir(double pix, int senha) {

	}

	public void abrirConta() {

	}

	public void consultaSaldo() {
		System.out.println("Seu saldo é: R$" + getSaldo());
	}

	public boolean validaSenhaAntiga(int senhaAntiga) {
		if (senhaAntiga == this.getSenha()) {
			return true;
		} else {
			return false;
		} 
		
	}

	public void trocarSenha(int senhaAntiga, int senhaNova) {
		this.setSenha(senhaNova);
		System.out.println("Senha Alterada com sucesso!");
	}

}
