package avengers;

import java.util.Scanner;

public class CondicaoSimples {

	public static void main(String[] args) {

		Scanner entradaDados = new Scanner(System.in);
		
		float n1;
		float n2;
		float media;
		
		System.out.print("Nota 1: ");
		n1 = entradaDados.nextFloat();
		System.out.print("Nota 2: ");
		n2 = entradaDados.nextFloat();
	
		media = (n1 + n2) /2;
		
		if (media >= 7) {    // estrutura simples
			System.out.println("Aprovado");
		}
		System.out.println("Fim!");
		
		entradaDados.close();
	}

}
