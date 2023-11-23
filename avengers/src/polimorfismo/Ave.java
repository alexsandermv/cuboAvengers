package polimorfismo;

public class Ave extends Animal{

	@Override
	public void movimentar() {// metodos pertencem a classe animal mas estão sendo implementados na atual POLIMORFISMO
		System.out.println("Voando");
	}

	@Override
	public void alimentar() {// metodos pertencem a classe animal mas estão sendo implementados na atual POLIMORFISMO
		System.out.println("Comendo Fruta");
	}

	@Override
	public void emitirSom() {// metodos pertencem a classe animal mas estão sendo implementados na atual POLIMORFISMO
		System.out.println("Som de Ave");
	}
	
	

}
