package avengers;

import java.util.Scanner;

public class EntradaDados {

	public static void main(String[] args) {

		String nome;
		int idade;
		
		Scanner inputDados = new Scanner(System.in); //inputDados é um objeto criado na classe Scanner
		
		System.out.print("Qual seu nome? ");
		nome = inputDados.nextLine();
		System.out.print("Qual sua idade: ");
		idade = inputDados.nextInt();

		System.out.println("Muito Prazer, " + nome);
		System.out.println("Sua idade é: " + idade + " anos!");
		
	}

}
