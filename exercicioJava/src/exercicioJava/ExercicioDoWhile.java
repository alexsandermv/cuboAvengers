package exercicioJava;

import java.util.Scanner;

public class ExercicioDoWhile {

	public static void main(String[] args) {
		
		Scanner inputDados = new Scanner(System.in);
		
		int numero;
		
		System.out.println("=============================");
		System.out.println("        Exercício 1          ");
		System.out.println("=============================");
		System.out.println("Digite um número ( 0 para PARAR)");
		do {
			numero = inputDados.nextInt();
			inputDados.nextInt();
		} while (numero == 0);
	inputDados.close();
	}
	

}
