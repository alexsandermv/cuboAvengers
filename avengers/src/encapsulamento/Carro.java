package encapsulamento;

public class Carro implements CarroInterface{
	
	private String cor;
	private String modelo;
	private double valor;
	private boolean ligarCarro;
	private boolean desligarCarro;
	private boolean ligarAr;
	private boolean desligarAr;
	
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

	@Override
	public void ligarCarro() {
		this.setLigarCarro(true);
	}

	@Override
	public void desligarCarro() {
		this.setLigarCarro(false);
		
	}

	@Override
	public void ligarAr() {
		if (this.getLigarCarro()) {
			this.setLigarAr(true);
		}
		
	}

	@Override
	public void desligarAr() {
		this.desligarAr = false;
	}

	public boolean getLigarCarro() {
		return ligarCarro;
	}

	public void setLigarCarro(boolean ligarCarro) {
		this.ligarCarro = ligarCarro;
	}

	public boolean getDesligarCarro() {
		return desligarCarro;
	}

	public void setDesligarCarro(boolean desligarCarro) {
		this.desligarCarro = desligarCarro;
	}

	public boolean getLigarAr() {
		return ligarAr;
	}

	public void setLigarAr(boolean ligarAr) {
		this.ligarAr = ligarAr;
	}

	public boolean getDesligarAr() {
		return desligarAr;
	}

	public void setDesligarAr(boolean desligarAr) {
		this.desligarAr = desligarAr;
	}
	
	public void status() {
		System.out.println(" - Sobre o veículo -");
		System.out.println("Modelo: " + this.getModelo());
		System.out.println("Cor: " + this.getCor());
		System.out.println("O carro está ligado? " + this.getLigarCarro());
		System.out.println("O ar está ligado? " + this.getLigarAr());
	}
	
}
