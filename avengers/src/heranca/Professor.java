package heranca;

public class Professor extends Pessoa{
	private String especialidade;
	private double salario;
	
	public Professor() {
		
	}
	
	public void recebeAum(double aum) {
		this.salario += aum; // salario = salario + aum
	}
	
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	@Override
	public String toString() {
		return "Professor: \n[Nome: " + nome + "\nSalário: " + salario + "\nEspecialidade: " + especialidade +"]";
	}
	
	
}
