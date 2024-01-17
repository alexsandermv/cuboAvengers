package projetoCubo;

public class ContaPoupanca extends Conta {
	@Override
	public void abrirConta() {
		double aleatorio = Math.random();
		this.setSaldo(20);
		this.setNumConta((int) (0 + aleatorio * (10000 - 1) + 10000));
		System.out.println("Conta Poupança aberta com SUCESSO!");
		System.out.println(" * Seja Bem-Vindo ao CUBO BANK *");
		System.out.println("Saldo de bonificação R$" + getSaldo());
		System.out.println("Seu número de conta é: " + getNumConta());
		System.out.println("Para cada depósito você ganha 5% de bonus");
		System.out.println("Para cada SAQUE ou PIX será descontado R$5,00 de taxa");
	}

	@Override
	public void transferir(String chave, double pix, int senha) {
		if (senha == this.getSenha()) {
			if (this.getSaldo() > 0 && this.getSaldo() >= pix+5) {
				this.setSaldo(this.getSaldo() - (pix + 5));
				System.out.println("Pix realizado com sucesso!");
			} else {
				System.out.println("Valor do Pix: R$:" + pix);
				System.out.println("Saldo Insuficiente");
			}
		} else {
			System.out.println("Senha INVÁLIDA");
		}
	}

	@Override
	public void depositar(double valor, int senha) {
		if (senha == this.getSenha()) {
		this.setSaldo((valor*0.05)+valor + this.getSaldo());
		System.out.println("Valor do depósito: R$" + valor + "e obeteve R$" + valor*0.05 + "de bonus");
		}else {
			System.out.println("Senha INVÁLIDA");
		}	
	}
	
	@Override
	public void sacar(double valor, int senha) {
		if (senha == this.getSenha()) {

			if (this.getSaldo() > 0 && this.getSaldo() >= valor + 5) {
				this.setSaldo(this.getSaldo() - (valor+5));
				System.out.println("Saque realizado com sucesso!");
			} else {
				System.out.println("Valor do Saque + Taxa: R$:" + valor+5);
				System.out.println("Saldo Insuficiente");
			}
		}else {
			System.out.println("Senha INVÁLIDA");
		}
	}
	
}
