package avengers;

public class ManipulandoString {

	public static void main(String[] args) {

		String texto = "AvengErs";
		
		System.out.println(texto.toLowerCase());  	// tudo em letras minúsculas
		System.out.println(texto.toUpperCase());	// tudo em letras maiúsculas
		System.out.println(texto.length());			// conta os caracteres da variável
		System.out.println(texto.charAt(0));	 	// mostra o caracter da posição passada como parametro
		
		System.out.println(texto.substring(0,1).toUpperCase().concat(texto.substring(1).toLowerCase())); // Mostrar somente a primeira letra em maiusculo e o resto em minusculo
		
	}

}
