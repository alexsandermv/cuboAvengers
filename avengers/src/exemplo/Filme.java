package exemplo;

public class Filme {

	private int cod;
	private String titulo;
	private int ano;
	private String genero;
	private String duracao;
	public int getCod() {
		return cod;
	}
	public void setCod(int cod) {
		this.cod = cod;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String nome) {
		this.titulo = nome;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getDuracao() {
		return duracao;
	}
	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}
	
	public void catalago() {
		System.out.println("=== CATÁLOGO ===");
		System.out.println("Código: " + this.getCod());
		System.out.println("Filme: " + this.getTitulo());
		System.out.println("Duração: " + this.getDuracao());
		System.out.println("Ano: " + this.getAno());
		System.out.println("Genero: " + this.getGenero());
	}
	 
	
	
}
