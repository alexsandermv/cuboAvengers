package avengers;

import java.util.Scanner;

public class ForPara2 {

	public static void main(String[] args) {
	
		Scanner inputDados = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int num = inputDados.nextInt();
		
		System.out.print("Digite um intervalo: ");
		int intervalo = inputDados.nextInt();
		
		
		for (int i = 0; i <= num; i+=intervalo) {
			System.out.println("i = " + i);
		}
		inputDados.close();
	}

}
