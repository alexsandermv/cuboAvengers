package exemplo;

public class ContaCorrente extends Conta {

	@Override
	public void abrirConta() {
		double aleatorio = Math.random();
		this.setSaldo(50);
		this.setNumConta((int) (0 + aleatorio * (10000 - 1)) );
		System.out.println(" * Seja Bem-Vindo ao CUBO BANK *");
		System.out.println("Saldo de bonificação R$" + getSaldo());
		System.out.println("Conta aberta com SUCESSO!");
		System.out.println("Seu número de conta é: " + getNumConta());
	}

	public void depositar(double valor) {
		this.setSaldo(valor + this.getSaldo());
		System.out.println("Valor do depósito: R$" + valor);
	}

	@Override
	public void transferir(double pix, int senha) {
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
}
