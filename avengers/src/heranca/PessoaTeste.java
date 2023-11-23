package heranca;

public class PessoaTeste {

	public static void main(String[] args) {

		Pessoa pessoa = new Pessoa(); 		//instanciando classe pessoa 
		Aluno aluno = new Aluno();			//instanciando classe aluno que tem acesso aos atributos de pessoa
		Professor p1 = new Professor();
		
		pessoa.setNome("Alex teste"); 
		aluno.setNome("Alexsander Chies"); //
		
		p1.setEspecialidade("Biologia");
		p1.setSalario(5000);
		p1.setNome("João");
		System.out.println(p1);
		p1.recebeAum(1000);
		System.out.println(p1);
		
		
		Funcionario f1 = new Funcionario();
		f1.setNome("Batista");
		f1.setSetor("TI");
		f1.setTrabalhando(true);
		
		
		System.out.println(f1);
		
		Aluno aluno2 = new Aluno();			//instanciando classe aluno que tem acesso aos atributos de pessoa
		
		aluno2.setNome("Alex");
		aluno2.setMatricula(1092);
		aluno2.setIdade(27);
		aluno2.setSexo("Masculino");
		
		System.out.println(aluno2.toString());
		
		aluno2.fazerAniversario();
		System.out.println(aluno2.toString());
	}

}
