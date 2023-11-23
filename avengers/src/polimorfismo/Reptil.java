package polimorfismo;

public class Reptil extends Animal{

	@Override
	public void movimentar() {// metodos pertencem a classe animal mas estão sendo implementados na atual POLIMORFISMO
		System.out.println("Rastejando");
	}

	@Override
	public void alimentar() {// metodos pertencem a classe animal mas estão sendo implementados na atual POLIMORFISMO
		System.out.println("Comendo Insetos");
	}

	@Override
	public void emitirSom() {// metodos pertencem a classe animal mas estão sendo implementados na atual POLIMORFISMO
		System.out.println("Som de Reptil");
	}

}
