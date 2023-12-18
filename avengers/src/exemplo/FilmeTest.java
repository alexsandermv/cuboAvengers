package exemplo;

import java.util.Scanner;

public class FilmeTest {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Quantos Filmes deseja cadastrar: ");
		int quantFilme = input.nextInt();
		
		Filme[] filmes = new Filme[quantFilme];
		
		for (int i = 0; i < filmes.length; i++) {
			
			Filme filme = new Filme();
			
			System.out.println("Informe os dados do Filme " + (i+1));
			
			System.out.print("Código: ");
			filme.setCod(input.nextInt());
			
			input.nextLine();
			
			System.out.println("Titulo: ");
			filme.setTitulo(input.nextLine());
			
			System.out.print("Ano: ");
			filme.setAno(input.nextInt());
			
			input.nextLine();
			
			System.out.print("Gênero: ");
			filme.setGenero(input.nextLine());
			
			System.out.print("Duração: ");
			filme.setDuracao(input.nextLine());
			
			filmes[i] = filme; // o  Array recebe o objeto filme;
									
		}
			
		for (Filme filme : filmes) { // for each
			filme.catalago();
			System.out.println();
		}
	
		input.close();
	}

}
