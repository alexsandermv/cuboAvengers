package exercicioJava;

import java.util.Scanner;

public class Endereco {

	public static void main(String[] args) {

		String rua;
		int numero;
		String bairro;
		String cep;
		String cidade;
		String estado;
		String nomePessoa;
		String complemento;
		
		
		
		Scanner entradaDados = new Scanner (System.in);
		
		System.out.print("Digite seu nome: ");
		nomePessoa = entradaDados.nextLine();
		
		System.out.print("Digite o estado: ");
		estado = entradaDados.nextLine();
		
		System.out.print("Digite a cidade: ");
		cidade = entradaDados.nextLine();
		
		System.out.print("Digite o CEP: ");
		cep = entradaDados.nextLine();
		
		System.out.print("Digite o bairro: ");
		bairro = entradaDados.nextLine();
		
		System.out.print("Digite o nome da rua: ");
		rua = entradaDados.nextLine();
		
		System.out.print("Digite o numero do endereço: ");
		numero = entradaDados.nextInt();
		entradaDados.nextLine();
		
		System.out.print("Digite o numero do endereço: ");
		numero = entradaDados.nextInt();
		
		entradaDados.nextLine();
		
		System.out.print("Digite o complemento do endereço: ");
		complemento = entradaDados.nextLine();		
		
		System.out.println("Seu nome é " + nomePessoa);
		System.out.println("Mora em: " + cep + rua + " Nº" + numero + " " + complemento  + " bairro " + bairro + " - " + cidade + "-"+ estado);
		entradaDados.close();
	}
}
