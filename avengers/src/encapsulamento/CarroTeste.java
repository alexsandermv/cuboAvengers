package encapsulamento;

public class CarroTeste {

	public static void main(String[] args) {

		Carro v2 = new Carro(); // instanciando

		v2.setCor("Preto");
		v2.setModelo("Evoque");
		v2.setValor(500000);
		v2.ligarCarro();
		v2.ligarAr();
		v2.status();
		
	}

}
