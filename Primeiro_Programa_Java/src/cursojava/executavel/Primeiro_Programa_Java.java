public class teste {

	/* Main � um metodo alto executavel em Java */
	public static void main(String[] args) {

	int nota1 = 90; 
	int nota2 = 90; 
	int nota3 = 90; 
	int nota4 = 90; 
	int media = 0;
	
	media = (nota1 + nota2 + nota3 + nota4) /4;
	
	/*Operações logicas aninhadas: Sao perações dentro de operações*/
	
	if (media >= 50) {
	if (media >= 70) {
	if (media >= 90) {
		System.out.println("Aluno aprovado = " + media + " pontos" + " - exelente");
	}else {
		System.out.println( "Aluno aprovado = " + media + " pontos");
	}
	
	}else {
		System.out.println( "Aluno em recuperação = " + media + " pontos");
  }
		
    }else {
    	System.out.println( "Aluno reprovado = " + media + " pontos");
    }
	
  }

}
