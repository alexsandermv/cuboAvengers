package exercicioJava;

import java.util.Scanner;

public class ArrayMedia {

	public static void main(String[] args) {

		Scanner inputDados = new Scanner(System.in);

		int qtdNotas;

		System.out.print("Quantas notas são? ");
		qtdNotas = inputDados.nextInt(); 				// solicitando a quantidade de notas 
		inputDados.nextLine();							// encerrando o nextInt

		double[] notas = new double[qtdNotas]; 			// criando o array conforme a quantidade de notas informada

		for (int i = 0; i < notas.length; i++) {
			System.out.println("informe a " + (i + 1) + "ª nota:"); 
			notas[i] = inputDados.nextDouble(); 		// solicita as notas do aluno
		}

		double media = 0;

		for (int i = 0; i < notas.length; i++) {
			media = media + notas[i]; 					// soma todas as notas informadas 
		}
		
		media = media / qtdNotas; 						// calcula a média do aluno
		
		System.out.println("A média é: " + media);
		
		inputDados.close();
	}

}
