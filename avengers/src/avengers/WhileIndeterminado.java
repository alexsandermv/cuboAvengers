package avengers;

import java.util.Scanner;

public class WhileIndeterminado {

	public static void main(String[] args) {

		Scanner inputDados = new Scanner(System.in);

		String nome = "";

		System.out.println("Digite os nomes que desejar, para concluir digite 'sair'");

		while (!nome.equalsIgnoreCase("sair")) { // enquanto o nome for diferente de sair vai executar

			System.out.print("Digite o nome: ");
			nome = inputDados.nextLine();

		}
		System.out.println("Fim");
		inputDados.close();
	}

}
