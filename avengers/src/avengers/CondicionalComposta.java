package avengers;

import java.util.Scanner;

public class CondicionalComposta {

	public static void main(String[] args) {

		Scanner entradaDados = new Scanner(System.in);
		
		int idade;
		
		System.out.print("Informe sua idade: ");
		idade = entradaDados.nextInt();
		
		if (idade >= 18) {
			System.out.println("Maior de idade!");
		} else {          							// condicional composta
			System.out.println("Menor de idade!");
		}
		
		entradaDados.close();
	}

}
