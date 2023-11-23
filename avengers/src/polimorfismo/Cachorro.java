package polimorfismo;

public class Cachorro extends Mamifero{
	
	@Override
	public void emitirSom() { //mesmo metodo sendo executado de diversas formas em todas as classes POLIMORFISMO
		System.out.println("Latindo");
	}
	
}
