package exercicio;

import java.util.Scanner;

public class ArrayNotas {

	public static void main(String[] args) {

		Scanner inputDados = new Scanner(System.in);
		
		int qtdAlunos;
		
		System.out.print("Informe a quantidade de alunos: ");
		qtdAlunos = inputDados.nextInt();
		inputDados.nextLine();
		
		String[] nomeAluno = new String [qtdAlunos];
		double[] nota1 = new double [qtdAlunos];
		double[] nota2 = new double [qtdAlunos];
		double[] media = new double [qtdAlunos];
		
		for (int i = 0; i < nomeAluno.length; i++) {
			System.out.print("Digite o nome do " + (i + 1) + "º aluno: ");
			nomeAluno[i] = inputDados.nextLine();
			System.out.print("Informe a primeira nota: ");
			nota1[i] = inputDados.nextDouble();
			System.out.print("Informe a segunda nota: ");
			nota2[i] = inputDados.nextDouble();
			inputDados.nextLine();
			media[i] = (nota1[i] + nota2[i]) / 2;
		}
		System.out.println("===============================================");
		System.out.println("              R E S U L T A D O S              ");
		System.out.println("===============================================");
		
		for (int i = 0; i < media.length; i++) {
			if (media[i] < 7) {
				System.out.println("Aluno " + nomeAluno[i] + " teve média " + media[i] + " e está REPROVADO");
			}else {
				System.out.println("Aluno " + nomeAluno[i] + " teve média " + media[i] + " e está APROVADO");				
			}
		}
		
		inputDados.close();
	}

}