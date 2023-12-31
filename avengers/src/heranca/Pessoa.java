package heranca;

public class Pessoa {
	
	protected String nome;
	private int idade;
	private String sexo;
	
	
	public Pessoa() { // Contrutor default
		
	}

	public Pessoa(String nome, int idade, String sexo) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
	}

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public String getSexo() {
		return sexo;
	}


	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	@Override
	public String toString() {
		return "\n[Nome: " + nome + "\nIdade: " + idade + "\nSexo: " + sexo +"]";
	}
	
	public void fazerAniversario() {
		this.idade ++; //incrementa 1 
	}
	
}
