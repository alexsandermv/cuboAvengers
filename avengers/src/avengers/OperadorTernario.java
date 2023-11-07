package avengers;

public class OperadorTernario {

	public static void main(String[] args) {

		int num1 = 28;
		int num2 = 25;
		int maior = num1 < num2 ? num1 : num2; // num1 é menor que num2 ?  SIM maior recebe num1 NÃO maior recebe num2
		
		System.out.println(maior);
		
		maior = num1 < num2 ? 50 : 2;         // num1 é menor que num2 ?  SIM aplica antes dos : NÃO maior aplica dps do :
		System.out.println(maior);

	}

}
