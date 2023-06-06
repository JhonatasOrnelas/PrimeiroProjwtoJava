package cursoJava.classes;

/*Este é a nova classe/objeto que representa o aluno*/
public class Aluno {

	/* Esses são atributos do aluno */

	private String nome;
	private int idade;
	private String dataNascimento;
	private String registroGeral;
	private String numeroCpf;
	private String nomeMae;
	private String nomePai;
	private String dataMatricula;
	private String nomeEscola;
	private String serieMatricola;

	public Aluno() {/* Cria os dados na memoria - Sendo padrão do Java */

	}

	public Aluno(String nomePadrão) {
		nome = nomePadrão;
	}

	public Aluno(String nomePadrão, int idadePadrão) {
		nome = nomePadrão;
		idade = idadePadrão;
	}

	/* veremos os metodos Setters e Getters do objeto */
	/* Set é para adiionar ou receber dados para os atributos */
	/* Get é para resgatar oou obter o valor do atributo */

	/* recebe dados */
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getRegistroGeral() {
		return registroGeral;
	}

	public void setRegistroGeral(String registroGeral) {
		this.registroGeral = registroGeral;
	}

	public String getNumeroCpf() {
		return numeroCpf;
	}

	public void setNumeroCpf(String numeroCpf) {
		this.numeroCpf = numeroCpf;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public String getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public String getNomeEscola() {
		return nomeEscola;
	}

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

	public String getSerieMatricola() {
		return serieMatricola;
	}

	public void setSerieMatricola(String serieMatricola) {
		this.serieMatricola = serieMatricola;
	}

}
