package polimorfismo;

public class PolimorfismoTeste {

	public static void main(String[] args) {

		Cachorro tobi = new Cachorro();
		
		tobi.setPeso(10);
		tobi.setIdade(2);
		System.out.println("Som do Cachorro: ");
		tobi.emitirSom();
		System.out.println();
		
		Canario passaro = new Canario();
		
		passaro.alimentar();
		passaro.setPeso(0.100);
		System.out.println(passaro.getPeso());

		Mamifero m = new Mamifero();
		m.peso = 0.10;
		m.idade = 1;
		m.setNome("Bob");
		
				
		
	}

}
