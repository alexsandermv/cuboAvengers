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
			System.out.println("Bem vindo ao banco CUBO!");
			System.out.println();
			System.out.println("Selecione uma opção:");
			System.out.println("         1- Criar Conta Corrente");
			System.out.println("         2- Criar Conta Poupança");
			System.out.println("         3- Acessar Conta");
			System.out.println("         0- Sair");
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
				System.out.print("Digite o CPF (sem pontuação): ");
				cc.setCpf(input.nextLine());
				while (cc.getCpf().length() != 11) {
					System.out.print("CPF inválido, digite novamente:");
					cc.setCpf(input.nextLine());
				}
				System.out.print("Digite uma senha de 4 dígitos:");
				senha = input.nextInt();
				senhaAntiga = senha;
				input.nextLine();
				while (senhaAntiga != 0) {
					senhaAntiga = senhaAntiga / 10;
					cont++;
				}
				; // contar digitos da senha
				while (cont != 4) { // entra para pedir senha novamente até que seja de 4 digitos
					cont = 0;
					System.out.print("Senha inválida, Digite novamente:");
					senha = input.nextInt();
					senhaAntiga = senha;
					input.nextLine();
					while (senhaAntiga != 0) {
						senhaAntiga = senhaAntiga / 10;
						cont++;
					}
					;
				}
				cc.setSenha(senha);
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
					System.out.println("         6- Pagar Boleto");
					System.out.println("         0- SAIR");
					opcaoB = input.nextInt();
					input.nextLine();
					if (cc.getContaBloqueada() == true) {
						System.out.print("**********Conta bloqueada Entre em contato com seu a agência*******");
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
						while (cc.getContaBloqueada() == false && cc.validaSenhaAntiga(senhaAntiga) == false) {
							System.out.print("Senha inválida! Digite a senha antiga novamente: ");
							senhaAntiga = input.nextInt();
							if (i > 3) {
								cc.setContaBloqueada(true);
							}
							i++;
						}
						if (cc.getContaBloqueada() == true) {
							System.out.println("**********Conta bloqueada Entre em contato com seu a agência*******");
						} else {
							System.out.print("Digite a senha nova de 4 dígitos:");
							senhaNova = input.nextInt();
							input.nextLine();
							senhaAntiga = senha;							
							while (senhaAntiga != 0) {
								senhaAntiga = senhaAntiga / 10;
								cont++;
							}; // contar digitos da senha
							while (cont != 4) { // entra para pedir senha novamente até que seja de 4 digitos
								cont = 0;
								System.out.print("Senha inválida, Digite novamente:");
								senhaNova = input.nextInt();
								senhaAntiga = senhaNova;
								input.nextLine();
								while (senhaAntiga != 0) {
									senhaAntiga = senhaAntiga / 10;
									cont++;
								}
								;
							}
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
						System.out.print("Digite a Senha:");
						senha = input.nextInt();
						input.nextLine();
						cc.depositar(valor, senha);
					}else if (opcaoB == 6 && cc.getContaBloqueada() == false) { // PAGAR BOLETO
						System.out.print("Digite o código de barras:");
						input.nextLine();
						System.out.print("Digite o valor a ser pago:");
						valor = input.nextDouble();
						System.out.print("Digite sua senha: ");
						senha = input.nextInt();
						input.nextLine();
						cc.pagarBoleto(valor, senha); 
					} else if (opcaoB == 0){
						cc.setContaBloqueada(false);
						System.out.println("...Voltando ao menu anterior...");
					} else {
						System.out.println("Opção inválida");
					}
				} while (opcaoB != 0);

				//
				//
				// CONTA POUPANCA
				//
				//
			} else if (opcaoA == 2) {
				System.out.print("Digite seu Nome Completo:");
				cp.setTitular(input.nextLine());
				cp.setTipo("Conta Corrente");
				System.out.print("Digite o CPF (sem pontuação): ");
				cp.setCpf(input.nextLine());
				while (cp.getCpf().length() != 11) {
					System.out.print("CPF inválido, digite novamente:");
					cp.setCpf(input.nextLine());
				}
				System.out.print("Digite uma senha de 4 dígitos:");
				senha = input.nextInt();
				senhaAntiga = senha;
				input.nextLine();
				while (senhaAntiga != 0) {
					senhaAntiga = senhaAntiga / 10;
					cont++;
				}
				; // contar digitos da senha
				while (cont != 4) { // entra para pedir senha novamente até que seja de 4 digitos
					cont = 0;
					System.out.print("Senha inválida, Digite novamente:");
					senha = input.nextInt();
					senhaAntiga = senha;
					input.nextLine();
					while (senhaAntiga != 0) {
						senhaAntiga = senhaAntiga / 10;
						cont++;
					}
					;
				}
				cp.setSenha(senha);
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
					System.out.println("         0- SAIR");
					opcaoB = input.nextInt();
					input.nextLine();
					if (cp.getContaBloqueada() == true) {
						System.out.print("**********Conta bloqueada Entre em contato com seu a agência*******");
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
						while (cp.getContaBloqueada() == false && cp.validaSenhaAntiga(senhaAntiga) == false) {
							System.out.print("Senha inválida! Digite a senha antiga novamente: ");
							senhaAntiga = input.nextInt();
							i++;
							if (i == 4) {
								cp.setContaBloqueada(true);
							}
						}
						if (cp.getContaBloqueada() == true) {
							System.out.println("**********Conta bloqueada Entre em contato com seu a agência*******");
						} else {
							System.out.print("Digite a senha nova de 4 dígitos:");
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
								System.out.print("Senha inválida, Digite novamente:");
								senhaNova = input.nextInt();
								senhaAntiga = senhaNova;
								input.nextLine();
								while (senhaAntiga != 0) {
									senhaAntiga = senhaAntiga / 10;
									cont++;
								}
							}
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
						System.out.print("Digite a Senha:");
						senha = input.nextInt();
						input.nextLine();
						cp.depositar(valor, senha);
					} else if (opcaoB == 0){
						cp.setContaBloqueada(false);
						System.out.println("...Voltando ao Menu anterior...");
					} else {
						System.out.println("Opção inválida");
					}

				} while (opcaoB != 0);
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
				}
				; // contar digitos da senha
				while (cont != 4) { // entra para pedir senha novamente até que seja de 4 digitos
					cont = 0;
					System.out.print("Senha inválida, Digite novamente:");
					senha = input.nextInt();
					senhaAntiga = senha;
					input.nextLine();
					while (senhaAntiga != 0) {
						senhaAntiga = senhaAntiga / 10;
						cont++;
					}
				}

				//
				// CONTA CORRENTE JA CRIADA
				//
				if (conta <= 10000) {
					cc.setSenha(senha);
					cc.setTipo("CC");
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
						System.out.println("         0- SAIR");
						opcaoB = input.nextInt();
						input.nextLine();
						if (cc.getContaBloqueada() == true) {
							System.out.print("**********Conta bloqueada Entre em contato com seu a agência*******");
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
							while (cc.getContaBloqueada() == false && cc.validaSenhaAntiga(senhaAntiga) == false) {
								System.out.print("Senha inválida! Digite a senha antiga novamente: ");
								senhaAntiga = input.nextInt();
								i++;
								if (i == 4) {
									cc.setContaBloqueada(true);
								}
							}
							if (cc.getContaBloqueada() == true) {
								System.out.println("**********Conta bloqueada Entre em contato com seu a agência*******");
							} else {
								System.out.print("Digite a senha nova de 4 dígitos:");
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
									System.out.print("Senha inválida, Digite novamente:");
									senhaNova = input.nextInt();
									senhaAntiga = senhaNova;
									input.nextLine();
									while (senhaAntiga != 0) {
										senhaAntiga = senhaAntiga / 10;
										cont++;
									}
									;
								}
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
							System.out.print("Digite a Senha:");
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
						} else if (opcaoB == 0){
							cc.setContaBloqueada(false);
							
							System.out.println("...Voltando ao menu anterior...");
						} else {
							System.out.println("Opção inválida");
						}
					} while (opcaoB != 0);
					//
					// CONTA POUPANCA JA CRIADA
					//
				} else {
					cp.setSenha(senha);
					cp.setTipo("CP");
					do {
						System.out.println();
						System.out.println();
						System.out.println("Selecione uma opção:");
						System.out.println("         1- Consulta Saldo");
						System.out.println("         2- Pix");
						System.out.println("         3- Trocar Senha");
						System.out.println("         4- Sacar");
						System.out.println("         5- Depositar");
						System.out.println("         0- SAIR");
						opcaoB = input.nextInt();
						input.nextLine();
						if (cp.getContaBloqueada() == true) {
							System.out.print("**********Conta bloqueada Entre em contato com seu a agência*******");
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
							while (cp.getContaBloqueada() == false && cp.validaSenhaAntiga(senhaAntiga) == false) {
								System.out.print("Senha inválida! Digite a senha antiga novamente: ");
								senhaAntiga = input.nextInt();
								i++;
								if (i == 4) {
									cp.setContaBloqueada(true);
								}
							}
							if (cp.getContaBloqueada() == true) {
								System.out
										.println("**********Conta bloqueada Entre em contato com seu a agência*******");
							} else {
								System.out.print("Digite a senha nova de 4 dígitos:");
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
									System.out.print("Senha inválida, Digite novamente:");
									senhaNova = input.nextInt();
									senhaAntiga = senhaNova;
									input.nextLine();
									while (senhaAntiga != 0) {
										senhaAntiga = senhaAntiga / 10;
										cont++;
									}
									;
								}
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
							System.out.print("Digite a Senha:");
							senha = input.nextInt();
							input.nextLine();
							cp.depositar(valor, senha);
						} else if (opcaoB == 0 ){
							cp.setContaBloqueada(false);
							System.out.println("...Voltando ao menu anterior...");
						} else {
							System.out.println("Opção inválida");
						}
					} while (opcaoB != 0);
				}
			} else if (opcaoA == 0) {
				System.out.println("........Encerrando........");
				System.out.println("Obrigado por usar nosso Sistema");
			} else {
				System.out.println("Opção inválida");
			}

		} while (opcaoA != 0);
		input.close();
	}
}
