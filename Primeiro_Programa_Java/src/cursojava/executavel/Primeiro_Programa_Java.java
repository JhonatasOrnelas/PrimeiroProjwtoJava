import cursoJava.classes.Aluno;

public class PrimeiroProjetoJava {

	/* Main � um metodo alto executavel em Java */
	
	private static Aluno aluno2;

	public static void main(String[] args) {

		/*new aluno() é uma instancia (Criação de objeto)*/
		/*aluno1 é uma referencia para o objeto aluno*/
		

		Aluno aluno1 = new Aluno();/*Aqui sera o João*/
		aluno1.setNome("João da Silva");
		aluno1.setIdade(50);
		aluno1.setNomePai("Sergio");
		aluno1.setDataNascimento("22/11/2007");
		aluno1.setRegistroGeral("12345.12345.12345");
		aluno1.setNumeroCpf("123456789");
		aluno1.setNomeMae("Cristina");
		aluno1.setDataMatricula("12/12/34");
		aluno1.setSerieMatricola("10");
		
		System.out.println("nome do aluno é " + aluno1.getNome());
		System.out.println("Idade é " + aluno1.getIdade());
		System.out.println("data de nascimento é " + aluno1.getDataNascimento());
		
		/*==========================================================================================*/
		System.out.println("------------------------------------------------------------------------");
		
		Aluno aluno2 = new Aluno();
		
		aluno1.setNome("João P");
		aluno1.setIdade(45);
		aluno1.setDataNascimento("22/11/1970");
		
		System.out.println("nome do aluno é " + aluno1.getNome());
		System.out.println("Idade é " + aluno1.getIdade());
		System.out.println("data de nascimento é " + aluno1.getDataNascimento());

        /*==========================================================================================*/
		
		Aluno Aluno3 = new Aluno();/*Aqui sera o Pedro*/
		
		Aluno Aluno4 = new Aluno();/*Aqui sera o Alex*/
		
		Aluno Aluno5 = new Aluno("Maria");
		
		Aluno Aluno6 = new Aluno("José", 50);
	}

}