package orientacaoobjeto;

public class CarroTeste {

	public static void main(String[] args) {

		Carro v1 = new Carro();					//instanciando

		Carro v2 = new Carro(); 				// instanciando

		Carro v3 = new Carro("Prata"); 			// instanciando

		Carro v4 = new Carro("Azul", 30000); 	// instanciando

		v1.setCor("Branco"); 
		v1.setModelo("BMW320i");
		v1.setValor(135000);

		v2.setCor("Preto");
		v2.setModelo("Evoque");
		v2.setValor(500000);

		System.out.println(v1.getCor());
		System.out.println(v1.getModelo());
		System.out.println(v1.getValor());
		System.out.println();
		System.out.println(v2.getCor());
		System.out.println(v2.getModelo());
		System.out.println(v2.getValor());
		System.out.println();
		System.out.println(v3.getCor());
		System.out.println(v3.getModelo());
		System.out.println(v3.getValor());
		System.out.println();
		System.out.println(v4.getCor());
		System.out.println(v4.getModelo());
		System.out.println(v4.getValor());
	}

}
