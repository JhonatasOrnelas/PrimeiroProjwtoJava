package executavel;

import javax.swing.JOptionPane;

import classes.Aluno;

public class PrimeiroProjetoJava {

	/* Main � um metodo alto executavel em Java */

	private static Aluno aluno2;

	public static void main(String args[]) {

		/* new aluno() é uma instancia (Criação de objeto) */
		/* aluno1 é uma referencia para o objeto aluno */

		String nome = JOptionPane.showInputDialog("Qual o nome do aluno?");
		String idade = JOptionPane.showInputDialog("Qual a idade?");
		String DataNascimento = JOptionPane.showInputDialog("Qual a data de nascimento?");
		String RG = JOptionPane.showInputDialog("Qual registro geral(RG)?");
		String CPF = JOptionPane.showInputDialog("Qual o CPF?");
		String nomePai = JOptionPane.showInputDialog("Qual o nome do Pai?");
		String nomeMae = JOptionPane.showInputDialog("Qual o nome da mãe?");
		String Matricola = JOptionPane.showInputDialog("Qual a data da matricola?");
		String Serie = JOptionPane.showInputDialog("Qual a serie?");
		String nota1 = JOptionPane.showInputDialog("Nota 1");
		String nota2 = JOptionPane.showInputDialog("Nota 2");
		String nota3 = JOptionPane.showInputDialog("Nota 3");
		String nota4 = JOptionPane.showInputDialog("Nota 4");

		Aluno aluno1 = new Aluno();/* Aqui sera o joão */

		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setNomePai(nomePai);
		aluno1.setDataNascimento(DataNascimento);
		aluno1.setRegistroGeral(RG);
		aluno1.setNumeroCpf(CPF);
		aluno1.setNomeMae(nomeMae);
		aluno1.setDataMatricula(Matricola);
		aluno1.setSerieMatricola(Serie);
		aluno1.setNota1(Double.parseDouble(nota1));
		aluno1.setNota2(Double.parseDouble(nota2));
		aluno1.setNota3(Double.parseDouble(nota3));
		aluno1.setNota4(Double.parseDouble(nota4));

		System.out.println("nome do aluno é " + aluno1.getNome());
		System.out.println("nome do pai é " + aluno1.getNomePai());
		System.out.println("nome da mãe é " + aluno1.getNomeMae());
		System.out.println("Idade é " + aluno1.getIdade());
		System.out.println("data de nascimento é " + aluno1.getDataNascimento());
		System.out.println("Media da nota é = " + aluno1.getMediaNota());
		System.out.println("resultado = " + (aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
		System.out.println("resultado 2 = " + (aluno1.getAlunoAprovado2() ? "Aprovado" : "Reprovado"));

	}

}