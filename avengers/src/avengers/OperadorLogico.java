package avengers;

public class OperadorLogico {

	public static void main(String[] args) {
		int x,y,z;
		x = 4;
		y = 7;
		z = 12;
		int idade = 17;
		
		boolean resultadoLogico;
		String resultadoString;
		String voto;
		
		
		resultadoLogico = (x < y && y!= z) ? true:false; // && = condição E da tabela verdade
		resultadoString = (x < y && y!= z) ? "Verdadeiro":"Falso"; // && = condição E da tabela verdade
		
		voto = ((idade >= 16 && idade < 18) || (idade > 60)) ? "Voto facultativo":"Voto Obrigatório"; // || condição OU da tabela verdade
		
		System.out.println("resultado Lógico: " + resultadoLogico);
		System.out.println("resultado String: " + resultadoString);
		System.out.println(voto);

	}

}
