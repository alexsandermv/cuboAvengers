package projetoCubo;

import java.util.Scanner;

public class ContaTeste {

	public static void main(String[] args) {
		int opcaoA = 0;
		int opcaoB = 0;
		int senha;
		double valor;
		int conta = 0;
		String chave;
		int senhaAntiga;
		int senhaNova;
		int cont = 0;

		Scanner input = new Scanner(System.in);
		ContaCorrente cc = new ContaCorrente();
		ContaPoupanca cp = new ContaPoupanca();

		do {
			System.out.println();
			System.out.println();
			System.out.println("Selecione uma opção:");
			System.out.println("         1- Criar Conta Corrente");
			System.out.println("         2- Criar Conta Poupança");
			System.out.println("         3- Acessar Conta");
			opcaoA = input.nextInt();
			input.nextLine();
			//
			//
			// CONTA CORRENTE
			//
			//
			if (opcaoA == 1) {
				System.out.print("Digite seu Nome Completo:");
				cc.setTitular(input.nextLine());
				cc.setTipo("Conta Corrente");
				System.out.print("Digite o CPF: ");
				cc.setCpf(input.nextLine());
				while (cc.getCpf().length() != 11) {
					System.out.println("CPF inválido, digite novamente:");
					cc.setCpf(input.nextLine());
				}
				System.out.print("Digite uma senha de 4 dígitos:");
				senhaNova = input.nextInt();
				senhaAntiga = senhaNova;
				input.nextLine();
				while (senhaAntiga != 0) {
					senhaAntiga = senhaAntiga / 10;
					cont++;
				}
				; // contar digitos da senha
				while (cont != 4) { // entra para pedir senha novamente até que seja de 4 digitos
					cont = 0;
					System.out.println("Senha inválida, Digite novamente:");
					senhaNova = input.nextInt();
					senhaAntiga = senhaNova;
					input.nextLine();
					while (senhaAntiga != 0) {
						senhaAntiga = senhaAntiga / 10;
						cont++;
					}
					;
				}
				cc.setSenha(senhaNova);
				System.out.println(cc.getSenha());
				cc.abrirConta();
				//
				// SUB MENU CONTA CORRENTE
				//
				do {
					System.out.println();
					System.out.println();
					System.out.println("Selecione uma opção:");
					System.out.println("         1- Consulta Saldo");
					System.out.println("         2- Pix");
					System.out.println("         3- Trocar Senha");
					System.out.println("         4- Sacar");
					System.out.println("         5- Depositar");
					System.out.println("         0- Voltar");
					opcaoB = input.nextInt();
					input.nextLine();
					if (cc.getContaBloqueada() == true) {
						System.out.print("**********Conta bloqueada Entre em contato com o banco*******");
					} else if (opcaoB == 1) { // CONSULTA SALDO
						cc.consultaSaldo();
					} else if (opcaoB == 2) { // TRANSFERIR PIX
						System.out.println("Digite a Chave PIX:");
						chave = input.nextLine();
						System.out.print("Digite o valor: ");
						valor = input.nextDouble();
						System.out.print("Digite a senha: ");
						senha = input.nextInt();
						cc.transferir(chave, valor, senha);
					} else if (opcaoB == 3 && cc.getContaBloqueada() == false) { // TROCAR SENHA
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
							System.out.println("**********Conta bloqueada Entre em contato com o banco*******");
						} else {
							System.out.print("Digite a senha nova:");
							senhaNova = input.nextInt();
							cc.trocarSenha(senhaAntiga, senhaNova);
						}
					} else if (opcaoB == 4 && cc.getContaBloqueada() == false) { // SACAR
						System.out.print("Digite o valor do saque:");
						valor = input.nextDouble();
						System.out.print("Digite a senha:");
						senha = input.nextInt();
						input.nextLine();
						cc.sacar(valor, senha);
					} else if (opcaoB == 5 && cc.getContaBloqueada() == false) { // DEPOSITAR
						System.out.print("Digite o valor a depositar:");
						valor = input.nextDouble();
						System.out.print("Digite a Senha");
						senha = input.nextInt();
						input.nextLine();
						cc.depositar(valor, senha);				
					} else {
						System.out.println("Opção inválida");
					}
				}while (opcaoB == 0) ;

				//
				//
				// CONTA POUPANCA
				//
				//
			} else if (opcaoA == 2) {
				System.out.print("Digite seu Nome Completo:");
				cp.setTitular(input.nextLine());
				cp.setTipo("Conta Corrente");
				System.out.print("Digite o CPF: ");
				cp.setCpf(input.nextLine());
				while (cp.getCpf().length() != 11) {
					System.out.println("CPF inválido, digite novamente:");
					cp.setCpf(input.nextLine());
				}
				System.out.print("Digite uma senha de 4 dígitos:");
				senhaNova = input.nextInt();
				senhaAntiga = senhaNova;
				input.nextLine();
				while (senhaAntiga != 0) {
					senhaAntiga = senhaAntiga / 10;
					cont++;
				}; // contar digitos da senha
				while (cont != 4) { // entra para pedir senha novamente até que seja de 4 digitos
					cont = 0;
					System.out.println("Senha inválida, Digite novamente:");
					senhaNova = input.nextInt();
					senhaAntiga = senhaNova;
					input.nextLine();
					while (senhaAntiga != 0) {
						senhaAntiga = senhaAntiga / 10;
						cont++;
					};
				}
				cp.setSenha(senhaNova);
				cp.abrirConta();
				//
				// SUB MENU CONTA POUPANCA
				//
				do {
					System.out.println();
					System.out.println();
					System.out.println("Selecione uma opção:");
					System.out.println("         1- Consulta Saldo");
					System.out.println("         2- Pix");
					System.out.println("         3- Trocar Senha");
					System.out.println("         4- Sacar");
					System.out.println("         5- Depositar");
					System.out.println("         0- Voltar");
					opcaoB = input.nextInt();
					input.nextLine();
					if (cp.getContaBloqueada() == true) {
						System.out.print("**********Conta bloqueada Entre em contato com o banco*******");
					} else if (opcaoB == 1) { // CONSULTA SALDO
						cp.consultaSaldo();
						opcaoB = 0;
					} else if (opcaoB == 2) { // TRANSFERIR PIX
						System.out.println("Digite a Chave PIX:");
						chave = input.nextLine();
						System.out.print("Digite o valor: ");
						valor = input.nextDouble();
						System.out.print("Digite a senha: ");
						senha = input.nextInt();
						cp.transferir(chave, valor, senha);
					} else if (opcaoB == 3 && cp.getContaBloqueada() == false) { // TROCAR SENHA
						System.out.print("Digite a senha antiga: ");
						senhaAntiga = input.nextInt();
						int i = 0;
						while (i < 2 && cp.validaSenhaAntiga(senhaAntiga) == false) {
							System.out.print("Senha inválida! Digite a senha antiga novamente: ");
							senhaAntiga = input.nextInt();
							i++;
							cp.setContaBloqueada(true);
						}
						if (cp.getContaBloqueada() == true) {
							System.out.println("**********Conta bloqueada Entre em contato com o banco*******");
						} else {
							System.out.print("Digite a senha nova:");
							senhaNova = input.nextInt();
							cp.trocarSenha(senhaAntiga, senhaNova);
							opcaoB = 0;
						}
					} else if (opcaoB == 4 && cc.getContaBloqueada() == false) { // SACAR
						System.out.print("Digite o valor do saque:");
						valor = input.nextDouble();
						System.out.print("Digite a senha:");
						senha = input.nextInt();
						input.nextLine();
						cc.sacar(valor, senha);					
					} else if (opcaoB == 5 && cp.getContaBloqueada() == false) { // DEPOSITAR
						System.out.print("Digite o valor a depositar:");
						valor = input.nextDouble();
						System.out.print("Digite a Senha");
						senha = input.nextInt();
						input.nextLine();
						cp.depositar(valor, senha);
					} else {
						System.out.println("Opção inválida");
					}
					
				} while (opcaoB != 0) ;
				//
				//
				// CONTA JA CRIADA
				//
				//
			} else if (opcaoA == 3) {
				System.out.println("Digite o número da conta:");
				conta = input.nextInt();
				System.out.println("Digite a senha da conta:");
				senha = input.nextInt();
				senhaAntiga = senha;
				while (senhaAntiga != 0) {
					senhaAntiga = senhaAntiga / 10;
					cont++;
				}; // contar digitos da senha
				while (cont != 4) { // entra para pedir senha novamente até que seja de 4 digitos
					cont = 0;
					System.out.println("Senha inválida, Digite novamente:");
					senhaNova = input.nextInt();
					senhaAntiga = senhaNova;
					input.nextLine();
					while (senhaAntiga != 0) {
						senhaAntiga = senhaAntiga / 10;
						cont++;
					};
				}
				
				//
				// CONTA CORRENTE JA CRIADA
				//
				if (conta <= 10000) {
					cc.setSenha(senha);
					do {
						System.out.println();
						System.out.println();
						System.out.println("Selecione uma opção:");
						System.out.println("         1- Consulta Saldo");
						System.out.println("         2- Pix");
						System.out.println("         3- Trocar Senha");
						System.out.println("         4- Sacar");
						System.out.println("         5- Depositar");
						System.out.println("         6- Pagar boleto");
						System.out.println("         0- Voltar");
						opcaoB = input.nextInt();
						input.nextLine();
						if (cc.getContaBloqueada() == true) {
							System.out.print("**********Conta bloqueada Entre em contato com o banco*******");
						} else if (opcaoB == 1) { // CONSULTA SALDO
							cc.consultaSaldo();
						} else if (opcaoB == 2) { // TRANSFERIR PIX
							System.out.println("Digite a Chave PIX:");
							chave = input.nextLine();
							System.out.print("Digite o valor: ");
							valor = input.nextDouble();
							System.out.print("Digite a senha: ");
							senha = input.nextInt();
							cc.transferir(chave, valor, senha);
						} else if (opcaoB == 3 && cc.getContaBloqueada() == false) { // TROCAR SENHA
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
								System.out.println("**********Conta bloqueada Entre em contato com o banco*******");
							} else {
								System.out.print("Digite a senha nova:");
								senhaNova = input.nextInt();
								cc.trocarSenha(senhaAntiga, senhaNova);
							}
						} else if (opcaoB == 4 && cc.getContaBloqueada() == false) { // SACAR
							System.out.print("Digite o valor do saque:");
							valor = input.nextDouble();
							System.out.print("Digite a senha:");
							senha = input.nextInt();
							input.nextLine();
							cc.sacar(valor, senha);
						} else if (opcaoB == 5 && cc.getContaBloqueada() == false) { // DEPOSITAR
							System.out.print("Digite o valor a depositar:");
							valor = input.nextDouble();
							System.out.print("Digite a Senha");
							senha = input.nextInt();
							input.nextLine();
							cc.depositar(valor, senha);
						} else if (opcaoB == 6 && cc.getContaBloqueada() == false) { // PAGAR BOLETO
							System.out.print("Digite o código de barras:");
							input.nextInt();
							input.nextLine();
							System.out.print("Digite o valor a ser pago:");
							valor = input.nextDouble();
							System.out.print("Digite sua senha: ");
							senha = input.nextInt();
							input.nextLine();
							cc.pagarBoleto(valor, senha);
						} else {
							System.out.println("Opção inválida");
						}
					}while (opcaoB != 0);
				//
				// CONTA POUPANCA JA CRIADA
				//				
				} else {
					cp.setSenha(senha);
					do {
						System.out.println();
						System.out.println();
						System.out.println("Selecione uma opção:");
						System.out.println("         1- Consulta Saldo");
						System.out.println("         2- Pix");
						System.out.println("         3- Trocar Senha");
						System.out.println("         4- Sacar");
						System.out.println("         5- Depositar");
						System.out.println("         0- Voltar");
						opcaoB = input.nextInt();
						input.nextLine();
						if (cp.getContaBloqueada() == true) {
							System.out.print("**********Conta bloqueada Entre em contato com o banco*******");
						} else if (opcaoB == 1) { // CONSULTA SALDO
							cp.consultaSaldo();
						} else if (opcaoB == 2) { // TRANSFERIR PIX
							System.out.println("Digite a Chave PIX:");
							chave = input.nextLine();
							System.out.print("Digite o valor: ");
							valor = input.nextDouble();
							System.out.print("Digite a senha: ");
							senha = input.nextInt();
							cp.transferir(chave, valor, senha);
						} else if (opcaoB == 3 && cp.getContaBloqueada() == false) { // TROCAR SENHA
							System.out.print("Digite a senha antiga: ");
							senhaAntiga = input.nextInt();
							int i = 0;
							while (i < 2 && cp.validaSenhaAntiga(senhaAntiga) == false) {
								System.out.print("Senha inválida! Digite a senha antiga novamente: ");
								senhaAntiga = input.nextInt();
								i++;
								cp.setContaBloqueada(true);
							}
							if (cp.getContaBloqueada() == true) {
								System.out.println("**********Conta bloqueada Entre em contato com o banco*******");
							} else {
								System.out.print("Digite a senha nova:");
								senhaNova = input.nextInt();
								cp.trocarSenha(senhaAntiga, senhaNova);
							}
						} else if (opcaoB == 4 && cp.getContaBloqueada() == false) { // SACAR
							System.out.print("Digite o valor do saque:");
							valor = input.nextDouble();
							System.out.print("Digite a senha:");
							senha = input.nextInt();
							input.nextLine();
							cp.sacar(valor, senha);
						} else if (opcaoB == 5 && cp.getContaBloqueada() == false) { // DEPOSITAR
							System.out.print("Digite o valor a depositar:");
							valor = input.nextDouble();
							System.out.print("Digite a Senha");
							senha = input.nextInt();
							input.nextLine();
							cp.depositar(valor, senha);												
						} else {
							System.out.println("Opção inválida");
						}
					}while (opcaoB != 0);
				}
			}
			
		}while (opcaoA != 0);
		input.close();
	}
}
