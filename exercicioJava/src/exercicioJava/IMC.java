package exercicioJava;

import java.util.Scanner;

public class IMC {

	public static void main(String[] args) {

		float pesoPaciente;
		float alturaPaciente;
		float imcPaciente;
		String resultadoImc;
		String nomePaciente;

		Scanner inputDados = new Scanner(System.in);

		System.out.println("******************CALCULO IMC PACIENTE******************");
		System.out.print("Digite o Nome do Paciente: ");
		nomePaciente = inputDados.nextLine();

		System.out.print("Altura (cm): ");
		alturaPaciente = inputDados.nextFloat();

		System.out.print("Peso (Kg): ");
		pesoPaciente = inputDados.nextFloat();

		imcPaciente = pesoPaciente / ((alturaPaciente / 100) * (alturaPaciente / 100));
		if (imcPaciente >= 40) {
			resultadoImc = "A classificação é Obesidade Mórbida 2";
		} else if (imcPaciente < 40 && imcPaciente >= 35) {
			resultadoImc = "A classificação é Obesidade Mórbida";
		} else if (imcPaciente < 35 && imcPaciente >= 30) {
			resultadoImc = "A classificação é Obesidade";
		} else if (imcPaciente < 30 && imcPaciente >= 25) {
			resultadoImc = "A classificação é Sobrepeso";
		} else if (imcPaciente < 25 && imcPaciente >= 18.5) {
			resultadoImc = "A classificação é Normal";
		} else if (imcPaciente < 18.5) {
			resultadoImc = "A classificação é Baixo Peso";
		} else {
			resultadoImc = "ERRO ORA NÃO MANIPULADO KKKK";
		}
		System.out.print("O IMC do paciente " + nomePaciente.toUpperCase());
		System.out.printf(" é %.2f\n", imcPaciente);
		System.out.println(resultadoImc);

		inputDados.close();
	}

}
