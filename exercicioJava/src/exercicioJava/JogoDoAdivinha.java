package exercicioJava;

import java.util.Scanner;

public class JogoDoAdivinha {

	public static void main(String[] args) {
		
		int numeroInformado;
		double numeroAleatorio = Math.random();
		int numeroSorteado = (int) (0 + numeroAleatorio * (5 - 1));
		String resultadoSorteio;
			
		
		System.out.println("=========================================");
		System.out.println("************JOGO DA SORTE****************");
		
		Scanner entradaDados = new Scanner (System.in);
		
		System.out.print("Digite um número DE 1 a 5: ");
		numeroInformado = entradaDados.nextInt();
		
		resultadoSorteio = numeroInformado == numeroSorteado ? "Õ/ GANHOOOOOOOU Õ/" : "perdeu :(";
		
		
		System.out.println("Você escolheu " + numeroInformado + " e número sorteado foi "+ numeroSorteado + " você " + resultadoSorteio);
		
		entradaDados.close();
				
	}

}