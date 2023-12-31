package exercicioJava;

import java.util.Scanner;

public class SalarioFinalFuncionario {

	public static void main(String[] args) {
		Scanner inputDados = new Scanner(System.in);
		
		String nomeFuncionario;
		float salarioFuncionario = 0f;
		float salarioFinal = 0f;
		int quantDependente;
		int faixa1 = 5;
		int faixa2 = 10;
		int faixa3 = 15;
		int faixa4 = 18;
		
		System.out.print("Digite o nome do funcionario: ");
		nomeFuncionario = inputDados.nextLine();
		
		System.out.print("Informe o salario: ");
		salarioFuncionario = inputDados.nextFloat();
		
		System.out.print("Quantos dependentes tem (0 para nenhum)?: ");
		quantDependente = inputDados.nextInt();
		
		if (quantDependente == 0) {
			salarioFinal = salarioFuncionario + (salarioFuncionario * faixa1/100);
		}else if (quantDependente > 0 && quantDependente <= 3) {
			salarioFinal = salarioFuncionario + (salarioFuncionario * faixa2/100);
		}else if (quantDependente > 3 && quantDependente <= 6) {
			salarioFinal = salarioFuncionario + (salarioFuncionario * faixa3/100);			
		}else if (quantDependente > 6) {
			salarioFinal = salarioFuncionario + (salarioFuncionario * faixa4/100);
		}
		else {
			System.out.println("ERRO");
		}
		System.out.print("Salario final de " + nomeFuncionario);
		System.out.printf(" é R$ %.2f\n", salarioFinal); 
		
		
		inputDados.close();
		
	}

}
