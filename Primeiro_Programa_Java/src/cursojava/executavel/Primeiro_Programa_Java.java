public class teste {

	/* Main � um metodo alto executavel em Java */
	public static void main(String[] args) {

		/* Estrutura de repetição FOR e Continue*/

		for (int numero = 0; numero <= 10; numero++) {
			if (numero == 2 || numero == 4 || numero == 6) {
				System.out.println("numero encontrado");
				break;
			}
			
			System.out.println("Processando laço de repetição");

		}

	}

}