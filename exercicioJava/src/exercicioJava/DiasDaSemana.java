package exercicioJava;

import java.util.Scanner;

public class DiasDaSemana {

	public static void main(String[] args) {
		String diaDaSemana;
		
		Scanner inputDados = new Scanner (System.in);
		System.out.println("++++++++++++++++++++++++++++++++");
		System.out.println("    D I A S   D A   S E M A N A ");
		System.out.println("++++++++++++++++++++++++++++++++");
		System.out.print("Digite um dia da semana: ");
		diaDaSemana = inputDados.nextLine();
		diaDaSemana = diaDaSemana.replace('Ç', 'C');
		
		if (diaDaSemana.equalsIgnoreCase("DOMINGO")) {
			System.out.println("Domingo é o 1º dia da semana");
		} else if (diaDaSemana.equalsIgnoreCase("SEGUNDA")) {
			System.out.println("Segunda é o 2º dia da semana");
		} else if (diaDaSemana.equalsIgnoreCase("TERCA")) {
			System.out.println("Terça é o 3º dia da semana");
		}else if (diaDaSemana.equalsIgnoreCase("QUARTA")) {
			System.out.println("Quarta é o 4º dia da semana");
		}else if (diaDaSemana.equalsIgnoreCase("QUINTA")) {
			System.out.println("Quinta é o 5º dia da semana");
		}else if (diaDaSemana.equalsIgnoreCase("SEXTA")) {
			System.out.println("Sexta é o 6º dia da semana");
		}else if (diaDaSemana.equalsIgnoreCase("SÁBADO")) {
			System.out.println("Sábado é o 7º dia da semana");
		} else {
			System.out.println("Dia inválido");
		}
		
		inputDados.close();

	}

}
