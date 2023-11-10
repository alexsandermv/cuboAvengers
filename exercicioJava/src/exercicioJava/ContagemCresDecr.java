package exercicioJava;

import java.util.Scanner;

public class ContagemCresDecr {

	public static void main(String[] args) {

		Scanner inputDados = new Scanner(System.in);

		int num1;
		int num2;
		int contador;

		   System.out.println("=============================");
		   System.out.println("            CUBO             ");
		   System.out.println("=============================");
		   System.out.println("Vamos realizar uma contagem!!");
		   
		System.out.print("Digite o primeiro número: ");
		num1 = inputDados.nextInt();

		System.out.print("Digite o segundo número: ");
		num2 = inputDados.nextInt();

		if (num1 < num2) {
			contador = num1;
			System.out.println("Contagem Progressiva");
			while (contador <= num2) {
				System.out.println(contador + "..");
				contador++;
			}
		} else {
			contador = num1;
			System.out.println("Contagem regressiva");
			while (contador >= num2) {
				System.out.println(contador + "..");
				contador--;
			}
		}

		inputDados.close();
	}

}
