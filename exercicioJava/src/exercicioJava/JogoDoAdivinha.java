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
		
		resultadoSorteio = numeroInformado == numeroSorteado ? "GANHOOOOOOOU" : "perdeu";
		
		
		System.out.println("O número sorteado foi "+ numeroSorteado + " e você " + resultadoSorteio);
		
				
	}

}