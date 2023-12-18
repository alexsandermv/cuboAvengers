package exemplo;

import java.util.Scanner;

public class ContaTeste {

	public static void main(String[] args) {

		int opcaoA = 0;
		double valor;
		int senhaAntiga;
		int senhaNova;

		Scanner input = new Scanner(System.in);
		ContaCorrente cc = new ContaCorrente();
		cc.abrirConta();
		cc.setSenha(1350);

		while (opcaoA == 0) {
			System.out.println();
			System.out.println();
			System.out.println("Selecione uma opção:");
			System.out.println("         1- Consulta Saldo");
			System.out.println("         2- Pix");
			System.out.println("         3- Trocar Senha");
			opcaoA = input.nextInt();

			if (opcaoA == 1) {
				cc.consultaSaldo();
				opcaoA = 0;
			} else if (opcaoA == 2) {
				System.out.print("Digite o valor: ");
				valor = input.nextDouble();
				System.out.print("Digite a senha: ");
				int senha = input.nextInt();
				cc.transferir(valor, senha);
				opcaoA = 0;
			} else if (opcaoA == 3) {
				System.out.print("Digite a senha antiga: ");
				senhaAntiga = input.nextInt();
				int i = 0;
				while (i < 2 && cc.validaSenhaAntiga(senhaAntiga) == false) {
					System.out.print("Senha inválida! Digite a senha antiga novamente: ");
					senhaAntiga = input.nextInt();
					i++;
					cc.setContaBloqueada(true);
				}
				if (cc.getContaBloqueada() == true) {
					System.out.println("**********Conta bloqueada*******");
				}else {

					System.out.print("Digite a senha nova:");
					senhaNova = input.nextInt();
					cc.trocarSenha(senhaAntiga, senhaNova);
					opcaoA = 0;
				}
			}
		}
		input.close();
	}

}
