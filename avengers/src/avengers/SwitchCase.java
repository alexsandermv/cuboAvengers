package avengers;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		Scanner inputDados = new Scanner(System.in);
		
		String conceito = "";
		
		System.out.print("Informe a nota1 do aluno: ");
		int nota1 = inputDados.nextInt();  //não precisa criar variável no bloco superior
		System.out.print("Informe a nota2 do aluno: ");
		int nota2 = inputDados.nextInt();
		
		int media = (nota1 + nota2)/ 2;
		
		switch (media) {
		case 10,9:
			conceito = "A";
			break;
		case 8,7:
			conceito = "B";
			break;
		case 6,5:
			conceito = "C";
			break;
		case 4,3,2:
			conceito = "D";
			break;
		default:
			conceito = "E";			
			break;
		}
		inputDados.close();
		System.out.println(conceito);
		
	}

}
