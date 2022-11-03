/*9) Elaborar um programa que efetue a leitura de 10 valores numéricos e apresente no 
 * final o total do somatório e a média aritmética dos valores lidos.*/

package tarefa8;

public class Exercicio9 {

	public static void main(String[] args) {
		double soma = 0;
		for (double i = 0; i <= 10; i++) {
			soma += i;

		}
		System.out.println("A soma dos valores é : " + soma);
		double media = soma / 10;
		System.out.println("A média dos valores é : " + media);
	}

}
