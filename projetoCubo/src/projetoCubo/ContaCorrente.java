package projetoCubo;

public class ContaCorrente extends Conta {

	@Override
	public void abrirConta() {
		double aleatorio = Math.random();
		this.setSaldo(25);
		this.setNumConta((int) (0 + aleatorio * (10000 - 1)) );
		System.out.println("Conta Corrente aberta com SUCESSO!");
		System.out.println(" * Seja Bem-Vindo ao CUBO BANK *");
		System.out.println("Saldo de bonificação R$" + getSaldo());
		System.out.println("Seu número de conta é: " + getNumConta());
	}
	
	@Override
	public void depositar(double valor, int senha) {
		if (senha == this.getSenha()) {
		this.setSaldo(valor + this.getSaldo());
		System.out.println("Valor do depósito: R$" + valor);
		}else {
			System.out.println("Senha INVÁLIDA");
		}
		
	}

	@Override
	public void transferir(String chave, double pix, int senha) {
		if (senha == this.getSenha()) {

			if (this.getSaldo() > 0 && this.getSaldo() >= pix) {
				this.setSaldo(this.getSaldo() - pix);
				System.out.println("Pix realizado com sucesso!");
			} else {
				System.out.println("Valor do Pix: R$:" + pix);
				System.out.println("Saldo Insuficiente");
			}
		}else {
			System.out.println("Senha INVÁLIDA");
		}
	}
	@Override
	public void sacar(double valor, int senha) {
		if (senha == this.getSenha()) {

			if (this.getSaldo() > 0 && this.getSaldo() >= valor) {
				this.setSaldo(this.getSaldo() - valor);
				System.out.println("Saque realizado com sucesso!");
			} else {
				System.out.println("Valor do Saque: R$:" + valor);
				System.out.println("Saldo Insuficiente");
			}
		}else {
			System.out.println("Senha INVÁLIDA");
		}
	}
	
	public void pagarBoleto(double valor, int senha) {
		if (senha == this.getSenha()) {

			if (this.getSaldo() > 0 && this.getSaldo() >= valor) {
				this.setSaldo(this.getSaldo() - valor);
				System.out.println("Saque realizado com sucesso!");
			} else {
				System.out.println("Valor do pagamento: R$:" + valor);
				System.out.println("Saldo Insuficiente");
			}
		}else {
			System.out.println("Senha INVÁLIDA");
		}
	}
}
