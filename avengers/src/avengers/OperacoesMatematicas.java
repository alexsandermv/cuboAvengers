package avengers;

import java.util.Scanner;

public class OperacoesMatematicas {

	public static void main(String[] args) {

		String nome;
		int valor1;
		int valor2;
		int soma;
		int subtracao;
		int multiplicacao;
		int divisao;
		
		Scanner entradaDeDados = new Scanner(System.in);
		
		System.out.print("Digite o seu Nome: ");
		nome = entradaDeDados.nextLine();		
		System.out.print("Digite o primeiro valor: ");
		valor1 = entradaDeDados.nextInt();
		System.out.print("Digite o segundo valor: ");
		valor2 = entradaDeDados.nextInt();
		
		
		System.out.println("Seu nome é " + nome + " e as operações matemáticas são: ");
		
		
		soma = valor1 + valor2;
		System.out.println("O resultado de " + valor1 + " mais " + valor2 + " é: " + soma);
		
		subtracao = valor1 - valor2;
		System.out.println("O resultado de " + valor1 + " menos " + valor2 + " é: " + subtracao);		
		
		multiplicacao = valor1 * valor2;
		System.out.println("O resultado de " + valor1 + " vezes " + valor2 + " é: " + multiplicacao);
		
		divisao = valor1 / valor2;
		System.out.println("O resultado de " + valor1 + " dividido por " + valor2 + " é: " + divisao);
		
		
		entradaDeDados.close();
	}

}
