package exemplo;

public class Filme {

	private int cod;
	private String nome;
	private int ano;
	private String genero;
	private String duracao;
	public int getCod() {
		return cod;
	}
	public void setCod(int cod) {
		this.cod = cod;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
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
		System.out.println("Filme: " + this.getNome());
		System.out.println("Duração: " + this.getDuracao());
		System.out.println("Ano: " + this.getAno());
		System.out.println("Genero: " + this.getGenero());
	}
	 
	
	
}
