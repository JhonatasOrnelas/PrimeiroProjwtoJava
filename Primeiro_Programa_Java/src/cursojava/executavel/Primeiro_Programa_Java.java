public class teste {

	/* Main � um metodo alto executavel em Java */
	public static void main(String[] args) {

	int nota1 = 70; 
	int nota2 = 70; 
	int nota3 = 70; 
	int nota4 = 70; 
	int media = 0;
	
	media = (nota1 + nota2 + nota3 + nota4) /4;
	
	/*Switch Case: operações exatas*/
	int dia = 6;
	switch (dia) {
	case 1: 
		System.out.println("domingo");
		break;
	case 2:
		System.out.println("Segunda feira");
		break;
	case 3:
		System.out.println("terça feira");
		break;
	case 4:
		System.out.println("Quarta feira");
		break;
	case 5:
		System.out.println("Quinta feira");
		break;
	case 6:
		System.out.println("Sexta feira");
		break;	
		
	default: System.out.println("Outro dia qualquer");
			
	}
	
  }

}