package exemplo;

public class LivroTeste {

	public static void main(String[] args) {

		Livro livro = new Livro();
		
		livro.setAno(2000);
		livro.setAutor("Alexsander da Silva Sauro");
		livro.setEditora("Publica");
		livro.setNome("As aventuras de Alexsander");

		livro.catalogo();
	}

}
