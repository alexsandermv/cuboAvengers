package exemplo;

public class Livro {
	
	private String nome;
	private String autor;
	private int ano;
	private String editora;

	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}

	

	public void catalogo() {
		System.out.println("=== CATÁLOGO ===");
		System.out.println("Nome:" + this.getNome());
		System.out.println("Autor: " + this.getAutor() );
		System.out.println("Ano: " + this.getAno());
		System.out.println("Editora: " + this.getEditora());
		
	}
}
