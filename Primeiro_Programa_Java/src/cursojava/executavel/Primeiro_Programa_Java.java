public class teste {

	/* Main � um metodo alto executavel em Java */
	public static void main(String[] args) {

	int nota1 = 90; 
	int nota2 = 80; 
	int nota3 = 80; 
	int nota4 = 90; 
	int media = 0;
	
	media = (nota1 + nota2 + nota3 + nota4) /4;
	
	/*Condiações com IF e ELSE*/
	
	if (media >= 70) {
		System.out.println("Aluno aprovado : " + media);
	}
	if (media >= 40 && media <= 69) {
		System.out.println("Aluno em recuperação : " + media);
	}
	else {
		System.out.println("Aluno reprovado : " + media);
		
	}
	
	/*Operadores ternareos sao para micro validações*/
	
	String saidaResultado;
	
	saidaResultado = media >= 70 ? "aluno aprovado" : (media >= 40 && media <= 69) ? "aluno em recuperação" : "reprovado";
			System.out.println(saidaResultado);
	
	}

}
