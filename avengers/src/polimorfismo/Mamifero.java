package polimorfismo;

public class Mamifero extends Animal{
	
	private String corDoPelo;
	protected String nome;

	@Override //sobrescrevendo
	public void movimentar() { // metodos pertencem a classe animal mas estão sendo implementados na atual POLIMORFISMO
		System.out.println("Correndo");
	}

	@Override
	public void alimentar() {// metodos pertencem a classe animal mas estão sendo implementados na atual POLIMORFISMO
		System.out.println("Tomando leite");
	}

	@Override
	public void emitirSom() { // metodos pertencem a classe animal mas estão sendo implementados na atual POLIMORFISMO
		System.out.println("Som de mamifero");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCorDoPelo() {
		return corDoPelo;
	}

	public void setCorDoPelo(String corDoPelo) {
		this.corDoPelo = corDoPelo;
	}

	
	
}
