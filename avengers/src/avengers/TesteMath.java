package avengers;

public class TesteMath {

	public static void main(String[] args) {

		double PI = Math.PI; 						// objeto da classe Math 
		double potencia = Math.pow(5,2); 			// 5 elevado ao quadrado
		double raizQuadrada = Math.sqrt(25);		// raiz quadrada de 25
		
		double arredondaBaixo = Math.floor(8.8); 	//arredondamento pra baixo
		double arredondaCima = Math.ceil(PI);		//arredodamento pra cima
		double arredondamento = Math.round(8.6);	//arredondamento aritmetico
		int convDoubleInt = (int) Math.floor(8.8); 	//type cast converte um valor quebrado para inteiro
		
		System.out.println(PI);
		System.out.println(potencia);
		System.out.println(raizQuadrada);
		System.out.println(arredondaBaixo);
		System.out.println(arredondaCima);
		System.out.println(arredondamento);
		System.out.println(convDoubleInt);
	}

}
