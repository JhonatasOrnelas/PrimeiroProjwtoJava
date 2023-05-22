import javax.swing.JOptionPane;

public class PrimeiroProjetoJava {

	/* Main � um metodo alto executavel em Java */
	public static void main(String[] args) {
		
	/*Modulo : resto da divisão % */
		
		
	String carros = JOptionPane.showInputDialog("informe a quantidade de carros");
	String pessoas = JOptionPane.showInputDialog("informe a quantidade de pessoas");
	
	double carroNumero = Double.parseDouble(carros);
	double pessoaNumero = Double.parseDouble(pessoas);
	
	int divisao = (int) (carroNumero / pessoaNumero);
	
	double resto = carroNumero % pessoaNumero;
	
	int resposta = JOptionPane.showConfirmDialog(null, "deseja ver o resultado da divisao?")
			
	if (resposta == 0) {
		JOptionPane.showMessageDialog(null, "divisao para as pessoas deu " + divisao )
		
	}else {
		System.out.println("nao quiz ver o resultado");
	} 	

	resposta = JOptionPane.showMessageDialog(null, "deseja ver o resultado da divisao?")
			
	if (resposta == 0) {
		JOptionPane.showMessageDialog(null, "o resto da divisao é " + resto )
		
	}
	
	
	}

}