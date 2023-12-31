package polimorfismo;

public abstract class Animal {
	
	protected double peso; // com protected consegue acessar diretamente se for classe filha ou a atual
	protected int idade;
	private int membros; // private acessa somente com get e set 
	
	public abstract void movimentar();  // por ser abstrata não tem bloco ce código []
	public abstract void alimentar();  // por ser abstrata não tem bloco ce código []
	public abstract void emitirSom();  // por ser abstrata não tem bloco ce código []
	
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getMembros() {
		return membros;
	}
	public void setMembros(int membros) {
		this.membros = membros;
	}
	
	
}
