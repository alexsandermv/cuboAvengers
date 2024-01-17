package avengers;

public class Random {

	public static void main(String[] args) {

		double aleatorio = Math.random(); // valor aleatório entre 0 e 1.0
		
		int aleatrorioIntervalo = (int) (0 + aleatorio * (20000 - 1)+10000);  //valor aleatório entre 1 e 100
		
		System.out.println(aleatrorioIntervalo);
		System.out.println(aleatorio);
	}

}
