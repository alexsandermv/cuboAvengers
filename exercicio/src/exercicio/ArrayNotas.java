package exercicio;

import java.util.Scanner;

public class ArrayNotas {

	public static void main(String[] args) {

		System.out.println("===============================================");
		System.out.println("=       M É D I A S  D O S  A L U N O S       =");
		System.out.println("===============================================");

		Scanner inputDados = new Scanner(System.in);

		int qtdAlunos;
		int notaMaxima;

		System.out.print("Qual a nota máxima: ");
		notaMaxima = inputDados.nextInt();
		inputDados.nextLine();

		System.out.print("Informe a quantidade de alunos: ");
		qtdAlunos = inputDados.nextInt();
		inputDados.nextLine();

		String[] nomeAluno = new String[qtdAlunos];
		double[] nota1 = new double[qtdAlunos];
		double[] nota2 = new double[qtdAlunos];
		double[] media = new double[qtdAlunos];

		for (int i = 0; i < nomeAluno.length; i++) {
			System.out.print("Digite o nome do " + (i + 1) + "º aluno: ");
			nomeAluno[i] = inputDados.nextLine();
			System.out.print("Informe a primeira nota: ");
			nota1[i] = inputDados.nextDouble();
			while (nota1[i] > notaMaxima) {								// condição para não informar uma nota maior que a nota máxima possível
				System.out.print("Nota inválida, informe primeira nota novamente: ");
				nota1[i] = inputDados.nextDouble();
			}
			System.out.print("Informe a segunda nota: ");
			nota2[i] = inputDados.nextDouble();
			while (nota2[i] > notaMaxima) { 							// condição para não informar uma nota maior que a nota máxima possível
				System.out.print("Nota inválida, informe segunda nota novamente: ");
				nota2[i] = inputDados.nextDouble();
			}
			inputDados.nextLine();
			media[i] = (nota1[i] + nota2[i]) / 2; 						// calcula a média do aluno
		}
		System.out.println("===============================================");
		System.out.println("=              R E S U L T A D O S            =");
		System.out.println("===============================================");

		for (int i = 0; i < media.length; i++) {
			if (media[i] < (notaMaxima * 0.7)) { 						// se não tiver atingido 70% da nota máxima está reprovado
				System.out.println("Aluno " + nomeAluno[i] + " teve média " + media[i] + " e está REPROVADO");
			} else {
				System.out.println("Aluno " + nomeAluno[i] + " teve média " + media[i] + " e está APROVADO");
			}
		}

		inputDados.close();
	}

}
