package exercicioJava;
//mostrar a data formatada a partir da classe 

public class DataTeste {

	public static void main(String[] args) {
		Data d1 = new Data();
		
		d1.setDia(16);
		d1.setMes(11);
		d1.setAno(2023);
		
		//String data = d1.formatarData();
		
		d1.imprimirDataFormatada();
		
		System.out.println(d1.formatarData("d","m","a"));
		System.out.println(d1.formatarData("m","a"));
	
	}

}
