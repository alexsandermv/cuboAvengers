package avengers;

public class ForPara {

	public static void main(String[] args) {

		//estrutura PARA do VisualG
		for (int i = 10; i <= 20; i++) {  // ++ incremento
			System.out.println("i = " + i);
		}

		for (int i = 10; i >= 0; i--) {  // -- decremento
			System.out.println("i = " + i);
		}
		
		for (int i = 10; i <= 20; i+= 2) {  // += pula de 2 em 2
			System.out.println("i = " + i);
		}
	}

}
