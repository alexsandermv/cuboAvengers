package exemplo;

public class FilmeTeste {

	public static void main(String[] args) {

		Filme filme = new Filme();
		
		filme.setCod(001);
		filme.setTitulo("Matrix");
		filme.setDuracao("2h30min");
		filme.setAno(2003);
		filme.setGenero("Ação/Ficção");
		System.out.println("Código: " + filme.getCod());
		System.out.println("Filme: " + filme.getTitulo());
		System.out.println("Duração: " + filme.getDuracao());
		System.out.println("Ano: " + filme.getAno());
		System.out.println("Genero: " + filme.getGenero());

		System.out.println();
		
		filme.catalago();
	}

}
