package heranca;

public class PessoaTeste2 {

	public static void main(String[] args) {

		Aluno aluno = new Aluno();
		
		aluno.setNome("Alexsander");
		aluno.setIdade(27);
		aluno.setCurso("Java");
		aluno.setSexo("M");
		
		System.out.println(aluno.toString());
		System.out.println("Curso: " + aluno.getCurso());
		
		aluno.fazerAniversario(); //metodo da classe pessoa,
		System.out.println(aluno.toString());
		
		Professor professor = new Professor();
		
		professor.setSalario(5000);
		System.out.println(professor.getSalario());
		professor.recebeAum(1000);
		System.out.println(professor.getSalario());
		
	}

}
