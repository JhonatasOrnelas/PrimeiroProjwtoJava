import javax.swing.JOptionPane;

public class PrimeiroProjetoJava {

	/* Main � um metodo alto executavel em Java */
	public static void main(String[] args) {

		String nota = JOptionPane.showInputDialog("informe a nota 1");
		String nota = JOptionPane.showInputDialog("informe a nota 2");
		String nota = JOptionPane.showInputDialog("informe a nota 3");
		String nota = JOptionPane.showInputDialog("informe a nota 4");

		double dNota1 = Double.parseDouble(nota1);
		double dNota2 = Double.parseDouble(nota2);
		double dNota3 = Double.parseDouble(nota3);
		double dNota4 = Double.parseDouble(nota4);

		double media = (dNota1 + dNota2 + dNota3 + dNota4) / 4;

		/* Media para aprovação é 70 */

		if (media >= 50) {

			if (media >= 70) {
				JOptionPane.showMessageDialog(null, "aluno esta aprovado com a nota :" + media);
			} else {
				JOptionPane.showMessageDialog(null, "aluno em recuperação com a media:" + media);
			}

		} else {
			JOptionPane.showMessageDialog(null, "A media é :" + media);
		}

	}

}