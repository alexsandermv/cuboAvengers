package avengers;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		Scanner inpuDados = new Scanner(System.in);
		System.out.println("Digite o nome que desejar, para clocluir digite, 'sair': ");
		String nome;
		do {
			System.out.println("Digite o nome: ");
			nome = inpuDados.nextLine();
		} while (!nome.equalsIgnoreCase("sair"));

		System.out.print("Programa finalizado");
		inpuDados.close();
	}

}
