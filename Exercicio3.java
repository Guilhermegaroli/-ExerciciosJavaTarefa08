/*3) Elaborar um programa que apresente no final o somatório dos valores pares 
 * existentes na faixa de 1 até 500.*/

package tarefa8;

public class Exercicio3 {

	public static void main(String[] args) {
		int soma = 0;
		for (int i = 2; i <= 500; i += 2) {
			soma += i;
		}
		System.out.println("Pares: " + soma);
	}

}
