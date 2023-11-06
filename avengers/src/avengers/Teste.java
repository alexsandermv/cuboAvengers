package avengers;


public class Teste {

	public static void main(String[] args) {
		
		int idade = 27;
		String nome = "Alexsander Chies";
		float salario = 1540.2000f;  // sempre que for float deve ser usado o f no final do valor
		double media = 7.5;
		boolean casado = true;
		
		System.out.println("Idade: " + idade); //println usa o + pra concatenar com variáveis
		System.out.println("Nome: " + nome);
		System.out.format("Salário: R$ %.3f\n", salario); //  	\n = para quebrar linha e %.2f = formatação para casas decimais
		System.out.printf("Salário: R$ %.2f\n", salario); // 	printf ou format usa , pra concatenar 
		System.out.println("Média: " + media);
		System.out.println("Casado: " + casado);
		
	}

}
