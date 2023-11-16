package orientacaoobjeto;

public class Carro {
	
	private String cor;
	private String modelo;
	private double valor;
	
	public Carro() {
		
	}
	
	public Carro(String cor) {   // construtor
		this.cor = cor;
	}
	
	public Carro(String cor, double valor) {   // construtor
		this.cor = cor;
		this.valor = valor;
	}
	
	public Carro(String cor, String modelo, double valor) {   // construtor
		this.cor = cor;
		this.modelo = modelo;
		this.valor = valor;
	}
	
	public String getCor() {
		return cor;
	}
	
	public void setCor(String corCarro) {
		cor = corCarro;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
}
