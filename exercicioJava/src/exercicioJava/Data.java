package exercicioJava;

public class Data {

	private int dia;
	private int mes;
	private int ano;
	
	public String dataFormatada() {
		return String.format("%d/%d/%d", dia,mes,ano);
	}
	
	void imprimirDataFormatada() {
		System.out.println(dataFormatada());
	}
	
	public String formatarData (String d, String m, String a) {
		return dia + "/" + mes + "/" + ano;
	}
	public String formatarData (String m, String a) {
		return mes + "/" + ano;
	}
	
	public String formatarDataPorExtenso (String m, String a) {
		return mes + "/" + ano;
	}

	
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	
}
