package exercicioJava;

public class ParesAteCem {

	public static void main(String[] args) {

		int soma = 0;
		
		for (int i = 0; i <= 100; i+=2) {
			soma = soma + i;			
		}
		System.out.println("A soma dos números pares até 100 é: " + soma);
	}

}
