package exemplo;

import java.util.Scanner;

public class ContaTeste {

	public static void main(String[] args) {

		int opcao = 0;
		double valor;
		int senhaAntiga;
		int senhaNova;

		Scanner input = new Scanner(System.in);
		ContaCorrente cc = new ContaCorrente();
		cc.abrirConta();
		cc.setSenha(1350);

		while (opcao == 0) {
			System.out.println();
			System.out.println();
			System.out.println("Selecione uma opção:");
			System.out.println("         1- Consulta Saldo");
			System.out.println("         2- Pix");
			System.out.println("         3- Trocar Senha");
			opcao = input.nextInt();

			if (opcao == 1) {
				cc.consultaSaldo();
				opcao = 0;
			} else if (opcao == 2) {
				System.out.print("Digite o valor: ");
				valor = input.nextDouble();
				System.out.print("Digite a senha: ");
				int senha = input.nextInt();
				cc.transferir(valor, senha);
				opcao = 0;
			} else if (opcao == 3) {
				System.out.print("Digite a senha antiga: ");
				senhaAntiga = input.nextInt();
				if (cc.validaSenhaAntiga(senhaAntiga)) {
					System.out.print("Digite a senha nova:");
					senhaNova = input.nextInt();
					cc.trocarSenha(senhaAntiga, senhaNova);
					opcao = 0;
				} else {
					System.out.print("Senha antiga inválida");
					opcao = 3;
				}

			}
		}
		input.close();
	}

}