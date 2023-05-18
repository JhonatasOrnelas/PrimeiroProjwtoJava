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
	
	JOptionPane.showMessageDialog(null, "divisao para as pessoas deu " + divisao + "carros e sobrou " + resto + "carro");	
	
	}

}