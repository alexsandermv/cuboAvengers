package avengers;

public class TratamentoStrings {

	public static void main(String[] args) {

		
		String nome = "joão";
		String nome1 = "joão";
		String nome2 = new String("João");  // construtor
		
		String cubo = "avangers";
		
		System.out.println(cubo.substring(0,1).toUpperCase().concat(cubo.substring(1))); // Mostrar somente a primeira letra em maiusculo 
		System.out.println(cubo.toUpperCase()); 		//tudo em caixa alta
		System.out.println(cubo.toLowerCase()); 		//tudo em minúsculo
		System.out.println(cubo.length()); 				// quantidade de caracteres da variável
		System.out.println(cubo.charAt(5));  			// mostra somente o caracter da quinta casa começa no zero
				
		
		System.out.println(nome1 == nome2);
		System.out.println(nome.equals(nome2));
		System.out.println(nome1.equalsIgnoreCase(nome2));   // ignora se tem maiúsculo e minusculo na comparação 
		
	}

}
