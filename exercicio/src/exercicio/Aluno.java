
package exercicio;

import java.util.Scanner;

public class Aluno {

	public static void main(String[] args) {

		String nomeEscola;
		String nomeAluno;
		String matriculaAluno;
		String anoAluno;
		String salaAluno;
		double nota1;
		double nota2;
		double nota3;
		double nota4;
		double media;

		Scanner entradaDados = new Scanner(System.in);

		System.out.print("Digite o nome da escola: ");
		nomeEscola = entradaDados.nextLine();

		System.out.print("Digite o nome do aluno: ");
		nomeAluno = entradaDados.nextLine();

		System.out.print("Matricula do aluno: ");
		matriculaAluno = entradaDados.nextLine();

		System.out.print("Ano do aluno: ");
		anoAluno = entradaDados.nextLine();

		System.out.print("Sala do aluno: ");
		salaAluno = entradaDados.nextLine();

		System.out.print("Informe a primeira nota: ");
		nota1 = entradaDados.nextDouble();

		System.out.print("Informe a segunda nota: ");
		nota2 = entradaDados.nextDouble();

		System.out.print("Informe a terceira nota: ");
		nota3 = entradaDados.nextDouble();

		System.out.print("Informe a quarta nota: ");
		nota4 = entradaDados.nextDouble();

		media = (nota1 + nota2 + nota3 + nota4) / 4;

		System.out.println("================= " + nomeEscola + " ================");
		System.out.println("**** MÉDIA DA TURMA " + anoAluno + " Sala " + salaAluno + "****");
		System.out.println("Aluno: " + nomeAluno + " matricula " + matriculaAluno);
		System.out.println("Sua média foi " + media);
		System.out.println("==================================================");

		entradaDados.close();
	}

}
